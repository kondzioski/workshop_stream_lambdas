package lib;

public class Apple {
	
	public Apple(String color, int weight, String producer, int pricePerKilogram) {
		this.color = color;
		this.weight = weight;
		this.producer = producer;
		this.pricePerKilogram = pricePerKilogram;
	}

	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}


	public int getPricePerKilogram() {
		return pricePerKilogram;
	}

	public void setPricePerKilogram(int pricePerKilogram) {
		this.pricePerKilogram = pricePerKilogram;
	}


	private String color;
	private int weight;
	private String producer;
	private int pricePerKilogram;
	
}
