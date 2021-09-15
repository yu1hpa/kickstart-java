class Queue {
	int queue_size;
	int data[] = new int[5];
	int Quantity;
}

class Main {
	static boolean enqueue(Queue queue, int number) {
		if(queue.Quantity > queue.data.length) {
			return false;
		} else if (number < 0){
			return false;
		}
		queue.data[queue.Quantity] = number;
		queue.Quantity++;
		return true;
	}
	
	static int dequeue(Queue queue) {
		int bottomData;
		if(queue.Quantity == 0) {
			return -1;
		}
		bottomData = queue.data[0];
		for (int i = 0; i < queue.data.length -1; i++) {
			queue.data[i] = queue.data[i+1];
		}
		queue.data[queue.data.length-1] = 0;
		queue.Quantity--;
		return bottomData;
	}
	
	static int printQueue(Queue queue) {
		for (int i = 0; i < queue.data.length; i++) {
			System.out.println(queue.data[i]);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		enqueue(queue,10); printQueue(queue);
		enqueue(queue,20); printQueue(queue);
		enqueue(queue,30); printQueue(queue);
	}
}
