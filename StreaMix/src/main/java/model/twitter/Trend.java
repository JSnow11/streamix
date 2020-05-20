
package model.twitter;

public class Trend {

	public static Trend of(String name, Integer tweetVolume) {
		return new Trend(name, tweetVolume);
	}

	private String name;
	private Integer tweetVolume;

	private Trend(String name, Integer tweetVolume) {
		super();
		this.name = name;

		this.tweetVolume = tweetVolume;
	}

	public String getName() {
		return name;
	}

	public Integer getVolume() {
		return tweetVolume;
	}

}
