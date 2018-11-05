public class Main {

    public static void main(String[] args) {

        Summator newSum= new Summator();

        newSum.setFirstNumber(2_000_000_000);
        newSum.setSecondNumber(2_000_000_000);

        long summa = newSum.sum();
        System.out.println(summa);

    }
}
