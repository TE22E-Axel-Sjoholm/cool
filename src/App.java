import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {;
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Divisions program:");
        System.out.print("Ange tal 1:");
        int tal1 = tangentbord.nextInt();
        System.out.print("Ange tal 2:");
        int tal2 = tangentbord.nextInt();
        double DbKvot = (double) tal1 / tal2;
        int intKvot = tal1 / tal2;
        System.out.println("Kvoten Är: "+DbKvot);
        System.out.println("Kvoten Är: "+intKvot);

        
    }  
}
