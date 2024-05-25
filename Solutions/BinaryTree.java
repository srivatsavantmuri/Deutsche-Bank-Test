/*
2) Define and implement a class(es), representing binary tree with integer-values nodes

Define and implement methods:
1.	find maximum value
2.	calculate tree depth */


class Node{

    int value;
    Node left;
    Node right;

    Node(int value){

        this.value = value;
        this.left = null;
        this.right = null;
    }
}

 class TreeUtil{

    static int max = Integer.MIN_VALUE;
    public static int findMaxValue(Node root){

        if(root == null)
            return -1;

        if(root.left == null && root.right == null)
            return root.value;

        int left = findMaxValue(root.left);
        int right = findMaxValue(root.right);

        return Math.max(TreeUtil.max, Math.max(left,right));

    }

    public static int findTreeDepth(Node root){

        if(root == null)
            return 0;

        int left = findTreeDepth(root.left);
        int right = findTreeDepth(root.right);

        return Math.max(left, right)+1;

    }
}

public class Main {


    public static void main(String[] args) {


        Node head = new Node(5);
        head.left = new Node(3);
        head.right = new Node(2);
        head.left.left = new Node(10);
        head.left.right = new Node(11);

        System.out.printf("Max Value in Binary Tree: %d%n",TreeUtil.findMaxValue(head));
        System.out.printf("Depth of Binary Tree: %d%n",TreeUtil.findTreeDepth(head));

    }
}
