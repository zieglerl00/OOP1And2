public class Queue {

    private doubleLinkedList list = new doubleLinkedList();

    public void enqueue(int data){
        list.appendNode(data);
    }

    public void print(){
        list.printList();
    }

    public int size(){
        return list.listLength();
    }

    public int dequeue(){
        if (list.listLength() <= 0){
            throw new IllegalArgumentException("QueueTooSmallException");
        }
        int firstItem = list.getFirstItem();
        list.deleteElementOnIndex(list.seekListReverse(list.getLastItem()));
        return firstItem;
    }

    public int[] dequeue(int remove){
        if (list.listLength() < remove){
            throw new IllegalArgumentException("StackTooSmallException");
        }
        int[] removed = new int[remove];
        for (int i = 0; i < remove; i++) {
            removed[i] = list.getFirstItem();
            list.deleteElementOnIndex(list.seekListReverse(list.getLastItem()));
        }
        return removed;
    }
}
