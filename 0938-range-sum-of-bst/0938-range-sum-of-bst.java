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
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> a = new ArrayList<>();
        inorder(root,a);
        Collections.sort(a);
        int sum=0;
        for(int i=0;i<a.size();i++){
           if(a.get(i)>=low && a.get(i)<=high){
                sum+=a.get(i);
            }
        }
        return sum;
    }
    public void inorder(TreeNode root,ArrayList<Integer>a){
        if(root==null){
            return;
        }
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
}