/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package family;

/**
 *
 * @author Lenovo
 */
public class Child extends Family {
    String namaanak;
    String tanggallahiranak;
    String alamatanak;
    int tinggibadananak;
    int beratbadananak;
    int umuranak;
    Pekerjaan pekerjaan;
    Makanan makananKesukaan;
    
    public Child(String namaAnak, String alamatAnak, String Tanggallahir, int Tinggibadan, int Beratbadan, int umurAnak, Pekerjaan pekerjaanAnak, Makanan anakmakananKesukaan) {
        namaanak = namaAnak;
        tanggallahiranak = Tanggallahir;
        alamatanak = alamatAnak;
        tinggibadananak = Tinggibadan;
        beratbadananak = Beratbadan;
        umuranak = umurAnak;
        pekerjaan = pekerjaanAnak;
        makananKesukaan = anakmakananKesukaan;
    }

    public void printChild() {
        System.out.println("Nama Anak: " + namaanak);
        System.out.println("Tanggal Lahir: " + tanggallahiranak);
        System.out.println("Alamat: " + alamatanak);
        System.out.println("Tinggi Badan: " + tinggibadananak + " cm");
        System.out.println("Berat Badan: " + beratbadananak + " kg");
        System.out.println("Umur Anak: " + umuranak + " tahun");
        System.out.println("Pekerjaan: " + pekerjaan.getNamapekerjaan());
        System.out.println("Makanan Kesukaan Anak: " + makananKesukaan.getMakanankesukaan());
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
