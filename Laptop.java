public class Laptop {

	private String vendor;
	private String cpuVendor;
	private String color;
	private String operatingSystem;
	private String randomAccessMemory;
	private String hddValue;
	private String price;


	public String getVendor() {return vendor;}
	public String getCpuVendor() {return cpuVendor;}
	public String getColor() {return color;}
	public String getOperatingSystem() {return operatingSystem;}
	public String getRandomAccessMemory() {return randomAccessMemory;}
	public String getHddValue() {return hddValue;}
	public String price() {return price;}
	public void setPrice(String price) {this.price = price;}


	public Laptop(String vendor, String cpuVendor, String color, String operatingSystem, String randomAccessMemory, String hddValue, String price) {
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
