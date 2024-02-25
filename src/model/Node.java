package model;

/**
 *
 * @author nhs
 * @param <T>
 */
public class Node<T extends Comparable<T>> {

    private T data;
    private Node left;
    private Node right;

    public Node(T data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    
    
    
    @Override
    public String toString() {
        return data.toString();
    }
}
