package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class main. Memanggil semua yang dibutuhkan agar program dapat berjalan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instansiasi objek
        Human human = new Human();
        
        human.setNama("Agung Nurhamidan");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
