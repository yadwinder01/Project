/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * @modifier Yadwinder Singh, Pushp Kumar
 * date: 10/08/2020
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 * 
 */
public class Card implements Comparable<Card>
{
    
    
    private final int rank;
	
    private final String suitType;
	

    public Card(String suit, int rnk)
    {

        suitType = suit;
	
        rank = rnk;
	
    }
	

    public int getRank()
    {

        return rank;

    }
    
    
    
    public String getSuit()
    
    {

        return suitType;
	
    }
	

    
	
   
   @Override
	
    public int compareTo(Card c2) 
    
    {
		

        if(rank > c2.rank)
        
        {

            return 1;
	
        }
        
        else if(rank < c2.rank)

        {
	
            return -1;
	
        }
        
        else 

        {
	
            return 0;
	
        }
	
        }
	
	@Override
	public String toString()
        {
	
            return "Suit " + this.getSuit() + " Value: " + this.getRank();
		
	}
    
}
