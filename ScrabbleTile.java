/** Paige Bartusiak for Assignment 8.3a
  * October 24, 2018
  * ReadMe: A definition for the class named ScrabbleTile. 
  *       Includes instance varables, constructor, accessors, and mutators. 
  **/

public class ScrabbleTile{
  //create instance variables letter and value!
  private char letter;
  private int value;
  
  //constructor method!!
  public ScrabbleTile(char let, int val){
    letter = let;
    value = val;
  }
  
  //Accessor Methods!!!
  public char getLetter(){ 
    return letter;
  }
  
  public int getValue(){
    return value;
  }
  
  ///Mutator Methods!!!
  public void setLetter(char let){
    letter = let;
  }
  
  public void setValue(int val){
    value = val;
  }
  
  public String printTile(){
    return "The letter is " + letter + " and the value is " + value + ". ";
  }

}