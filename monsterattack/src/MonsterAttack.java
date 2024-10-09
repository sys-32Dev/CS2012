import java.util.Date;
public class MonsterAttack {
    private String monsterName;
    private String attackLocation;
    private double damagesInMillionUSD;
    private Date date;

    public MonsterAttack(String monsterName, String attackLocation, double damagesInMillionUSD, Date date) {
        this.monsterName = monsterName;
        this.attackLocation = attackLocation;
        this.damagesInMillionUSD = damagesInMillionUSD;
        this.date = date;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public String getAttackLocation() {
        return attackLocation;
    }

    public double getDamagesInMillionUSD() {
        return damagesInMillionUSD;
    }

    public Date getDate() {
        return date;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public void setAttackLocation(String attackLocation) {
        this.attackLocation = attackLocation;
    }

    public void setDamagesInMillionUSD(double damagesInMillionUSD) {
        this.damagesInMillionUSD = damagesInMillionUSD;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "Monster Attack Details: \n" +
                "Monster Name: " + monsterName + "\n" +
                "Location: " + attackLocation + "\n" +
                "Damages: $" + damagesInMillionUSD + " million\n" +
                "Date: " + date;
    }
}
