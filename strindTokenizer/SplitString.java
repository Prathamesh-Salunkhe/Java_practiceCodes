package strindTokenizer;
import java.util.StringTokenizer;
public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is an example of string tokenizer class";
		StringTokenizer words=new StringTokenizer(s);
		while(words.hasMoreTokens()) {
			System.out.println(words.nextToken());
			System.out.println(words.countTokens());
		}

	}
}