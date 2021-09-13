import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an animal.");
   String  userPet = input.nextLine();

   System.out.println("Enter the starting ammount.");
   int userPets = input.nextInt(); 

   System.out.println("Enter the projection year.");
   int userYear = input.nextInt(); 

   float totPets = userPets*(userYear -2020)+userPets;

   System.out.print("Type of animal: " + userPet);

   System.out.print("\nStarting ammount" + userPets);

   System.out.print("\n ")







  }
}