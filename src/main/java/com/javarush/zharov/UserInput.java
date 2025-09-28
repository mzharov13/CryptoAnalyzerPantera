package com.javarush.zharov;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static com.javarush.zharov.ActionNameCom.DECODE;
import static com.javarush.zharov.ActionNameCom.ENCODE;

public class UserInput {
    private final String inputURL;
    private final String outputURL;
    private String key;
    private String nameCommand;


    public UserInput(Scanner scanner) {
        System.out.println("Введите название файла:");
        inputURL = scanner.nextLine();
        System.out.println("Введите файл сохранения:");
        outputURL = scanner.nextLine();
        System.out.println(" Что собираемся делать?\n 1. Расшифровать файл - введите ENCODE \n 2. Зашифровать файл - введите DECODE   \n ");


        Set<String> validCommands = new HashSet<>();
        for (ActionNameCom command : ActionNameCom.values()) {
            validCommands.add(command.name());
        }

        while (true) {
            nameCommand = scanner.nextLine();
            String upperCommand = nameCommand.toUpperCase();

            if (validCommands.contains(upperCommand)) {
                ActionNameCom actionNameCommand = ActionNameCom.valueOf(upperCommand);
                switch (actionNameCommand) {
                    case ENCODE: {
                        nameCommand = "ENCODE";
                        System.out.println("Выбран режим - расшифровка. \n " +
                                "Введите ключ расшифровки:");
                        key = scanner.nextLine();
                        break;
                    }
                    case DECODE: {
                        nameCommand = "DECODE";
                        System.out.println("Выбран режим - шифрование. \n " +
                                "Введите ключ шифрования:");
                        key = scanner.nextLine();
                        break;
                    }
                }
                break;
            }
            System.out.println("Неверная команда. Попробуйте снова");
        }
        System.out.println("Данные получены, начинаю работу");
    }

    public String[] getCommandLine() {
        return new String[]{inputURL, outputURL, key, nameCommand};
    }
}
