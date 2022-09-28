package misc;

public class palsub {

	public static void main(String[] args) {
		int c=0,z=0,len;
		String s="bob had a radar plane";
		String []sp=s.split(" ");
		for (int i = 0; i < sp.length; i++) 
		{
			
			char []ch=sp[i].toCharArray();
			if(ch.length==1)
			{
				System.out.print(ch);System.out.print(" ");
			}
			
			for(int j=0;j<=(ch.length)/2;j++)
			{
				if(ch[j]==ch[ch.length-j-1])
				{
					c++;
				}
				
				if(c==ch.length/2)
				{
				z=c;
					for(int k=0;k<ch.length;k++)
					{
						System.out.print("*");
					}
					System.out.print(" ");
				}
					
			}
			if(z!=ch.length/2)
			{
				
			System.out.print(sp[i]+" ");
		
		}
			c=0;
			z=0;
		}	
		

}
}
