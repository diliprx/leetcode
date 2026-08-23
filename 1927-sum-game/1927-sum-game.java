class Solution {
    public boolean sumGame(String s) {
        //constaints
        int n = s.length();
        int m = n / 2;
        //left part
        int lq = 0;
        int ls = 0;
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) == '?') {
                lq++;
            } else {
                ls += s.charAt(i) - '0'; //49-48=0;
            }
        }

        //right part
        int rq = 0;
        int rs = 0;
        for (int i = m; i < n; i++) {
            if (s.charAt(i) == '?') {
                rq++;
            } else {
                rs += s.charAt(i) - '0';
            }
        }

        //sum diff
        int sd = ls - rs;
        //q diff;
        int qd = lq - rq;
        if (qd == 0) {
            if (sd == 0) {
                return false; //Bob win;
            } else {
                return true; //Alice win;
            }
        }
        else if((lq+rq)%2!=0){
            return true;  //alice win
        }

        else {
            int p = qd / 2;
            int maxd = -9 * p;
            if (maxd == sd) {
                return false;   //a;ice win
            } else {
                return true;  //bob  win;
            }
        }

    }
}