public class Main {
    public static void main(String[] args) {

        int initial = 100;
        int neededRefill = 1000;
        int refill = 1300;
        int coefficient = 100;
        boolean bonusAdded = (refill > neededRefill);

        if (bonusAdded) {
            int bonus = refill / coefficient;
            int totalWithBonus = refill + initial + bonus;
            System.out.println("вам начислено " + bonus + " бонусов");
            System.out.println("Итого на счету " + totalWithBonus + " рублей");
        } else {
            int total = initial + refill;
            System.out.println("Итого на счету " + total + " рублей");
        }
    }
}
