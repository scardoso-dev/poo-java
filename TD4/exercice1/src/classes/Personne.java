package classes;

import java.util.Objects;

/**
 * Classe Personne
 * @author Samuel CARDOSO
 */
public abstract class Personne {

    /**
     * Numéro de sécurité social de la Personne
     * !! On considéra comme dans la vie réelle que ce numéro est unique, il fera aussi office d'identifiant.
     * Il sera composé également de 15 chiffres, dont le premier chiffre correspond au sexe (1 pour Homme - Monsieur, 2 pour Femme - Madame)
     * et les deux suivants sont les deux derniers chiffres de l'année de naissance.
     */
    protected String nss;

    /**
     * Civilité de la Personne
     */
    protected String civilite;

    /**
     * Nom de la Personne
     */
    protected String nom;

    /**
     * Prénom de la Personne
     */
    protected String prenom;

    /**
     * Constructeur de la classe Personne avec paramètres
     * @param nss (double) Numéro de sécurité sociale qui doit comporter 15 chiffres
     * @param nom (String) Nom de la personne
     * @param prenom (String) Prénom de la personne
     * @param civilite (String) Civilité de la personne (H ou F)
     * @throws Exception
     */
    public Personne(String nss, String nom, String prenom, String civilite) throws Exception {
        String nssFirstInt = String.valueOf(nss.charAt(0));
        if (!Objects.equals(civilite, "H") && !Objects.equals(civilite, "F")) {
            throw new IllegalArgumentException("Civilite doit être H ou F");
        }
        if (nss.equals("0") || nss.equals("")) {
            throw new NSSErrorException("Le NSS (Numéro de Sécurité Social) ne peut pas être 0 ou vide ! Veuillez renseigner les 15 chiffres");
        } else if (nss.length() != 15) {
            throw new NSSErrorException("Le NSS (Numéro de Sécurité Social) doit être composé de 15 chiffres\n \t NSS n'a pas 15 chiffres");
        }
        if ( (civilite.equals("H")) && (!nssFirstInt.equals("1")) ) {
            throw new NSSErrorException("Le premier chiffre du NSS (Numéro de Sécurité Social) doit être égale à 1 car il s'agit d'un homme");

        } else if ( (civilite.equals("F")) && (!nssFirstInt.equals("2")) ) {
            throw new NSSErrorException("Le premier chiffre du NSS (Numéro de Sécurité Social) doit être égale à 2 car il s'agit d'une femme");
        }
        this.nss = nss;
        this.civilite = civilite;
        this.nom = nom.toUpperCase();

        // On met la premiere lettre du prénom en majuscule et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
        this.prenom = prenom;

    }

    /**
     * Accesseur du numéro de sécurité social de la personne (NSS)
     * @return (String) NSS de la personne
     */
    public String getNss() {
        return this.nss;
    }

    /**
     * Accesseur du nom de la personne
     * @return (String) Nom de la personne
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Accesseur du prenom de la personne
     * @return (String) Prénom de la personne
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Accesseur de la civilité de la personne
     * @return (String) Civilit de la personne
     */
    public String getCivilite() {
        return this.civilite;
    }

    /**
     * Modificateur du NSS
     * @param nss (int) Nouveau NSS
     * @throws NSSErrorException Exception du NSS
     *
     */
    public void setNss(String nss) throws NSSErrorException {
        String nssFirstInt = String.valueOf(nss.charAt(0));
        if (nss.equals("0") || nss.equals("")) {
            throw new NSSErrorException("Le NSS (Numéro de Sécurité Social) ne peut pas être 0 ou vide ! Veuillez renseigner les 15 chiffres");
        } else if (nss.length() != 15) {
            throw new NSSErrorException("Le NSS (Numéro de Sécurité Social) doit être composé de 15 chiffres\n \t NSS n'a pas 15 chiffres");
        }
        if ( (this.civilite.equals("H")) && (!nssFirstInt.equals("1")) ) {
            throw new NSSErrorException("Le premier chiffre du NSS (Numéro de Sécurité Social) doit être égale à 1 car il s'agit d'un homme");

        } else if ( (this.civilite.equals("F")) && (!nssFirstInt.equals("2")) ) {
            throw new NSSErrorException("Le premier chiffre du NSS (Numéro de Sécurité Social) doit être égale à 2 car il s'agit d'une femme");
        }
        this.nss = nss;
    }

    /**
     * Modificateur du nom de la personne
     * @param nom (String) Nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    /**
     * Modificateur du prénom de la personne
     * @param prenom (String) Nouveau prénom
     */
    public void setPrenom(String prenom) {
        // On met la premiere lettre du prénom en majuscule et le reste en minuscule
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1);
        this.prenom = prenom;
    }

    /**
     * Modificateur de la civilité de la personne
     * @param civilite (String) Nouvelle civilité
     */
    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    /**
     * Polymorphisme : Redéfinition de la classe toString()
     * @return (String) Retourne l'instance courante (this) sous forme de chaîne de caractères
     */
    @Override
    public String toString() {
        String civilite = "";
        if (this.civilite == "H") { civilite = "Monsieur"; }
        else if (this.civilite == "F")  { civilite = "Madame"; }
        return civilite + " " + this.prenom + " " + this.nom +", son NSS est " + this.nss;
    }
}
