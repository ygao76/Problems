/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> layerValue;
        List<TreeNode> currLayer = new ArrayList<TreeNode>();
        List<TreeNode> nextLayer;
        currLayer.add(root);
        while(currLayer.size()!=0){
            
            nextLayer = new ArrayList<TreeNode>();
            layerValue = new ArrayList<Integer>();
            for(TreeNode node: currLayer){
                if(node!=null){
                    nextLayer.add(node.left);
                    nextLayer.add(node.right);
                    layerValue.add(node.val);
                }
            }
            currLayer = nextLayer;
            if(layerValue.size()!=0){
                result.add(layerValue);
            }
        }
        return result;
    }
}
