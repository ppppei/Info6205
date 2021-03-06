package assignment6;

import javax.swing.tree.TreeNode;

public class q1 {
	
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	 }
	 
	class Solution {
	    public boolean isSubtree(TreeNode s, TreeNode t) {
	        if (t == null) return true;   
	        if (s == null) return false;  
	        return isSubtree(s.left,t) || isSubtree(s.right, t) || isSameTree(s,t);
	    }

		/**
		 * see if it is the same tree
		 */
	    public boolean isSameTree(TreeNode s, TreeNode t){
	        if (s == null && t == null) return true;
	        if (s == null || t == null) return false;
	        if (s.val != t.val) return false;
	        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
	    }
	}
}
