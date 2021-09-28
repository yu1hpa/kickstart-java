class Queue {
    int queue_size;
    int data[];
    int Quantity;

    Queue(){
        data = new int[5];
        System.out.println(data.length + "個分のキュー生成");
    }
    boolean enqueue(int number) {
        if(Quantity > data.length - 1) {
            return false;
        } else if (number < 0) {
            return false;
        }
        data[Quantity] = number;
        Quantity++;
        return true;
    }

    int dequeue() {
        int bottomData;
        if(Quantity == 0) {
            return -1;
        }
        bottomData = data[0];
        for(int i = 0; i < data.length - 1; i++) {
            data[i] = data[i+1];
        }
        data[data.length - 1] = 0;
        Quantity--;
        return bottomData;
    }

    void printQueue() {
        System.out.print("|");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            System.out.print("|");
        }
        System.out.println("");
    }
}

class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.enqueue(10)); queue.printQueue();
        System.out.println(queue.enqueue(20)); queue.printQueue();
        System.out.println(queue.enqueue(30)); queue.printQueue();
        System.out.println(queue.enqueue(40)); queue.printQueue();
        System.out.println(queue.enqueue(50)); queue.printQueue();
        System.out.println(queue.enqueue(60)); queue.printQueue();

        System.out.println(queue.dequeue()); queue.printQueue();
        System.out.println(queue.dequeue()); queue.printQueue();
        System.out.println(queue.dequeue()); queue.printQueue();
        System.out.println(queue.dequeue()); queue.printQueue();
        System.out.println(queue.dequeue()); queue.printQueue();
        System.out.println(queue.dequeue()); queue.printQueue();

    }
}