package trees;

public class tree_implementation {
        public static class Node{
        int val;
        Node right;//null
        Node left;//null

            public Node(int i) {
                this.val=i;
            }
        }
        public static void display(Node root){
            if(root==null){
                return ;
            }
            System.out.print(root.val+"->");
            if(root.left!=null) System.out.print(root.left.val+"");
            if (root.right!=null) System.out.print(root.right.val);
            System.out.println();
            display(root.left);
            display(root.right);
        }
    public static void main(String[] args)  {
            Node root=new Node(10);
        Node a=new Node(1);
        Node b=new Node(2);
        root.left=a;
        root.right=b;
        Node c=new Node(3);
        Node d=new Node(4);
        a.left=c;
        a.right=d;
        Node e=new Node(5);
        b.right=e;
        System.out.println(root.val);
        System.out.println(root.left);
        display(root);
    }

}
