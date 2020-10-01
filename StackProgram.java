
import java.util.Scanner;

public class StackProgram {
	static Scanner sc = new Scanner(System.in);
	static int stack[], top = -1, size;
	static {
		StackProgram.create();
	}

	public static void main(String args[]) {
		int ch, item;
		while (true) {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Traverse");
			System.out.println("5.Quit");
			System.out.print("Enter Your Choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter element:");
				item = sc.nextInt();
				push(item);
				break;

			case 2:
				item = StackProgram.pop();
				if (item == 0) {
					System.out.println("Stack is underflow \n");
				} else {
					System.out.println("Popped item:" + item);
				}
				break;
			case 3:
				item = StackProgram.peek();
				if (item == 0) {
					System.out.println("Stack is underflow \n");
				} else {
					System.out.println("Peeked element is:" + item);
				}
				break;
			case 4:
				StackProgram.traverse();
				break;
			case 5:
				System.exit(1);
			default:
				System.out.println("Invalid Choice");
			}

		}

	}

	static void create() {

		System.out.print("Enter size of stack:");
		size = sc.nextInt();
		stack = new int[size];
		System.out.println("Stack created successfully");

	}

	static void push(int item) {
		if (StackProgram.isFull()) {
			System.out.println("Stack is overflow \n");
		} else {
			stack[++top] = item;

		}
	}

	static boolean isFull() {
		if (top == size - 1) {
			return true;
		} else {
			return false;
		}
	}

	static int pop() {
		if (StackProgram.isEmpty()) {
			return 0;
		} else {
			return stack[top--];
		}
	}

	static boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	static int peek() {
		if (StackProgram.isEmpty()) {
			return 0;
		} else {
			return stack[top];
		}
	}

	static void traverse() {
		if (StackProgram.isEmpty()) {
			System.out.println("stack is empty:");
		} else {
			System.out.println("Elements of stack:");
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}

	}
}
