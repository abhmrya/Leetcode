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
    public List<Integer> helper(TreeNode root,int sum ,List<Integer> list){
        if(root==null){
            return list;
        }
        if(root.right==null && root.left==null){
            list.add(sum*10+root.val);
            return list;
        }
        helper(root.left,sum*10+root.val,list);
        helper(root.right,sum*10+root.val,list);
        return list;
    }
    public int sumNumbers(TreeNode root) {
        int sum =0;
        List<Integer> list = new ArrayList<>();
        List<Integer> lst = helper(root,0,list);
        for(int i : lst){
            sum+=i;
        }   
        return sum;
    }
}