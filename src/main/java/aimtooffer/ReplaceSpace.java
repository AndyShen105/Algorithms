package aimtooffer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020-04-21.
 */
public class ReplaceSpace {
    private static final Logger log = LogManager.getLogger(ReplaceSpace.class);
    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
}
