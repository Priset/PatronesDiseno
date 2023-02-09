package singleton.practice_one;

import java.io.*;

public class Logger {
    private static Logger instance = null;
    private Logger(){
        File archivo = new File("practica1.txt");
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new Logger();
        }
    }
    public static Logger getInstance(){
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    public void registro (String message){

        FileWriter escribir = null;
        try {
            escribir = new FileWriter("practica1.txt");
            escribir.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
