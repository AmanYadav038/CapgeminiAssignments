interface functions{
	double calculate(int x, int y);
}
interface Stringy{
	String convert(String x);
}
interface Authentication{
	boolean Authenticate(String username, String paswd);
}
public class PracticeLambda {
	public static void main(String[] args) {
		//1
		functions power = (x, y)->{
			return Math.pow(x, y);
		};
		
		System.out.println(power.calculate(2,3));
		
		
		//2
		Stringy s = (str)->{
			String sb = new String();

			for (char st : str.toCharArray()) {
			    sb+=st+" ";
			}
			return sb;
		};
		
		System.out.println(s.convert("CG"));
		
		
		
		//3
		Authentication auth = (username, paswd)->{
			return (username=="ABC" && paswd=="123") ;
		};
		System.out.println(auth.Authenticate("ABC", "123"));
		
		
	}
}
