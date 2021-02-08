var express = require('express');
var multer  = require('multer');
var upload = multer({ dest: 'uploads/' });
 
var app = express();
var exec = require("child_process").exec;
 
app.post('/profile', upload.single('avatar'), function (req, res, next) {
  exec("touch " + req.file.originalname); // NOT OK
});
 
app.post('/photos/upload', upload.array('photos', 12), function (req, res, next) {
  req.files.forEach(file => {
    exec("touch " + file.originalname); // NOT OK
  })
});


var http = require('http');
var Busboy = require('busboy');

http.createServer(function (req, res) {
  var busboy = new Busboy({ headers: req.headers });
  busboy.on('file', function (fieldname, file, filename, encoding, mimetype) {
    exec("touch " + filename); // NOT OK
  });
  req.pipe(busboy);
}).listen(8000);
