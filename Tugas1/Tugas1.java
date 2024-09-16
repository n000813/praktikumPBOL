import java.util.Scanner;
public class Tugas1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Input NIM: ");
        int nim = scanner.nextInt();
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        scanner.close();
    }
}