import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myUser = new Scanner(System.in);
    String userName;
  
    System.out.println("Hello and welcome to Discord please Enter username!"); 
    userName = myUser.nextLine();   
       
    System.out.println("Thank you, Your Username is: " + userName);

  Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 5 digit number password: ");

        
        int num = scan.nextInt();

      
        scan.close();
        
        System.out.println("The password eneterd by user is: "+num);

        System.out.println("Thank you, Please wait a few seconds as we log you in!");
    

    
  }
}