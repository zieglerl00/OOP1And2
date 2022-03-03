public class main {
    public static void main(String[] args) {


        Queue queue = new Queue();

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");



        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.print("List elements: ");
        queue.print();

        System.out.println("\n\nDeleted:");

        int[] removedQueue = queue.dequeue(5);

        for (int i = 0; i < removedQueue.length; i++) {
            System.out.print(removedQueue[i] + " ");
        }



        System.out.print("\n\nleft: ");
        queue.print();

        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");

    }
}
