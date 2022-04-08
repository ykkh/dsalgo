package com.ykkh.datastructure.queue;

public class Queue<T> {
	private int capacity;
	//private int[] array;
	private T[] a;
	private int tail;
	private boolean isSizeLimited;

	@SuppressWarnings("unchecked")
	public Queue() {
		this.capacity = 2;
		//array = new int[capacity];
		tail = -1;
		isSizeLimited = false;
		a = (T[]) new Object[capacity];
	}

	@SuppressWarnings("unchecked")
	public Queue(int size) {
		isSizeLimited = true;
		this.capacity = size;
		//array = new int[size];
		a = (T[]) new Object[size];
		tail = -1;
		
	

	}
	
	@SuppressWarnings("unchecked")
	public void insert(T i) {

		if (isFull() && !isSizeLimited) {
			capacity = capacity * 2;
			Object[] newArray = new Object[capacity];

			for (int j = 0; j < a.length; j++) {
				newArray[j] = a[j];
			}

			a = (T[]) newArray;
			a[++tail] = i;

		} else if (isFull() && isSizeLimited) {
			Object[] newArray = new Object[capacity];

			for (int j = 0; j < a.length-1; j++) {
				newArray[j] = a[j+1];
			}
			a = (T[]) newArray;
			a[tail] = i; // tail unchanged
		} else {
			a[++tail] = i;
		}

	}


	public boolean isFull() {
		return tail >= capacity - 1;
	}

	public void print() {
		System.out.print("[");
		for (int i = 0; i < tail+1; i++) {
			System.out.print(this.a[i] + " ");
		}
		System.out.print("]");

	}

}
