/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Book;
import model.BookTree;
import model.Node;
import util.InputUtils;

/**
 *
 * @author nhsuongg
 */
public class Controller {
    public static void main(String[] args) {
        int choice;
        BookTree bl = new BookTree();
        while (true) {
            choice = Menu.chooseInputOption();
            switch (choice) {
                case 1 -> {
                    addBook(bl);
                }
                case 2 -> {
                    searchBook(bl);
                }
                case 3 -> {
                    deleteBook(bl);
                }
                case 4 -> {
                    viewAllBook(bl);
                }
                case 5 ->
                    System.exit(0);
            }
        }
    }
    
    public static void addBook(BookTree bl){
        System.out.print("Enter SIBN code: ");
        int sibn = InputUtils.inputInt();
        System.out.print("Enter book's name: ");
        String title = InputUtils.inputName();
        System.out.print("Enter book's author: ");
        String author = InputUtils.inputName();
        Book book = new Book(sibn, title, author);
        bl.insert(book);
    }
    
    public static void searchBook (BookTree bl){
        System.out.print("Enter SIBN to search: ");
        int sibn = InputUtils.inputInt();
        Node<Book> root = bl.getRoot();
        Book b = new Book(sibn,null,null);
        Node<Book> result = bl.search(root, b);
        result.toString();
    }
    
    public static void viewAllBook (BookTree bl){
        bl.inOrderTraversal(bl.getRoot());
    }
    
    public static void deleteBook(BookTree bl){
        System.out.println("Enter SIBN to delete: ");
        int sibn = InputUtils.inputInt();
        Node<Book> root = bl.getRoot();
        Book b = new Book(sibn,null,null);
        Node<Book> result = bl.search(root, b);
        if(result != null){
            bl.deleteByCopying(result.getData());
            System.out.println("Successfully!");
        }else{
            System.out.println("Not found.");
        }
    }
}
