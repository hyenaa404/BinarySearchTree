
package model;

/**
 *
 * @author nhs
 */
public class BookList extends BinarySearchTree <Book> {

    public BookList() {
        super();
    }

    public void displayList(Node<Book> p){
        System.out.printf("%-20s| %-20s| %-20s\n", "SIBN", "TITLE", "AUTHOR");
        super.inOrderTraversal(p);
    }
    
    
    
}
