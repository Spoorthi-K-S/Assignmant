package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class StringRev {
	public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	Scanner s = new Scanner(System.in); 
	System.out.println("Enter the size of string array : ");
	int n = s.nextInt();
	for(int i=0;i<n;i++) {
		arr.add(s.next());
	}
	System.out.println("Reversed Strings : ");
	for(int j=arr.size()-1;j>=0;j--) {
		System.out.println(arr.get(j));
	}

}
}
