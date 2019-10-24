package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Turunan dari clas LivingThink.
 * 
 */
public class Human extends LivingThing {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //Notasi override menyatakan override dari superclass. Disini statement-nya sudah jelas.
    @Override
    public void walk(String nama) {
        System.out.println(nama + " sedang berjalan");
    }
}
