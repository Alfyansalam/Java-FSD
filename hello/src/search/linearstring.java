package search;

public class linearstring {

	public static void main(String[] args) {
		String key="f",a[]= {"a","b","c","d","e"};
		for(int i=0;i<5;i++)
		{
			if(a[i]==key)
			{
				System.out.println("item found");
			System.exit(0);
			}
		}
		System.out.println("item not found");

	}

}
