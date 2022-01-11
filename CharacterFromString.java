package checkedFile;

public class CharacterFromString {

	public static void main(String[] args) {
		try {
			String str="This is a new Strig";
			System.out.println(str.charAt(13));
			String[] name= {"Ram","Krishna"};
			//System.out.println(name);
		}
		catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}



}
