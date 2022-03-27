public class Main {
    public static void main(String[] args){
        Article article1 = new Article("pomada",1200f,20.2f,100);
        Article article11 = new Article("gele",1200f,20.2f,200);
        Article article2 = new Article("knina",1300f,25.2f,120);
        Article article3 = new Article("siro",1400f,22.2f,110);
        Stock stock = new Stock();
        stock.addArticle(article1); //prouit ajouter
        stock.addArticle(article2); //prouit ajouter
        stock.addArticle(article3); //prouit ajouter
        //stock.afficherArticles();
        stock.addArticle(article11);// produit n'est pas ajouter car le referent exeste déjà
        stock.afficherArticles(); //affichage des articles present en stock
        System.out.println(stock.searchByReference(1200)); // rechercher par referent
        System.out.println(stock.searchByName("siro")); // recherche par nom
        stock.deletArticle(1400); // article supprimer a l'aide de sa reference
        stock.updateArticle(article1,article11); //article1 remplacer par article 11
    }
}
