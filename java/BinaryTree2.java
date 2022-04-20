public class BinaryTree2 {
    class Node {
        int data;
        // 왼쪽 노드 저장 변수
        Node left;

        // 오른쪽 노드 저장 변수
        Node right;

        Node (int data) {
            this.data = data;
        }
    }

    // class의 멤버 변수
    Node root;

    // 재귀호출에 필요한 데이터를 처음으로 지정
    // 재귀호출이 끝나면 root 노드의 주소를 받아서 멤버변수에 저장
    public void makeTree(int[] array) {
        root = makeTreeR(array,0,array.length-1);
    }


    public Node makeTreeR(int[] array,int start,int end) {
        if (start > end) {
            return null;
        }

        int mid = (start+end)/2;

        Node node = new Node(array[mid]);
        node.left = makeTreeR(array,start,mid-1);
        node.right = makeTreeR(array,mid+1,end);

        return node;
    }


    public void searchBTree(Node node,int find) {
        if (find < node.data) {
            System.out.println("Data is smaller than : " + node.data);
            searchBTree(node.left,find);
        } else if (find > node.data) {
            System.out.println("Data is bigger than : " + node.data);
            searchBTree(node.right,find);
        } else {
            System.out.println("Data found!");
        }
    }
}


class BinaryTreeTest {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i=0;i<10;i++) {
            array[i] = i;
        }

        BinaryTree2 tree = new BinaryTree2();
        tree.makeTree(array);
        tree.searchBTree(tree.root,6);
    }
}
