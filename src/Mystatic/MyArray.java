package Mystatic;

import java.util.*;

public class MyArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the elements ");
		int n = sc.nextInt();
		int a[] = new int[10];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the elements in the array");
			a[i] = sc.nextInt();
		}
		System.out.println("The array is ");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}