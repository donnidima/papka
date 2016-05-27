/**
 * Created by donni on 23.05.2016.
 */
public class RandomN {
    public static void main (String [] args) {
        int n = 8;
        {
            System.out.println("Число n = " +n);
            System.out.println("Псевдослучайное число [-n;n]");
            System.out.println(+Math.random() * 17 - 8);
        }
    }

}
