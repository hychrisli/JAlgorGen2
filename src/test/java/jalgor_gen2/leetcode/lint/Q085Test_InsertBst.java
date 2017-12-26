package jalgor_gen2.leetcode.lint;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.mapper.TreeNodeMapper;
import jalgor_gen2.structure.TreeNode;

public class Q085Test_InsertBst extends AbstractTest<TreeNode> {

    Q085_InsertBst sol = new Q085_InsertBst();
    
    @Override
    protected void baseTest(TreeNode expected, TreeNode actual) {
	Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void test1() {
	String[] vals1 = {"2", "1", "3"};
	TreeNode root1 = TreeNodeMapper.toTreeNode(vals1);
	
	String[] vals2 = {"2", "1", "3", "#", "#", "#", "4"};
	TreeNode root2 = TreeNodeMapper.toTreeNode(vals2);
	
	baseTest(root2, sol.insertNode(root1, new TreeNode(4)));
    }
    
    
    @Test
    public void test2() {
	String[] vals1 = {"2", "1", "4"};
	TreeNode root1 = TreeNodeMapper.toTreeNode(vals1);
	
	String[] vals2 = {"2", "1", "4", "#", "#", "3"};
	TreeNode root2 = TreeNodeMapper.toTreeNode(vals2);
	
	baseTest(root2, sol.insertNode(root1, new TreeNode(3)));
    }
    
    
}
