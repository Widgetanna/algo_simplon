import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Bonjour!");
        System.out.println("Quel est votre prénom ?");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour " + prenom + " !");



        calculNombre(scanner);
        nombrePositif(scanner);
        prixTTC(scanner);
        positifNegatifUniquement(scanner);
        ordreNombres(scanner);
        valeurAbsolue(scanner);
        auMoinsUnPositif(scanner);
        positifNegatifZero(scanner);
        positifNegatifNull(scanner);
        ageEnfant(scanner);

        scanner.close();
    }

    public static void calculNombre(Scanner scanner) {
        System.out.println("Veuillez entrer un nombre :");

        int nombre = scanner.nextInt();

        scanner.nextLine();

        int carre = nombre * nombre;

        System.out.println("Son carré est : " + carre);

    }
    public static void nombrePositif(Scanner scanner) {
        System.out.println("Veuillez entrer un nombre pour vérifier s'il est positif où negatif:");
        int nombre = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ce nombre est : " + nombre);

        if (nombre > 0) {
            System.out.println("Le nombre est positif.");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif.");
        }
    }
    public static void prixTTC(Scanner scanner) {
        System.out.println("Veuillez entrer le prixHT :");
        double prixHT = scanner.nextDouble();
        double prixTTC = prixHT * 2.20;
        System.out.println("Entrez le nombre d’articles :");
        int nombreArtilces = scanner.nextInt();

        double total = prixTTC * nombreArtilces;
        System.out.println("Total TTC:" + total );
    }
    public static void positifNegatifUniquement(Scanner scanner) {
        System.out.println("Veuillez entrer 1er nombre : ");
        int nombreA = scanner.nextInt();
        System.out.println("Valeur du nombre numero 1 est " + nombreA );
        System.out.println("Veuillez entrer 2ème nombre :");
        int nombreB = scanner.nextInt();
        System.out.println("Valeur du nombre numero 2 est " + nombreB );

        if ((nombreA > 0 && nombreB > 0) || (nombreA < 0 && nombreB < 0)) {
            System.out.println("Le produit est positif.");
        } else {
            System.out.println("Le produit est négatif.");
        }
    }
    public static void ordreNombres(Scanner scanner) {
        System.out.println("Veuillez entrer 1er numero  :");
        int nombre1 = scanner.nextInt();
        System.out.println("Veuillez entrer 2ème numero  :");
        int nombre2 = scanner.nextInt();
        System.out.println("Veuillez entrer 3ème numero  :");
        int nombre3 = scanner.nextInt();

        if ((nombre1 <= nombre2 ) && (nombre2 <= nombre3 ))   {
            System.out.println("Les nombres sont dans l’ordre croissant.");
        } else {
            System.out.println("Les nombres ne sont pas dans l’ordre croissant.");
        }
    }
    public static void valeurAbsolue(Scanner scanner) {
        System.out.println("Veuillez entrer un nombre réel:");
        int nombre = scanner.nextInt();

        if (nombre > 0) {
            System.out.println("La valeur absolue de X = " + nombre);
        } else {
            System.out.println("La valeur absolue de X = " + (-nombre));
        }
    }
    public static void auMoinsUnPositif(Scanner scanner) {
        System.out.print("Veuillez entrer le 1er nombre : ");
        int nombre1 = scanner.nextInt();
        System.out.print("Veuillez entrer le 2ème nombre : ");
        int nombre2 = scanner.nextInt();

        if (nombre1 > 0 || nombre2 > 0) {
            System.out.println("Il y a au moins un nombre positif.");
        } else {
            System.out.println("Il n'y a aucun nombre positif.");
        }
    }
    public static void positifNegatifZero(Scanner scanner) {
        System.out.println("Veuillez entrer un nombre :");
        int nombre = scanner.nextInt();
        System.out.println("Valeur du nombre que vous avez entré est " + nombre );

        if (nombre == 0 ) {
            System.out.println("Le nombre est nul.");
        } else {
            if (nombre > 0 )  {
                System.out.println("Le produit est positif.");
            } else {
                System.out.println("Le produit est négatif.");
            }
        }
    }
    public static void positifNegatifNull(Scanner scanner) {
        System.out.println("Veuillez entrer 1er nombre : ");
        int nombreA = scanner.nextInt();
        System.out.println("Valeur du nombre numero 1 est " + nombreA );
        System.out.println("Veuillez entrer 2ème nombre :");
        int nombreB = scanner.nextInt();
        System.out.println("Valeur du nombre numero 2 est " + nombreB );
        System.out.println("Vérification si si le produit est négatif ou positif en incluant le traitement null");

        if (nombreA == 0 || nombreB == 0) {
            System.out.println("Le produit est nul.");
        } else {
            if (nombreA > 0 && nombreB > 0) {
                System.out.println("Le produit est positif.");
            } else {
                System.out.println("Le produit est négatif.");
            }
        }
    }
    public static void ageEnfant(Scanner scanner) {
        System.out.print("Veuillez entrer l'âge de l'enfant : ");

        int age = scanner.nextInt();

        if (age >= 6 && age <= 7) {
            System.out.println("Catégorie : Poussin");
        } else if (age >= 8 && age <= 9) {
            System.out.println("Catégorie : Pupille");
        } else if (age >= 10 && age <= 11) {
            System.out.println("Catégorie : Minime");
        } else if (age >= 12) {
            System.out.println("Catégorie : Cadet");
        }
    }
}

