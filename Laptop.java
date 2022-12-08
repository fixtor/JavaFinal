public class Laptop {

	private String vendor;
	private String cpuVendor;
	private String color;
	private String operatingSystem;
	private int randomAccessMemory;
	private int hddValue;

	private float price;


	public String getVendor() {return vendor;}

	public String getCpuVendor() {return cpuVendor;}

	public String getColor() {return color;}

	public String getOperatingSystem() {return operatingSystem;}

	public int getRandomAccessMemory() {return randomAccessMemory;}

	public int getHddValue() {return hddValue;}

	public float price() {return price;}


	public void setPrice(float price) {this.price = price;}


	public Laptop(String vendor, String cpuVendor, String color, String operatingSystem, int randomAccessMemory, int hddValue, float price) {
		this.vendor = vendor;
		this.cpuVendor = cpuVendor;
		this.color = color;
		this.operatingSystem = operatingSystem;
		this.randomAccessMemory = randomAccessMemory;
		this.hddValue = hddValue;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop{" +
				"vendor='" + vendor + '\'' +
				", cpuVendor='" + cpuVendor + '\'' +
				", color='" + color + '\'' +
				", operatingSystem='" + operatingSystem + '\'' +
				", randomAccessMemory=" + randomAccessMemory +
				", hddValue=" + hddValue +
				", price=" + price +
				'}';
	}
}
