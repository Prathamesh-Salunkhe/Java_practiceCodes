package checkedFile;

public class FileReaderDemo {
	static FileReader fr=null;
	public static void main(String[] args) {
		try {
			 fr=new FileReader("Data");
		System.out.println("Content of file....");
		System.out.println("===========");
		int r=0;
		try {
			while((r=fr.read()) !=-1) {
				System.out.println((char) r);
			}
			
		}
		catch(IOException e) {
			
		}
		
		
		}
		catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		finally {
			try {
				
			}
		}

	}

}
