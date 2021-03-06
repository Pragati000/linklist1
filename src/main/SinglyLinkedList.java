package main;

public class SinglyLinkedList {
    private class Node{
      private  int data;
    private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next=null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head=null;
    private int size=0;

    public static void main(String[] args) {
        SinglyLinkedList linklist = new SinglyLinkedList();
        System.out.println(linklist);

        linklist.insert(42);
        linklist.insert(66);
        System.out.println(linklist);
    }
        @Override
                public String toString(){
            StringBuilder response =new StringBuilder();
            response.append("[");
            Node temp=this.head;
            while(temp!=null){
                response.append(temp.getData());

            if(temp.next!=null){
                response.append("==> ");
            }
                temp=temp.next;
            }
            response.append("]");
            return response.toString();
    }

    private void insertHead(int data){
        Node newNode=new Node(data,this.head);
        // this.head=new Node(data,this.head);
 this .head=newNode;
 size++;
    }

    private void insertAfter(int data, Node node){
        Node newNode =new Node(data, node.next);
        node.next=new Node(data ,node.next);
        size++;

    }
    public void insert(int data){
        if(head==null){
            insertHead(data);
        }
        else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            insertAfter(data, temp);
        }
    }

    public void delete(){

    }

}
