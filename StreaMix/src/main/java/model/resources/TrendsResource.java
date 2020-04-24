package model.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.twitter.Trend;
import model.twitter.Trending;

public class TrendsResource {
	public static final String bearerToken = "AAAAAAAAAAAAAAAAAAAAAFGTDgEAAAAAEZoGu1eukF9DG%2Fd1iNeDCfHMvWU%3DPR3zJLzXYZ7TgjyWbsRe1qgdntSe1QSGFmKvck1yc6IeUCn18L";
	public static final String locationID = "774508";
	public static final Logger log = Logger.getLogger(TrendsResource.class.getName());
	
	public Trending getTrends() throws ResourceException, IOException {
		String uri = "https://api.twitter.com/1.1/trends/place.json?id="+locationID+"&count=5";
		log.log(Level.INFO, "trends URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);
		
		//String st = cr.get().getText();
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
		"                \"name\": \"\\u598A\\u5A208\\u30F6\\u6708\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%E5%A6%8A%E5%A8%A08%E3%83%B6%E6%9C%88\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%E5%A6%8A%E5%A8%A08%E3%83%B6%E6%9C%88\",\r\n" + 
		"                \"tweet_volume\": 16152\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#\\u4E16\\u5E2F\\u4E3B\\u3067\\u306F\\u306A\\u304F\\u500B\\u4EBA\\u306B\\u7D66\\u4ED8\\u3057\\u3066\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E4%B8%96%E5%B8%AF%E4%B8%BB%E3%81%A7%E3%81%AF%E3%81%AA%E3%81%8F%E5%80%8B%E4%BA%BA%E3%81%AB%E7%B5%A6%E4%BB%98%E3%81%97%E3%81%A6\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23%E4%B8%96%E5%B8%AF%E4%B8%BB%E3%81%A7%E3%81%AF%E3%81%AA%E3%81%8F%E5%80%8B%E4%BA%BA%E3%81%AB%E7%B5%A6%E4%BB%98%E3%81%97%E3%81%A6\",\r\n" + 
		"                \"tweet_volume\": 56392\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#7YearsOfLove\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%237YearsOfLove\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%237YearsOfLove\",\r\n" + 
		"                \"tweet_volume\": 48511\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#MBC_\\uD569\\uC131_\\uC0AC\\uACFC\\uD574\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23MBC_%ED%95%A9%EC%84%B1_%EC%82%AC%EA%B3%BC%ED%95%B4\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23MBC_%ED%95%A9%EC%84%B1_%EC%82%AC%EA%B3%BC%ED%95%B4\",\r\n" + 
		"                \"tweet_volume\": 31837\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#\\u3055\\u3093\\u307E\\u5FA1\\u6BBF\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E3%81%95%E3%82%93%E3%81%BE%E5%BE%A1%E6%AE%BF\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23%E3%81%95%E3%82%93%E3%81%BE%E5%BE%A1%E6%AE%BF\",\r\n" + 
		"                \"tweet_volume\": 17471\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"\\u770C\\u8077\\u54E1\\u306E10\\u4E07\\u5186\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%E7%9C%8C%E8%81%B7%E5%93%A1%E3%81%AE10%E4%B8%87%E5%86%86\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%E7%9C%8C%E8%81%B7%E5%93%A1%E3%81%AE10%E4%B8%87%E5%86%86\",\r\n" + 
		"                \"tweet_volume\": 62796\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"sehun\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=sehun\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"sehun\",\r\n" + 
		"                \"tweet_volume\": 179882\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"ARMY WITH BTS FOREVER\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22ARMY+WITH+BTS+FOREVER%22\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%22ARMY+WITH+BTS+FOREVER%22\",\r\n" + 
		"                \"tweet_volume\": 10417\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"Jos\\u00E9 Mar\\u00EDa Calleja\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Jos%C3%A9+Mar%C3%ADa+Calleja%22\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%22Jos%C3%A9+Mar%C3%ADa+Calleja%22\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"\\u3057\\u3085\\u3093\\u307E\\u3084\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%E3%81%97%E3%82%85%E3%82%93%E3%81%BE%E3%82%84\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%E3%81%97%E3%82%85%E3%82%93%E3%81%BE%E3%82%84\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"Ekim2016 Atamaild\\u0131\\u015F\\u0131\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Ekim2016+Atamaild%C4%B1%C5%9F%C4%B1%22\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%22Ekim2016+Atamaild%C4%B1%C5%9F%C4%B1%22\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"\\u30AB\\u30D3\\u4ED8\\u7740\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%E3%82%AB%E3%83%93%E4%BB%98%E7%9D%80\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%E3%82%AB%E3%83%93%E4%BB%98%E7%9D%80\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"WE PURPLE YOU BTS\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22WE+PURPLE+YOU+BTS%22\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%22WE+PURPLE+YOU+BTS%22\",\r\n" + 
		"                \"tweet_volume\": 43151\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"\\u9577\\u8C37\\u90E8\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%E9%95%B7%E8%B0%B7%E9%83%A8\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%E9%95%B7%E8%B0%B7%E9%83%A8\",\r\n" + 
		"                \"tweet_volume\": 153599\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"\\u5C71P\\u306E\\u30A4\\u30F3\\u30B9\\u30BF\\u30E9\\u30A4\\u30D6\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%E5%B1%B1P%E3%81%AE%E3%82%A4%E3%83%B3%E3%82%B9%E3%82%BF%E3%83%A9%E3%82%A4%E3%83%96\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%E5%B1%B1P%E3%81%AE%E3%82%A4%E3%83%B3%E3%82%B9%E3%82%BF%E3%83%A9%E3%82%A4%E3%83%96\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"Belva\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=Belva\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"Belva\",\r\n" + 
		"                \"tweet_volume\": 10654\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#NationalTeaDay\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23NationalTeaDay\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23NationalTeaDay\",\r\n" + 
		"                \"tweet_volume\": 11832\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#KenyaVsUganda\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23KenyaVsUganda\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23KenyaVsUganda\",\r\n" + 
		"                \"tweet_volume\": 11971\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#Dumhdurum1stWin\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23Dumhdurum1stWin\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23Dumhdurum1stWin\",\r\n" + 
		"                \"tweet_volume\": 44677\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#\\u30AF\\u30A4\\u30BA\\u30AA\\u30F3\\u30EA\\u30FC1\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E3%82%AF%E3%82%A4%E3%82%BA%E3%82%AA%E3%83%B3%E3%83%AA%E3%83%BC1\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23%E3%82%AF%E3%82%A4%E3%82%BA%E3%82%AA%E3%83%B3%E3%83%AA%E3%83%BC1\",\r\n" + 
		"                \"tweet_volume\": 25337\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#\\u0627\\u0644\\u062D\\u0631\\u064A\\u0647_\\u0644\\u062D\\u064A\\u0648\\u0627\\u0646\\u0627\\u062A_\\u0627\\u0644\\u062F\\u063A\\u064A\\u0631\\u064A\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%D8%A7%D9%84%D8%AD%D8%B1%D9%8A%D9%87_%D9%84%D8%AD%D9%8A%D9%88%D8%A7%D9%86%D8%A7%D8%AA_%D8%A7%D9%84%D8%AF%D8%BA%D9%8A%D8%B1%D9%8A\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23%D8%A7%D9%84%D8%AD%D8%B1%D9%8A%D9%87_%D9%84%D8%AD%D9%8A%D9%88%D8%A7%D9%86%D8%A7%D8%AA_%D8%A7%D9%84%D8%AF%D8%BA%D9%8A%D8%B1%D9%8A\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#\\u0938\\u094B\\u0928\\u0942_\\u0928\\u093F\\u0917\\u092E_\\u0924\\u0941\\u092E_\\u0915\\u0939\\u093E\\u0901_\\u0939\\u094B\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E0%A4%B8%E0%A5%8B%E0%A4%A8%E0%A5%82_%E0%A4%A8%E0%A4%BF%E0%A4%97%E0%A4%AE_%E0%A4%A4%E0%A5%81%E0%A4%AE_%E0%A4%95%E0%A4%B9%E0%A4%BE%E0%A4%81_%E0%A4%B9%E0%A5%8B\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23%E0%A4%B8%E0%A5%8B%E0%A4%A8%E0%A5%82_%E0%A4%A8%E0%A4%BF%E0%A4%97%E0%A4%AE_%E0%A4%A4%E0%A5%81%E0%A4%AE_%E0%A4%95%E0%A4%B9%E0%A4%BE%E0%A4%81_%E0%A4%B9%E0%A5%8B\",\r\n" + 
		"                \"tweet_volume\": 44908\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#izmirBarosu\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23izmirBarosu\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23izmirBarosu\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#1MilyonYaz\\u0131l\\u0131mc\\u0131\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%231MilyonYaz%C4%B1l%C4%B1mc%C4%B1\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%231MilyonYaz%C4%B1l%C4%B1mc%C4%B1\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#\\u30CD\\u30C3\\u30C8\\u4E0A\\u3068\\u30EA\\u30A2\\u30EB\\u3067\\u306E\\u5370\\u8C61\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E3%83%8D%E3%83%83%E3%83%88%E4%B8%8A%E3%81%A8%E3%83%AA%E3%82%A2%E3%83%AB%E3%81%A7%E3%81%AE%E5%8D%B0%E8%B1%A1\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23%E3%83%8D%E3%83%83%E3%83%88%E4%B8%8A%E3%81%A8%E3%83%AA%E3%82%A2%E3%83%AB%E3%81%A7%E3%81%AE%E5%8D%B0%E8%B1%A1\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#\\u304A\\u3046\\u3061\\u3067\\u611B\\u7406\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E3%81%8A%E3%81%86%E3%81%A1%E3%81%A7%E6%84%9B%E7%90%86\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23%E3%81%8A%E3%81%86%E3%81%A1%E3%81%A7%E6%84%9B%E7%90%86\",\r\n" + 
		"                \"tweet_volume\": 26454\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#kayseride23nisan\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23kayseride23nisan\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23kayseride23nisan\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#\\u30CA\\u30B7\\u30CA\\u30B8\\u30FC\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E3%83%8A%E3%82%B7%E3%83%8A%E3%82%B8%E3%83%BC\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23%E3%83%8A%E3%82%B7%E3%83%8A%E3%82%B8%E3%83%BC\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
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
		"                \"name\": \"#BuenMartes\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23BuenMartes\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23BuenMartes\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#sal\\u0131\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23sal%C4%B1\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23sal%C4%B1\",\r\n" + 
		"                \"tweet_volume\": 26151\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#\\u7D20\\u6575\\u306A\\u9078TAXI\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23%E7%B4%A0%E6%95%B5%E3%81%AA%E9%81%B8TAXI\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23%E7%B4%A0%E6%95%B5%E3%81%AA%E9%81%B8TAXI\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#UTBKuy\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23UTBKuy\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23UTBKuy\",\r\n" + 
		"                \"tweet_volume\": null\r\n" + 
		"            },\r\n" + 
		"            {\r\n" + 
		"                \"name\": \"#mebzorunluhizmeteaf\",\r\n" + 
		"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23mebzorunluhizmeteaf\",\r\n" + 
		"                \"promoted_content\": null,\r\n" + 
		"                \"query\": \"%23mebzorunluhizmeteaf\",\r\n" + 
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
		log.log(Level.WARNING, st);
		Trending t = parse(st);
		log.log(Level.WARNING, "Parseado");
		return t;
	}
	
	private Trending parse(String st) {
		List<Trend> lt = new ArrayList<Trend>();
		String name = "";
		Integer volume = 0;
		for(String trd: st.split("[{},]")) {
			if(!trd.contains("trends")) {
				if(trd.contains("name")) {
					name = trd.split(":")[1].trim();
					name = name.substring(1,name.length()-2);
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
}
