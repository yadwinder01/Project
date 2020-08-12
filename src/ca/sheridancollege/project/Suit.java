

package ca.sheridancollege.project;

/**
 * This class +++Software Design Fundamentals+++
 *
 * @author Yadwinder Singh,Sarthak Sharma, Pushp Kumar,Krupesh Jayeshbhai Patel
 * date: 10/08/2020
 */


public enum Suit 
{
   
    club("Club"), 
    Diamond("Diamond"), 
    Heart("Heart"), 
    Spade("Spade");
	
    private final String value;
	
	
    private Suit(String val)
    {

        value = val;
	
    }
	

    @Override
    public String toString(){
    
        return value;
    
    }
    
}
