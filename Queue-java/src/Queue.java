public class Queue {
	static int defaultSize = 5;
	static int queue[] = new int[defaultSize];
	static int Quantity = 0;
	
	static boolean enqueue(int number) {
		if (Quantity > queue.length) {
			return false;
		} else if (number < 0) {
			return false;
		}
		queue[Quantity] = number;
		Quantity++;
		return true;
	}
	
	static int dequeue() {
		int bottomData;
		if (Quantity == 0) {
			return -1;
		}
		bottomData = queue[0];
		for (int i = 0; i < queue.length - 1; i++) {
			queue[i] = queue[i+1];
		}
		queue[queue.length-1] = 0;
		Quantity--;
		return bottomData;
	}
	
	static int printQueue() {
		for (int i = 0; i < queue.length; i++) {
			System.out.println(queue[i]);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		enqueue(10); printQueue();
		enqueue(20); printQueue();
		enqueue(30); printQueue();
	}

}
