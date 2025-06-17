public class Ways_finding_fib{
	public static void main(String[] args) {
	    int n=ways(5);
	    System.out.println(n);
	}public static int ways(int n){
	    if(n==0 || n==1)return 1;
	    return ways(n-2)+ways(n-1);
	}
}