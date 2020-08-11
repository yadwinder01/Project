

package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * This class +++Software Design Fundamentals+++
 *
 * @author Yadwinder Singh, Pushp Kumar, Sarthak Sharma, Krupesh Jayeshbhai Patel
 * date: 10/08/2020
 */
public class Main 
{

    
    
    public static void main(String[] args) 
    {
	
        Scanner input = new Scanner(System.in);
	System.out.print("Enter name of first participant : ");
        String player1 =input.next();
                
        System.out.println(" \n ");
                
        System.out.print("Enter name of second participant : ");
	String player2 =input.next();
        input.close();
                
       
        System.out.println(" \n  ");
                
        GameDeck deck = new GameDeck();
	War w = new War(player1,player2,deck);
	String winner = w.play();
        System.out.println("Wohoo! " + winner + " is the winner of the game ");
	
    }
}
    

