import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tugas2{
    public static Map<String, String> mahasiswaMap = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("Pilihan:");
            System.out.println("1. Create Mahasiswa");
            System.out.println("2. Read Mahasiswa");
            System.out.println("3. Update Mahasiswa");
            System.out.println("4. Delete Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Pilih opsi (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    createMahasiswa();
                    break;
                case 2:
                    readMahasiswa();
                    break;
                case 3:
                    updateMahasiswa();
                    break;
                case 4:
                    deleteMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak ada. Coba lagi.");
            }
        } while (pilihan < 5);
    }

    public static void createMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        if (mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM sudah terdaftar.");
            return;
        }

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        mahasiswaMap.put(nim, nama);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public static void readMahasiswa() {
        if (mahasiswaMap.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }

        System.out.println("Data Mahasiswa:");
        for (Map.Entry<String, String> entry : mahasiswaMap.entrySet()) {
            System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
        }
    }

    public static void updateMahasiswa() {
        System.out.print("Masukkan NIM untuk diupdate: ");
        String nim = scanner.nextLine();

        if (!mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM tidak ada.");
            return;
        }

        System.out.print("Masukkan Nama baru: ");
        String namaBaru = scanner.nextLine();

        mahasiswaMap.put(nim, namaBaru);
        System.out.println("Data mahasiswa berhasil diupdate.");
    }

    public static void deleteMahasiswa() {
        System.out.print("Masukkan NIM untuk dihapus: ");
        String nim = scanner.nextLine();

        if (!mahasiswaMap.containsKey(nim)) {
            System.out.println("NIM tidak ada.");
            return;
        }

        mahasiswaMap.remove(nim);
        System.out.println("Mahasiswa berhasil dihapus.");
    }
}