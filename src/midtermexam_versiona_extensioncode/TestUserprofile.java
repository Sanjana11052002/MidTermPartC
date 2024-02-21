/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author sanju
 */
public class TestUserprofile {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Horror");
        System.out.println("5. Sci-Fi");

        
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        
        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Horror";
                break;
            case 5:
                genre = "Sci-Fi";
                break;
            default:
                genre = "Unknown";
                break;
        }

       
        System.out.println("\nUser profile created successfully!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
}


