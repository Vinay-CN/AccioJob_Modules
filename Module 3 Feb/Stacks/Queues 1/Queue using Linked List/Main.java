import java.util.*;

class Node {
  int data;
  Node next;

  Node() {
    this.data = 0;
    this.next = null;
  }

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Queue {
  //Write your code here
  Node head;
  Node tail;
  int size;

  Queue() {
    head = null;
    tail = null;
    size = 0;
  }

  // addLast in LL
  // TC: O(1)
  public void push(int value) {
    //Write your code here
    Node node = new Node(value);

    if (size == 0) {
      head = tail = node;
    } else {
      tail.next = node;
      tail = node;
    }

    size++;
  }

  // removeFirst in LL
  // TC: O(1)
  public int pop() {
    //Write your code here
    if (size == 0) {
      return -1;
    } else if (size == 1) {
      int value = head.data;
      head = tail = null;
      size = 0;
      return value;
    } else {
      int value = head.data;

      Node temp = head.next;
      head.next = null;
      head = temp;
      size--;

      return value;
    }
  }

  // return head data
  // TC: O(1)
  public int front() {
    //Write your code here
    if (size == 0) {
      return -1;
    } else {
      return head.data;
    }
  }

  // return size
  // TC: O(1)
  public int getSize() {
    //Write your code here
    return size;
  }
}

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue q = new Queue();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int op = sc.nextInt();
      if (op == 1) {
        int x = sc.nextInt();
        q.push(x);
      } else if (op == 2) {
        System.out.println(q.pop());
      } else if (op == 3) System.out.println(q.front()); else if (
        op == 4
      ) System.out.println(q.getSize());
    }
  }
}
