/* 
 * File      : Animal.java    22/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File kelas abstrak Animal
 */

public abstract class Animal {
    public abstract void Eat();

    public String toString() {
        return this.getClass().getSimpleName();
    }
}