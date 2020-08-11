/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * @modifier Yadwinder Singh, Pushp Kumar, Sarthak Sharma, Krupesh Jayeshbhai Patel
 * date: 10/08/2020
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 * 
 */
public class War 
{
      
Player participant1;
Player participant2;

List<Card> participant1Cards = new ArrayList<>();
List<Card> participant2Cards = new ArrayList<>();

List<Card> deckOfCards;

/**
  
  * constructor war take both players and the deck of cards
     * @param player1
     * @param player2
     * @param deck
 */

public War(String player1, String player2, GameDeck deck)
{

deckOfCards = deck.getCards();

//shuffling the deck of cards
Collections.shuffle(deckOfCards);	

//method to distribute
distribute(deckOfCards);

participant1 = new Player(player1,participant1Cards);
participant2 = new Player(player2,participant2Cards);
	
}

//method for distributing cards
/**
 * 
     * @param deck_Cards
 * 
 */
public void distribute(List<Card> deck_Cards)
{
boolean var = true;
for(Card c : deck_Cards){			
if(var)
{				
participant1Cards.add(c);
var = false;
}

else
{
participant2Cards.add(c);
var = true;
}		
}
		
}
	
	
//this method will check for the player whose all cards are gone or lost in the game
/**
 * 
     * @param participant1
     * @param participant2
     * @return 
 */
public String checkEmpty(Player participant1, Player participant2)
{

    if(participant2.getSize() == 0 && participant2.ReservedCardsSize()==0)
    
    {

        return participant1.getName();
	
    }
    
    else if(participant1.getSize() == 0 && participant1.ReservedCardsSize()==0)
    
    {

        return participant2.getName();
	
    }

    if(participant1.getSize() == 0 && participant1.ReservedCardsSize()!=0)
    
    {

        
        System.out.println("Renewing the cards of " + participant1.getName());
	
        participant1.renewPlayerCards();
	
    }

    if(participant2.getSize() == 0 && participant2.ReservedCardsSize()!=0)
    
    {

        
       System.out.println("Renewing the cards of " + participant2.getName());
	
       participant2.renewPlayerCards();
	
    }

    return null;
	
}

//this method will called to start the game 
/**
 * 
 * 
     * @return winner
 */
public String play()
{

    
    List<Card> war_cards = new ArrayList<>();
		
while(true)
{
			
String winner = checkEmpty(participant1,participant2);

if(winner!=null)
{
return winner;
}

if(participant1.getSize()!=0 && participant2.getSize()!=0){

    Card c1 = participant1.getCard();

    Card c2 = participant2.getCard();

    //the return value is stored in result after comparing
    int result = c1.compareTo(c2);

    System.out.println(participant1.getName() + " has card with Rank : " + c1.getRank());

    System.out.println(participant2.getName() + " has card with Rank : " + c2.getRank());
		
/**
 * 
 * The result variable will return a number 
 * which will decide which player has more cards
 */
    
    
switch(result)
{
			
case 1: if(war_cards.size()>0)
                        
{
						
             
    war_cards.forEach((c) -> {
        participant1.addingToReseveCards(c);
        });
						
war_cards.clear();
					
                        
}
					
participant1.addingToReseveCards(c1);
					
participant1.addingToReseveCards(c2);
					
System.out.println(participant1.getName() +" is winner of this round \n");
					
                        
break;
			
case -1: if(war_cards.size()>0)
       
{
						

    war_cards.forEach((c) -> {
        participant2.addingToReseveCards(c);
        });
						

war_cards.clear();
					 
                        
}
					 

participant2.addingToReseveCards(c1);
					 

participant2.addingToReseveCards(c2);
					

System.out.println(participant2.getName() +" is the winner of this round \n");
					 

break;
				

case 0: System.out.println("The War has begun! Lay down 1 card and draw another one");
			        

war_cards.add(c1);
			        

war_cards.add(c2);
			        

String winnerOfWar = checkEmpty(participant1,participant2);
					

if(winnerOfWar!=null)

{
						

    return winnerOfWar;
					
    
}
					

if(participant1.getSize()!=0 && participant2.getSize()!=0)

{

    war_cards.add(participant1.getCard());

    war_cards.add(participant2.getCard());
					
    
}
			        

break;

}

}
		

}
		

}

    
}//end class
