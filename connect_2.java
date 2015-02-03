/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }else{
            root.next =null;
        }
        while(root!=null){
            TreeLinkNode nextStartParent = findNextLevelStart(root);
            TreeLinkNode curr = nextStartParent;
            while(curr!=null){
                TreeLinkNode next = findNextNode(curr.next);
                if(curr.left!=null && curr.right!=null){
                    curr.left.next = curr.right;
                    curr.right.next = next;
                }else if(curr.left!=null && curr.right==null){
                    curr.left.next = next;
                }else if(curr.right!=null){
                    curr.right.next = next;
                }
                curr = curr.next;
            }
            root = findChildNode(nextStartParent);
        }
    }
    
    public TreeLinkNode findNextLevelStart(TreeLinkNode node){
        while(node!=null){
            if(node.left!=null || node.right!=null){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public TreeLinkNode findChildNode(TreeLinkNode node){
        if(node==null){
            return null;
        }
        if(node.left!=null){
            return node.left;
        }else{
            return node.right;
        }
    }
    
    public TreeLinkNode findNextNode(TreeLinkNode node){
        while(node!=null){
            TreeLinkNode child = findChildNode(node);
            if(child !=null){
                return child;
            }   
            node = node.next;
        }
        return null;
    }
}/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }else{
            root.next =null;
        }
        while(root!=null){
            TreeLinkNode nextStartParent = findNextLevelStart(root);
            TreeLinkNode curr = nextStartParent;
            while(curr!=null){
                TreeLinkNode next = findNextNode(curr.next);
                if(curr.left!=null && curr.right!=null){
                    curr.left.next = curr.right;
                    curr.right.next = next;
                }else if(curr.left!=null && curr.right==null){
                    curr.left.next = next;
                }else if(curr.right!=null){
                    curr.right.next = next;
                }
                curr = curr.next;
            }
            root = findChildNode(nextStartParent);
        }
    }
    
    public TreeLinkNode findNextLevelStart(TreeLinkNode node){
        while(node!=null){
            if(node.left!=null || node.right!=null){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public TreeLinkNode findChildNode(TreeLinkNode node){
        if(node==null){
            return null;
        }
        if(node.left!=null){
            return node.left;
        }else{
            return node.right;
        }
    }
    
    public TreeLinkNode findNextNode(TreeLinkNode node){
        while(node!=null){
            TreeLinkNode child = findChildNode(node);
            if(child !=null){
                return child;
            }   
            node = node.next;
        }
        return null;
    }
}/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }else{
            root.next =null;
        }
        while(root!=null){
            TreeLinkNode nextStartParent = findNextLevelStart(root);
            TreeLinkNode curr = nextStartParent;
            while(curr!=null){
                TreeLinkNode next = findNextNode(curr.next);
                if(curr.left!=null && curr.right!=null){
                    curr.left.next = curr.right;
                    curr.right.next = next;
                }else if(curr.left!=null && curr.right==null){
                    curr.left.next = next;
                }else if(curr.right!=null){
                    curr.right.next = next;
                }
                curr = curr.next;
            }
            root = findChildNode(nextStartParent);
        }
    }
    
    public TreeLinkNode findNextLevelStart(TreeLinkNode node){
        while(node!=null){
            if(node.left!=null || node.right!=null){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public TreeLinkNode findChildNode(TreeLinkNode node){
        if(node==null){
            return null;
        }
        if(node.left!=null){
            return node.left;
        }else{
            return node.right;
        }
    }
    
    public TreeLinkNode findNextNode(TreeLinkNode node){
        while(node!=null){
            TreeLinkNode child = findChildNode(node);
            if(child !=null){
                return child;
            }   
            node = node.next;
        }
        return null;
    }
}/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }else{
            root.next =null;
        }
        while(root!=null){
            TreeLinkNode nextStartParent = findNextLevelStart(root);
            TreeLinkNode curr = nextStartParent;
            while(curr!=null){
                TreeLinkNode next = findNextNode(curr.next);
                if(curr.left!=null && curr.right!=null){
                    curr.left.next = curr.right;
                    curr.right.next = next;
                }else if(curr.left!=null && curr.right==null){
                    curr.left.next = next;
                }else if(curr.right!=null){
                    curr.right.next = next;
                }
                curr = curr.next;
            }
            root = findChildNode(nextStartParent);
        }
    }
    
    public TreeLinkNode findNextLevelStart(TreeLinkNode node){
        while(node!=null){
            if(node.left!=null || node.right!=null){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public TreeLinkNode findChildNode(TreeLinkNode node){
        if(node==null){
            return null;
        }
        if(node.left!=null){
            return node.left;
        }else{
            return node.right;
        }
    }
    
    public TreeLinkNode findNextNode(TreeLinkNode node){
        while(node!=null){
            TreeLinkNode child = findChildNode(node);
            if(child !=null){
                return child;
            }   
            node = node.next;
        }
        return null;
    }
}/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }else{
            root.next =null;
        }
        while(root!=null){
            TreeLinkNode nextStartParent = findNextLevelStart(root);
            TreeLinkNode curr = nextStartParent;
            while(curr!=null){
                TreeLinkNode next = findNextNode(curr.next);
                if(curr.left!=null && curr.right!=null){
                    curr.left.next = curr.right;
                    curr.right.next = next;
                }else if(curr.left!=null && curr.right==null){
                    curr.left.next = next;
                }else if(curr.right!=null){
                    curr.right.next = next;
                }
                curr = curr.next;
            }
            root = findChildNode(nextStartParent);
        }
    }
    
    public TreeLinkNode findNextLevelStart(TreeLinkNode node){
        while(node!=null){
            if(node.left!=null || node.right!=null){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public TreeLinkNode findChildNode(TreeLinkNode node){
        if(node==null){
            return null;
        }
        if(node.left!=null){
            return node.left;
        }else{
            return node.right;
        }
    }
    
    public TreeLinkNode findNextNode(TreeLinkNode node){
        while(node!=null){
            TreeLinkNode child = findChildNode(node);
            if(child !=null){
                return child;
            }   
            node = node.next;
        }
        return null;
    }
}/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }else{
            root.next =null;
        }
        while(root!=null){
            TreeLinkNode nextStartParent = findNextLevelStart(root);
            TreeLinkNode curr = nextStartParent;
            while(curr!=null){
                TreeLinkNode next = findNextNode(curr.next);
                if(curr.left!=null && curr.right!=null){
                    curr.left.next = curr.right;
                    curr.right.next = next;
                }else if(curr.left!=null && curr.right==null){
                    curr.left.next = next;
                }else if(curr.right!=null){
                    curr.right.next = next;
                }
                curr = curr.next;
            }
            root = findChildNode(nextStartParent);
        }
    }
    
    public TreeLinkNode findNextLevelStart(TreeLinkNode node){
        while(node!=null){
            if(node.left!=null || node.right!=null){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public TreeLinkNode findChildNode(TreeLinkNode node){
        if(node==null){
            return null;
        }
        if(node.left!=null){
            return node.left;
        }else{
            return node.right;
        }
    }
    
    public TreeLinkNode findNextNode(TreeLinkNode node){
        while(node!=null){
            TreeLinkNode child = findChildNode(node);
            if(child !=null){
                return child;
            }   
            node = node.next;
        }
        return null;
    }
}/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }else{
            root.next =null;
        }
        while(root!=null){
            TreeLinkNode nextStartParent = findNextLevelStart(root);
            TreeLinkNode curr = nextStartParent;
            while(curr!=null){
                TreeLinkNode next = findNextNode(curr.next);
                if(curr.left!=null && curr.right!=null){
                    curr.left.next = curr.right;
                    curr.right.next = next;
                }else if(curr.left!=null && curr.right==null){
                    curr.left.next = next;
                }else if(curr.right!=null){
                    curr.right.next = next;
                }
                curr = curr.next;
            }
            root = findChildNode(nextStartParent);
        }
    }
    
    public TreeLinkNode findNextLevelStart(TreeLinkNode node){
        while(node!=null){
            if(node.left!=null || node.right!=null){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public TreeLinkNode findChildNode(TreeLinkNode node){
        if(node==null){
            return null;
        }
        if(node.left!=null){
            return node.left;
        }else{
            return node.right;
        }
    }
    
    public TreeLinkNode findNextNode(TreeLinkNode node){
        while(node!=null){
            TreeLinkNode child = findChildNode(node);
            if(child !=null){
                return child;
            }   
            node = node.next;
        }
        return null;
    }
}/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }else{
            root.next =null;
        }
        while(root!=null){
            TreeLinkNode nextStartParent = findNextLevelStart(root);
            TreeLinkNode curr = nextStartParent;
            while(curr!=null){
                TreeLinkNode next = findNextNode(curr.next);
                if(curr.left!=null && curr.right!=null){
                    curr.left.next = curr.right;
                    curr.right.next = next;
                }else if(curr.left!=null && curr.right==null){
                    curr.left.next = next;
                }else if(curr.right!=null){
                    curr.right.next = next;
                }
                curr = curr.next;
            }
            root = findChildNode(nextStartParent);
        }
    }
    
    public TreeLinkNode findNextLevelStart(TreeLinkNode node){
        while(node!=null){
            if(node.left!=null || node.right!=null){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public TreeLinkNode findChildNode(TreeLinkNode node){
        if(node==null){
            return null;
        }
        if(node.left!=null){
            return node.left;
        }else{
            return node.right;
        }
    }
    
    public TreeLinkNode findNextNode(TreeLinkNode node){
        while(node!=null){
            TreeLinkNode child = findChildNode(node);
            if(child !=null){
                return child;
            }   
            node = node.next;
        }
        return null;
    }
}/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }else{
            root.next =null;
        }
        while(root!=null){
            TreeLinkNode nextStartParent = findNextLevelStart(root);
            TreeLinkNode curr = nextStartParent;
            while(curr!=null){
                TreeLinkNode next = findNextNode(curr.next);
                if(curr.left!=null && curr.right!=null){
                    curr.left.next = curr.right;
                    curr.right.next = next;
                }else if(curr.left!=null && curr.right==null){
                    curr.left.next = next;
                }else if(curr.right!=null){
                    curr.right.next = next;
                }
                curr = curr.next;
            }
            root = findChildNode(nextStartParent);
        }
    }
    
    public TreeLinkNode findNextLevelStart(TreeLinkNode node){
        while(node!=null){
            if(node.left!=null || node.right!=null){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public TreeLinkNode findChildNode(TreeLinkNode node){
        if(node==null){
            return null;
        }
        if(node.left!=null){
            return node.left;
        }else{
            return node.right;
        }
    }
    
    public TreeLinkNode findNextNode(TreeLinkNode node){
        while(node!=null){
            TreeLinkNode child = findChildNode(node);
            if(child !=null){
                return child;
            }   
            node = node.next;
        }
        return null;
    }
}
