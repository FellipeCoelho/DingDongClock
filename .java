import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    
	    int hour,minute,vminute,aux,hour1,minute1 = 0;
	    
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter with the hours value.");
	    hour = s.nextInt();
		System.out.println("Enter with the minutes value.");
		minute = s.nextInt();
		System.out.println("Enter with the minutes spent value.");
		vminute = s.nextInt();
		
		minute1 = (vminute + minute) % 60;
		aux = (vminute + minute) / 60;
		
        hour1 = (aux + hour) % 24;
        
		System.out.println("The clock shows: "+ hour1 + ":" + minute1);
		
	}
}