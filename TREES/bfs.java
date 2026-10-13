package TREES;
import java.util.*;
public class bfs {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        bfsTraversal(root);
    }
    public static void bfsTraversal(TreeNode root){
        if (root==null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode current = q.poll();
            System.out.print(current.data + " ");
            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add (current.right);
            
        }
    }

}
