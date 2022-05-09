
public class IString {

	public static void main(String[] args) {
		
		String s1="jail";  
		char ch[]={'s','t','r','i','n','g','s'};    
		String s2=new String(ch);    
		String s3=new String("escape");   
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);    
		
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.insert(1,"Java");
		System.out.println(sb);

		StringBuilder stb = new StringBuilder(); 
		stb.append("Simplilearn");
        System.out.println("String = " + stb.toString());

	}

}
