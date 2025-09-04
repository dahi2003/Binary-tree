package trees;

public class size_of_binary_tree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int i) {
            this.val=i;
        }
    }
    public static int height(Node root){
        if(root==null ||(root.left==null && root.right==null)){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static int  max_value(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int a=root.val;
        int b=max_value(root.left);
        int c=max_value(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int sum_of_roots(Node root){
        if(root==null)
            return 0;
        return root.val+sum_of_roots(root.left)+sum_of_roots(root.right);
    }

    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;
    }
//    public static void preorder(Node root){
//     if(root==null){
//         return;
//     }
//        System.out.print(root.val+" "); / count++;(count is a global variable)
//     preorder(root.left);
//        preorder(root.right);
//    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;

        System.out.println(size(root));
        System.out.println(sum_of_roots(root));
        System.out.println(max_value(root));
        System.out.println(height(root));
    }
}
