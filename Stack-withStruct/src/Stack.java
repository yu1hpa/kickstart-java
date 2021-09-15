class Stack {
	int volume;
	int data[] = new int[5];
}

class Main {
	static boolean push(Stack stack, int number) {
		if(stack.volume < stack.data.length) {
			stack.data[stack.volume] = number;
			stack.volume++;
			return true;
		} else {
			System.out.println("overflow!!!");
			return false;
		}
	}
	
	static int pop(Stack stack) {
		int value;
		if(stack.volume > 0) {
			value = stack.data[stack.volume-1];
			stack.data[stack.volume-1] = 0;
			stack.volume--;
		} else {
			value = -1;
		}
		return value;
	}
    static void printStack(Stack stack)
    {
        System.out.print("|");
        for(int i=0; i < stack.data.length; i++)
        {
            System.out.print(stack.data[i]);
            System.out.print("|");
        }
        System.out.println("");
    }
    public static void main(String[] args)
    {
        Stack tower = new Stack();
        push(tower,10);printStack(tower);
        push(tower,20);printStack(tower);
        push(tower,30);printStack(tower);
        push(tower,40);printStack(tower);
        push(tower,50);printStack(tower);
        push(tower,60);printStack(tower);
        System.out.println(pop(tower));printStack(tower);
        System.out.println(pop(tower));printStack(tower);
        System.out.println(pop(tower));printStack(tower);
        System.out.println(pop(tower));printStack(tower);
        System.out.println(pop(tower));printStack(tower);
        System.out.println(pop(tower));printStack(tower);
    }
}