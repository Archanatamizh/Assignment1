package wk1Assignments;

public class IsPrimeNumbers {
	public static void main(String[] args) 
	{
		int n=5;
		boolean prime=true;
		if(n==0 ||n==1) {
			System.out.println("It is not a Prime Number");
		}
		
		for(int i=2;i<=n-1;i++)
		{if(n%i==0)
			{
			    prime=false;
			    break;
			    }}
		if(prime==false) {
		System.out.println(n+"It is not a Prime Number");
			}
			else {
				System.out.println(n+"is a Prime Number");
			}
		}
		
	}


