/** Paige Bartusiak for Assignment 8.3a
  * October 24, 2018
  * ReadMe: Creates ScrabbleTile objects and tests methods of the ScrabbleTile class.
  **/

public class TestScrabble{
  public static void main(String [] args){
    //Create one object (tile)
    ScrabbleTile tile1 = new ScrabbleTile('A', 1);
    System.out.print("There is one tile: ");
    System.out.println(tile1.printTile());
    
    //Testing mutators and accessors on the first tile
    tile1.setLetter('B');
    System.out.println("Now, the letter is " + tile1.getLetter());
    tile1.setValue(3);
    System.out.println("Now, the value is " + tile1.getValue());
    
    //create a new tile
    ScrabbleTile tile2= new ScrabbleTile('Z', 10 );
    System.out.print("There is a another tile: ");
    System.out.println(tile2.printTile());
    
    
    //Testing mutators and accessors on the second tile
    tile2.setLetter('W');
    System.out.println("Now, the letter is " + tile2.getLetter());
    tile2.setValue(4);
    System.out.println("Now, the value is " + tile2.getValue());
   
    //Summary:
    System.out.println("\nTotal, there are two tiles. Their end states are as follows...\nTile 1: " + tile1.printTile()+ "\nTile 2: " +  tile2.printTile());
  
  }
}