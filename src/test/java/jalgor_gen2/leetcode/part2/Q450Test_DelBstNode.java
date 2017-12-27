package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.mapper.TreeNodeMapper;
import jalgor_gen2.structure.TreeNode;

public class Q450Test_DelBstNode extends AbstractTest<TreeNode> {

    Q450_DelBstNode sol = new Q450_DelBstNode();
    
    @Override
    protected void baseTest(TreeNode expected, TreeNode actual) {
	Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void test1() {
	
	String[] vals1 = {"2", "1", "3", "#", "#", "#", "4"};
	TreeNode root1 = TreeNodeMapper.toTreeNode(vals1);
	
	String[] vals2 = {"2", "1", "3"};
	TreeNode root2 = TreeNodeMapper.toTreeNode(vals2);
	
	baseTest(root2, sol.deleteNode(root1, 4));
    }
    
    
    @Test
    public void test2() {
	
	String[] vals1 = {"2", "1", "3", "#", "#", "#", "4"};
	TreeNode root1 = TreeNodeMapper.toTreeNode(vals1);
	
	String[] vals2 = {"2", "1", "4"};
	TreeNode root2 = TreeNodeMapper.toTreeNode(vals2);
	
	baseTest(root2, sol.deleteNode(root1, 3));
    }
    
    
    @Test
    @Ignore
    public void test3() {
	
	String[] vals1 = {"6", "2", "5", "1", "4", "#", "#", "#", "#", "3"};
	TreeNode root1 = TreeNodeMapper.toTreeNode(vals1);
	
	String[] vals2 = {"6", "3", "5", "1", "4"};
	TreeNode root2 = TreeNodeMapper.toTreeNode(vals2);
	
	baseTest(root2, sol.deleteNode(root1, 2));
    }
    
    
    @Test
    public void test4() {
	
	String[] vals1 = {"7", "3", "8", "1", "2", "#", "9"};
	TreeNode root1 = TreeNodeMapper.toTreeNode(vals1);
	
	String[] vals2 = {"7", "3", "9", "1", "2"};
	TreeNode root2 = TreeNodeMapper.toTreeNode(vals2);
	
	baseTest(root2, sol.deleteNode(root1, 8));
    }
    
    
    @Test
    public void test5() {
	
	String[] vals1 = {"4", "3","8", "1","2","5","#", "#","#","#","#","#","6" };
	TreeNode root1 = TreeNodeMapper.toTreeNode(vals1);
	
	String[] vals2 = {"4", "3", "5", "1", "2", "#", "6"};
	TreeNode root2 = TreeNodeMapper.toTreeNode(vals2);
	
	baseTest(root2, sol.deleteNode(root1, 8));
    }
    
    
    @Test
    @Ignore
    public void test6() {
	
	String[] vals1 = {"4", "3","8", "1","2","5","#", "#","#","#","#","#","6" };
	TreeNode root1 = TreeNodeMapper.toTreeNode(vals1);
	
	String[] vals2 = {"5", "3", "8", "1", "2", "6"};
	TreeNode root2 = TreeNodeMapper.toTreeNode(vals2);
	
	baseTest(root2, sol.deleteNode(root1, 4));
    }
    
}
