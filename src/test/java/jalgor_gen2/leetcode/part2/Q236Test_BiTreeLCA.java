package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.mapper.TreeNodeMapper;
import jalgor_gen2.structure.TreeNode;

public class Q236Test_BiTreeLCA extends AbstractTest<TreeNode> {

    Q236_BiTreeLCA sol = new Q236_BiTreeLCA();
    
    @Override
    protected void baseTest(TreeNode expected, TreeNode actual) {
	System.out.println(actual.toString());
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	TreeNode root = TreeNodeMapper.toTreeNode(new String[] {"1","2","3","4","5","6","7"});
	TreeNode p = root.left.left;
	TreeNode q = root.right.right;
	baseTest(root, sol.lowestCommonAncestor(root, p, q));
    }
    
    @Test
    public void test2() {
	TreeNode root = TreeNodeMapper.toTreeNode(new String[] {"1","2","3","4","5","6","7"});
	TreeNode p = root.left;
	TreeNode q = root.left.right;
	baseTest(root.left, sol.lowestCommonAncestor(root, p, q));
    }
    
    
    @Test
    public void test3() {
	TreeNode root = TreeNodeMapper.toTreeNode(new String[] {"1","2","3","4","5","6","7"});
	TreeNode p = root.right.left;
	TreeNode q = root.right.right;
	System.out.println(root.right.val);
	baseTest(root.right, sol.lowestCommonAncestor(root, p, q));
    }
    
}
