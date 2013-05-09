import java.util.ArrayList;

/**
 * Fun interactive activity to make Curtis/Randall's final presentation enjoyable!
 */
public class Puzzle {
  
  /**
   * Create a new ArrayList<String>
   * Populate this new ArrayList with data from input, using the data in the index of the String array
   * For example, if the array ["a", "b", "c", "d"] was found at index 1 of input, 
   * index 1 of your ArrayList should be "b".
   * @param  input ArrayList containing String arrays
   * @return       ArrayList with just Strings
   */
  private ArrayList<String> aaron(ArrayList<String[]> input) {
    
  }

  /**
   * Removes all instances of the string "3" in an ArrayList
   * @param  ArrayList<String> ArrayList containing unwanted 3's
   * @return                   ArrayList sans 3's
   */
  private ArrayList<String> nick(ArrayList<String> input) {
    
  }
  
  /**
   * Convert the ArrayList to an array *without* using .toArray() 
   */
  private String[] nicole(ArrayList<String> input) {
    
  }
  
  /**
   * Convert a String[] array to a String
   */
  private String robert(String[] input) {
    
  }

  /**
   * Reverse the inputted string
   */
  private String tim(String input) {
    
  }

  public static void main(String[] args) {
    ArrayList<String[]> test = new ArrayList<String[]>() {{
      //How's that for obfuscation?
      add(new String[]{"!", "y", "d", "v", "1", ";", "z", "t", "q", "1", "x", "d", "1", "q", "r"});
      add(new String[]{"w", "3", "w", "e", "q", "'", "x", "y", "a", "2", "b", "n", "f", "s", "d"});
      add(new String[]{"x", "6", "c", "r", "a", "(", "c", "u", "s", "3", "n", ",", "g", "d", "m"});
      add(new String[]{"h", "c", "e", "i", "z", "7", "v", "6", "r", "4", "t", ";", "t", "b", "n"});
      add(new String[]{"/", "j", "4", "o", "t", "u", "b", "5", "t", "0", "g", "l", "b", "v", "7"});
      add(new String[]{"k", "y", "y", "p", "f", "3", "n", "4", "g", "9", "d", "u", "d", "c", "p"});
      add(new String[]{"y", "s", "v", "l", "v", "h", "s", "f", "j", "6", "q", "j", "e", "x", ")"});
      add(new String[]{"v", "e", "n", "k", "g", "n", "3", "a", "u", "7", "m", "h", "x", "n", "'"});
      add(new String[]{"d", "o", ",", "t", "t", "m", "e", "b", "t", "5", ",", "a", "n", "g", "b"});
      add(new String[]{"3", "p", "(", "f", "4", "k", "d", "n", "2", "3", ".", "f", "k", "5", "s"});
      add(new String[]{"0", ";", "w", "r", "e", "8", "c", "g", "w", "3", "t", "m", "p", "6", "f"});
      add(new String[]{"-", "s", "r", "d", "h", "o", " ", ".", "s", "4", "8", "3", ")", "8", "h"});
      add(new String[]{"j", "2", "f", "e", "n", "p", "n", "/", "t", "6", "9", ",", "i", "i", "5"});
      add(new String[]{"k", "'", "x", "s", "k", "6", "y", "n", "7", "7", "=", ".", "7", "g", "r"});
      add(new String[]{"y", "d", "n", "e", "e", "p", "v", "a", "q", "5", "2", "n", "t", "e", "3"});
    }};
    
    Puzzle puzz = new Puzzle();
    
    ArrayList<String> aaronResult = puzz.aaron(test);
    ArrayList<String> nickResult = puzz.nick(aaronResult);
    String[] nicoleResult = puzz.nicole(nickResult);
    String robertResult = puzz.robert(nicoleResult);
    String timResult = puzz.tim(robertResult);
    System.out.println(timResult);
  }
}