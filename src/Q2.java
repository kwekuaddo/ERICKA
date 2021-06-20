
public class Q2 {
public static int fib(int x){
	if (x==0){
		return 0;
}
	else if (x==1){
		return 1;
	}
	else {
		return fib (x-1)+fib(x-2);
	}
	}
	public static void main(String[] args) {
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
	}

}







