import java.util.Scanner;
import library.Library;
public class Application {
    public static void main(String[] args) {
        Library obj = new Library();
        Scanner myobj=new Scanner(System.in);
        
        int choice=1;
        while (choice != 0) {
            System.out.println("---------------------------------------");
            System.out.println("Enter 1 to add Books");
            System.out.println("\t 2 to Lend Book");
            System.out.println("\t 3 to Return Book");
            System.out.println("\t 4 to List Book");
            System.out.println("Any other number to Exit");
            System.out.println("---------------------------------------");
            
            choice=myobj.nextInt();
            switch (choice) {
                case 1:
                obj.addbook();
                break;
                case 2:
                obj.lendbook();
                break;
                case 3:
                obj.returnbook();
                break;
                case 4:
                obj.listbook();
                break;
                default:
                choice=0;
                break;
            }
        }
    }
}
