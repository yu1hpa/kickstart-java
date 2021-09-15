class Stack {
	int volume;
	int data[] = new int[5];
	
	boolean push(int number) {
		if (volume < data.length) {
			data[volume] = number;
			volume++;
			return true;
		} else {
			System.out.println("stack overflow!!!");
			return false;
		}
	}
	
	int pop() {
		int value;
		if (volume > 0) {
			value = data[volume - 1];
			data[volume - 1] = 0;
			volume--;
		} else {
			value = -1;
		}
		return value;
	}
	
	void printStack() {
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
		Stack tower = new Stack();
        tower.push(10);tower.printStack();
        tower.push(20);tower.printStack();
        tower.push(30);tower.printStack();
        tower.push(40);tower.printStack();
        tower.push(50);tower.printStack();
        tower.push(60);tower.printStack();

        System.out.println(tower.pop());tower.printStack();
        System.out.println(tower.pop());tower.printStack();
        System.out.println(tower.pop());tower.printStack();
        System.out.println(tower.pop());tower.printStack();
        System.out.println(tower.pop());tower.printStack();
        System.out.println(tower.pop());tower.printStack();
    }
}