/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.text;

import java.util.Arrays;


public abstract class StrMatcher {
    public static StrMatcher commaMatcher() {
      return null;
    }

    public static StrMatcher tabMatcher() {
      return null;
    }

    public static StrMatcher spaceMatcher() {
      return null;
    }

    public static StrMatcher splitMatcher() {
      return null;
    }

    public static StrMatcher trimMatcher() {
      return null;
    }

    public static StrMatcher singleQuoteMatcher() {
      return null;
    }

    public static StrMatcher doubleQuoteMatcher() {
      return null;
    }

    public static StrMatcher quoteMatcher() {
      return null;
    }

    public static StrMatcher noneMatcher() {
      return null;
    }

    public static StrMatcher charMatcher(final char ch) {
      return null;
    }

    public static StrMatcher charSetMatcher(final char... chars) {
      return null;
    }

    public static StrMatcher charSetMatcher(final String chars) {
      return null;
    }

    public static StrMatcher stringMatcher(final String str) {
      return null;
    }

    public abstract int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd);

    public int isMatch(final char[] buffer, final int pos) {
      return 0;
    }

}
