import java.util.Scanner;
public class ZooManagement {
    private int nbrCages;
    private String zooName;
    public ZooManagement() {
        this.nbrCages = 20;
        this.zooName = "my zoo";
    }
    public void displayInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages");
    }
    public void updateInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de cages: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ce n'est pas un nombre valide. Essayez encore.");
            scanner.next();
        }
        this.nbrCages = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Entrez le nom du zoo: ");
        this.zooName = scanner.nextLine();
    }
}
