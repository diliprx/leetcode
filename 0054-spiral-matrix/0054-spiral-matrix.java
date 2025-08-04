class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> a=new ArrayList<>();
        int cs=0,rs=0;
        int re=m.length-1;
        int ce=m[0].length-1;

        while(cs<=ce && rs<=re){

        for(int i=cs;i<=ce;i++){
            a.add(m[rs][i]);
        }
        rs++;
        for(int i=rs;i<=re;i++){
            a.add(m[i][ce]);
        }
        ce--;

        if(rs<=re){
        for(int i=ce;i>=cs;i--){
            a.add(m[re][i]);
        }
        re--;
        }
        if(cs<=ce){
        for(int i=re;i>=rs;i--){
            a.add(m[i][cs]);
        }
        cs++;
        }
        }
        return a;

        
    }
}