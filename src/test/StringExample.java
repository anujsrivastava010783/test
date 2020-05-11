package test;

public class StringExample {

	public static void main(String[] args) {
		String text = "Hi ([bla bla]) how are ([test]) you?";
		while(text.contains("([") && text.contains("])")){
			String text1 = text.substring(0, text.indexOf("(["));
			String text2=text.substring(text.indexOf("])"));
			
			System.out.println("value of text1:"+text1);
			System.out.println("value of text2:"+text2);
		  text = text.substring(0, text.indexOf("(["))+
		        text.substring(text.indexOf("])")+"]))".length());
		  System.out.println("value of text is:"+text);
		}
		System.out.println(text); 

	}

}
