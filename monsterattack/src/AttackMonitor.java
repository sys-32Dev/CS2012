import java.util.Scanner;
import java.util.Date;

public class AttackMonitor {
    private MonsterAttack[] attacks;
    private int attackCount;

    public AttackMonitor() {
        this.attacks =new MonsterAttack[5];
        this.attackCount = 0;
    }

    public void reportAttacks() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++)  {
            System.out.println("Enter attack " + (i+1) + ": ");
            System.out.println("Enter Monster Name: ");
            String monsterName = scanner.nextLine();
            System.out.println("Enter Attack Location: ");
            String attackLocation = scanner.nextLine();
            System.out.println("Enter Damages (Millions): ");
            int damagesInMillionsUSD = scanner.nextInt();
            scanner.nextLine();
            Date date =new Date();
            attacks[i] = new MonsterAttack(monsterName, attackLocation, damagesInMillionsUSD, date);
            attackCount++;
        }
    }
    public void showAttacks() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Monster Name: " + attacks[i].toString());
        }
    }
    public void showDamages() {
        double totalDamages = 0;
        for (int i = 0; i < 5; i++) {
            totalDamages += attacks[i].getDamagesInMillionUSD();
        }
        double meanDamages = totalDamages / attackCount;
        System.out.println(meanDamages + " damages in million USD (mean)");
        System.out.println(totalDamages + " damages in million USD (total)");
    }
    public void showMonsters() {
        String[] monsterNames = new String[attackCount];
        int[] attackCounts = new int[attackCount];
        int unique = 0;
        for (int i = 0; i < attackCount; i++) {
            String monsterName = attacks[i].getMonsterName();
            boolean monsterExists = false;

            for (int j = 0; j < unique; j++) {
                if (monsterNames[j].equals(monsterName)) {
                    attackCounts[j]++;
                    break;
                }
            }

            if (!monsterExists) {
                monsterNames[unique] = monsterName;
                attackCounts[unique] = 1;
                unique++;
            }
        }
        for (int i = 0; i < unique; i++) {
            System.out.println("Monster Name: " + monsterNames[i] + ", " + attackCounts[i] + " attack(s)");
        }
    }
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Enter Attacks");
            System.out.println("2. Show Attacks");
            System.out.println("3. Show Damages");
            System.out.println("4. Show Monsters");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    reportAttacks();
                    break;
                case 2:
                    showAttacks();
                    break;
                case 3:
                    showDamages();
                    break;
                case 4:
                    showMonsters();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}