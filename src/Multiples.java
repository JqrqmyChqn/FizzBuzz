public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 1000;i+=1) {
            if (i % 5 == 0 || i % 3 == 0) {
                count += 1;
            }
        }
        System.out.println(count);

    }
}
