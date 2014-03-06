
public class MainClass {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertFirst("Uno");
		list.insertFirst("Dos");
		list.insertFirst("Tres");
		list.println();
		while (!list.isEmpty()) {
			try {
				Object obj = list.getLastObject();
				System.out.println(obj);
				list.extract(obj);
			} catch (EmptyListException ex) {
				System.out.println("Empty List:");
			} catch (ObjectNotFoundException e) {
				System.out.println("error");
			}
			}
		}
	}


