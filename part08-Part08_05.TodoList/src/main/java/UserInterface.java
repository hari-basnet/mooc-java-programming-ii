
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class UserInterface {
    
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start(){
        
        while(true){
            System.out.println("Command: ");
            String command = String.valueOf(scanner.nextLine());
            
            if(command.equals("stop")){
                break;
            }
            
            processCommand(command);
        }
    }

    private void processCommand(String command) {
        
        if(command.equals("add")){
            add();
        }else if(command.equals("list")){
            list();
        }else if(command.equals("remove")){
            remove();
        }else{
            System.out.println("Unknown command");
        }
    }
    
    public void add(){
        System.out.println("To add: ");
        String todo = String.valueOf(scanner.nextLine());
        
        this.todoList.add(todo);
    }

    private void list() {
        todoList.print();
    }

    private void remove() {
        System.out.println("Which one is removed? ");
        int itemToRemove = Integer.valueOf(scanner.nextLine());
        
        this.todoList.remove(itemToRemove);
    }
}
