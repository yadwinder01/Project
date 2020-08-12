  /**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 * @modifier Krupesh Jayeshbahi Patel, Sarthak Sharma
 * date : 10/08/2020
 */

public class GameDeck 
{
   
    
  
    
List<Card> cards = new ArrayList<>();
	

    
public GameDeck()
    
    
{
		


    
for(Suit suit : Suit.values())
        

{


    String suit_rank = suit.toString();
	
    
    for(int r=1;r<=13;r++)
            
    
    {

                
                
    
    Card card = new Card(suit_rank,r);
		
                
                
    
    cards.add(card);			

    
    }
	
    
}
	

    
}
	

/**
 * 
 * 
 * @return cards
 */    
public List<Card> getCards()
{

        

return this.cards;


}

}//end class
