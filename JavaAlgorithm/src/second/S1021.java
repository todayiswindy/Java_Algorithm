package second;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class S1021 {

	public static <E> void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			list.add(i + 1);
		}

		int count = 0;

		for (int i = 0; i < M; i++) {
			int num = sc.nextInt();
			int index = list.indexOf(num);
			int half = list.size() / 2;

			if (index <= half) {
				while (num != list.getFirst()) {
					list.add(list.removeFirst());
					count++;
				}
			} 
			else {
				while (num != list.getFirst()) {
					list.addFirst(list.removeLast());
					count++;
				}
			}
			list.remove();
		}
		System.out.println(count);
	}

}
