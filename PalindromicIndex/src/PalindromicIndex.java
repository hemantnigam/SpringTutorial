import java.util.Scanner;

public class PalindromicIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		for(int k=0;k<t;k++) {
			String s= sc.next();
			int i=0, j=s.length()-1,index=-1;
			
			boolean IsPalindrome=false;
			while(i<j) {
				if(s.charAt(i)!=s.charAt(j)) {
					
					if(IsPalindrome=IsPalindrome(s.substring(0,i)+s.substring(i+1))?true:false) {
						index=i;
						break;
						
					}
					else if(IsPalindrome=IsPalindrome(s.substring(0,j)+s.substring(j+1))?true:false) {
						index=j;
						break;
						
					}
					
					
				}
					i++;
					j--;
				
			}
			
			System.out.println(IsPalindrome==true?index:"-1");
		}
		
		
				
	}
	
	public static boolean IsPalindrome(String s) {
		boolean isPalindrome=true;
		
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				isPalindrome=false;
			
			i++;
			j--;
		}
		return isPalindrome;
		
	}
}
