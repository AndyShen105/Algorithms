package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hang.shen@transwarp.io on 2020-05-11.
 */
public class WordBreakTests {
    private static final Logger log = LogManager.getLogger(WordBreakTests.class);

    @Test
    public void test() {
        String s = "leetcode";
        String[] ss = {"leet", "code"};
        List<String> wordDic = Arrays.asList(ss);
        WordBreak wordBreak = new WordBreak();
        log.info(wordBreak.wordBreak(s, wordDic));
    }

    @Test
    public void test1() {
        String s = "applepenapple";
        String[] ss = {"apple", "pen"};
        List<String> wordDic = Arrays.asList(ss);
        WordBreak wordBreak = new WordBreak();
        log.info(wordBreak.wordBreak(s, wordDic));
    }

    @Test
    public void test2() {
        String s = "catsandog";
        String[] ss = {"cats", "dog", "sand", "and", "cat"};
        List<String> wordDic = Arrays.asList(ss);
        WordBreak wordBreak = new WordBreak();
        log.info(wordBreak.wordBreak(s, wordDic));
    }

    @Test
    public void test3() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        String[] ss = {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"};
        List<String> wordDic = Arrays.asList(ss);
        WordBreak wordBreak = new WordBreak();
        log.info(wordBreak.wordBreak(s, wordDic));
    }
}

