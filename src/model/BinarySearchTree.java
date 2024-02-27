package model;

/**
 *
 * @author nhs
 * @param <T>
 */
public class BinarySearchTree<T extends Comparable<T>> {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node<T> search(Node<T> p, T x) {
        if (p == null) {
            return (null);
        }
        if (x.compareTo(p.getData()) == 0) {
            return (p);
        }
        if (x.compareTo(p.getData()) < 0) {
            return (search(p.getLeft(), x));
        } else {
            return (search(p.getRight(), x));
        }

    }

    public void insert(T x) {
        if (root == null) {
            root = new Node(x, null, null);
            return;
        }
        Node<T> f, p;
        p = root;
        f = null;
        while (p != null) {
            if (x.compareTo(p.getData()) == 0) {
                System.out.println(" The key " + x + " already exists, no insertion");
                return;
            }
            f = p;
            if (x.compareTo(p.getData()) < 0) {
                p = p.getLeft();
            } else {
                p = p.getRight();
            }
        }
        if (x.compareTo(f.getData()) < 0) {
            f.setLeft(new Node(x, null, null));
//            System.out.print("left: ");
//            f.getLeft().toString();
        } else {
            f.setRight(new Node(x, null, null));
//            System.out.print("right: ");
//            f.getRight().toString();
        }
    }

    public void inOrderTraversal(Node<T> p) {
            if (p == null) {
                return;
            }
            inOrderTraversal(p.getLeft());
            visit(p);
            inOrderTraversal(p.getRight());
    }
    
    public void visit (Node<T> p){
        p.toString();
    }
    
    public Node<T> getRoot(){
        return root;
    }
    

    public void deleteByCopying(T key) {
        root = BinarySearchTree.this.deleteByCopying(root, key);
    }

    private Node<T> deleteByCopying(Node<T> p, T key) {
        if (p == null) {
            return null;
        }

        if (key.compareTo(p.getData()) < 0) {
            p.setLeft(BinarySearchTree.this.deleteByCopying(p.getLeft(), key)) ;
        }
        
        else if (key.compareTo(p.getData()) > 0) {
            p.setRight(BinarySearchTree.this.deleteByCopying(p.getRight(), key)) ;
        }
        
        else {
            
            if (p.getLeft() == null) {
                return p.getRight();
            } else if (p.getRight() == null) {
                return p.getLeft();
            }
            
            Node<T> left = p.getLeft();
            Node<T> right = p.getRight();
            Node<T> min = findMin(p.getRight());
            p = new Node<T>(min.getData(),null,null);
            p.setRight(BinarySearchTree.this.deleteByCopying(right, min.getData()));
            p.setLeft(left);
        }

        return p;
    }

    private Node<T> findMin(Node<T> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

}



