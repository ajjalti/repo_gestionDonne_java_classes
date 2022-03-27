public class Article {
    private float numero_refefence;
    private String nom;
    private float prix;
    private int quantite;
    // add constructors:
    public Article(){}
    public Article(String nom,float numero_reference,float prix,int quantite){
        this.nom=nom;
        this.numero_refefence=numero_reference;
        this.prix=prix;
        this.quantite=quantite;
    }

    //accesseurs :

    public String getNom() {
        return nom;
    }

    public float getPrix() {
        return prix;
    }

    public float getNumero_refefence() {
        return numero_refefence;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setNumero_refefence(float numero_refefence) {
        this.numero_refefence = numero_refefence;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "numero_refefence = " + numero_refefence +'\n'+
                "nom = " + nom +'\n'+
                "prix = " + prix +'\n'+
                "quantite = " + quantite+'\n';
    }
}
