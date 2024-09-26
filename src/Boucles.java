import java.util.Scanner;

public class Boucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* #1     */
        System.out.println("Veuillez entrer un nombre");
        int nombre = scanner.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(nombre + i);
        }

         /* #2     */
        System.out.println("Veuillez entrer un nombre");
        int nombre1 = scanner.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(nombre1 + " x " +i + " = " +nombre * i);
        }

         /* #3    */
        System.out.println("Veuillez entrer un nombre");
        int nombre2 = scanner.nextInt();

        for (int i = nombre2; i > 0; i--) {
            System.out.println(  i );
        }

        /* #4     */
        System.out.println("Veuillez entrer un nombre");
        int nombre3 = scanner.nextInt();
        for (int i = nombre3; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println("Afficher paires " + i);
            }
        }

        /* #5     */
        System.out.println("Veuillez entrer un nombre");
        int nombre4 = scanner.nextInt();
        for (int i = nombre4; i > 0; i--) {
            if (i % 2 == 1) {
                System.out.println("Afficher impaire " + i);
            }
        }

        /* #6     */
        System.out.println("Donner 1er nombre");
        int n1 = scanner.nextInt();
        System.out.println("Donner 2ème nombre");
        int n2 = scanner.nextInt();

        int min = (n1 < n2) ? n1 : n2;
        int max = (n1 > n2) ? n1 : n2;

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

         /* #7     */
        System.out.println("Donner un nombre");
        int nombre7 = scanner.nextInt();
        int somme = 0;
        for (int i = 1; i <= nombre7; i++) {
            somme += i;

            if (i < nombre7) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + somme);

          /* #8   */
        System.out.println("Donner un nombre");
        int nombre8 = scanner.nextInt();
        int somme1 = 1;
        for (int i = 1; i <= nombre8; i++) {
            somme1 *= i;

            if (i < nombre8) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println(" = " + somme1);

        /* #9 */
        System.out.println("Donner 1er nombre");
        int maximum = scanner.nextInt();

        for (int i = 2; i <= 20; i++) {
            System.out.println("Donner " + i + "eme nombre");

            int numero = scanner.nextInt();

            if (numero > maximum) {
                maximum = numero;

            }
            System.out.println("La plus grande valeur est : " + maximum);

        }
        /* #10  */
        double resultatClasse =  0.0;
        int nombreEleves = 10;
        for (int i = 1; i <= nombreEleves; i++) {
            System.out.print("Donner une note de l'éléve " + i + ": ");
            double note = scanner.nextDouble();
            resultatClasse += note;
        }
            double moyenne = resultatClasse / nombreEleves;
            System.out.println("La moyenne de la classe est : " + moyenne);


        /* #11  */
        int personnes = 5;
        double totalTaille = 0;
        for (int i = 1; i <= personnes; i++ ) {
            System.out.println("Donner la taille  de la personne numero " +i );
            double taille = scanner.nextDouble();
           totalTaille += taille;
        }
        double moyenneTaille =  totalTaille / personnes;
        System.out.println("La moyenne des tailles est : " + moyenneTaille);

        /* #12  */
        int horizontales5 = 5;
        int colonnes = 5;

        for (int i = 0; i < horizontales5; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* #13  */
        int horizontales = 5;

        for (int i = 1; i <= horizontales; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* #14   */
        int horizontal = 5;
        int colonne = 5;
        for (int i = 0; i < horizontal; i++) {
            for (int j = i; j < colonne; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         /* #15.  */
        int ligne1 = 5;
        for (int i = 0; i < ligne1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = ligne1 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* #16 */
        int lignes = 5;
        for (int i = 0; i < lignes; i++) {
        for (int j = 0; j < lignes - i - 1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < (2 * i + 1); j++) {
            System.out.print("*");
        }
        System.out.println();
    }

         /* #17  */
        int ligne = 6;

        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = (ligne - i) * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




