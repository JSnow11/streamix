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
import utility.Tools;

public class test {

	public static void main(String[] args) {
	String st = "{\r\n" + 
				"    \"statuses\": [{\r\n" + 
				"        \"created_at\": \"Fri May 01 15:00:03 +0000 2020\",\r\n" + 
				"        \"id\": 1256236952069844993,\r\n" + 
				"        \"id_str\": \"1256236952069844993\",\r\n" + 
				"        \"text\": \"\\u00bfHola?\",\r\n" + 
				"        \"truncated\": false,\r\n" + 
				"        \"entities\": {\r\n" + 
				"            \"hashtags\": [],\r\n" + 
				"            \"symbols\": [],\r\n" + 
				"            \"user_mentions\": [],\r\n" + 
				"            \"urls\": []\r\n" + 
				"        },\r\n" + 
				"        \"metadata\": {\r\n" + 
				"            \"iso_language_code\": \"es\",\r\n" + 
				"            \"result_type\": \"recent\"\r\n" + 
				"        },\r\n" + 
				"        \"source\": \"\\u003ca href=\\\"http:\\/\\/twitter.com\\/download\\/iphone\\\" rel=\\\"nofollow\\\"\\u003eTwitter for iPhone\\u003c\\/a\\u003e\",\r\n" + 
				"        \"in_reply_to_status_id\": null,\r\n" + 
				"        \"in_reply_to_status_id_str\": null,\r\n" + 
				"        \"in_reply_to_user_id\": null,\r\n" + 
				"        \"in_reply_to_user_id_str\": null,\r\n" + 
				"        \"in_reply_to_screen_name\": null,\r\n" + 
				"        \"user\": {\r\n" + 
				"            \"id\": 1227038241746038784,\r\n" + 
				"            \"id_str\": \"1227038241746038784\",\r\n" + 
				"            \"name\": \"Dariel NH \\ud83c\\udde9\\ud83c\\uddf4\",\r\n" + 
				"            \"screen_name\": \"DarielNh\",\r\n" + 
				"            \"location\": \"\",\r\n" + 
				"            \"description\": \"Instagram: Dariel.nh\",\r\n" + 
				"            \"url\": \"https:\\/\\/t.co\\/HJT1GpePTh\",\r\n" + 
				"            \"entities\": {\r\n" + 
				"                \"url\": {\r\n" + 
				"                    \"urls\": [{\r\n" + 
				"                        \"url\": \"https:\\/\\/t.co\\/HJT1GpePTh\",\r\n" + 
				"                        \"expanded_url\": \"https:\\/\\/www.youtube.com\\/channel\\/UCCjLJPjxGvs-f3K0kvAXZHQ\",\r\n" + 
				"                        \"display_url\": \"youtube.com\\/channel\\/UCCjLJ\\u2026\",\r\n" + 
				"                        \"indices\": [\r\n" + 
				"                            0,\r\n" + 
				"                            23\r\n" + 
				"                        ]\r\n" + 
				"                    }]\r\n" + 
				"                },\r\n" + 
				"                \"description\": {\r\n" + 
				"                    \"urls\": []\r\n" + 
				"                }\r\n" + 
				"            },\r\n" + 
				"            \"protected\": false,\r\n" + 
				"            \"followers_count\": 2,\r\n" + 
				"            \"friends_count\": 38,\r\n" + 
				"            \"listed_count\": 0,\r\n" + 
				"            \"created_at\": \"Tue Feb 11 01:14:58 +0000 2020\",\r\n" + 
				"            \"favourites_count\": 23,\r\n" + 
				"            \"utc_offset\": null,\r\n" + 
				"            \"time_zone\": null,\r\n" + 
				"            \"geo_enabled\": false,\r\n" + 
				"            \"verified\": false,\r\n" + 
				"            \"statuses_count\": 17,\r\n" + 
				"            \"lang\": null,\r\n" + 
				"            \"contributors_enabled\": false,\r\n" + 
				"            \"is_translator\": false,\r\n" + 
				"            \"is_translation_enabled\": false,\r\n" + 
				"            \"profile_background_color\": \"F5F8FA\",\r\n" + 
				"            \"profile_background_image_url\": null,\r\n" + 
				"            \"profile_background_image_url_https\": null,\r\n" + 
				"            \"profile_background_tile\": false,\r\n" + 
				"            \"profile_image_url\": \"http:\\/\\/pbs.twimg.com\\/profile_images\\/1253679594613411842\\/eZDQScxx_normal.jpg\",\r\n" + 
				"            \"profile_image_url_https\": \"https:\\/\\/pbs.twimg.com\\/profile_images\\/1253679594613411842\\/eZDQScxx_normal.jpg\",\r\n" + 
				"            \"profile_banner_url\": \"https:\\/\\/pbs.twimg.com\\/profile_banners\\/1227038241746038784\\/1585568432\",\r\n" + 
				"            \"profile_link_color\": \"1DA1F2\",\r\n" + 
				"            \"profile_sidebar_border_color\": \"C0DEED\",\r\n" + 
				"            \"profile_sidebar_fill_color\": \"DDEEF6\",\r\n" + 
				"            \"profile_text_color\": \"333333\",\r\n" + 
				"            \"profile_use_background_image\": true,\r\n" + 
				"            \"has_extended_profile\": false,\r\n" + 
				"            \"default_profile\": true,\r\n" + 
				"            \"default_profile_image\": false,\r\n" + 
				"            \"following\": null,\r\n" + 
				"            \"follow_request_sent\": null,\r\n" + 
				"            \"notifications\": null,\r\n" + 
				"            \"translator_type\": \"none\"\r\n" + 
				"        },\r\n" + 
				"        \"geo\": null,\r\n" + 
				"        \"coordinates\": null,\r\n" + 
				"        \"place\": null,\r\n" + 
				"        \"contributors\": null,\r\n" + 
				"        \"is_quote_status\": false,\r\n" + 
				"        \"retweet_count\": 0,\r\n" + 
				"        \"favorite_count\": 0,\r\n" + 
				"        \"favorited\": false,\r\n" + 
				"        \"retweeted\": false,\r\n" + 
				"        \"lang\": \"es\"\r\n" + 
				"    }],\r\n" + 
				"    \"search_metadata\": {\r\n" + 
				"        \"completed_in\": 0.019,\r\n" + 
				"        \"max_id\": 1256236952069844993,\r\n" + 
				"        \"max_id_str\": \"1256236952069844993\",\r\n" + 
				"        \"next_results\": \"?max_id=1256236952069844992&q=hola&count=2&include_entities=1\",\r\n" + 
				"        \"query\": \"hola\",\r\n" + 
				"        \"refresh_url\": \"?since_id=1256236952069844993&q=hola&include_entities=1\",\r\n" + 
				"        \"count\": 2,\r\n" + 
				"        \"since_id\": 0,\r\n" + 
				"        \"since_id_str\": \"0\"\r\n" + 
				"    }\r\n" + 
				"}";
		
		System.out.println( "comienza el parseo");
		List<String> t= parse(st);
		System.out.println( t.toString());
		System.out.println( "Parseado" + t);
		getHtml(t);
	}
	private static List<String> parse(String st) {
		
		List<String> lu = new ArrayList<>();
		Boolean b=true;
		String id ="";
		for(String trd: st.split("[{},]")) {
			if(!trd.contains("statuses")&&!trd.contains("sidebar")) {
				if(trd.contains("\"id\"") && b) {
					id = trd.split(":")[1].trim();
					System.out.println( "id:"+id);
					lu.add(id);
					b=false;
					
				}
				if(trd.contains("\"created_at\"")) {
					b=true;
				}
				
			}
		}
		return lu;
	}
	
	private static void getHtml(List<String> ls){
		List<String> lhtml = new ArrayList<>();
		for(String s : ls) {
			String uri = "https://publish.twitter.com/oembed?url=https://twitter.com/user/status/"+s;
			System.out.println( uri);
		}
		System.out.println( "html conseguido");
	}
}
