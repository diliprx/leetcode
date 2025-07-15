class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;

        for(char c:word.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            if(Character.isLetter(c)){
                char l=Character.toLowerCase(c);
                if("aeiou".indexOf(l)!=-1){
                    hasVowel= true;
                }
                else{
                    hasConsonant=true;
                }
            }
        } 

        return hasVowel && hasConsonant;
    }
}