import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myUser = new Scanner(System.in);
    String userName;
    
    
    System.out.println("Hello and welcome to Discord please Enter username!"); 
    userName = myUser.nextLine();   
       
    System.out.println(" Your Username is: " + userName);

    
  }
}