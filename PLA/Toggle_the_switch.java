package PLA;

public class Toggle_the_switch {
    public static void main(String[] args) {
        int num = 100;
        int on = (int) Math.sqrt(num);
        for (int i = 1; i <= on; i++) {
            System.out.print(i * i + " ");
        }
    }
}
