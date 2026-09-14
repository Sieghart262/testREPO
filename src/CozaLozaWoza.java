public class CozaLozaWoza {
    public static void main(String[] args) {

        for (int number = 1; number <= 100; number++) {

            boolean chiaHet = false;

            if (number % 3 == 0) {
                System.out.print("Coza");
                chiaHet = true;
            }
            if (number % 5 == 0) {
                System.out.print("Loza");
                chiaHet = true;
            }
            if (number % 7 == 0) {
                System.out.print("Woza");
                chiaHet = true;
            }

            if (!chiaHet) {
                System.out.print(number);
            }

            System.out.print(" ");

            if (number % 11 == 0) {
                System.out.println();
            }
        }
    }
}
