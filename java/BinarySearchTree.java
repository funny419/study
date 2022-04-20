import java.util.Scanner;

public class BinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }
    }

    public Node root;




    public static Node circularSearch(Node node,int key) {
        if (node == null) {
            return null;
        }

        if (key == node.data) {
            return node;
        } else if (key < node.data) {
            return circularSearch(node.left,key);
        } else {
            return circularSearch(node.right,key);
        }
    }


    public static Node repetitiveSearch(Node node,int key) {
        while (node != null) {
            if (key == node.data) {
                return node;
            } else if (key < node.data) {
                node = node.left;
            } else {
                node = node.right;
            }
        }

        return null;
    }


    public Node insertNode(Node node,int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.data) {
            node.left = insertNode(node.left,key);
        } else if (key > node.data) {
            node.right = insertNode(node.right,key);
        }

        return node;
    }


    public Node deleteNode(Node root,int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = deleteNode(root.left,key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right,key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right,temp.data);
        }

        return root;
    }


    public Node minValueNode(Node node) {
        Node currentNode = node;
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }

        return currentNode;
    }


    public void inOrder(Node node) {
        if (node != null) {
            if (node.left != null) {
                inOrder(node.left);
            }
            System.out.print(node.data + " ");
            if (node.right != null) {
                inOrder(node.right);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinarySearchTree t = new BinarySearchTree();

        for (int i=0;i<n;i++) {
            int key = sc.nextInt();
            if (circularSearch(t.root,key) == null) {
                t.root = t.insertNode(t.root,key);
            }
        }

        System.out.println("\n이진 탐색 트리 중위 순회");
        t.inOrder(t.root);

        if (repetitiveSearch(t.root,68) != null) {
            System.out.println("\n\n68 탐색 성공");
        } else {
            System.out.println("\n\n68 탐색 실패");
        }

        System.out.println("\n1. 단말 노드 삭제 - 30 삭제 ");
        t.deleteNode(t.root, 30);
        t.inOrder(t.root);

        System.out.println("\n\n2. 하나의 서브트리만 가진 노드 삭제 - 68 삭제 ");
        t.deleteNode(t.root, 68);
        t.inOrder(t.root);

        System.out.println("\n\n3. 두개의 서브트리를 가진 노드 삭제 - 18 삭제 ");
        t.deleteNode(t.root, 18);
        t.inOrder(t.root);
    }
}
