
package model.twitter;

import java.util.List;

public class Trending {

	public static Trending of(List<Trend> trends) {
		return new Trending(trends);
	}

	private List<Trend> trends = null;

	public List<Trend> getTrends() {
		return trends;
	}

	private Trending(List<Trend> trends) {
		this.trends = trends;
	}
}
