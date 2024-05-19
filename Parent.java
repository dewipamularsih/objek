/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package family;
import java.util.ArrayList;

public class Parent extends Family {
    String nama;
    String tanggallahir;
    String alamat;
    int tinggibadan;
    int beratbadan;
    int umur;
    int jumlahanak;
    Pekerjaan pekerjaan;
    Makanan makananKesukaan;
    ArrayList<Child> anakAnak;

    public Parent(String namaParent, String alamatParent, String Tanggallahir, int Tinggibadan, int Beratbadan, int umurParent, int jumlahAnakParent, Pekerjaan pekerjaanParent, Makanan parentMakananKesukaan) {
        nama = namaParent;
        tanggallahir = Tanggallahir;
        alamat = alamatParent;
        tinggibadan = Tinggibadan;
        beratbadan = Beratbadan;
        umur = umurParent;
        jumlahanak = jumlahAnakParent;
        pekerjaan = pekerjaanParent;
        makananKesukaan = parentMakananKesukaan;
        anakAnak = new ArrayList<>();
    }

    public void printParent() {
        System.out.println("Nama Parent: " + nama);
        System.out.println("Tanggal Lahir: " + tanggallahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tinggi Badan: " + tinggibadan + " cm");
        System.out.println("Berat Badan: " + beratbadan + " kg");
        System.out.println("Umur Parent: " + umur + " tahun");
        System.out.println("Pekerjaan: " + pekerjaan.getNamapekerjaan());
        System.out.println("Makanan Kesukaan: " + makananKesukaan.getMakanankesukaan());
        System.out.println("Jumlah Anak: " + jumlahanak);

        for (Child anak : anakAnak) {
            anak.printChild();
        }
    }

    public void addChild(Child anak) {
        this.anakAnak.add(anak);
    }

    public int getJumlahAnak() {
        return jumlahanak;
    }

    @Override
    void umur() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    void jumlahAnak() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    void anakKe() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
