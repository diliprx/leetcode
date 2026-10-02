class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        backtrack(n, 0, 0, new StringBuilder(), answer);
        return answer;
    }

    private void backtrack(int n, int open, int close,
                           StringBuilder path, List<String> answer) {
        if (path.length() == 2 * n) {
            answer.add(path.toString());
            return;
        }

        if (open < n) {
            path.append('(');
            backtrack(n, open + 1, close, path, answer);
            path.deleteCharAt(path.length() - 1);
        }

        if (close < open) {
            path.append(')');
            backtrack(n, open, close + 1, path, answer);
            path.deleteCharAt(path.length() - 1);
        }
    }
}