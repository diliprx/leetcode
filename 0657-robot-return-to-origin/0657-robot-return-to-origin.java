class Solution {
    public boolean judgeCircle(String moves) {
    int u=0,d=0,r=0,l=0;
    for(char c:moves.toCharArray()){
        if(c=='U'){
            u++;
        }
        else if(c=='D'){
            d++;
        }
        else if(c=='L'){
            l++;
        }
        else if(c=='R'){
            r++;
        }
    }
    return (u==d) && (r==l);
    }
}
