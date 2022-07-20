package org.raji;

public class Looping {
	public static void main(String[] args) {
		for(int f=0;f<5;f++) {
			System.out.println("forloop");
		}
		int w=0;
		while(w<5) {
			System.out.println("whileloop");
			w++;
		}
		int d=0;
		do {
			System.out.println("do while");
			d++;
		}while(d<5);
	}
}