package top_20_java_program;

public class SortStringArr {
	public static void main(String[] args) {
		String s[]= {"abi","muthu","kavi", "raju", "ammu"};
		sortArr(s);
	}
	public static void sortArr(String [] s) {
		for(int i=0;i<s.length-1;i++) {
			for(int j=0;j<s.length-i-1;j++) {
				if(s[j].compareTo(s[j+1])>0) {
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(String str:s) {
			System.out.println(str + " ");
		}
	}

}
