package BinaryTreeLevelOrderTraversal_LT_102;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

 class Approach1 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {           //default constructor

      }
      TreeNode(int val) {     //constructor with value
          this.val = val;
      }
      TreeNode(int val, TreeNode left, TreeNode right) {   //constructor with value, left, right node
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

        public static List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> list = new LinkedList<>();
            if (root == null) return list;
            queue.offer(root);

            while (!queue.isEmpty()) {
                int levelNumber = queue.size();
                List<Integer> subList = new LinkedList<>();
                for (int i = 0; i < levelNumber; i++) {
                    if (queue.peek().left != null) queue.offer(queue.peek().left);
                    if (queue.peek().right != null) queue.offer(queue.peek().right);
                    subList.add(queue.poll().val);
                }
                list.add(subList);
            }
          return list;
        }


        public static void main(String[] args) {

        }

}
