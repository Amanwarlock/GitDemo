package com.aman.git.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.aman.git.GitDemo";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}
