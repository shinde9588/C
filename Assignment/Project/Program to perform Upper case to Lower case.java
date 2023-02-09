package omkar;
import java.lang.*;
import java.util.*;
public class ChangeLowercasetoUpperCase {
	char ch, ch2;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ch = sc.next().charAt(0);
	if(ch>='A' && ch<='z') {
		ch = Character.toLowerCase(ch);
		System.out.println("Lowercase " + ch);
		
	}else {
		ch2 = Character.toUpperCase(ch2);
		System.out.println("Uppercase " + ch2);
	}
	}

}
