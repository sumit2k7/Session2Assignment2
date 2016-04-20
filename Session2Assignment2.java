
public class Session2Assignment2 
{
	public static void main(String args[])
	{
		int p=0;
		System.out.print("Prime No. Between 1 to 100 are:-> 1 2 ");
		for (int i=2;i<=100;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					p=0;
					break;
				}
				p=1;
			}
			if(p==1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
	