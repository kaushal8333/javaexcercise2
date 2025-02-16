package day5;


public class StackClass {
	private Contact[] stack;
	private int maxi;
	private int top;
	
	public StackClass(int size){
		this.maxi=size;
		this.stack=new Contact[size];
		this.top=-1;
	}
	public void push(Contact contact) throws Exception{
		if(top==maxi-1) {
			throw new Exception("Stack is full");
		}
		stack[++top]=contact;
	}
	public Contact pop() throws Exception{
		if(top==-1) {
			throw new Exception("Stack is empty");
		}
		return stack[top--];
	}
	
	public static void main(String[] args) {
		try {
			StackClass contact=new StackClass(2);
			Contact c=new Contact();
			c.setFirstName("first");
			c.setDob("02-02-2002");
			c.setGender("male");
			c.setLastName("last");
			c.setMiddleName("middle");
			c.setMobileno("123");
			contact.push(c);
			contact.push(c);
			contact.push(c);
			contact.push(c);
//			try {
//				contact.push(c);
//			}
//			catch(Exception e) {
//				System.out.println(e.getMessage());
//		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
