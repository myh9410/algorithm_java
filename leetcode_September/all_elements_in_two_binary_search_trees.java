package leetcode_sep;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class all_elements_in_two_binary_search_trees {
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(4));
		TreeNode root2 = new TreeNode(1, new TreeNode(0),new TreeNode(3));
		System.out.println(sol.getAllElements(root1, root2));
	}
}



//Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
	}
}


class Solution5 {
	static List<Integer> tmp1;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
    	tmp1 = new LinkedList<Integer>();
    	inOrder(root1);
    	inOrder(root2);
    	Collections.sort(tmp1);
        return tmp1;
    }

	private void inOrder(TreeNode node) {
		if (node == null) return;
		inOrder(node.left);
		tmp1.add(node.val);
		inOrder(node.right);
	}
}
