/* 
 * File      : Superman.java    22/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File kelas Superman
 */

public class Superman extends Kryptonian {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    public void Eat() {
        System.out.println("Superman juga harus makan seperti pada manusia umumnya");
    }

    public void takeOff() {
        System.out.println(this.name + "sedang lepas landas");
    }

    public void land() {
        System.out.println(this.name + "sedang mendarat");
    }

    public void fly() {
        System.out.println(this.name + "sedang terbang");
    }

    public void leapBuilding() {
        System.out.println(this.name + "sedang loncat dari gedung yang tinggi");
    }

    public void stopBullet() {
        System.out.println(this.name + "dapat menghetikan peluru");
    }
}