
public class DynamicArrayStack {

	final int capacity = 257;
	int[] stackArray;
	int top, size;
	
	public DynamicArrayStack(int size) {
		this.size = size;
		this.stackArray = new int[size];
		this.top = -1;
	}
	
	public int pop() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("stack underflow");
		}
		int entry = this.stackArray[top --];
		System.out.println("poping "+entry);
		return entry;
	}
	
	public void push(int entry) throws Exception {
		if(this.isArrayFull()) {
			this.increaseCapasity();
		}
		this.stackArray[++top] = entry;
		System.out.println("Added "+entry);
	}
	
	public void increaseCapasity() throws Exception {
		if((this.size<<1) < capacity) {
			int[] newStack = new int[this.size << 1];
			for(int i = 0; i<size; i++)
				newStack[i] = this.stackArray[i];
			this.stackArray = newStack;
			this.size = this.size<<1;
		}
		else
		throw new Exception("Stack Overflow");
	}
	
	public boolean isArrayFull() {
		return (top == size-1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public static void main(String[] args) {

		DynamicArrayStack stack = new DynamicArrayStack(64);
		for(int i = 1; i<10; i++) {
			try {
				stack.push(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for(int i = 1; i< 4; i++) {
			try {
				stack.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
