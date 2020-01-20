package com;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, l1 = 0, l2 = 0;
		char[] s1 = { 'h', 'e', 'l', 'l', 'o' };
		String s2 = new String(s1);
		char[] s3 = { 'H', 'e', 'l', 'l', 'o' };
		String s4 = new String(s3);
		for (int i = 0; s1[i] =='\n'; i++) {
			l1++;
		}
		for (int j = 0; s3[j]==0; j++) {
			l2++;
		
		}
		System.out.println("l1="+l1+"l2="+l2);
		for (int i = 0; i < l1; i++) {
			for (int j = 0; i < l2; j++) {
				if (s1[i] == s3[j]) {
					c=0;
				}

			}
			if (c ==0 )
				System.out.println("notequal");
			else
				System.out.println(" equal");

		}

	}

}
