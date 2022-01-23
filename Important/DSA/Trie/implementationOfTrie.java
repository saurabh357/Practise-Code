package Trie;

import java.util.*;

public class implementationOfTrie {
	class TrieNode {
		Map<Character, TrieNode> child;
		boolean endOfWord;

		TrieNode() {
			this.child = new HashMap<Character, TrieNode>();
			this.endOfWord = false;
		}
	}

	TrieNode root = new TrieNode();

	public void insert(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.child.get(ch);
			if (node == null) {
				node = new TrieNode();
				current.child.put(ch, node);
			}
			current = node;
		}
		current.endOfWord = true;
		System.out.println("Successfully inserted " + word + " in the Trie!");
	}

	public boolean prefixSearch(String s) {
		TrieNode current = root;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			TrieNode node = current.child.get(ch);
			if (node == null) {
				return false;
			}
			current = node;
		}
		return true;
	}

	public boolean search(String s) {
		TrieNode current = root;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			TrieNode node = current.child.get(ch);
			if (node == null) {
				return false;
			}
			current = node;
		}
		return current.endOfWord;
	}

	public boolean delete(TrieNode curr, String str, int index) {
		if (index == str.length()) {
			if (!curr.endOfWord) {
				return false;
			}
			curr.endOfWord = false;
			return curr.child.size() == 0;
		}
		char ch = str.charAt(index);
		TrieNode node = curr.child.get(ch);
		if (node == null)
			return false;
		boolean shouldDel = delete(node, str, index + 1);
		if (shouldDel) {
			curr.child.remove(ch);
			// return true if no mappings are left in the map.
			return curr.child.size() == 0;
		}
		return false;
	}

	public void delete(String str) {
		if (search(str) == true) {
			delete(root, str, 0);
		}
	}

	public static void main(String[] args) {
		implementationOfTrie trie = new implementationOfTrie();
		trie.insert("abc");
		trie.insert("abg");
		trie.insert("lmn");
		System.out.println(trie.prefixSearch("ab"));
		System.out.println(trie.search("abc"));
		trie.delete("abc");
		System.out.println(trie.search("abc"));
	}
}
