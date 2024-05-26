/* 
 * File      : Airport.java    22/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : File kelas Airport
 */

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String givePermissionToLand(iFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Izin mendarat diberikan";
        } else {
            return "Izin mendarat ditolak";
        }
    }
}