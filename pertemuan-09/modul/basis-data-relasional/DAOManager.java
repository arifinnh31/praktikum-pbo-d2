/* 
 * File      : DAOManager.java    15/05/24
 * Penulis   : Arifin Nurmuhammad Haris
 * Deskripsi : pengelola DAO dalam program
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        this.personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}