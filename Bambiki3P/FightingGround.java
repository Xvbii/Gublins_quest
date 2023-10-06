package org.example;
import java.util.Scanner;
// Driver class and method
class FightingGround {
    public static void main(String args[]) {
        // create new margherita pizza
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i>0; i++) {
            System.out.println("Wybierz przeciwnika: \n 1.Zwykły goblin \n 2.Goblin żołnierz \n " +
                    "3.Król goblinów");
            System.out.print("przeciwnik nr: ");
            int number = scan.nextInt();
            System.out.println(" ");

            if (number == 1) {
                Enemy gublin = new NormalGoblin();
                System.out.println(gublin.getDescription() +
                        " | Życie: " + gublin.getHealth());
                break;

            } else if (number == 2) {
                Enemy gublin2 = new SoldierGoblin();
                System.out.println(gublin2.getDescription() +
                        " | Życie: " + gublin2.getHealth());
                break;

            } else if (number == 3) {
                Enemy gublin3 = new GoblinKing();
                System.out.println(gublin3.getDescription() +
                        " | Życie: " + gublin3.getHealth());
                System.out.println("\nWybierz swój miecz Towarzyszu\n 1.Lodowy miecz \n " +
                        "2.Ognisty miecz \n 3.??? miecz");
                System.out.print("miecz nr: ");
                number = scan.nextInt();
                break;
            }
                else{
                 System.out.println("Ten przeciwnik nie istnieje Towarzyszu.");
            }
        }

    }
}
