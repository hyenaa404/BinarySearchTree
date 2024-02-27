
package model;

/**
 *
 * @author nhs
 */
public class BookTree extends BinarySearchTree <Book> {

    public BookTree() {
        super();
    }

    public void displayList(Node<Book> p){
        System.out.printf("%-20s| %-20s| %-20s\n", "SIBN", "TITLE", "AUTHOR");
        super.inOrderTraversal(p);
    }
    
    
    
}
