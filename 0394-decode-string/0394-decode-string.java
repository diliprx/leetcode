class Solution {
    public String decodeString(String a) {
        Stack<StringBuilder> s = new Stack<>();
        Stack<Integer> n = new Stack<>();
        StringBuilder curstr = new StringBuilder();
        int curnum = 0;
        for (char i : a.toCharArray()) {
            if (Character.isDigit(i)) {
                curnum = curnum * 10 + (i - '0');
            } else if (i == '[') {
                n.push(curnum);
                s.push(curstr);
                curstr = new StringBuilder();
                curnum = 0;
            } else if (i == ']') {
                StringBuilder decostr = s.pop();
                int k = n.pop();

                for (int j = 0; j < k; j++) {
                    decostr.append(curstr);
                }
                curstr = decostr;
            } else {
                curstr.append(i);
            }
        }
        System.out.println(n);
        System.out.print(s);
        return curstr.toString();
    }
}