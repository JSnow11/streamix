package model.resources;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.Response;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.Encoding;
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
		String st = "[\r\n" + 
				"    {\r\n" + 
				"        \"trends\": [\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#cacerolada\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23cacerolada\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23cacerolada\",\r\n" + 
				"                \"tweet_volume\": 58701\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#FeriaDeAbril2020\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23FeriaDeAbril2020\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23FeriaDeAbril2020\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#25Abril\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%2325Abril\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%2325Abril\",\r\n" + 
				"                \"tweet_volume\": 43421\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Jon Kortajarena\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Jon+Kortajarena%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Jon+Kortajarena%22\",\r\n" + 
				"                \"tweet_volume\": 44713\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Trump\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=Trump\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"Trump\",\r\n" + 
				"                \"tweet_volume\": 3373195\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"El 2\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22El+2%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22El+2%22\",\r\n" + 
				"                \"tweet_volume\": 22370\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#StopConfinamientoEspana\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23StopConfinamientoEspana\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23StopConfinamientoEspana\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#AloPresidente\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23AloPresidente\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23AloPresidente\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Kim Jong-un\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Kim+Jong-un%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Kim+Jong-un%22\",\r\n" + 
				"                \"tweet_volume\": 182364\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Bella Ciao\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Bella+Ciao%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Bella+Ciao%22\",\r\n" + 
				"                \"tweet_volume\": 102035\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Runners\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=Runners\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"Runners\",\r\n" + 
				"                \"tweet_volume\": 10318\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Don Patricio\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Don+Patricio%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Don+Patricio%22\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Pearl Harbor\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Pearl+Harbor%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Pearl+Harbor%22\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Personalidades\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=Personalidades\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"Personalidades\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"John Shelby\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22John+Shelby%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22John+Shelby%22\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Rels B\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Rels+B%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Rels+B%22\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Beckham\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=Beckham\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"Beckham\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Perspectiva\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=Perspectiva\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"Perspectiva\",\r\n" + 
				"                \"tweet_volume\": 14652\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Kobe Bryant\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Kobe+Bryant%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Kobe+Bryant%22\",\r\n" + 
				"                \"tweet_volume\": 19793\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"l\\u00E9rida\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=l%C3%A9rida\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"l%C3%A9rida\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Juninho Pernambucano\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Juninho+Pernambucano%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Juninho+Pernambucano%22\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Camera Caf\\u00E9\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Camera+Caf%C3%A9%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Camera+Caf%C3%A9%22\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Terelu\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=Terelu\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"Terelu\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Nick Cave\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Nick+Cave%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Nick+Cave%22\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Madrid R\\u00EDo\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Madrid+R%C3%ADo%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Madrid+R%C3%ADo%22\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"consejo de europa\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22consejo+de+europa%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22consejo+de+europa%22\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Antonio Burgos\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%22Antonio+Burgos%22\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%22Antonio+Burgos%22\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Blancas\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=Blancas\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"Blancas\",\r\n" + 
				"                \"tweet_volume\": 14558\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#VerguenzaDeOposicion\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23VerguenzaDeOposicion\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23VerguenzaDeOposicion\",\r\n" + 
				"                \"tweet_volume\": 21506\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#EnCasaConVivaLaVida\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23EnCasaConVivaLaVida\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23EnCasaConVivaLaVida\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#EurovisionAgain\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23EurovisionAgain\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23EurovisionAgain\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#2demayo\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%232demayo\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%232demayo\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#EDASantiagoAbascal\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23EDASantiagoAbascal\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23EDASantiagoAbascal\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#AvengersEndgame\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23AvengersEndgame\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23AvengersEndgame\",\r\n" + 
				"                \"tweet_volume\": 22713\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#NataliaTourEnCasa\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23NataliaTourEnCasa\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23NataliaTourEnCasa\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#CampusFraudULEnto\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23CampusFraudULEnto\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23CampusFraudULEnto\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#FirstDates25A\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23FirstDates25A\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23FirstDates25A\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#L6Ndesescalando\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23L6Ndesescalando\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23L6Ndesescalando\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#MatchingInazuma\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23MatchingInazuma\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23MatchingInazuma\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#LutoNacionalYA\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23LutoNacionalYA\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23LutoNacionalYA\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#MerlosGate\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23MerlosGate\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23MerlosGate\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#EscapeRoomAkelarre\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23EscapeRoomAkelarre\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23EscapeRoomAkelarre\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#Tonucci\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23Tonucci\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23Tonucci\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#AndalucismoSigloXXI\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23AndalucismoSigloXXI\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23AndalucismoSigloXXI\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#JaviSerranoLive\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23JaviSerranoLive\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23JaviSerranoLive\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#martalopez\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23martalopez\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23martalopez\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#bodorriomarinana\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23bodorriomarinana\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23bodorriomarinana\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#MiVoto40SamSmith\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23MiVoto40SamSmith\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23MiVoto40SamSmith\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#Tormenta\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23Tormenta\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23Tormenta\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"#FascismoNuncaMais\",\r\n" + 
				"                \"url\": \"http:\\/\\/twitter.com\\/search?q=%23FascismoNuncaMais\",\r\n" + 
				"                \"promoted_content\": null,\r\n" + 
				"                \"query\": \"%23FascismoNuncaMais\",\r\n" + 
				"                \"tweet_volume\": null\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"as_of\": \"2020-04-25T19: 45: 21Z\",\r\n" + 
				"        \"created_at\": \"2020-04-25T19: 40: 35Z\",\r\n" + 
				"        \"locations\": [\r\n" + 
				"            {\r\n" + 
				"                \"name\": \"Seville\",\r\n" + 
				"                \"woeid\": 774508\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    }\r\n" + 
				"]";
		
		log.log(Level.WARNING, st);
		st = URLDecoder.decode(st, "UTF8");
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
