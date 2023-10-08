package com.ccl.documentmanagementintapi.exceptions;

public class NoImageContentException extends RuntimeException {
    public NoImageContentException(String user, String locator, String app) {
        super("Image content not found for locator: " + locator + ", user: " + user + ", app: " + app);
    }
}
