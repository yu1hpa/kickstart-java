class Queue {
    private int queue_size;
    private int data[];
    private int Quantity;

    public Queue(){
        data = new int[5];
        System.out.println(data.length + "個分のキュー生成");
    }

    public boolean enqueue(int number) {
        if(Quantity > data.length - 1) {
            return false;
        } else if (number < 0) {
            return false;
        }
        data[Quantity] = number;
        Quantity++;
        return true;
    }

    public int dequeue() {
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

    public void printQueue() {
        System.out.print("|");
        for (int i = 0; i < data.length; i++) {
            printQueue(i);
            System.out.print("|");
        }
        System.out.println("");
    }

    private void printQueue(int i) {
        System.out.print(data[i]);
    }
}

class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();
    }
}