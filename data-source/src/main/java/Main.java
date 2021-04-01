import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author admin
 * @date 2021/4/1
 * @description Main
 */
public class Main {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("https://www.quanjing.com/creative/topic/1").get();
            System.out.println(document);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}