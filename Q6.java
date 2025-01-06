import java.util.Scanner;
interface I1{
	Scanner sc=new Scanner(System.in);
	default int m1(float a){
	System.out.println(a);
	return sc.nextInt();
	}
	char m2(int b);
}
interface I2{
	

	default boolean m3(int a){
	System.out.println(a);
	return I1.sc.nextBoolean();
	}
	long m4(char c);

}
abstract class A implements I1,I2{
	int m5(char c){
	System.out.println(c);
	return sc.nextInt();
	}
	abstract int m6(double d);
	A(D obj){
	System.out.println(obj);
	}
}
class B extends A{
	public char m2(int b){
		System.out.println(b);
	return I1.sc.next().charAt(0);
	}
	public long m4(char c){
		System.out.println(c);
	return I1.sc.nextLong();
	}
	int m6(double d){
	System.out.println(d);
	return I1.sc.nextInt();
	}
	B(){
	super(test.obj);
	}

}
class C extends A{
	public char m2(int b){
		System.out.println(b);
	return sc.next().charAt(0);
	}
	public long m4(char c){
		System.out.println(c);
	return sc.nextLong();
	}
	int m6(double d){
	System.out.println(d);
	return sc.nextInt();
	}
	C(){
	super(test.obj);
	}
}
	
class D{
	int m7(float a){
	System.out.println(a);
	return I1.sc.nextInt();
	}
	D(int a){
	System.out.println(a);
	}

}

class test{
	static D obj=new D(I1.sc.nextInt());

	public static void main(String[]args){
	A a=new B();
	A b=new C();
	System.out.println(a.m1(I1.sc.nextFloat()));
	System.out.println(a.m2(I1.sc.nextInt()));
	System.out.println(a.m3(I1.sc.nextInt()));
	System.out.println(a.m4(I1.sc.next().charAt(0)));
	System.out.println(a.m5(I1.sc.next().charAt(0)));
	System.out.println(a.m6(I1.sc.nextDouble()));
	System.out.println(obj.m7(I1.sc.nextFloat()));
	System.out.println(b.m2(I1.sc.nextInt()));
	System.out.println(b.m4(I1.sc.next().charAt(0)));
	System.out.println(b.m6(I1.sc.nextDouble()));
	}
}	