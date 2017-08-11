import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FullCountingSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] result=new String[100];
		for(int i=0;i<100;i++)
			result[i]="";
		for(int i=0;i<n;i++) {
			
			int k= sc.nextInt();
			String str=sc.next();
			String s="";
			if(i<n/2)
				s="-";
			else
				s=str;
			
			result[k]=result[k]+s+" ";
		}
		for(String e:result)
			if(e!=null)
			System.out.print(e);	
		
	}

}
