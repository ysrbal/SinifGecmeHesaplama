import java.util.Scanner;

public class Sgh {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner not = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = not.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = not.nextInt();
        System.out.print("Turkce Notunuz : ");
        turkce = not.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = not.nextInt();
        System.out.print("Muzik Notunuz : ");
        muzik = not.nextInt();


        if (mat < 0 || mat > 100) {
            mat = 0;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }

        double average = (mat + fizik + turkce + kimya + muzik) / 5;
        System.out.println("Ortalamaniz : " + average);


        if (average >= 55) {
            System.out.println("Sinifi Gectiniz.");

        } else {
            System.out.println("Sinifi Gecemediniz.");
        }

    }

}
