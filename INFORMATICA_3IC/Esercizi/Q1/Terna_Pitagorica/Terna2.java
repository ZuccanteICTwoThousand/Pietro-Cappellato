public class Terna2 {
public static void main(String[]args) {
	final int MAX = 1000;
	int a, b;
	b=0;

	for (a=1; a<MAX/3; a++){
		for (b=a+1; b<MAX/2; b++){
			if(IsTerna(a, b, MAX-a-b))
			System.out.println(a*b*(MAX-a-b));
		}
	}
 }
 public static boolean
 IsTerna(int a, int b, int c){
	if(a*a+b*b==c*c) return true;
		else return false;
}  }
