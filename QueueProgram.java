
import java.util.Scanner;
public class QueueProgram {
    int queue[];
    int front,rear;
    public QueueProgram() {
        queue = new int[5];
        front = 0;
        rear = 0;
    }
    void dispMenu() {
        String menu = "Menu Driven Application \n";
               menu += "1.Insert \n";
               menu += "2.Delete \n";
               menu += "3.Display \n";
                menu += "4.Exit \n";
               menu += "Select any option \n";
               System.out.println(menu);
    }
    void insert(int data) {
        if(rear == queue.length-1) {
            System.out.println("Queue is full");
        }
        else {
            queue[rear] = data;
            rear++;
            System.out.println("Inserted Successfully");
        }
        
    }
    void delete() {
        if(front ==  rear ) {
            System.out.println("Queue is empty");
        }
        else {
            
            System.out.println("Deleted Element Is" + queue[front]);
            for(int i = 0; i <=rear;i++) {
                queue[i] = queue[i+1];
                rear--;
                System.out.println("Deleted Successfully");
            }
        }
    }
    void display() {
        System.out.println("Queue Elements");
        for(int i = front; i < rear;i++ ) {
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        QueueProgram obj = new QueueProgram();
        Scanner sc = new Scanner(System.in);
        while(true) {
        obj.dispMenu();
        int choice = sc.nextInt();
        switch(choice) {
                case 1:
                    System.out.println("Enter any number ?");
                    obj.insert(sc.nextInt());
                    
                    break;
                case 2:
                    
                    obj.delete();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");
                    
        }
        }


    }


}
 




