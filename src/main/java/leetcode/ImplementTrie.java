package leetcode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by hang.shen@transwarp.io on 2020/4/21.
 */
public class ImplementTrie {

    private static final Logger log = LogManager.getLogger(ImplementTrie.class);

    class TrieNode {
        boolean isLeaf;
        TrieNode[] content;

        public TrieNode() {
            content = new TrieNode[26];
        }
    }

    public class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            if (word == null || word.length() == 0) {
                return;
            }

            TrieNode node = root;
            TrieNode tempNode = null;
            ;
            for (int i = 0, len = word.length(); i < len; i++) {
                Character c = word.charAt(i);
                tempNode = node.content[c - 'a'];
                if (tempNode == null) {
                    tempNode = new TrieNode();
                    node.content[c - 'a'] = tempNode;
                }
                node = tempNode;
            }
            node.isLeaf = true;
        }


        public boolean search(String word) {
            if (word == null || word.length() == 0) {
                return false;
            }

            TrieNode node = root;
            TrieNode tempNode = null;
            ;
            for (int i = 0, len = word.length(); i < len; i++) {
                Character c = word.charAt(i);
                tempNode = node.content[c - 'a'];
                if (tempNode == null) {
                    return false;
                }
                node = tempNode;
            }
            return node.isLeaf;
        }

        public boolean startsWith(String prefix) {
            if (prefix == null || prefix.length() == 0) {
                return false;
            }

            TrieNode node = root;
            TrieNode tempNode = null;
            ;
            for (int i = 0, len = prefix.length(); i < len; i++) {
                Character c = prefix.charAt(i);
                tempNode = node.content[c - 'a'];
                if (tempNode == null) {
                    return false;
                }
                node = tempNode;
            }
            return true;
        }
    }

}




