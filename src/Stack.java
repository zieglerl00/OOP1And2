public class Stack {

    private doubleLinkedList list = new doubleLinkedList();


    public void push(Integer data) {
        list.appendNode(data);
    }

    public int size() {
        return list.listLength();
    }

    public void print(){
        list.printListReverse();
    }

    public int pop(){
        if (list.listLength() <= 0){
            throw new IllegalArgumentException("StackTooSmallException");
        }
        int firstItem = list.getLastItem();
        list.deleteElementOnIndex(list.seekListReverse(list.getFirstItem()));
        return firstItem;
    }

    public int peek(){
        if (list.listLength() <= 0){
            throw new IllegalArgumentException("StackTooSmallException");
        }
        return list.getLastItem();
    }

    public int[] pop(int remove){
        if (list.listLength() <= remove){
            throw new IllegalArgumentException("StackTooSmallException");
        }
        int[] removed = new int[remove];
        for (int i = 0; i < remove; i++) {
            removed[i] = list.getLastItem();
            list.deleteElementOnIndex(list.seekListReverse(list.getFirstItem()));
        }
        return removed;
    }
}