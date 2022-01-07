
package ListasEnlazadas;


class Node{
    Node next=null;
    String data;
    int numData;
    Node(String data){
        this.data = data;
    }
    Node(int data){
        this.numData = data;
    }
}

public class Random {
    Node head = null;
    int length;
    Random(){
        
    }
    Node insertBeginning(Node head, String data){
        if (head!=null) {
            Node new_node = new Node(data);
            new_node.next = head;
            return new_node;
        }
        else{
            Node new_node = new Node(data);
            head = new_node;
            return head;
        }
    }
    void insertAt(int data,int position){
        this.length++;
        
    }
    
    public void insertAt(String data, int position){
        this.length++;
        if (position<this.length) {    
            Node node = new Node(data);
            Node previus_node = head;
            int counter = 0;
            while(counter<this.length ){
                if (counter == position-1) {
                    node.next = previus_node.next;
                    previus_node.next = node;
                    break;
                }
                previus_node = previus_node.next;
                counter++;
            }
           
        }else{
            System.out.println("Index out of range.");
        }
    }
    void addFirst(int data){
        this.length++;
        if (head!=null) {
            Node node = new Node(data);
            node.next = head;
            head = node;
        }else{
            head = new Node(data);
        }
    }
    void deleteNodeByKey(String key){
        Node node = head;
        while(node.data!=key){
            node = node.next;
        }
    }
    void deleteNodeAt(int index){
        if (head!=null&&index<length) {
            this.length-=1;
            int counter = 0;
            Node node = head, prev = null;
            while(counter<index){
                prev = node;
                node = node.next;
                counter++;
            }
            prev.next = node.next;
            
            
        }else{
            System.out.println("Error :(");
        }
    }
    public void addFirst(String data){
        this.length++;
        if (head != null) {
            Node node = new Node(data);
            node.next = head;
            head = node;
        }else{
            head = new Node(data);
        }
    }
    void addLast(int data){
        this.length++;
        if (head!=null) {
            Node new_node = new Node(data);
            Node node = head;
            while(node.next!=null){
                node = node.next;
            }
            node.next = new_node;
        }else{
            head = new Node(data);
        }
    }
    public void addLast(String data){
        this.length++;
        if (head != null) {
            Node new_node = new Node(data);
            Node node = head;
            while(node.next!=null){
                node = node.next;
            }
            node.next = new_node;
            
        }else{
            head = new Node(data);
        }
    }
    public void printLinkedList(){
        Node node = head;
        while(node!=null){
            System.out.println("data = "+node.data);
            node = node.next;
        }
    }
    void print(){
        Node node = head;
        while(node!=null){
            System.out.println("num = " + node.numData);
            node=node.next;
        }
    }
    
    void printLinkedList(Node node){
        Node nodeClon = node;
        while(nodeClon!=null){
            System.out.println("nodeClon.data = " + nodeClon.data);
            nodeClon = nodeClon.next;
        }
    }
    public static void main(String[] args) {
       /* LinkedList listaNombres = new LinkedList();
        listaNombres.addLast("Alvaro");
        listaNombres.addLast("Maria");
        listaNombres.addLast("Echevarria");
        listaNombres.addLast("Josemaria");
        listaNombres.addFirst("Samuel");
        listaNombres.printLinkedList();
        listaNombres.deleteNodeAt(2);
        System.out.println("Longitud de Linkred List : "+listaNombres.length);
        System.out.println(" ");
        listaNombres.printLinkedList();
        System.out.println("Longitud de Linkred List : "+listaNombres.length);
        */
       Node nodo1 = new Node(1);
       Node nodo2 = new Node(12);
       Node nodo3 = new Node(3);
       nodo2.next = nodo3;
       nodo1.next = nodo2;
       
       Node nodo_guia = nodo1;
        while(nodo_guia.next!=null){
           System.out.println("Dato "+nodo_guia.numData);
           nodo_guia=nodo_guia.next;
       }
        System.out.println("Dato "+nodo_guia.numData);
        
        System.out.println("nodo1 = "+nodo1);
        System.out.println("nodo2 = " + nodo2);
        System.out.println("nodo3 = " + nodo3);
       
    }
}
