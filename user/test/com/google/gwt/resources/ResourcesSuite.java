/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.resources;

import com.google.gwt.junit.tools.GWTTestSuite;
import com.google.gwt.resources.client.CSSResourceTest;
import com.google.gwt.resources.client.ImageResourceTest;
import com.google.gwt.resources.client.NestedBundleTest;
import com.google.gwt.resources.client.TextResourceTest;
import com.google.gwt.resources.rg.CssNodeClonerTest;
import com.google.gwt.resources.rg.CssReorderTest;
import com.google.gwt.resources.rg.CssRtlTest;

import junit.framework.Test;

/**
 * Tests the ClientBundle framework.
 */
public class ResourcesSuite {
  public static Test suite() {

    GWTTestSuite suite = new GWTTestSuite("Test for com.google.gwt.resources");
    suite.addTestSuite(CSSResourceTest.class);
    suite.addTestSuite(CssReorderTest.class);
    suite.addTestSuite(CssRtlTest.class);
    suite.addTestSuite(CssNodeClonerTest.class);
    // TODO(bobv) Re-enable after fixing this case in non-inlining mode
    // suite.addTestSuite(ImageResourceTest.class);
    suite.addTestSuite(NestedBundleTest.class);
    suite.addTestSuite(TextResourceTest.class);

    return suite;
  }
}
