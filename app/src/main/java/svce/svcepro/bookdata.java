package svce.svcepro;

/**
 * Created by harishananth on 28/09/17.
 */

public class bookdata {
    String url;
    String title;
    String author;
    Float rating;
    bookdata(String url,String title,String author,Float rating){
        this.url=url;
        this.title=title;
        this.author=author;
        this.rating=rating;
    }
}
