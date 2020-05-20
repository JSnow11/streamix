package model.resources;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.twitter.Embeed;
import utility.Tools;

public class TweetsResource {
	public static final String bearerToken = "AAAAAAAAAAAAAAAAAAAAAFGTDgEAAAAAEZoGu1eukF9DG%2Fd1iNeDCfHMvWU%3DPR3zJLzXYZ7TgjyWbsRe1qgdntSe1QSGFmKvck1yc6IeUCn18L";
	public static final Logger log = Logger.getLogger(TweetsResource.class.getName());

	public List<String> getTweets(String query) {
		String queryFormatted = "";
		try {
			queryFormatted = URLEncoder.encode(query, "UTF-8");
		}catch(IOException ioe) {
			queryFormatted = "null";
		}
		String uri = "https://api.twitter.com/1.1/search/tweets.json?q=" + queryFormatted + "&count=5";
		log.log(Level.INFO, "tweets URI: " + uri);

		ClientResource cr = new ClientResource(uri);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);
		String st = null;
		try{
			st = cr.get(String.class);
		} catch (ResourceException re) {
			st = null;
		} 
		/*
		 * String st = "{\r\n" + "    \"statuses\": [{\r\n" +
		 * "        \"created_at\": \"Fri May 01 15:00:03 +0000 2020\",\r\n" +
		 * "        \"id\": 1256236952069844993,\r\n" +
		 * "        \"id_str\": \"1256236952069844993\",\r\n" +
		 * "        \"text\": \"\\u00bfHola?\",\r\n" +
		 * "        \"truncated\": false,\r\n" + "        \"entities\": {\r\n" +
		 * "            \"hashtags\": [],\r\n" + "            \"symbols\": [],\r\n" +
		 * "            \"user_mentions\": [],\r\n" + "            \"urls\": []\r\n" +
		 * "        },\r\n" + "        \"metadata\": {\r\n" +
		 * "            \"iso_language_code\": \"es\",\r\n" +
		 * "            \"result_type\": \"recent\"\r\n" + "        },\r\n" +
		 * "        \"source\": \"\\u003ca href=\\\"http:\\/\\/twitter.com\\/download\\/iphone\\\" rel=\\\"nofollow\\\"\\u003eTwitter for iPhone\\u003c\\/a\\u003e\",\r\n"
		 * + "        \"in_reply_to_status_id\": null,\r\n" +
		 * "        \"in_reply_to_status_id_str\": null,\r\n" +
		 * "        \"in_reply_to_user_id\": null,\r\n" +
		 * "        \"in_reply_to_user_id_str\": null,\r\n" +
		 * "        \"in_reply_to_screen_name\": null,\r\n" + "        \"user\": {\r\n"
		 * + "            \"id\": 1227038241746038784,\r\n" +
		 * "            \"id_str\": \"1227038241746038784\",\r\n" +
		 * "            \"name\": \"Dariel NH \\ud83c\\udde9\\ud83c\\uddf4\",\r\n" +
		 * "            \"screen_name\": \"DarielNh\",\r\n" +
		 * "            \"location\": \"\",\r\n" +
		 * "            \"description\": \"Instagram: Dariel.nh\",\r\n" +
		 * "            \"url\": \"https:\\/\\/t.co\\/HJT1GpePTh\",\r\n" +
		 * "            \"entities\": {\r\n" + "                \"url\": {\r\n" +
		 * "                    \"urls\": [{\r\n" +
		 * "                        \"url\": \"https:\\/\\/t.co\\/HJT1GpePTh\",\r\n" +
		 * "                        \"expanded_url\": \"https:\\/\\/www.youtube.com\\/channel\\/UCCjLJPjxGvs-f3K0kvAXZHQ\",\r\n"
		 * +
		 * "                        \"display_url\": \"youtube.com\\/channel\\/UCCjLJ\\u2026\",\r\n"
		 * + "                        \"indices\": [\r\n" +
		 * "                            0,\r\n" + "                            23\r\n" +
		 * "                        ]\r\n" + "                    }]\r\n" +
		 * "                },\r\n" + "                \"description\": {\r\n" +
		 * "                    \"urls\": []\r\n" + "                }\r\n" +
		 * "            },\r\n" + "            \"protected\": false,\r\n" +
		 * "            \"followers_count\": 2,\r\n" +
		 * "            \"friends_count\": 38,\r\n" +
		 * "            \"listed_count\": 0,\r\n" +
		 * "            \"created_at\": \"Tue Feb 11 01:14:58 +0000 2020\",\r\n" +
		 * "            \"favourites_count\": 23,\r\n" +
		 * "            \"utc_offset\": null,\r\n" +
		 * "            \"time_zone\": null,\r\n" +
		 * "            \"geo_enabled\": false,\r\n" +
		 * "            \"verified\": false,\r\n" +
		 * "            \"statuses_count\": 17,\r\n" + "            \"lang\": null,\r\n"
		 * + "            \"contributors_enabled\": false,\r\n" +
		 * "            \"is_translator\": false,\r\n" +
		 * "            \"is_translation_enabled\": false,\r\n" +
		 * "            \"profile_background_color\": \"F5F8FA\",\r\n" +
		 * "            \"profile_background_image_url\": null,\r\n" +
		 * "            \"profile_background_image_url_https\": null,\r\n" +
		 * "            \"profile_background_tile\": false,\r\n" +
		 * "            \"profile_image_url\": \"http:\\/\\/pbs.twimg.com\\/profile_images\\/1253679594613411842\\/eZDQScxx_normal.jpg\",\r\n"
		 * +
		 * "            \"profile_image_url_https\": \"https:\\/\\/pbs.twimg.com\\/profile_images\\/1253679594613411842\\/eZDQScxx_normal.jpg\",\r\n"
		 * +
		 * "            \"profile_banner_url\": \"https:\\/\\/pbs.twimg.com\\/profile_banners\\/1227038241746038784\\/1585568432\",\r\n"
		 * + "            \"profile_link_color\": \"1DA1F2\",\r\n" +
		 * "            \"profile_sidebar_border_color\": \"C0DEED\",\r\n" +
		 * "            \"profile_sidebar_fill_color\": \"DDEEF6\",\r\n" +
		 * "            \"profile_text_color\": \"333333\",\r\n" +
		 * "            \"profile_use_background_image\": true,\r\n" +
		 * "            \"has_extended_profile\": false,\r\n" +
		 * "            \"default_profile\": true,\r\n" +
		 * "            \"default_profile_image\": false,\r\n" +
		 * "            \"following\": null,\r\n" +
		 * "            \"follow_request_sent\": null,\r\n" +
		 * "            \"notifications\": null,\r\n" +
		 * "            \"translator_type\": \"none\"\r\n" + "        },\r\n" +
		 * "        \"geo\": null,\r\n" + "        \"coordinates\": null,\r\n" +
		 * "        \"place\": null,\r\n" + "        \"contributors\": null,\r\n" +
		 * "        \"is_quote_status\": false,\r\n" +
		 * "        \"retweet_count\": 0,\r\n" + "        \"favorite_count\": 0,\r\n" +
		 * "        \"favorited\": false,\r\n" + "        \"retweeted\": false,\r\n" +
		 * "        \"lang\": \"es\"\r\n" + "    }],\r\n" +
		 * "    \"search_metadata\": {\r\n" + "        \"completed_in\": 0.019,\r\n" +
		 * "        \"max_id\": 1256236952069844993,\r\n" +
		 * "        \"max_id_str\": \"1256236952069844993\",\r\n" +
		 * "        \"next_results\": \"?max_id=1256236952069844992&q=hola&count=2&include_entities=1\",\r\n"
		 * + "        \"query\": \"hola\",\r\n" +
		 * "        \"refresh_url\": \"?since_id=1256236952069844993&q=hola&include_entities=1\",\r\n"
		 * + "        \"count\": 2,\r\n" + "        \"since_id\": 0,\r\n" +
		 * "        \"since_id_str\": \"0\"\r\n" + "    }\r\n" + "}";
		 */

