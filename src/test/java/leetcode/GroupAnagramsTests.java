package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 20-4-13.
 */
public class GroupAnagramsTests {
    private static final Logger log = LogManager.getLogger(GroupAnagramsTests.class);

    @Test
    public void groupAnagramsTest1() {
        String[] query = {"hos","boo","nay","deb","wow","bop","bob","brr","hey","rye","eve","elf","pup","bum","iva",
                "lyx","yap","ugh","hem","rod","aha","nam","gap","yea","doc","pen","job","dis","max","oho","jed",
                "lye","ram","pup","qua","ugh","mir","nap","deb","hog","let","gym","bye","lon","aft","eel","sol","jab"};
        log.info(GroupAnagrams.groupAnagrams(query));


    }
}
