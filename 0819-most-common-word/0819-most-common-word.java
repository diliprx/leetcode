class Solution {
    public String mostCommonWord(String p, String[] banned) {
         Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }
        String[] words = p.toLowerCase().replaceAll("[^a-zA-Z]+", " ").split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        String mostCommon = "";
        int maxFreq = 0;

        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            if (wordCount.get(word) > maxFreq) {
                maxFreq = wordCount.get(word);
                mostCommon = word;
            }
        }
        return mostCommon;
    }
}