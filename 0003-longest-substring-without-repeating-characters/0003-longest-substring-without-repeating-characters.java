class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int l=0;
        // int r=0;
        // String res="";
        // Set<Character> b=new HashSet<>();
        // while(r<s.length()){
        //     char a=s.charAt(r);
        //     while(b.contains(a)){
        //         b.remove(l);
        //         l++;
        //     }
        //     b.add(s.charAt(r));
        //     r++;
        //     if(r-l>res.length()){
        //         res=s.substring(l,r);
        //     }
        // }
        int l=0;
		int r=0;
		String res="";
		ArrayList<Character>b=new ArrayList<>();
		while(r<s.length()){
		    char c=s.charAt(r);
		    while(b.contains(c)){
		        b.remove((Character)s.charAt(l));
		        l++;
		    }
		    b.add(s.charAt(r));
		    r++;
		    if(r-l>res.length()){
		        res=s.substring(l,r);
		    }
		}
        return res.length();
    }
}