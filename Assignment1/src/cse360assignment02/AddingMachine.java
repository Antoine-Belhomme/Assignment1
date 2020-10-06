package cse360assignment02;

public class AddingMachine {
  private int total;    //An integer for the total result
  private String stringHistory; //A string to track calculation
  public static void main(String[] args) //Main to test my java code
  {
	 AddingMachine myCalculator = new AddingMachine(); //Create myCaculator
	 myCalculator.add(4);				//Add 4
	 myCalculator.subtract(2);			//Subtract 2
	 myCalculator.add(5);				//Add 5
	 System.out.println(myCalculator.getTotal());//Prints the total
	 System.out.println(myCalculator.toString());//Prints the history
  }
  
  public AddingMachine () 
  {
    total = 0;  // not needed - included for clarity
    stringHistory = "0 "; //Start the history at 0
  }
  
  public int getTotal () //Will return total 
  { 
    return total; //return total
  }
  
  public void add (int value) //Add a value to the total
  {  
	  total += value; //Add the value to the total
	  stringHistory = stringHistory + "+ "+value + " "; //Add the value to the history
  }

  public void subtract (int value) //Subtract a value to the total
  {  
	  total -= value;  //Subtract value to the total
	  stringHistory = stringHistory + "- "+value + " ";//Add the subtraction to the history
  }

  public String toString () //Put all the operations into a string
  {  
    return stringHistory;	//return all the history contain in stringHistory
  }

  public void clear() 
  {
	  total = 0;	//clear total back to 0
	  stringHistory = "0 ";	//clear history back to 0
  }
}