import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node head;
    int size;

    public BinaryTree() {
        head = null;
        size = 0;
    }

    public void push(Node node) {
        if (size == 0) {
            Node nd = node;
            head = nd;
        } else {
            Node nd = head;
            Queue<Node> q = new LinkedList<>();
            q.add(nd);

            while (!q.isEmpty()) {
                Node temp = q.poll();

                if (temp.left == null) {
                    temp.left = nd;
                    break;
                } else {
                    q.add(temp.left);
                }

                if (temp.right == null) {
                    temp.right = nd;
                    break;
                } else {
                    q.add(temp.right);
                }
            }
        }
        size++;
    }


    public int pop(Node node) {
        if (contain(node)) {
            Node lastNode = removeLastNode();

            if (head != null) {
                if (isSame(head,node)) {
                    head.value = lastNode.value;
                } else {
                    Queue<Node> queue = new LinkedList<>();
                    queue.add(head);

                    while (!queue.isEmpty()) {
                        Node temp = queue.poll();

                        if (temp.left != null) {
                            if (isSame(temp.left,node)) {
                                temp.left.value = lastNode.value;
                                break;
                            }

                            queue.add(temp.left);
                        }

                        if (temp.right != null) {
                            if (isSame(temp.right,node)) {
                                temp.right.value = lastNode.value;
                                break;
                            }
                        }
                    }
                }
            }

            size--;

            return 1;
        }

        return 0;
    }


    public boolean contain(Node node) {
        boolean check = false;

        if (size != 0) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()) {
                Node temp = queue.poll();

                if (isSame(temp,node)) {
                    check = true;
                    break;
                }

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }

        return check;
    }


    private Node removeLastNode() {
        Node last = head;

        if (size == 1) {
            head = null;
            return last;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(last);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            last = temp;

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        queue.add(head);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left != null) {
                if (isSame(temp.left,last)) {
                    temp.left = null;
                    break;
                }

                queue.add(temp.left);
            }

            if (temp.right != null) {
                if (isSame(temp.right,last)) {
                    temp.right = null;
                    break;
                }

                queue.add(temp.right);
            }
        }

        return last;
    }


    private boolean isSame(Node source,Node target) {
        return source.value == target.value &&
                source.left == target.left &&
                source.right == target.right;
    }


    public void printBFS(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.println(temp.value);

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }


    public void printDFS(Node node) {
        if (node.left == null && node.right == null) {
            System.out.println(node.value);
        } else {
            if (node.left != null) {
                printDFS(node.left);
            }

            System.out.println(node.value);

            if (node.right != null) {
                printDFS(node.right);
            }
        }
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}


class BinaryTreeProcess {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(7);
        Node node4 = new Node(4);
        Node node5 = new Node(2);

        binaryTree.push(node1);
        binaryTree.push(node2);
        binaryTree.push(node3);
        binaryTree.push(node4);
        binaryTree.push(node5);

        System.out.println("BFS로 탐색합니다.");
        binaryTree.printBFS(node1);

        System.out.println("DFS로 탐색합니다.");
        binaryTree.printDFS(node1);
    }
}
