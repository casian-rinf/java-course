package com.rinftech.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        readAndThrowCustomUncheckedException();

        try {
            readAndThrowCustomCheckedException();
        } catch (IncorrectFileNameException e) {
            System.out.println(e + "\n");
        }
    }

    private static void readAndThrowCustomCheckedException() throws IncorrectFileNameException {
        String fileName = "file";
        try (Scanner scanner = new Scanner(new File(fileName))) {
            if (scanner.hasNext()) {
                System.out.println("Message");
            }
        } catch (FileNotFoundException e) {
            if (!isValidName(fileName))
                throw new IncorrectFileNameException("This file has an incorrect name", e);
        }
    }

    private static void readAndThrowCustomUncheckedException() {
        String fileName = "file";
        try (Scanner scanner = new Scanner(new File(fileName))) {
            if (scanner.hasNext()) {
                System.out.println("Message");
            }
        } catch (FileNotFoundException e) {
            if (!isValidExtension(fileName))
                throw new IncorrectFileExtensionException("This type of extension is not supported", e);
        }
    }

    public static boolean isValidName(String filename) {
        return false;
    }

    public static boolean isValidExtension(String filename) {
        return false;
    }
}
