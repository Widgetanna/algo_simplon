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
        predictionAvenirMinutePlus(scanner);
        predictionAvenirMinuteSecond(scanner);
        photocopies(scanner);
        impot(scanner);
        jourSemaine(scanner);
        ordreCroissant(scanner);

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
        System.out.println("Veuillez entrer le prix HT :");
        double prixHT = scanner.nextDouble();

        double tauxDeTaxe = 2.2;
        double prixTTC = prixHT * (1 + (tauxDeTaxe / 100));
        System.out.println("Prix TTC pour cet article s'éléve à "+ prixTTC );

        System.out.println("Entrez le nombre d’articles :");
        int nombreArtilces = scanner.nextInt();

        double total = prixTTC * nombreArtilces;
        System.out.println("Total prix TTC:" + total );
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
                System.out.println("Le nombre est positif.");
            } else {
                System.out.println("Le nombre est négatif.");
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
        System.out.print("Veuillez entrer l'âge de l'enfant à partir de 6 ans : ");

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
    public static void predictionAvenirMinutePlus(Scanner scanner) {
        System.out.println("C'est une prédiction de l'avenir. L'oracle vous dira quelle heure il sera dans 1 minute");
        System.out.print("Entrez l'heure : ");
        int heure = scanner.nextInt();
        System.out.print("Entrez minutes : ");
        int minutes = scanner.nextInt();

        minutes++;

        if (minutes == 60) {
            minutes = 00;
            heure++;
        }
        if (heure == 24) {
            heure = 24;
        }

        System.out.println("Oracle vous prédit que dans une minute, il sera " + heure + " heure " + minutes + " minute.");
    }
    public static void predictionAvenirMinuteSecond(Scanner scanner) {
        System.out.println("C'est une prédiction de l'avenir. L'oracle vous dira quelle heure il était 1 minute d'avant");
        System.out.print("Entrez l'heure : ");
        int heure = scanner.nextInt();
        System.out.print("Entrez minutes : ");
        int minutes = scanner.nextInt();
        System.out.print("Entrez secondes : ");
        int secondes = scanner.nextInt();

        secondes++;

        if (secondes == 60) {
            secondes = 00;
            minutes++;
        }
        if (minutes == 60) {
            minutes = 0;
            heure++;
        }
        if (heure == 24) {
            heure = 24;
        }

        System.out.println("Oracle vous prédit que dans une seconde il sera  il sera " + heure + " heure " + minutes + " minute " + secondes + " seconde ");
    }
    public static void photocopies(Scanner scanner) {
        System.out.println("Facture de photocopies.\n Entrez le nombre de photocopies effectuées:");
        int photocopies = scanner.nextInt();

        double total = 0.0;

        if (photocopies <= 10) {
            total = photocopies * 0.10;
        } else if (photocopies <= 30) {
            total = (10 * 0.10) + ((photocopies - 10) * 0.09);
        } else {
            total = (10 * 0.10) + (20 * 0.09) + ((photocopies - 30) * 0.08);
        }
        System.out.printf("Le montant total de la facture est : %.2f €", total);
    }
    public static void impot(Scanner scanner) {
        System.out.println("Des impôts de Zorglub");
        System.out.print("Veuillez entrer le genre homme = H soit femme = F) : ");

        char genre = scanner.next().charAt(0);

        System.out.print("Veuillez entrer l'âge : ");
        int age = scanner.nextInt();

        boolean impotH = (genre == 'H' || genre == 'h') && age > 20;
        boolean impotF = (genre == 'F' || genre == 'f') && (age >18 && age <= 35);

        if (impotH || impotF) {
            System.out.println("Imposable");

        } else {
            System.out.println("Non Imposable");
        }
    }
    public static void jourSemaine(Scanner scanner) {
        System.out.print("Entrez un chiffre entre 1 et 7 : ");

        int chiffre = scanner.nextInt();

        switch (chiffre) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("Erreur");
        }
    }
    public static void  ordreCroissant(Scanner scanner) {
        System.out.println("Entrez le 1er nombre entier");
        int nombre1= scanner.nextInt();
        System.out.println("Entrez le 2ème nombre entier");
        int nombre2= scanner.nextInt();

        if (nombre1 < nombre2) {
            System.out.println("Les nombres dans l'ordre croissant : " + nombre1 + ", " + nombre2);
        } else {
            System.out.println("Les nombres dans l'ordre non-croissant : " + nombre2 + ", " + nombre1);
        }
    }
}