		log.log(Level.WARNING, st);
		log.log(Level.WARNING, "comienza el parseo");
		List<String> t = parse(st);
		log.log(Level.WARNING, t.toString());
		t = getHtml(t);
		
		log.log(Level.WARNING, "Parseado" + t);
		return t;
	}

	private static List<String> parse(String st) {

		List<String> lu = new ArrayList<>();
		Boolean b = true;
		String id = "";
		for (String trd : st.split("[{},]")) {
			if (!trd.contains("statuses") && !trd.contains("sidebar")) {
				if (trd.contains("\"id\"") && b) {
					id = trd.split(":")[1].trim();
					log.log(Level.WARNING, "id:" + id);
					lu.add(id);
					b = false;
				}
				if (trd.contains("\"created_at\"")) {
					b = true;
				}

			}
		}
		return lu;
	}

	private static List<String> getHtml(List<String> ls) {
		List<String> lhtml = new ArrayList<>();
		for (String s : ls) {
			if (s.matches("[0-9]{19}")) {
				String uri = "https://publish.twitter.com/oembed?url=https://twitter.com/user/status/" + s;
				log.log(Level.WARNING, uri);
				ClientResource cr = new ClientResource(uri);
				Embeed e = null;
				try {
					e = cr.get(Embeed.class);
				} catch (ResourceException re) {
					e = null;
				}
				if (e != null)
					lhtml.add(e.getHtml());
			}
		}
		log.log(Level.WARNING, "html conseguido");
		return lhtml;
	}
}
