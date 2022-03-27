import java.sql.SQLOutput;
import java.util.ArrayList;

public class Stock {
    private ArrayList<Article> liste_articles = new ArrayList<Article>();
    // constructor :
    public Stock(){}

    // rechercher un article par referent :
    public Article searchByReference(float ref){
        for (Article article:this.liste_articles) {
            if (article.getNumero_refefence()==ref){
                return article;
            }
        }return null;
    }

    // ajouter un article en vérifiant son referent :
    public void addArticle(Article article){
        if(this.searchByReference(article.getNumero_refefence())==null){
            this.liste_articles.add(article);
        }
    }

    // supprimer un article :
    public void deletArticle(float ref){
        if(this.searchByReference(ref)!=null){
            this.liste_articles.remove(this.searchByReference(ref));
        }
    }

    // modifier un article :
    public void updateArticle(Article article1,Article article2){
        if(this.searchByReference(article1.getNumero_refefence())!=null){
        this.liste_articles.set(this.liste_articles.indexOf(article1),article2);
        }
    }

    // rechercher un article par nom :
    public Article searchByName(String nom){
        for (Article article:this.liste_articles) {
            if(article.getNom()==nom){
                return article;
            }
        }return null;
    }

    //rechercher les article par interval de prix :
    public ArrayList<Article> searchArticles(float prixMin,float prixMax){
        ArrayList<Article> listeArticle=new ArrayList<Article>();
        for (Article article:this.liste_articles) {
            if(article.getPrix()>=prixMin && article.getPrix()<=prixMax){
                listeArticle.add(article);
            }
        }return listeArticle;
    }

    // afficher tous les articles :

    public  void afficherArticles() {
        for (Article article:this.liste_articles) {
            System.out.println(article);
        }
    }
}
