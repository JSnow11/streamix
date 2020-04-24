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

import model.twitter.Trending;
import model.twitter.TweetList;

public class TweetsResource {
	public static final String bearerToken = "AAAAAAAAAAAAAAAAAAAAAFGTDgEAAAAAEZoGu1eukF9DG%2Fd1iNeDCfHMvWU%3DPR3zJLzXYZ7TgjyWbsRe1qgdntSe1QSGFmKvck1yc6IeUCn18L";
	public static final Logger log = Logger.getLogger(TrendsResource.class.getName());
	
	public List<String> getTweets(String query) throws ResourceException, IOException {
		String queryFormatted = URLEncoder.encode(query, "UTF-8");
		String uri = "https://api.twitter.com/1.1/search/tweets.json?q="+queryFormatted+"&count=2";
		log.log(Level.INFO, "tweets URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);

		//log.log(Level.WARNING, cr.get().getText());
		//TweetList t = cr.get(TweetList.class);
		String st="{\r\n" + 
				"  \"statuses\": [\r\n" + 
				"    {\r\n" + 
				"      \"created_at\": \"Mon May 06 20:01:29 +0000 2019\",\r\n" + 
				"      \"id\": 1125490788736032770,\r\n" + 
				"      \"id_str\": \"1125490788736032770\",\r\n" + 
				"      \"text\": \"Today's new update means that you can finally add Pizza Cat to your Retweet with comments! Learn more about this ne… https://t.co/Rbc9TF2s5X\",\r\n" + 
				"      \"truncated\": true,\r\n" + 
				"      \"entities\": {\r\n" + 
				"        \"hashtags\": [],\r\n" + 
				"        \"symbols\": [],\r\n" + 
				"        \"user_mentions\": [],\r\n" + 
				"        \"urls\": [\r\n" + 
				"          {\r\n" + 
				"            \"url\": \"https://t.co/Rbc9TF2s5X\",\r\n" + 
				"            \"expanded_url\": \"https://twitter.com/i/web/status/1125490788736032770\",\r\n" + 
				"            \"display_url\": \"twitter.com/i/web/status/1…\",\r\n" + 
				"            \"indices\": [\r\n" + 
				"              117,\r\n" + 
				"              140\r\n" + 
				"            ]\r\n" + 
				"          }\r\n" + 
				"        ]\r\n" + 
				"      },\r\n" + 
				"      \"metadata\": {\r\n" + 
				"        \"iso_language_code\": \"en\",\r\n" + 
				"        \"result_type\": \"recent\"\r\n" + 
				"      },\r\n" + 
				"      \"source\": \"<a href=\"https://mobile.twitter.com\" rel=\"nofollow\">Twitter Web App</a>\",\r\n" + 
				"      \"in_reply_to_status_id\": null,\r\n" + 
				"      \"in_reply_to_status_id_str\": null,\r\n" + 
				"      \"in_reply_to_user_id\": null,\r\n" + 
				"      \"in_reply_to_user_id_str\": null,\r\n" + 
				"      \"in_reply_to_screen_name\": null,\r\n" + 
				"      \"user\": {\r\n" + 
				"        \"id\": 2244994945,\r\n" + 
				"        \"id_str\": \"2244994945\",\r\n" + 
				"        \"name\": \"Twitter Dev\",\r\n" + 
				"        \"screen_name\": \"TwitterDev\",\r\n" + 
				"        \"location\": \"Internet\",\r\n" + 
				"        \"description\": \"Your official source for Twitter Platform news, updates & events. Need technical help? Visit https://t.co/mGHnxZU8c1 ⌨️ #TapIntoTwitter\",\r\n" + 
				"        \"url\": \"https://t.co/FGl7VOULyL\",\r\n" + 
				"        \"entities\": {\r\n" + 
				"          \"url\": {\r\n" + 
				"            \"urls\": [\r\n" + 
				"              {\r\n" + 
				"                \"url\": \"https://t.co/FGl7VOULyL\",\r\n" + 
				"                \"expanded_url\": \"https://developer.twitter.com/\",\r\n" + 
				"                \"display_url\": \"developer.twitter.com\",\r\n" + 
				"                \"indices\": [\r\n" + 
				"                  0,\r\n" + 
				"                  23\r\n" + 
				"                ]\r\n" + 
				"              }\r\n" + 
				"            ]\r\n" + 
				"          },\r\n" + 
				"          \"description\": {\r\n" + 
				"            \"urls\": [\r\n" + 
				"              {\r\n" + 
				"                \"url\": \"https://t.co/mGHnxZU8c1\",\r\n" + 
				"                \"expanded_url\": \"https://twittercommunity.com/\",\r\n" + 
				"                \"display_url\": \"twittercommunity.com\",\r\n" + 
				"                \"indices\": [\r\n" + 
				"                  93,\r\n" + 
				"                  116\r\n" + 
				"                ]\r\n" + 
				"              }\r\n" + 
				"            ]\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"protected\": false,\r\n" + 
				"        \"followers_count\": 501947,\r\n" + 
				"        \"friends_count\": 1473,\r\n" + 
				"        \"listed_count\": 1507,\r\n" + 
				"        \"created_at\": \"Sat Dec 14 04:35:55 +0000 2013\",\r\n" + 
				"        \"favourites_count\": 2186,\r\n" + 
				"        \"utc_offset\": null,\r\n" + 
				"        \"time_zone\": null,\r\n" + 
				"        \"geo_enabled\": true,\r\n" + 
				"        \"verified\": true,\r\n" + 
				"        \"statuses_count\": 3389,\r\n" + 
				"        \"lang\": \"en\",\r\n" + 
				"        \"contributors_enabled\": false,\r\n" + 
				"        \"is_translator\": false,\r\n" + 
				"        \"is_translation_enabled\": null,\r\n" + 
				"        \"profile_background_color\": \"null\",\r\n" + 
				"        \"profile_background_image_url\": \"null\",\r\n" + 
				"        \"profile_background_image_url_https\": \"null\",\r\n" + 
				"        \"profile_background_tile\": null,\r\n" + 
				"        \"profile_image_url\": \"null\",\r\n" + 
				"        \"profile_image_url_https\": \"https://pbs.twimg.com/profile_images/880136122604507136/xHrnqf1T_normal.jpg\",\r\n" + 
				"        \"profile_banner_url\": \"https://pbs.twimg.com/profile_banners/2244994945/1498675817\",\r\n" + 
				"        \"profile_link_color\": \"null\",\r\n" + 
				"        \"profile_sidebar_border_color\": \"null\",\r\n" + 
				"        \"profile_sidebar_fill_color\": \"null\",\r\n" + 
				"        \"profile_text_color\": \"null\",\r\n" + 
				"        \"profile_use_background_image\": null,\r\n" + 
				"        \"has_extended_profile\": null,\r\n" + 
				"        \"default_profile\": false,\r\n" + 
				"        \"default_profile_image\": false,\r\n" + 
				"        \"following\": false,\r\n" + 
				"        \"follow_request_sent\": false,\r\n" + 
				"        \"notifications\": false,\r\n" + 
				"        \"translator_type\": \"null\"\r\n" + 
				"      },\r\n" + 
				"      \"geo\": null,\r\n" + 
				"      \"coordinates\": null,\r\n" + 
				"      \"place\": null,\r\n" + 
				"      \"contributors\": null,\r\n" + 
				"      \"is_quote_status\": true,\r\n" + 
				"      \"quoted_status_id\": 1125479034513645569,\r\n" + 
				"      \"quoted_status_id_str\": \"1125479034513645569\",\r\n" + 
				"      \"quoted_status\": {\r\n" + 
				"        \"created_at\": \"Mon May 06 19:14:46 +0000 2019\",\r\n" + 
				"        \"id\": 1125479034513645569,\r\n" + 
				"        \"id_str\": \"1125479034513645569\",\r\n" + 
				"        \"text\": \"It's easy to express yourself by Retweeting with a comment. What if you could take it a step further and include me… https://t.co/YTqpNZZ8M9\",\r\n" + 
				"        \"truncated\": true,\r\n" + 
				"        \"entities\": {\r\n" + 
				"          \"hashtags\": [],\r\n" + 
				"          \"symbols\": [],\r\n" + 
				"          \"user_mentions\": [],\r\n" + 
				"          \"urls\": [\r\n" + 
				"            {\r\n" + 
				"              \"url\": \"https://t.co/YTqpNZZ8M9\",\r\n" + 
				"              \"expanded_url\": \"https://twitter.com/i/web/status/1125479034513645569\",\r\n" + 
				"              \"display_url\": \"twitter.com/i/web/status/1…\",\r\n" + 
				"              \"indices\": [\r\n" + 
				"                117,\r\n" + 
				"                140\r\n" + 
				"              ]\r\n" + 
				"            }\r\n" + 
				"          ]\r\n" + 
				"        },\r\n" + 
				"        \"metadata\": {\r\n" + 
				"          \"iso_language_code\": \"en\",\r\n" + 
				"          \"result_type\": \"recent\"\r\n" + 
				"        },\r\n" + 
				"        \"source\": \"<a href=\"http://twitter.com\" rel=\"nofollow\">Twitter Web Client</a>\",\r\n" + 
				"        \"in_reply_to_status_id\": null,\r\n" + 
				"        \"in_reply_to_status_id_str\": null,\r\n" + 
				"        \"in_reply_to_user_id\": null,\r\n" + 
				"        \"in_reply_to_user_id_str\": null,\r\n" + 
				"        \"in_reply_to_screen_name\": null,\r\n" + 
				"        \"user\": {\r\n" + 
				"          \"id\": 17874544,\r\n" + 
				"          \"id_str\": \"17874544\",\r\n" + 
				"          \"name\": \"Twitter Support\",\r\n" + 
				"          \"screen_name\": \"TwitterSupport\",\r\n" + 
				"          \"location\": \"Twitter HQ\",\r\n" + 
				"          \"description\": \"Your official source for Twitter Support. We're available 24/7 via Direct Message to answer account questions. Follow us for tips, tricks, and announcements.\",\r\n" + 
				"          \"url\": \"https://t.co/heEvRrl4yN\",\r\n" + 
				"          \"entities\": {\r\n" + 
				"            \"url\": {\r\n" + 
				"              \"urls\": [\r\n" + 
				"                {\r\n" + 
				"                  \"url\": \"https://t.co/heEvRrl4yN\",\r\n" + 
				"                  \"expanded_url\": \"https://help.twitter.com\",\r\n" + 
				"                  \"display_url\": \"help.twitter.com\",\r\n" + 
				"                  \"indices\": [\r\n" + 
				"                    0,\r\n" + 
				"                    23\r\n" + 
				"                  ]\r\n" + 
				"                }\r\n" + 
				"              ]\r\n" + 
				"            },\r\n" + 
				"            \"description\": {\r\n" + 
				"              \"urls\": []\r\n" + 
				"            }\r\n" + 
				"          },\r\n" + 
				"          \"protected\": false,\r\n" + 
				"          \"followers_count\": 5861908,\r\n" + 
				"          \"friends_count\": 17,\r\n" + 
				"          \"listed_count\": 15129,\r\n" + 
				"          \"created_at\": \"Thu Dec 04 18:51:57 +0000 2008\",\r\n" + 
				"          \"favourites_count\": 313,\r\n" + 
				"          \"utc_offset\": null,\r\n" + 
				"          \"time_zone\": null,\r\n" + 
				"          \"geo_enabled\": true,\r\n" + 
				"          \"verified\": true,\r\n" + 
				"          \"statuses_count\": 27955,\r\n" + 
				"          \"lang\": \"en\",\r\n" + 
				"          \"contributors_enabled\": false,\r\n" + 
				"          \"is_translator\": false,\r\n" + 
				"          \"is_translation_enabled\": null,\r\n" + 
				"          \"profile_background_color\": \"null\",\r\n" + 
				"          \"profile_background_image_url\": \"null\",\r\n" + 
				"          \"profile_background_image_url_https\": \"null\",\r\n" + 
				"          \"profile_background_tile\": null,\r\n" + 
				"          \"profile_image_url\": \"null\",\r\n" + 
				"          \"profile_image_url_https\": \"https://pbs.twimg.com/profile_images/941807338171777025/PRP6vwDq_normal.jpg\",\r\n" + 
				"          \"profile_banner_url\": \"https://pbs.twimg.com/profile_banners/17874544/1499274456\",\r\n" + 
				"          \"profile_link_color\": \"null\",\r\n" + 
				"          \"profile_sidebar_border_color\": \"null\",\r\n" + 
				"          \"profile_sidebar_fill_color\": \"null\",\r\n" + 
				"          \"profile_text_color\": \"null\",\r\n" + 
				"          \"profile_use_background_image\": null,\r\n" + 
				"          \"has_extended_profile\": null,\r\n" + 
				"          \"default_profile\": false,\r\n" + 
				"          \"default_profile_image\": false,\r\n" + 
				"          \"following\": false,\r\n" + 
				"          \"follow_request_sent\": false,\r\n" + 
				"          \"notifications\": false,\r\n" + 
				"          \"translator_type\": \"null\"\r\n" + 
				"        },\r\n" + 
				"        \"geo\": null,\r\n" + 
				"        \"coordinates\": null,\r\n" + 
				"        \"place\": null,\r\n" + 
				"        \"contributors\": null,\r\n" + 
				"        \"is_quote_status\": false,\r\n" + 
				"        \"retweet_count\": 1466,\r\n" + 
				"        \"favorite_count\": 3990,\r\n" + 
				"        \"favorited\": false,\r\n" + 
				"        \"retweeted\": false,\r\n" + 
				"        \"possibly_sensitive\": false,\r\n" + 
				"        \"lang\": \"en\"\r\n" + 
				"      },\r\n" + 
				"      \"retweet_count\": 20,\r\n" + 
				"      \"favorite_count\": 44,\r\n" + 
				"      \"favorited\": false,\r\n" + 
				"      \"retweeted\": false,\r\n" + 
				"      \"possibly_sensitive\": false,\r\n" + 
				"      \"lang\": \"en\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"created_at\": \"Sat May 04 15:00:33 +0000 2019\",\r\n" + 
				"      \"id\": 1124690280777699328,\r\n" + 
				"      \"id_str\": \"1124690280777699328\",\r\n" + 
				"      \"text\": \"If you're at #Pycon2019 and you use Twitter data or the Twitter API with your code, we are running an Open Space in… https://t.co/mVLIzEr9Gx\",\r\n" + 
				"      \"truncated\": true,\r\n" + 
				"      \"entities\": {\r\n" + 
				"        \"hashtags\": [\r\n" + 
				"          {\r\n" + 
				"            \"text\": \"Pycon2019\",\r\n" + 
				"            \"indices\": [\r\n" + 
				"              13,\r\n" + 
				"              23\r\n" + 
				"            ]\r\n" + 
				"          }\r\n" + 
				"        ],\r\n" + 
				"        \"symbols\": [],\r\n" + 
				"        \"user_mentions\": [],\r\n" + 
				"        \"urls\": [\r\n" + 
				"          {\r\n" + 
				"            \"url\": \"https://t.co/mVLIzEr9Gx\",\r\n" + 
				"            \"expanded_url\": \"https://twitter.com/i/web/status/1124690280777699328\",\r\n" + 
				"            \"display_url\": \"twitter.com/i/web/status/1…\",\r\n" + 
				"            \"indices\": [\r\n" + 
				"              117,\r\n" + 
				"              140\r\n" + 
				"            ]\r\n" + 
				"          }\r\n" + 
				"        ]\r\n" + 
				"      },\r\n" + 
				"      \"metadata\": {\r\n" + 
				"        \"iso_language_code\": \"en\",\r\n" + 
				"        \"result_type\": \"recent\"\r\n" + 
				"      },\r\n" + 
				"      \"source\": \"<a href=\"http://twitter.com\" rel=\"nofollow\">Twitter for  iPhone</a>\",\r\n" + 
				"      \"in_reply_to_status_id\": null,\r\n" + 
				"      \"in_reply_to_status_id_str\": null,\r\n" + 
				"      \"in_reply_to_user_id\": null,\r\n" + 
				"      \"in_reply_to_user_id_str\": null,\r\n" + 
				"      \"in_reply_to_screen_name\": null,\r\n" + 
				"      \"user\": {\r\n" + 
				"        \"id\": 2244994945,\r\n" + 
				"        \"id_str\": \"2244994945\",\r\n" + 
				"        \"name\": \"Twitter Dev\",\r\n" + 
				"        \"screen_name\": \"TwitterDev\",\r\n" + 
				"        \"location\": \"Internet\",\r\n" + 
				"        \"description\": \"Your official source for Twitter Platform news, updates & events. Need technical help? Visit https://t.co/mGHnxZU8c1 ⌨️ #TapIntoTwitter\",\r\n" + 
				"        \"url\": \"https://t.co/FGl7VOULyL\",\r\n" + 
				"        \"entities\": {\r\n" + 
				"          \"url\": {\r\n" + 
				"            \"urls\": [\r\n" + 
				"              {\r\n" + 
				"                \"url\": \"https://t.co/FGl7VOULyL\",\r\n" + 
				"                \"expanded_url\": \"https://developer.twitter.com/\",\r\n" + 
				"                \"display_url\": \"developer.twitter.com\",\r\n" + 
				"                \"indices\": [\r\n" + 
				"                  0,\r\n" + 
				"                  23\r\n" + 
				"                ]\r\n" + 
				"              }\r\n" + 
				"            ]\r\n" + 
				"          },\r\n" + 
				"          \"description\": {\r\n" + 
				"            \"urls\": [\r\n" + 
				"              {\r\n" + 
				"                \"url\": \"https://t.co/mGHnxZU8c1\",\r\n" + 
				"                \"expanded_url\": \"https://twittercommunity.com/\",\r\n" + 
				"                \"display_url\": \"twittercommunity.com\",\r\n" + 
				"                \"indices\": [\r\n" + 
				"                  93,\r\n" + 
				"                  116\r\n" + 
				"                ]\r\n" + 
				"              }\r\n" + 
				"            ]\r\n" + 
				"          }\r\n" + 
				"        },\r\n" + 
				"        \"protected\": false,\r\n" + 
				"        \"followers_count\": 501947,\r\n" + 
				"        \"friends_count\": 1473,\r\n" + 
				"        \"listed_count\": 1507,\r\n" + 
				"        \"created_at\": \"Sat Dec 14 04:35:55 +0000 2013\",\r\n" + 
				"        \"favourites_count\": 2186,\r\n" + 
				"        \"utc_offset\": null,\r\n" + 
				"        \"time_zone\": null,\r\n" + 
				"        \"geo_enabled\": true,\r\n" + 
				"        \"verified\": true,\r\n" + 
				"        \"statuses_count\": 3389,\r\n" + 
				"        \"lang\": \"en\",\r\n" + 
				"        \"contributors_enabled\": false,\r\n" + 
				"        \"is_translator\": false,\r\n" + 
				"        \"is_translation_enabled\": null,\r\n" + 
				"        \"profile_background_color\": \"null\",\r\n" + 
				"        \"profile_background_image_url\": \"null\",\r\n" + 
				"        \"profile_background_image_url_https\": \"null\",\r\n" + 
				"        \"profile_background_tile\": null,\r\n" + 
				"        \"profile_image_url\": \"null\",\r\n" + 
				"        \"profile_image_url_https\": \"https://pbs.twimg.com/profile_images/880136122604507136/xHrnqf1T_normal.jpg\",\r\n" + 
				"        \"profile_banner_url\": \"https://pbs.twimg.com/profile_banners/2244994945/1498675817\",\r\n" + 
				"        \"profile_link_color\": \"null\",\r\n" + 
				"        \"profile_sidebar_border_color\": \"null\",\r\n" + 
				"        \"profile_sidebar_fill_color\": \"null\",\r\n" + 
				"        \"profile_text_color\": \"null\",\r\n" + 
				"        \"profile_use_background_image\": null,\r\n" + 
				"        \"has_extended_profile\": null,\r\n" + 
				"        \"default_profile\": false,\r\n" + 
				"        \"default_profile_image\": false,\r\n" + 
				"        \"following\": false,\r\n" + 
				"        \"follow_request_sent\": false,\r\n" + 
				"        \"notifications\": false,\r\n" + 
				"        \"translator_type\": \"null\"\r\n" + 
				"      },\r\n" + 
				"      \"geo\": null,\r\n" + 
				"      \"coordinates\": null,\r\n" + 
				"      \"place\": null,\r\n" + 
				"      \"contributors\": null,\r\n" + 
				"      \"is_quote_status\": false,\r\n" + 
				"      \"retweet_count\": 12,\r\n" + 
				"      \"favorite_count\": 27,\r\n" + 
				"      \"favorited\": false,\r\n" + 
				"      \"retweeted\": false,\r\n" + 
				"      \"possibly_sensitive\": false,\r\n" + 
				"      \"lang\": \"en\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"search_metadata\": {\r\n" + 
				"    \"completed_in\": 0.047,\r\n" + 
				"    \"max_id\": 1125490788736032770,\r\n" + 
				"    \"max_id_str\": \"1125490788736032770\",\r\n" + 
				"    \"next_results\": \"?max_id=1124690280777699327&q=from%3Atwitterdev&count=2&include_entities=1&result_type=mixed\",\r\n" + 
				"    \"query\": \"from%3Atwitterdev\",\r\n" + 
				"    \"refresh_url\": \"?since_id=1125490788736032770&q=from%3Atwitterdev&result_type=mixed&include_entities=1\",\r\n" + 
				"    \"count\": 2,\r\n" + 
				"    \"since_id\": 0,\r\n" + 
				"    \"since_id_str\": \"0\"\r\n" + 
				"  }\r\n" + 
				"}";
		List<String> T=parse(st);
		log.log(Level.WARNING, "Parseado");
		return T;
	}
private static List<String> parse(String st) {
		
		List<String> lu = new ArrayList<>();
		Boolean b=true;
		String url ="";
		for(String trd: st.split("[{},]")) {
			if(!trd.contains("statuses")&&!trd.contains("sidebar")) {
				if(trd.contains("\"id\"")&&b) {
					url = trd.split(":")[1].trim();
					url = url.substring(1,url.length()-1);
					lu.add(url);
					b=false;
					
					}
				if(trd.contains("\"created_at\"")) {
					b=true;
				}
				
			}
		}
		
		return lu;
		}
}
