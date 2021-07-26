/*
	Name: CustomStack
	Author: Kameron Fincher
	Description: Stack class implementation
	I.E. Command: compiled/run with other class
*/
class CustomStack{
	private Node head;
	
	public int size;
	
	public CustomStack(){
		this.head = null;
		this.size = 0;
	}

	private class Node{
		private Node next;
		private int val;
		Node(int val){
			this.next = null;
			this.val = val;
		}
	}
	
	public void push(int val){
		this.size += 1;
		if(head==null){
			head = new Node(val);
		}else{
			Node temp = head;
			head = new Node(val);
			head.next = temp;
		}
	}

	public void pop(int i){
		while(i>0){
			this.pop();
			i--;
		}
	}
	
	public void pop(){
		if(head!=null){
			this.size--;
			head = head.next; // thanks gc 
		}
	}
	
	public int peek(){
		checkSize(0);
		if(head!=null){
			return head.val; 
		}
		return -1; // should never reach here 
	}
	
	private void checkSize(int i){
		if(i>=this.size){
			try{
				throw new Exception("index out of bounds");
			}catch(Exception e){System.out.println(e);}
		}
	}
	
	public int get(int i){
		checkSize(i);
		
		if(head!=null){
			int counter = 0;
			if(counter==i){
				return head.val;
			}
			Node temp = head.next;
			counter++;
			while(true){
				if(temp!=null){
					if(counter==i){
						return temp.val;
					}
					counter++;
					temp = temp.next;
				}else{
					break;
				}
			}
		}
		
		return -1; // should never reach here 
	}
	
	
	public void print(){
		if(head!=null){
			String output = "{"+head.val;
			Node temp = head.next;
			while(true){
				if(temp!=null){
					output+= ", "+temp.val;
					temp = temp.next;
				}else{
					break;
				}
			}
			output+="}";
			System.out.println(output);
		}
	}
}