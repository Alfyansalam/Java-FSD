package misc;

public class indirev {

	public static void main(String[] args) {
		String s="www.google/com";
		char t;
		String []sp=s.split("\\.|/");
		for (int i = 0; i < sp.length; i++) 
		{

			char []ch=sp[i].toCharArray();
			
for(int j=0;j<=(ch.length-1)/2;j++)
{
	t=ch[j];
	ch[j]=ch[ch.length-j-1];
	ch[ch.length-j-1]=t;
	
}
System.out.println(ch);
}
			
}
}
