import java.util.Scanner;
/**
 * program to choose animal based off decisions 
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask if the animal has feathers
  System.out.println("Does the animal have feathers?");
  String feathers = input.nextLine();
  if( feathers.equals("yes")){
    // ask if it can swim
    System.out.println("Does the animal swim?");
    String swim = input.nextLine();
    
    if(swim.equals("yes")){
      System.out.println("This is a duck");
    }else if (swim.equals("no")){
      System.out.println("This is a hen");
    }
      }else{ 
      if( feathers.equals("no")){
        // ask if it has legs
        System.out.println("Does the animal have legs?");
        String legs = input.nextLine();

        if (legs.equals("yes")){
          System.out.println("This is a lizard");
        }else if (legs.equals("no")){
          System.out.println("This is a snake");
        
        }
        }
      }
    }
  }

