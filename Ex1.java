import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int nom1, nom2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("entrez le premier nombre: ");
        nom1 = scanner.nextInt();
        System.out.print("entrez le deuxieme nombre: ");
        nom2 = scanner.nextInt();
        int somme = addition(nom1,nom2);
        System.out.println("la somme est :" +somme);
    }
    public static int addition(int a, int b) {
        return a + b;
    }
}