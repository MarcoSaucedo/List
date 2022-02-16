package com.company;

//primera clase
 class LinkedList{
        private Node head;
        private Node tail;
        private int size;

       public void addAtTail (String data){

       }
       public void addAtFront(String data){

       }
        public void remove(int index){

        }
        public void removeAll(){

        }
        public void setAt(int index, String data){

        }
       public String getAt(String index){
            return null;
       }
        public void removeAllWithValue(String data){

        }
        public int getSize(){
                return size;
        }
        public LinkedListIterator getIterator(){
             return null;
        }

        }

        //Segunda clase

        class Node{
        private String data;
        private Node next;
        private Node previous;

        public String getData(){
                return data;
        }
        public void setData(String data){
                this.data=data;
        }
        public Node getNext(){
                return next;
        }
        public void setNext(Node next){
                this.next=next;
        }
        public Node getPrevious(){
                return previous;
        }
        public void setPrevious(){
                this.previous=previous;
        }
        }

        //Tercera clase
        class LinkedListIterator{

        public boolean hasNext(){
           return true;
        }
        public String next(){
            return null;
        }




public class Main {

    public static void main(String[] args) {
	LinkedList team1 = new LinkedList();
    LinkedList team2 = new LinkedList();

    team1.addAtTail( "jesús");
    team1.addAtTail( "Salomón");
    team1.addAtTail( "Yael");

    team2.addAtFront( "Cristian");
    team2.addAtFront( "Daniel");
    team2.addAtFront( "Diego");
    }
    }
}
