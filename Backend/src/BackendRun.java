import org.jsoup.Jsoup;
import java.io.IOException;
import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class BackendRun {
	public static void main(String[] args) throws IOException {
			// Title of First Link
			String url = "https://indianexpress.com/";
			Document doc = Jsoup.connect(url).get();
			//String title = doc.title();
			//System.out.println(title);
			//System.out.println(doc);
			Elements link = doc.select("div.other-article");
			link.forEach((e)->{
				String heading = e.select("title").text();
				String content = e.select("h3").text();
				String href = e.select("div.story-image").attr("e.attr(\"https://indianexpress.com/article/cities/bangalore/bengaluru-youth-arrested-social-media-post-puneeth-rajkummar-7604541/");
				System.out.println(heading+" "+content+" "+href);
			}); 
		}
	}
