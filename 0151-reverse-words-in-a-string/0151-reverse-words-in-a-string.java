class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String a[]=s.split("\\s+");
        ArrayList<String>b=new ArrayList<>();
        for(int i=a.length-1;i>=0;i--){
           b.add(a[i]);
        }
        return String.join(" ",b);
    }
}