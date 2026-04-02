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
    public TreeNode sortedArrayToBST(int[] nums) {
        return abc(nums,0,nums.length-1);
    }
    public TreeNode abc(int[] nums,int a,int b){
        if(a>b){
            return null;
        }
        int c=(a+b)/2;
        TreeNode root=new TreeNode(nums[c]);
        root.left=abc(nums,a,c-1);
        root.right=abc(nums,c+1,b);
        return root;
    }
}