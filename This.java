package This_keyword;

public class A{
	int value;
	A(){
		this(20)
		System.out.println("param constructor of a");
	}
	A(int value){
		this();
		this.value=value;
	}
	void printvalue() {
		System.out.println("value");
	}
}
public class This {

}
