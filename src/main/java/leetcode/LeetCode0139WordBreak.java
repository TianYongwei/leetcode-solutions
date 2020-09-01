package leetcode;

import java.util.*;

public class LeetCode0139WordBreak {
    List<LinkedList<String>> res = new ArrayList<LinkedList<String>>();
    Set<String> wordSet = new HashSet<>();

    // todo
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.size() == 0) return false;

        // 初始化
        wordDict.forEach(w -> {
            wordSet.add(w);
        });

        backTrace(s, 0, new LinkedList<String>());

        HashSet<String> resSet = new HashSet<>();
        res.forEach(l -> {
            l.forEach(str -> {
                resSet.add(str);
            });
        });

        if(wordSet.containsAll(resSet)) {
            return true;
        } else {
            return false;
        }
    }

    private void backTrace(String s, int i, LinkedList<String> trace) {
        if(i >= s.length()) {
            res.add(new LinkedList<>(trace));
            return;
        }

        int stepLen = s.length() - i;
        for (int j = 0; j < stepLen; j++) {
            String target = s.substring(i, i+j+1);
            if(!judge(target)) {
                continue;
            }
            trace.add(target);
            backTrace(s, i+j+1, trace);
            trace.removeLast();
        }
    }

    private boolean judge(String target) {
        return wordSet.contains(target);
    }
}
