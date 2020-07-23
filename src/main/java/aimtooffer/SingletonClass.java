package aimtooffer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/7/13.
 */
public class SingletonClass {

    private static final Logger log = LogManager.getLogger(SingletonClass.class);
    public static SingletonClass singletonClass;

    private SingletonClass() {
    }

    public static SingletonClass getSingletonClass() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}

