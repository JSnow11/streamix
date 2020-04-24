import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import model.twitter.Entities;
import model.twitter.Status;
import model.twitter.Trend;
import model.twitter.Trending;
import model.twitter.TweetList;
import model.twitter.Url;
import model.twitter.User;

public class test {

	public static void main(String[] args) {
		String st = "[\r\n" + 
				"    {\r\n" + 
				"        \"trends\": [\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#\\u30C8\\u30EA\\u30CB\\u30AF\\u3063\\u3066\\u4F55\\u306E\\u8089\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E3%83%88%E3%83%AA%E3%83%8B%E3%82%AF%E3%81%A3%E3%81%A6%E4%BD%95%E3%81%AE%E8%82%89\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23%E3%83%88%E3%83%AA%E3%83%8B%E3%82%AF%E3%81%A3%E3%81%A6%E4%BD%95%E3%81%AE%E8%82%89\",\r\n" + 
				"                \"tweet_volume\": 16417\r\n" + 
				"            },\r\n" + 

				"            {\r\n" + 
				"                \"name\": \"#\\u30DC\\u30EB\\u30D0\\u30EB\\u30B6\\u30FC\\u30AF\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E3%83%9C%E3%83%AB%E3%83%90%E3%83%AB%E3%82%B6%E3%83%BC%E3%82%AF\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23%E3%83%9C%E3%83%AB%E3%83%90%E3%83%AB%E3%82%B6%E3%83%BC%E3%82%AF\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#\\u30DE\\u30C4\\u30B3\\u306E\\u77E5\\u3089\\u306A\\u3044\\u4E16\\u754C\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E3%83%9E%E3%83%84%E3%82%B3%E3%81%AE%E7%9F%A5%E3%82%89%E3%81%AA%E3%81%84%E4%B8%96%E7%95%8C\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23%E3%83%9E%E3%83%84%E3%82%B3%E3%81%AE%E7%9F%A5%E3%82%89%E3%81%AA%E3%81%84%E4%B8%96%E7%95%8C\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#HnD_SOULMATE_Debut\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23HnD_SOULMATE_Debut\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23HnD_SOULMATE_Debut\",\r\n" + 
				"                \"tweet_volume\": 216695\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#SB19MENPA_Ken\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23SB19MENPA_Ken\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23SB19MENPA_Ken\",\r\n" + 
				"                \"tweet_volume\": 66304\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#\\u30B8\\u30E3\\u30F3\\u30D7\\u30C1\\u30D2\\u30FC\\u30ED\\u30FC\\u30BA\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E3%82%B8%E3%83%A3%E3%83%B3%E3%83%97%E3%83%81%E3%83%92%E3%83%BC%E3%83%AD%E3%83%BC%E3%82%BA\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23%E3%82%B8%E3%83%A3%E3%83%B3%E3%83%97%E3%83%81%E3%83%92%E3%83%BC%E3%83%AD%E3%83%BC%E3%82%BA\",\r\n" + 
				"                \"tweet_volume\": 17333\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#\\u0E0A\\u0E23\\u0E32\\u0E44\\u0E25\\u0E19\\u0E4C\\u0E19\\u0E32\\u0E19\\u0E17\\u0E35\\u0E1B\\u0E35\\u0E25\\u0E30\\u0E04\\u0E23\\u0E31\\u0E49\\u0E07\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E0%B8%8A%E0%B8%A3%E0%B8%B2%E0%B9%84%E0%B8%A5%E0%B8%99%E0%B9%8C%E0%B8%99%E0%B8%B2%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B8%9B%E0%B8%B5%E0%B8%A5%E0%B8%B0%E0%B8%84%E0%B8%A3%E0%B8%B1%E0%B9%89%E0%B8%87\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23%E0%B8%8A%E0%B8%A3%E0%B8%B2%E0%B9%84%E0%B8%A5%E0%B8%99%E0%B9%8C%E0%B8%99%E0%B8%B2%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B8%9B%E0%B8%B5%E0%B8%A5%E0%B8%B0%E0%B8%84%E0%B8%A3%E0%B8%B1%E0%B9%89%E0%B8%87\",\r\n" + 
				"                \"tweet_volume\": 78951\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#QueenElizabeth\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23QueenElizabeth\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23QueenElizabeth\",\r\n" + 
				"                \"tweet_volume\": 11773\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#MaiaInimigoDoBrasil\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23MaiaInimigoDoBrasil\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23MaiaInimigoDoBrasil\",\r\n" + 
				"                \"tweet_volume\": 74194\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#tuesdayvibes\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23tuesdayvibes\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23tuesdayvibes\",\r\n" + 
				"                \"tweet_volume\": 10702\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#RIPPrince\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23RIPPrince\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23RIPPrince\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#AhmedArif\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23AhmedArif\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23AhmedArif\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#CAIXATemNADA\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23CAIXATemNADA\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23CAIXATemNADA\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#\\u0627\\u0644\\u0627\\u064A\\u0627\\u0645_\\u0627\\u0644\\u0635\\u0639\\u0628\\u0647\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%D8%A7%D9%84%D8%A7%D9%8A%D8%A7%D9%85_%D8%A7%D9%84%D8%B5%D8%B9%D8%A8%D9%87\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23%D8%A7%D9%84%D8%A7%D9%8A%D8%A7%D9%85_%D8%A7%D9%84%D8%B5%D8%B9%D8%A8%D9%87\",\r\n" + 
				"                \"tweet_volume\": 15759\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#day26oflockdown\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23day26oflockdown\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23day26oflockdown\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#SaintsupLIVExLINETV\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23SaintsupLIVExLINETV\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23SaintsupLIVExLINETV\",\r\n" + 
				"                \"tweet_volume\": 58121\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#\\u0938\\u0902\\u0924\\u094B\\u0902_\\u0915\\u094B_\\u0907\\u0902\\u0938\\u093E\\u092B_\\u0926\\u094B\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E0%A4%B8%E0%A4%82%E0%A4%A4%E0%A5%8B%E0%A4%82_%E0%A4%95%E0%A5%8B_%E0%A4%87%E0%A4%82%E0%A4%B8%E0%A4%BE%E0%A4%AB_%E0%A4%A6%E0%A5%8B\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23%E0%A4%B8%E0%A4%82%E0%A4%A4%E0%A5%8B%E0%A4%82_%E0%A4%95%E0%A5%8B_%E0%A4%87%E0%A4%82%E0%A4%B8%E0%A4%BE%E0%A4%AB_%E0%A4%A6%E0%A5%8B\",\r\n" + 
				"                \"tweet_volume\": 77881\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"as_of\": \"2020-04-21T12:52:31Z\",\r\n" + 
				"        \"created_at\": \"2020-04-21T12:51:34Z\",\r\n" + 
				"        \"locations\": [\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Worldwide\",\r\n" + 
				"                \"woeid\": 1\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    }\r\n" + 
				"]";
		Trending t = parse(st);
		System.out.println(t.getTrends().get(0).getName());
	}
	
	private static Trending parse(String st) {
		List<Trend> lt = new ArrayList<Trend>();
		String name = "";
		Integer volume = 0;
		for(String trd: st.split("[{},]")) {
			if(!trd.contains("trends")) {
				if(trd.contains("name")) {
					name = trd.split(":")[1].trim();
					name = name.substring(1,name.length()-2);
					name=uncode(name);
				}
				if(trd.contains("tweet_volume")) {
					String pv = trd.split(":")[1].trim();
					volume = Integer.parseInt(pv.contains("null")? "0":pv);
					lt.add(Trend.of(name, volume));
				}
			}
		}
		return Trending.of(lt);
	}
	private static String uncode(String st) {
		String str = st.split(" ")[0];
		
		str =  str.replace("\\"," ");
		String[] arr = str.split("u");
		
		String text = "";
		for(int i = 1; i < arr.length; i++){
		    int hexVal = Integer.parseInt(arr[i].trim(), 16);
		    text += (char)hexVal;
		}
		return text;
		
	}
}
