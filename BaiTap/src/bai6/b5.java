package bai6;

public class b5 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            if (i != 5 && i != 7 && i != 19 && i != 45 && i != 67) {
                System.out.print(i + "   ");
            }
        }
    }
}
