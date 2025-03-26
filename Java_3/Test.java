
interface Stack {
int size = 10; 
void push(int item); 
int pop();
void display(); 
boolean overflow(); // Abstract method to check if the stack is full
boolean underflow(); 
}
// Subclass IntegerStack implementing the Stack interface
class IntegerStack implements Stack {
private int[] stackArray;
private int top;
public IntegerStack() {
stackArray = new int[size];
top = -1;
}

public void push(int item) {
if (!overflow()) {
stackArray[++top] = item;
System.out.println("Pushed: " + item);
} else {
System.out.println("Stack overflow!");
}
}
public int pop() {
if (!underflow()) {
int item = stackArray[top--];
System.out.println("Popped: " + item);
return item;
} else {
System.out.println("Stack underflow!");
return -1;
}
}

public void display() {
System.out.print("Stack: ");
for (int i = top; i >= 0; i--) {
System.out.print(stackArray[i] + " ");
}
System.out.println();
}

public boolean overflow() {
return top == size - 1;
}

public boolean underflow() {
return top == -1;
}}
// Test class
class Test {
public static void main(String[] args) {
IntegerStack stack = new IntegerStack();
System.out.println("Pushing elements onto the stack:");
for (int i = 1; i <= 12; i++) {
stack.push(i);
}
System.out.println("\nPopping elements from the stack:");
for (int i = 1; i <= 12; i++) {
stack.pop();
}
}
}