import java.util.Random;
import java.util.Scanner;

class HoT{	
	public static void main(String[] args){
		String[] str;
		str = new String[5];

		int num;
		int headcount=0;
		int tailcount=0;
		String hot;

		Random rand=new Random();

		System.out.println("Who are you?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("Hello, "+name+"!");

		for(int i=0;i<5;i++){
			num=1+rand.nextInt(2);
			if(num/2==0){
				str[i]="Heads";
				num=0;
			}else{
				str[i]="Tails";
				num=0;
			}
		}

		System.out.println("Tossing a coin...");
		for(int i=0;i<3;i++){
			hot=str[rand.nextInt(5)];
			System.out.println("Round" + (i+1) + ": "+hot);
			if(hot=="Heads"){
				headcount++;
			}else{
				tailcount++;
			}
		}
		System.out.println("Heads: "+headcount+", Tails: "+tailcount);

		if(headcount>tailcount){
			System.out.println( name + " won!");
		}else{
			System.out.println( name + " lost!");
		}
	}
}