import java.util.Random;
public class gpt {



        public static void main(String[] args) {
            char[][] harfDizisi = new char[4][4];
            Random random = new Random();

            // Kendi kendine 4x4'lük bir harf dizisi oluşturma
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    harfDizisi[i][j] = (char) (random.nextInt(26) + 'A');
                }
            }

            // Oluşturulan harf dizisini ekrana yazdırma
            System.out.println("Harf Dizisi:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(harfDizisi[i][j] + " ");
                }
                System.out.println();
            }

            // Rastgele sayılar üreterek harfleri bulma
            System.out.println("\nHarfleri Bulma:");
            for (int k = 0; k < 4; k++) {
                int satir = random.nextInt(4);
                int sutun = random.nextInt(4);
                char bulunanHarf = harfDizisi[satir][sutun];
                System.out.println("Bulunan Harf: " + bulunanHarf);
            }
        }
    }

