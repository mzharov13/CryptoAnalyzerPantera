package com.javarush.zharov;

public class Controller {
    public Controller(String[] userInput){
        switch (userInput[3]){
            case "ENCODE" -> new Encode().run(userInput);
            case "DECODE" -> new Decode().run(userInput);

        }
    }
}
