/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package family;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class MainFamily {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        // Data untuk Ayah
        System.out.println("Masukkan data untuk Ayah:");
        Parent ayah = inputData(a);

        // Data untuk Ibu
        System.out.println("Masukkan data untuk Ibu:");
        Parent ibu = inputData(a);
        inputChildrenData(a, ibu);

        // Menampilkan data Ayah
        System.out.println("\nData Ayah:");
        ayah.printParent();

        // Menampilkan data Ibu
        System.out.println("\nData Ibu:");
        ibu.printParent();
    }

    public static Parent inputData(Scanner a) {
        System.out.print("Masukkan nama: ");
        String nama = a.nextLine();
        System.out.print("Masukkan tanggal lahir: ");
        String tanggallahir = a.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = a.nextLine();
        System.out.print("Masukkan tinggi badan (cm): ");
        int tinggibadan = Integer.parseInt(a.nextLine());
        System.out.print("Masukkan berat badan (kg): ");
        int beratbadan = Integer.parseInt(a.nextLine());
        System.out.print("Masukkan jumlah anak: ");
        int jumlahanak = Integer.parseInt(a.nextLine());
        System.out.print("Masukkan tahun lahir: ");
        int umur = 2024 - Integer.parseInt(a.nextLine());
        System.out.print("Masukkan pekerjaan: ");
        String pekerjaan = a.nextLine();
        System.out.print("Masukkan makanan kesukaan: ");
        String makanankesukaan = a.nextLine();
        
        return new Parent(nama, alamat, tanggallahir, tinggibadan, beratbadan, umur, jumlahanak, new Pekerjaan(pekerjaan), new Makanan(makanankesukaan));
    }

    public static void inputChildrenData(Scanner a, Parent parent) {
        for (int i = 0; i < parent.getJumlahAnak(); i++) {
            System.out.println("Masukkan data untuk anak ke-" + (i + 1) + ":");
            System.out.print("Masukkan nama anak: ");
            String namaanak = a.nextLine();
            System.out.print("Masukkan alamat anak: ");
            String alamatanak = a.nextLine();
            System.out.print("Masukkan tanggal lahir anak: ");
            String tanggallahiranak = a.nextLine();
            System.out.print("Masukkan tinggi badan anak (cm): ");
            int tinggibadananak = Integer.parseInt(a.nextLine());
            System.out.print("Masukkan berat badan anak (kg): ");
            int beratbadananak = Integer.parseInt(a.nextLine());
            System.out.print("Masukkan tahun lahir: ");
            int umuranak = 2024 - Integer.parseInt(a.nextLine());
            System.out.print("Masukkan pekerjaan anak: ");
            String pekerjaan = a.nextLine();
            System.out.print("Masukkan makanan kesukaan: ");
            String makanankesukaan = a.nextLine();
            
            Child anak = new Child(namaanak, alamatanak, tanggallahiranak, tinggibadananak, beratbadananak, umuranak, new Pekerjaan(pekerjaan),new Makanan(makanankesukaan));
            parent.addChild(anak);
        }
    }
}
