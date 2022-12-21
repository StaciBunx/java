package Model;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {

    private String pathFile;

    public Log(String pathFile) {
        this.pathFile = pathFile;
    }

    public Logger WriteLog() {
        try {
            Logger logger = Logger.getLogger(pathFile);
            FileHandler fh = new FileHandler(pathFile, true);
            fh.setEncoding("UTF-8");
            logger.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
            return logger;
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
        return null;
    }

}