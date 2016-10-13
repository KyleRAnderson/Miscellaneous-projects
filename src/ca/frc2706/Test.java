package ca.frc2706;

import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomVariable= 2;
     for(int i = 3; i > 0; i--) {
    	 System.out.println("Insert your guess on the line below...");
    	 Scanner s = new Scanner(System.in);
         String myInput = s.next();
         int myInputAsInt = 0;
         try {
        	 myInputAsInt = Integer.parseInt(myInput);
         } catch (NumberFormatException e) {
        	 System.out.println("Sorry, not right. You have"+ i + "attempt(s) left");
        	 continue;
         }
    	 if (myInputAsInt == randomVariable) {
    		 System.out.println("You got it!");
    	 }
    	 else{
    		 int numLeft = (i- 1);
    		 System.out.println("Sorry, that is not the number. You have " + numLeft + " attempts left");
    	 }
    	 if (i == 0){
    		 System.out.println("Sorry, you have run out of attempts.");
    		 break;
    	 }
     }
	}

}
