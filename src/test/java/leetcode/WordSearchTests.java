package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Created by hang.shen@transwarp.io on 2020/4/29.
 */
public class WordSearchTests {

    private static final Logger log = LogManager.getLogger(WordSearchTests.class);

    @Test
    public void test1() {
        char[][] chars = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        WordSearch wordSearch = new WordSearch();
        log.info(wordSearch.exist(chars, "ABCCED"));
    }

    @Test
    public void test2() {
        char[][] chars = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        WordSearch wordSearch = new WordSearch();
        log.info(wordSearch.exist(chars, "ABCB"));
    }

    @Test
    public void test3() {
        char[][] chars = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        WordSearch wordSearch = new WordSearch();
        log.info(wordSearch.exist(chars, "SEE"));
    }

    @Test
    public void test4() {
        char[][] chars = {{'A'}};
        WordSearch wordSearch = new WordSearch();
        log.info(wordSearch.exist(chars, "A"));
    }

    @Test
    public void test5() {
        char[][] chars = {{'B', 'A'}};
        WordSearch wordSearch = new WordSearch();
        log.info(wordSearch.exist(chars, "AB"));
    }
}

