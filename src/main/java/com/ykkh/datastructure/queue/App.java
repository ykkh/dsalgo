package com.ykkh.datastructure.queue;

public class App {
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>();

		for (int i = 0; i < 10; i++) {
			q.insert(i);
		}

		q.print();
		
		System.out.println("");

		q = new Queue<Integer>(3);

		for (int i = 0; i < 10; i++) {
			q.insert(i);
		}

		q.print();
		System.out.println("");
		Queue<String> q2 = new Queue<>(3);

		for (int i = 0; i < 10; i++) {
			q2.insert(i+" Hey");
		}

		q2.print();

	}

}
