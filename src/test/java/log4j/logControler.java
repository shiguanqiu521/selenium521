package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class logControler {
    private static Logger logger = null;
    private static logControler logg = null;

    public static logControler getLogg(Class<?> T){
        if(logger == null){
            //实例化Properties类，处理.properties文件
            Properties p = new Properties();
            try{
                String path = System.getProperty("user.dir");
                String filePath = path+"/configs/log4j.properties";
                InputStream in =  new FileInputStream(filePath);
                p.load(in);
            }catch (IOException e){
                e.printStackTrace();
            }
            PropertyConfigurator.configure(p);
            logger = Logger.getLogger(T);
            logg = new logControler();
        }
        return  logg;
    }

    public void info(String msg){
        logger.info(msg);
    }

    public void debug(String msg){
        logger.debug(msg);
    }

    public void warn(String msg){
        logger.warn(msg);
    }

    public void error(String msg){
        logger.error(msg);
    }

}
