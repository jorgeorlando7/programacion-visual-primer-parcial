package State;

public class State {
	private String stateName;
	private int statePop;
	private City capCity, popCity;
        
	public State() {
		this("North Carolina", 10054192);
	}

	public State(String state, int statePop) {
		this.stateName = state;
		this.statePop = statePop;
 
	}

	public State(String state, int statePop, String capCityName, int capCityPop, String popCityName,
			int popCityPop) {
		this.stateName = state;
		this.statePop = statePop;
		capCity = new City(capCityName, capCityPop);
		popCity = new City(popCityName, popCityPop);
	}
 
	public String getStateData() {
		StringBuilder sb = new StringBuilder();
		sb.append(stateName + "\t\t");
		sb.append(statePop + "\n");
		sb.append(capCity.getCityName() + "\t\t");
		sb.append(capCity.getCityPop() + "\n");
		sb.append(popCity.getCityName() + "\t\t");
		sb.append(popCity.getCityPop());
		return sb.toString();
	}
 
	public String getStateName() {
		return stateName;
	}
 
	public int getStatePopulation() {
		return statePop;
	}

	private class City {
		private String cityName;
		private int cityPop;
 
		public City(String name, int pop) {
			setCityName(name);
			setCityPop(pop);
		}
 
		public void displayCity() {
			System.out.println("City Name: " + getCityName());
			System.out.println("City Population: " + getCityPop());
		}
 
		public String getCityName() {
			return cityName;
		}
 
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
 
		public int getCityPop() {
			return cityPop;
		}
 
		public void setCityPop(int cityPop) {
			this.cityPop = cityPop;
		}
 
	}
}