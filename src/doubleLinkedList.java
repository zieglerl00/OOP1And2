public class doubleLinkedList {
    private Node head;
    private Node tail;
    private int size;


    private class Node{
        int data;
        Node prev = null;
        Node next = null;

        public Node(int data){
            this.data = data;
        }
    }

    public doubleLinkedList(){
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    public void appendNode(int data){
        Node newNode = new Node(data);
        Node tmp = tail.prev;
        tail.prev = newNode;
        tmp.next = newNode;
        newNode.prev = tmp;
        newNode.next = tail;
        size++;
    }

    public void printList(){
        Node tempHead = head.next;   //create a temp head


        while (tempHead.next != null){ //if the node head is not null keep printing
            System.out.print(tempHead.data + " ");
            tempHead = tempHead.next; //node is now the next item
        }

    }

    public void printListReverse(){
        Node last = tail.prev;



        while (last.prev != null){
            System.out.print(last.data + " ");
            last = last.prev;
        }

    }

    public int listLength(){
        return size;
    }

    public int getLastItem(){
        return tail.prev.data;
    }

    public int getFirstItem(){
        return head.next.data;
    }

    public int seekList(int var){
        Node tempHead = head.next;  //Create temp head so i'm not changing the structure
        int position = 0;

        //every loop override tempHead with temHeadNext for checking the next data
        while (tempHead.data != var){
            tempHead = tempHead.next;
            position++;
        }
        return position;
    }

    public int seekListReverse(int var){
        int position = 0;

        Node last = tail.prev;

        while (last.data != var){
            position++;
            last = last.prev;
        }
        return position;
    }

    public void deleteElementOnIndex(int index){
        Node tempDeleteHead = head;
        int indexCounter = 0;

        if (index > size || index < 0){ //not possible input!
            System.out.println("zu groß");
            return;
        }

        while (indexCounter <= index){      //as long as the indexCounter is smaller tan the index keep going forward!
            tempDeleteHead = tempDeleteHead.next;
            indexCounter++;
        }

        tempDeleteHead.prev.next = tempDeleteHead.next;   //trade the temphead with the temphead Next
        tempDeleteHead.next.prev = tempDeleteHead.prev;     //trade the temphead next with the temp head previous

        size--;
    }
}
