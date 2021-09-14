import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an animal.");
   String  userPet = input.nextLine();

   System.out.println("Enter the starting ammount.");
   int userPets = Integer.parseInt(input.nextLine());

   System.out.println("Enter the projection year.");
   int userYear = Integer.parseInt(input.nextLine());

   float totPets = userPets*(userYear -2020)+userPets;

   System.out.print("Type of Animal: " + userPet);

   System.out.print("\nStarting Ammount: " + userPets);

   System.out.print("\nCurrent Year: 2020 ");

   System.out.print("\nProjection Year: " + userYear);

   System.out.print("\nProjected Population: " + totPets);







  }
}