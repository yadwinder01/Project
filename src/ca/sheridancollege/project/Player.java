/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * @modifier Yadwinder Singh, Pushp Kumar
 * date: 10/08/2020
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 * 
 * 
 */

public class Player 
{
    

    private final String name;

    private final List<Card> reservedCards = new ArrayList<>();
    
    private final List<Card> player_Cards;

    
	
    /**
     * @param nm
     * @param player_cards
     * 
     */
    public Player(String nm, List<Card> player_cards)
    
    {

        name = nm;
	
        player_Cards = new ArrayList<>(); 
	
        player_Cards.addAll(player_cards);
	
    }
	
    /**
     *
     * @return name
     * 
     */
    public String getName()
    {

        return name;
	
    }
	

    /**
     * 
     *@return card 
     * 
     */
    public Card getCard()
    {

        if(!this.player_Cards.isEmpty()) 
        {
	
        
        Card card = player_Cards.get(0);
	
        player_Cards.remove(0);
	
    
        return card;
	
        }
	
        return null;
	
    }
	
      
    /**
         * 
         * @return size
         * returning the size of cards each player has
         * 
         */

    public int getSize()
    
    {

        return player_Cards.size();
	
    }
	
        

    public int ReservedCardsSize()
    
    {

        return reservedCards.size();
	
    }
	

    //this method will add the cards to the participants cards who has won the round
    public void renewPlayerCards()
    
    {

        player_Cards.addAll(reservedCards);
	
        Collections.shuffle(player_Cards);
	
        reservedCards.clear();
	
    }
	

    /**
     *@param card 
     * 
     */
    public void addingToReseveCards(Card card)
    {
        reservedCards.add(card);
	
    }
}
