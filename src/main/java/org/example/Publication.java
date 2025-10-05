package org.example;

public class Publication {
    private String id;
    private String link;

    public Publication(String id, String link) {
        this.id = id;
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Publication{" + "id=" + id + ", link=" + link + '}';
    }

    public void afficherPublication() {
        System.out.println(this.toString());
    }

}
