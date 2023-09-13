package wk1Assignments;

public class FibonacciSeries {
public static void main(String[] args) {
	int a=0,b=1,tot=0;
	System.out.println(a+b);
	for(int i=2;i<8;i++)
	{
		tot=a+b;
		System.out.println(tot);
		a=b;
		b=tot;
	}
}
}
