package com.javarush.zharov;

public class Encode extends AbstractAction {
    public void run(String[] project) {
        String inFileName = project[0];
        String outFileName = project[1];
        int key = Integer.parseInt(project[2]);
        runAction(inFileName,outFileName, key);
    }
}
