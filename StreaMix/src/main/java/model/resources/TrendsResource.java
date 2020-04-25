package model.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.MediaType;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.twitter.Trend;
import model.twitter.Trending;
import utility.Tools;

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
		
		//String st = cr.get(String.class);
		String st = "[{\r\n" + 
				"    \"trends\": [{\r\n" + 
				"            \"name\": \"#SVGala10\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23SVGala10\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23SVGala10\",\r\n" + 
				"            \"tweet_volume\": 113583\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#SanchezMarchateYa\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23SanchezMarchateYa\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23SanchezMarchateYa\",\r\n" + 
				"            \"tweet_volume\": 86654\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#DiaDelLibro\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23DiaDelLibro\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23DiaDelLibro\",\r\n" + 
				"            \"tweet_volume\": 223127\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#BetisEnCasa\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23BetisEnCasa\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23BetisEnCasa\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#LaJunglaDuos\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23LaJunglaDuos\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23LaJunglaDuos\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Travis Scott\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Travis+Scott%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22Travis+Scott%22\",\r\n" + 
				"            \"tweet_volume\": 333577\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Vargas Llosa\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Vargas+Llosa%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22Vargas+Llosa%22\",\r\n" + 
				"            \"tweet_volume\": 21057\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Rodgers\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=Rodgers\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"Rodgers\",\r\n" + 
				"            \"tweet_volume\": 102412\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"M\\u00E1s de 5.000\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22M%C3%A1s+de+5.000%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22M%C3%A1s+de+5.000%22\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"lamb\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=lamb\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"lamb\",\r\n" + 
				"            \"tweet_volume\": 228257\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Joe Burrow\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Joe+Burrow%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22Joe+Burrow%22\",\r\n" + 
				"            \"tweet_volume\": 91507\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Sant Jordi\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Sant+Jordi%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22Sant+Jordi%22\",\r\n" + 
				"            \"tweet_volume\": 156247\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Zara\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=Zara\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"Zara\",\r\n" + 
				"            \"tweet_volume\": 68581\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"ana mar\\u00EDa\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22ana+mar%C3%ADa%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22ana+mar%C3%ADa%22\",\r\n" + 
				"            \"tweet_volume\": 23155\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Arag\\u00F3n\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=Arag%C3%B3n\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"Arag%C3%B3n\",\r\n" + 
				"            \"tweet_volume\": 26637\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Castilla\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=Castilla\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"Castilla\",\r\n" + 
				"            \"tweet_volume\": 28615\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Isa Serra\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Isa+Serra%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22Isa+Serra%22\",\r\n" + 
				"            \"tweet_volume\": 30600\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Cristina Segu\\u00ED\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Cristina+Segu%C3%AD%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22Cristina+Segu%C3%AD%22\",\r\n" + 
				"            \"tweet_volume\": 27066\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Leonor\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=Leonor\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"Leonor\",\r\n" + 
				"            \"tweet_volume\": 20501\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Poder Judicial\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Poder+Judicial%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22Poder+Judicial%22\",\r\n" + 
				"            \"tweet_volume\": 48623\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Manuel Castells\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Manuel+Castells%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22Manuel+Castells%22\",\r\n" + 
				"            \"tweet_volume\": 17336\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Badalona\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=Badalona\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"Badalona\",\r\n" + 
				"            \"tweet_volume\": 13559\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"Rodrigo Rato\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Rodrigo+Rato%22\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%22Rodrigo+Rato%22\",\r\n" + 
				"            \"tweet_volume\": 22771\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#FelizViernesATodos\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23FelizViernesATodos\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23FelizViernesATodos\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#SamanthaSinM\\u00E1s\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23SamanthaSinM%C3%A1s\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23SamanthaSinM%C3%A1s\",\r\n" + 
				"            \"tweet_volume\": 32369\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#felizjueves\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23felizjueves\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23felizjueves\",\r\n" + 
				"            \"tweet_volume\": 48040\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#SanJorge\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23SanJorge\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23SanJorge\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#VergURJCenza\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23VergURJCenza\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23VergURJCenza\",\r\n" + 
				"            \"tweet_volume\": 12263\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#usalytirar\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23usalytirar\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23usalytirar\",\r\n" + 
				"            \"tweet_volume\": 14568\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#WorldBookDay\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23WorldBookDay\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23WorldBookDay\",\r\n" + 
				"            \"tweet_volume\": 184833\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#felizsantjordi\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23felizsantjordi\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23felizsantjordi\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#Gasol16\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23Gasol16\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23Gasol16\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#Villalar2020\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23Villalar2020\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23Villalar2020\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#HTCMania13Aniversario\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23HTCMania13Aniversario\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23HTCMania13Aniversario\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#sanjordi\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23sanjordi\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23sanjordi\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#DiaDeAragon\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23DiaDeAragon\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23DiaDeAragon\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#DiaDeLaTierra\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23DiaDeLaTierra\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23DiaDeLaTierra\",\r\n" + 
				"            \"tweet_volume\": 21075\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#CuarentenaESP\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23CuarentenaESP\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23CuarentenaESP\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#AsiNonUDC\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23AsiNonUDC\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23AsiNonUDC\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#20A\\u00F1osDeGH\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%2320A%C3%B1osDeGH\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%2320A%C3%B1osDeGH\",\r\n" + 
				"            \"tweet_volume\": null\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#flaviocalma1m\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23flaviocalma1m\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23flaviocalma1m\",\r\n" + 
				"            \"tweet_volume\": 19737\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#NFLDraft2020\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23NFLDraft2020\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23NFLDraft2020\",\r\n" + 
				"            \"tweet_volume\": 167715\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"name\": \"#santjordiacasa\",\r\n" + 
				"            \"url\": \"http:\\/\\/twitter.com\\/search?q=%23santjordiacasa\",\r\n" + 
				"            \"promoted_content\": null,\r\n" + 
				"            \"query\": \"%23santjordiacasa\",\r\n" + 
				"            \"tweet_volume\": 14937\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    \"as_of\": \"2020-04-24T18:10:27Z\",\r\n" + 
				"    \"created_at\": \"2020-04-24T06:36:17Z\",\r\n" + 
				"    \"locations\": [{\r\n" + 
				"        \"name\": \"Seville\",\r\n" + 
				"        \"woeid\": 774508\r\n" + 
				"    }]\r\n" + 
				"}]";
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
					name = name.substring(1,name.length()-1);
					//name= Tools.decode(name);
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
