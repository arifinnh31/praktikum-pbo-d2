/* 
 * File      : PolimorfismeCoercion.java    02/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : Program penggunaan polimorfisme coercion
 */

public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan) {
        return bilangan * bilangan;
    }

    public static void main(String[] args) {
        // deklarasi objek integer
        Integer bilangan = 10;

        // objek integer dipaksa untuk diubah menjadi objek primitif
        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
    }
}