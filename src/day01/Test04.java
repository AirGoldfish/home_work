package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char[] c=str.toCharArray();
		String result="";
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='@'){
				for (int j = 0; j < i; j++) {
					result=result+c[j];
				}
				break;
			}
		}
		System.out.println("用户名为："+result);
	}
}
