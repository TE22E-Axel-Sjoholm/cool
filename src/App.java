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

        tangentbord.nextLine();

        System.out.print("Ange ett substantiv: ");
        String substantiv = tangentbord.nextLine();
        System.out.print("Ange substantivets pluraländelse: ");
        String pluraländelse = tangentbord.nextLine();
        System.out.println("En "+substantiv+", flera "+substantiv+pluraländelse);
        tangentbord.close();

    }  
}
