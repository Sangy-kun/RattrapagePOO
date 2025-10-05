package org.example;

public class TestGlobale {
    public static void main(String[] args) {
        Utilisateurs utilisateur1 = new Utilisateurs("1", "Jean", "Dupont", "jean@gmail.com", TypeUtilisateur.REAL);
        utilisateur1.afficherUtilisateur(utilisateur1);

        Message message1 = new Message("Bonjour", null, false);
        message1.afficherMessage();

        Publication publication1 = new Publication("1", "1");
    }
}
