package org.example;

public class Utilisateurs {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private TypeUtilisateur type;

    public Utilisateurs(String id, String nom, String prenom, String email, TypeUtilisateur type) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeUtilisateur getType() {
        return type;
    }

    public void setType(TypeUtilisateur type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Utilisateur : " + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + '.';
    }

    public void afficherUtilisateur(Utilisateurs utilisateur) {
        if ( this.type == TypeUtilisateur.REAL){
            System.out.println(utilisateur.toString());
        } else {
            System.out.println(this.getId());
        }
    }
}
