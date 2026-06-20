class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        final String[] MORSE = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        Set<String> uniqueTransformations = new HashSet<>();
        
        for (String word : words) {
            StringBuilder transformation = new StringBuilder();
            
            for (char c : word.toCharArray()) {
                transformation.append(MORSE[c - 'a']);
            }
            
            uniqueTransformations.add(transformation.toString());
        }
        
        return uniqueTransformations.size();
    }
}
