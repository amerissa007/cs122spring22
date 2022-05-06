package assignment6;


public class LinkedStack implements StackADT
{
 private Node top; // reference to top of stack

 public LinkedStack()
 {
     top = null;
 }

 public void push(Object val)
 {
     Node newNode = new Node(val);
     newNode.setNext(top);
     top = newNode;
 }

 public Object pop()
 {
     if(isEmpty())
         return null;
     Object item = top.getElement();
     top = top.getNext();
     return item;
 }

 public boolean isEmpty()
 {
     return top==null;
 }

 public boolean isFull()
 {
     return false;
 }
}