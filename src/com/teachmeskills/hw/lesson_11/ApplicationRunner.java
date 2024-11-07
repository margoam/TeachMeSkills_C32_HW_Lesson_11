package com.teachmeskills.hw.lesson_11;

import com.teachmeskills.hw.lesson_11.operation.StringOperation;

import java.util.Scanner;

/**
 * Написать программу со следующим функционалом:
 * На вход передать строку (будем считать, что это некий стандартный номер документа в заданном формате).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это любая цифра, а y — это буква латинского алфавита (могут быть большие и маленькие).
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a document number in the xxxx-yyy-xxxx-yyy-xyxy format: ");
        String userInput = scanner.nextLine();

        //Task1 - - Вывести на экран в одну строку два первых блока по 4 цифры.
        StringOperation.showFirstTwoNumberParts(userInput);

        //Task2 - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
        StringOperation.showDocumentNumberWithMaskedLetters(userInput);

        //Task3 - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        StringOperation.showDocumentLetters(userInput);

        //Task4 - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
        // (реализовать с помощью класса StringBuilder).
        StringOperation.showFormattedDocumentNumberWithLetters(userInput);

        //Task5 - Проверить содержит ли номер документа последовательность "abc" и вывети сообщение содержит или
        // нет(причем, abc и ABC считается одинаковой последовательностью).
        StringOperation.checkWordCombination(userInput);

        //Task6 - Проверить начинается ли номер документа с последовательности 555.
        StringOperation.checkNumberCombination(userInput);

        //Task7 - Проверить заканчивается ли номер документа на последовательность 1a2b.
        StringOperation.checkDocumentNumberEnd(userInput);
    }
}
