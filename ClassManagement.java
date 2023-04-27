import java.sql.*;
import java.util.Scanner;

public class ClassManagement {
    
    public static void main(String[] args) {
        try {
            Connection con = Database.getDatabaseConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        boolean running = true;

        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        while (running){
            printMenu();
            input = scanner.next();
            input = input.toLowerCase();

            switch(input){
                case "class management":
                        System.out.print("Create a class: ");
                        Scanner sc = new Scanner(scanner.next());
                        sc.useDelimiter(" ");
                        String courseNumber = sc.next();
                        String term = "";
                        int sectionNumber = 0;
                        if(sc.hasNext()){
                            term = sc.next();
                            if(sc.hasNext()){
                                sectionNumber = sc.nextInt();
                                if(sc.hasNext()){
                                    sectionNumber = sc.nextInt();
                                }
                            }

                        }
                        // reateClass()
                    break;
                case "q":
                    running=false;
                    break;
                default:
                    System.out.println("invalid selection");
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Class Management");
        System.out.println("Category and Assignment Management");
        System.out.println("Student Management");
        System.out.println("Grade Reporting");
        System.out.println("Grade Calculation");
        System.out.println("q");
    }
}
