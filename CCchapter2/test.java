
public class test {

	public static void main(String[] args){

		SinglyLinkedList list = new SinglyLinkedList();
		int content = 1;
		int content2 = 2;
		int content3 = 3;
		list.addToLast(content);
		list.addToLast(content2);
		list.addToLast(content3);
		Node start = list.returnFirstNode();
		System.out.println(start.getData());
		System.out.println(start.getNext().getData());
		System.out.println(start.getNext().getNext().getData());
	}
}
