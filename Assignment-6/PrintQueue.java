import java.util.*;
public class PrintQueue {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of documents:");
		int noofDocuments = scanner.nextInt();
		scanner.nextLine();
		String document;
		for(int iterate =0;iterate<noofDocuments;iterate++) {
			queue.add(scanner.nextLine());
		}
		System.out.println("Enter the no of documents to remove");
		int remove = scanner.nextInt();
		for(int iterate=0;iterate<remove;iterate++) {
			queue.poll();
		}
		System.out.println(queue);
	}
}
