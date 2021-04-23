package assignment8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class q3 {
	public static void main(String[] args) {
        LinkedList<String> wordList = new LinkedList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        System.out.println("queue " + wordList);

        System.out.println(ladderLength("hit", "cog", wordList));

    }
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (!wordList.contains(endWord)) {
			return 0;
		}
		Set<String> visited = new HashSet<>();
		Queue<String> queue = new LinkedList<>();
		queue.offer(beginWord);
		visited.add(beginWord);
		int count = 0;
		while (queue.size() > 0) {
			int size = queue.size();
			++count;
			for (int i = 0; i < size; ++i) {
				String start = queue.poll();
				for (String s : wordList) {
					// If visited, don't visit again
					if (visited.contains(s)) {
						continue;
					}
					// skip those that can't be converted
					if (!canConvert(start, s)) {
						continue;
					}
					if (s.equals(endWord)) {
						return count + 1;
					}
					visited.add(s);
					queue.offer(s);
				}
			}
		}
		return 0;
	}

	public static boolean canConvert(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		int count = 0;
		for (int i = 0; i < s1.length(); ++i) {
			if (s1.charAt(i) != s2.charAt(i)) {
				++count;
				if (count > 1) {
					return false;
				}
			}
		}
		return count == 1;
	}
}
