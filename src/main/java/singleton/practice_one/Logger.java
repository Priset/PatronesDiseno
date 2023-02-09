package singleton.practice_one;

public class Logger {
    private static Logger instance = null;
    private Logger(){
        System.out.println("REGISTRO");
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new Logger();
        }
    }

    public static Logger getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }
}
