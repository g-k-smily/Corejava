
import java.util.Scanner;
class LinkedList { 
      
    Node head;
     static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
    public static LinkedList insert(LinkedList list, int data) { 
     
        Node new_node = new Node(data); 
        new_node.next = null; 
  
       
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
           
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = new_node; 
        } 
        return list; 
    } 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
        System.out.print("LinkedList: "); 
         while (currNode != null) { 
             System.out.print(currNode.data + " "); 
             currNode = currNode.next; 
        } 
    }


    public static LinkedList deleteByKey(LinkedList list, int key) 
    { 
       
        Node currNode = list.head, prev = null; 
        if (currNode != null && currNode.data == key) { 
            list.head = currNode.next; 
            System.out.println(key + " found and deleted"); 
            return list; 
        } 
        
        while (currNode != null && currNode.data != key) { 
          
            prev = currNode; 
            currNode = currNode.next; 
        } 
       
        if (currNode != null) { 
              prev.next = currNode.next; 
              System.out.println(key + " found and deleted"); 
        } 
        if (currNode == null) { 
            System.out.println(key + " not found"); 
        } 
         return list; 
    } 
  
}
public class LinkedListProgram {


    static void menu() {
        String m = "\n Menu Driven Application\n";
               m += "1.Add Node\n";
               m += "2.Delete Node\n";
               m += "3.Display Node\n";
               m += "4.Exit\n";
               m += "Select any option \n";
        System.out.println(m);
    }
    public static void main(String[] args) {
        
        LinkedList obj = new LinkedList();
        Scanner sc = new Scanner(System.in);
        while(true) {
        menu();
        int choice = sc.nextInt();
        switch(choice) {
                case 1:
                    System.out.println("Enter any value ?");
                    LinkedList.insert(obj, sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter any value ?");
                    LinkedList.deleteByKey(obj, sc.nextInt());
                    break;
                case 3:
                    LinkedList.printList(obj);
                    break;
                case 4:
                    System.exit(0);
                    break;
                    
        }
                
        }
    }


}
 

