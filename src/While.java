import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 0   */
        int nbr = -1;
        while (nbr < 0) {
            nbr++;
            System.out.println("+");
        }
        System.out.println("bravo");

        do {
            System.out.println("+");
        } while (nbr < 0); {
            System.out.println("bravo");
        }

        /* 1 . Ecrire un algorithme qui demande à lʼutilisateur un nombre compris
        entre 1 et 3 jusquʼà ce que la réponse convienne.
         */
            int nombre = 0;
            System.out.println("Entrez un nombre entre 1 et 3");
            while (nombre < 1 || nombre > 3) {
                nombre = scanner.nextInt();
                if (nombre < 1 || nombre > 3) {
                    System.out.println("Erronée. Recommencez");
                }
            }
            System.out.println("Vous avez réussi trouver : " + nombre);


         /* 2. Ecrire un algorithme qui demande un nombre compris entre 10 et 20,
         jusquʼà ce que la réponse convienne. En cas de réponse supérieure à 20,
         on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! »
         si le nombre est inférieur à 10.*/

            int numero = 0;
            System.out.println("Entrez un nombre entre 10 et 20");
            while (numero < 10 || numero > 20) {
                numero = scanner.nextInt();

                if (numero < 10) {
                    System.out.println("Plus petit !");
                } else if (numero > 20) {
                    System.out.println("Plus grand !");
                }
            }
            System.out.println("Reussi! : " + numero);

        /* 3. Ecrire un algorithme qui demande successivement plusieurs nombres à l’utilisateur,
         et qui lui dise ensuite quel était le plus grand parmi ces nombres et sa position :
        La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro.
         */

            int num;
            int maxNombre = 0;
            int positionMax = 0;
            int compteur = 1;
            boolean premierNombre = true;

            System.out.println("Donnez des nombres et pour arrêter entrez 0 :");

            while (true) {
                num = scanner.nextInt(); // Lire un nombre

                if (num == 0) {
                    break; // Sort de la boucle si le nombre est zéro
                }

                if (premierNombre) {
                    maxNombre = num; // Met à jour le plus grand nombre
                    positionMax = compteur; // Met à jour la position du plus grand nombre
                    premierNombre = false; // On a maintenant un premier nombre
                } else {

                    if (num > maxNombre) {
                        maxNombre = num;
                        positionMax = compteur;
                    }
                }

                compteur++;
            }

            if (!premierNombre) {
                System.out.println("Le plus grand nombre est : " + maxNombre);
                System.out.println("Sa position est : " + positionMax);
            } else {
                System.out.println("Aucun nombre valide n'a été saisi.");
            }
        /* 4. Lire la suite des prix (en euros entiers et terminée par zéro)
        des achats dʼun client. Calculer la somme quʼil doit, lire la somme
        quʼil paye, et simuler la remise de la monnaie en affichant les textes
        "10 Euros", "5 Euros" et "1 Euro" autant de fois quʼil y a de coupures
        de chaque sorte à rendre.
         */

        int prix;
        int sum = 0;
        int payer = 0;

        System.out.println("Rentrez le prix des articles à acheter, pour arrêter tapez 0:");
        while (true) {
            prix = scanner.nextInt();
            if (prix == 0) break;
            sum += prix;
        }
        System.out.println("La somme total des articles =  : " + sum + " euros");


        do {
            System.out.print("Entrez la somme à payer : ");
            payer = scanner.nextInt();

            if (payer < sum) {
                System.out.println("La somme payée est insuffisante. Vous devez payer au moins " + sum + " euros.");
            }
        } while (payer < sum);
        System.out.println("Vous avez donné : " + payer + " euros");

        int monnaieARendre = payer - sum;
        System.out.println("Monnaie à rendre : " + monnaieARendre + " euros");

        while (monnaieARendre >= 10) {
            System.out.println("10 Euros");
            monnaieARendre -= 10;
        }
        while (monnaieARendre >= 5) {
            System.out.println("5 Euros");
            monnaieARendre -= 5;
        }
        while (monnaieARendre >= 1) {
            System.out.println("1 Euro");
            monnaieARendre -= 1;
        }
 /* 5.Ecrire un algorithme qui permet de retrouver le maximum,
 le minimum ainsi que la somme d’une liste de nombres positifs saisis
 par l’utilisateur.
 La fin de la liste est indiquée par un nombre négatif.
 La longueur de la liste n’est pas limitée.
  */

    }
    }
