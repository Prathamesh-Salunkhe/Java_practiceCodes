package interfaceExinJava8;

public interface Arith {
     public int add(int a,int b);
     public int div(int a,int b);
     public int mul(int a,int b);
     public int sub(int a,int b);
     Scanner sc=new Scanner(System.in);
     public static void readData() {
    	
    	 int value=sc.nextInt();
    	 return value;
     }
}
