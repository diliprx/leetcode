class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> a = new ArrayList<>();
        for(String i:operations){
            int n=a.size();
            if(i.equals("+")){
                a.add(a.get(n-1)+a.get(n-2));
            }
            else if(i.equals("C")){
                a.remove(n-1);
            }
            else if(i.equals("D")){
                a.add(a.get(n-1)*2);
            }
            else{
                a.add(Integer.parseInt(i));
            }
        }
        int c=0;
        for(int i:a){
            c+=i;
        }
        return c;
    }
}