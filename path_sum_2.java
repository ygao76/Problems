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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null){
            return new ArrayList<List<Integer>>();
        }
        ArrayList<Integer> path = new ArrayList<Integer>();
        return DFS(root, 0, sum, path);
    }

    public List<List<Integer>> DFS(TreeNode node, int sum, int target, ArrayList<Integer> path){
        sum = sum + node.val;
        path.add(node.val);
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        if(node.left==null && node.right==null && sum==target){
            paths.add(path);
        }else{
            if(node.left!=null){
              paths.addAll(DFS(node.left, sum, target, copy(path)));
            }
            if(node.right!=null){
              paths.addAll(DFS(node.right, sum, target, path));
            }
        }
        return paths;
    }
    
    public ArrayList<Integer> copy(ArrayList<Integer> path){
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.addAll(path);
        return res;
    }
}

