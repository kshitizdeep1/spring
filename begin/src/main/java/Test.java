import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int i=44;
		String t="",l="";
		int count=0;
		while(true)
		{
			l=l+i;
			t=t+i;
			t=t.replace("4","");
			t=t.replace("5","");
			if(t=="")
			{
				System.out.println(t);
				StringBuffer sb=new StringBuffer("l");
				sb.reverse();
				if(l.contentEquals(sb));
				{
					count++;
				}
				if(count==a)
				{
					System.out.println("l");
					break;
				}
			}
			l="";
			t="";
			i++;
		}
	}

}
