/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a = new ArrayList<>();
        if(root==null){
            return a;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int l=q.size();
            List<Integer> cur=new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode curnode=q.poll();
                cur.add(curnode.val);

                if(curnode.left!=null){
                    q.add(curnode.left);
                }
                if(curnode.right!=null){
                    q.add(curnode.right);
                }
            }
            a.add(cur);
        }
        return a;
    }
}