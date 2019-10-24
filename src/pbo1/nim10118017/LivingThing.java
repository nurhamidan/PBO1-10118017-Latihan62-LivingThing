package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class tertinggi dalam hirarki, dan class ini abstrak,
 *                        dengan satu method abstrak dan sisanya konkrit.
 * 
 */
public abstract class LivingThing {
    //Method ini masih abstrak, alias belum ditentukan statement-nya.
    public abstract void walk(String nama);
    
    //Method konkrit
    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }
    public void eat(String nama) {
        System.out.println(nama + " Makan");
    }
}
