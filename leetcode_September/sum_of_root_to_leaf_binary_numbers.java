package leetcode_sep;

public class sum_of_root_to_leaf_binary_numbers {
	public static void main(String[] args) {
		Solution sol = new Solution();
		TreeNode node = new TreeNode(1, new TreeNode(0, new TreeNode(0, null, null), new TreeNode(1, null, null)), new TreeNode(1, new TreeNode(0, null, null), new TreeNode(1, null, null)));
		int answer = sol.sumRootToLeaf(node);
		System.out.println(answer);
	}
}
class Solution {
	static int answer;
    public int sumRootToLeaf(TreeNode root) {
    	//int decimal=Integer.parseInt(binaryString,2);
    	answer = 0;
    	String binary = "";
        checkLeaf(binary,root);
    	return answer;
    }

	private void checkLeaf(String binary, TreeNode node) {
		String tmp = binary+node.val;
		if (node.left == null && node.right == null) {
			answer += Integer.parseInt(tmp, 2);
			return;
		}
		if (node.left != null) checkLeaf(tmp, node.left);
		if (node.right != null) checkLeaf(tmp, node.right);
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
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
