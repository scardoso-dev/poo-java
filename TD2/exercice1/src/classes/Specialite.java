package classes;

/**
 * Classe Specialite d'un médecin
 * @author Samuel CARDOSO
 */
public class Specialite {

    /**
     * Constructeur par défaut de la classe Specialite
     */
    public Specialite() {
        this.lastCurrentId ++;
        this.id = this.lastCurrentId;
    }

    /**
     * Constructeur de la classe Specialite avec paramètres
     * @param code (String) Code de la specialite
     * @param libelle (String) Libelle de la specialite
     */
    public Specialite(String code, String libelle) {
        this.lastCurrentId ++;
        this.id = this.lastCurrentId;
        this.code = code;
        this.libelle = libelle;
    }

    /**
     * Dernier idenditifant de la specialite
     */
    private static int lastCurrentId = 0;
    /**
     * Identifiant de la specialite
     */
    private int id;

    /**
     * Code de la specialite
     */
    private String code;

    /**
     * Libelle de la specialite
     */
    private String libelle;

    /**
     * Accesseur de l'identifiant
     * @return (int) Identifiant
     */
    public int getId() {
        return this.id;
    }

    /**
     * Accesseur du code
     * @return (String) Code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Accesseur du libelle
     * @return (String) Libelle
     */
    public String getLibelle() {
        return this.libelle;
    }

    /**
     * Modificateur du code de la specialite
     * @param code (String) Nouveau code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Modificateur du libelle de la specialite
     * @param libelle (String) Nouveau libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Méthode toString de la classe Specialite
     * @return (String) Specialite sous forme de chaîne de caractères
     */
    public String toString() {
        return "id="+this.id+", code="+this.code+", libelle="+this.libelle;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}