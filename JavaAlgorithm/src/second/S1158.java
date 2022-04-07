package second;

import java.util.LinkedList;
import java.util.Scanner;

public class S1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> list = new LinkedList<>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			list.add(i + 1);
		}
		
		System.out.print("<");
		
		while (!list.isEmpty()) {
			for (int i = 0; i < K; i++) {
				if (i == K - 1) {
					int a = list.remove();
					
					if (list.size() == 0) {
						System.out.print(a);
					}
					else {
						System.out.print(a + ", ");
					}
				}
				else {
					list.add(list.remove());
				}
			}
		}
		System.out.print(">");
	}

}
