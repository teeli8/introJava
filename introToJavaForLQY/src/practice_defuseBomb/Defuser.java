package practice_defuseBomb;

import java.util.Scanner;

public class Defuser {
	
	public static void main(String[] args) {
		System.out.println("Defusion begins! Have fun!");
		Triggers t = new Triggers();
		Scanner scan = new Scanner(System.in);
		
		String input;
		int time = 1;
		int result = -1;
		String prompt = "This is the first one! Go for it!";
		while(time<=6) {
			System.out.println(prompt);
			input = scan.nextLine();
			switch(time) {
			       case 1:
			    	   result = t.trigger1(input);
			    	   prompt = "You got the first one! Try the second one!";
			    	   break;
			       case 2:
			    	   result = t.trigger2(input);
			    	   prompt = "Awesome! On to the next!";
			    	   break;
			       case 3:
			    	   result = t.trigger3(input);
			    	   prompt = "Too easy so far? What about this one!";
			    	   break;
			       case 4:
			    	   result = t.trigger4(input);
			    	   prompt = "You are on fire! Two to go!";
			    	   break;
			       case 5:
			    	   result = t.trigger5(input);
			    	   prompt = "You're killin' it! This is the last one!";
			    	   break;
			       case 6:
			    	   result = t.trigger6(input);
			    	   break;
			}
			if(result < 0) {
				scan.close();
				return;
			}else {
				time++;
			}
		}
		System.out.println("Congrats! You have done it!");
		scan.close();
	}
}
