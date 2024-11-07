package com.teachmeskills.hw.lesson_11.operation;

public class StringOperation {

    //Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void showFirstTwoNumberParts(String userInput) {
        String[] splitUserInput = userInput.split("-");
        System.out.println("First two number parts: " + splitUserInput[0] + splitUserInput[2]);
    }

    //Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    public static void showDocumentNumberWithMaskedLetters(String userInput){
        String maskedDocumentNumber = userInput.replaceAll("[a-zA-Zа]", "*");
        System.out.println("Masked by \"*\" document number is: " + maskedDocumentNumber);
    }

    //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public static void showDocumentLetters(String userInput){
        String invokedLetters = userInput.replaceAll("[^a-zA-Zа]", "").toLowerCase();
        String formattedLetters = String.format("%s/%s/%s/%s",
                invokedLetters.substring(0, 3),
                invokedLetters.substring(3, 6),
                invokedLetters.substring(6, 7),
                invokedLetters.substring(7, 8));

        System.out.println("New document number with letters only is: " + formattedLetters);
    }

    //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
    public static void showFormattedDocumentNumberWithLetters(String userInput){
        String invokedLetters = userInput.replaceAll("[^a-zA-Zа]", "").toUpperCase();
        StringBuilder sb = new StringBuilder("Letters:");
        sb.append(invokedLetters, 0, 3).append("/")
                .append(invokedLetters, 3, 6).append("/")
                .append(invokedLetters.charAt(6)).append("/")
                .append(invokedLetters.charAt(7));

        System.out.println("New Document number in the \"Letters:yyy/yyy/y/y\" format is: " + sb);
    }

    //Проверить содержит ли номер документа последовательность "abc" и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью)
    public static void checkWordCombination(String userInput){
        boolean isSequencePresent = userInput.toLowerCase().contains("abc");

        if(isSequencePresent){
            System.out.println("The entered document number contains \"abc\", including in uppercase");
        }
        else{
            System.out.println("The entered document number doesn't contain \"abc\", including uppercase");
        }
    }

    //Проверить начинается ли номер документа с последовательности 555
    public static void checkNumberCombination(String userInput){
        boolean isNumberSequencePresent = userInput.startsWith("555");

        if(isNumberSequencePresent)
        {
            System.out.println("The document number starts with \"555\"");
        }
        else{
            System.out.println("The document number doesn't start with \"555\"");
        }
    }

    //- Проверить заканчивается ли номер документа на последовательность 1a2b.
    public  static void checkDocumentNumberEnd(String userInput){
        boolean isDocumentNumberEndsWithSequence = userInput.endsWith("1a2b");

        if(isDocumentNumberEndsWithSequence){
            System.out.println("The document number ends with \"1a2b\"");
        }
        else{
            System.out.println("The document number doesn't end with \"1a2b\"");
        }
    }
}

