class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> a = new HashMap<>();
        for(String b:strs){
            char[] c=b.toCharArray();
            Arrays.sort(c);
            String d=new String(c);


            if(!a.containsKey(d)){
                a.put(d,new ArrayList<>());
            }
            a.get(d).add(b);
        }
        return new ArrayList<>(a.values());
    }
}