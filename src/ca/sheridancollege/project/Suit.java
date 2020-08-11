

package ca.sheridancollege.project;

/**
 * This class +++Software Design Fundamentals+++
 *
 * @author Yadwinder Singh,Sarthak Sharma, Pushp Kumar,Krupesh Jayeshbhai Patel
 * date: 10/08/2020
 */


public enum Suit 
{
   
    club(1), 
    Diamond(2), 
    Heart(3), 
    Spade(4);
	
    private final int value;
	
	
    private Suit(int val)
    {

        value = val;
	
    }
	

    public int getValue()
    {

        return value;
	
    }
    
}
