package drills;

public class ArrayAccess2 {

  public static void main(String[] args) {
    // Access all the B grades in the grades array and output them to the screen.
    char grades[] = {'C', 'F', 'B', 'A', 'C', 'B'};
    System.out.println(grades[2] + " " + grades[5]);
    // Use values from the firstNames and lastNames arrays to create the names 
    // Sarah Dobbs and Davey Jones. 
    // Output the names to the screen.
    String firstNames[] = {"Matthew", "Mark", "Davey", "Sarah", "Linda" };
    String lastNames[] = {null, "Dobbs", "Cool", "Symbol", "Longshanks", "Jones"};
     
    System.out.println(firstNames[3] + " " + lastNames[1]);
    System.out.println(firstNames[2] + " " + lastNames[5]);
    // Declare and initialize an array containing your 
    // pet's name and the street you grew up on.
    // (If you do not have a pet, use the value null.) 
    String random[] = {"Sparky", "Turnberry"};
    
    System.out.println(random[0] + " " + random[1]);
    random = new String[4];
    random[0] = "Sparky";
    random[1] = "A";
    random[2] = "Turnberry";
    random[3] = "President";
    
    System.out.println(random[1] + " " + random[3] + " " + random[2] + " " + random[0]);
    System.out.println(random[0]);
    // Reassign the same array and initialize it with your middle 
    // name and a U.S. President's last name. 
    // (Use the array shortcut. If you do not have a middle name, use the value null.)
    
   }

}
