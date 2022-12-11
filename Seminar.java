import java.util.*;

public class Seminar {
	public static void main(String[] args) {

		//Задание 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
		Laptop laptop1 = new Laptop("Xiaomi", "Intel", "Black", "Windows 11", "8",
				"500", "24000");
		Laptop laptop2 = new Laptop("Apple", "Apple", "White", "MacOS", "16",
				"1000", "36000");
		Laptop laptop3 = new Laptop("Samsung", "AMD", "Blue", "Windows 10", "32",
				"250", "18000.0");
		Laptop laptop4 = new Laptop("Samsung", "Apple", "Green", "Linux", "64",
				"5000", "54000.0");

		//Задание 2. Создать множество ноутбуков.
		Set<Laptop> laptops = new HashSet<>();
		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);
		laptops.add(laptop4);

		System.out.println(userChoice(laptops));
		System.out.println();


		//Задание 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
		// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
		// Введите цифру, соответствующую необходимому критерию:
		//1 - ОЗУ
		//2 - Объем ЖД
		//3 - Операционная система
		//4 - Цвет …
	}

	public static Set<Laptop> setLaptops(Laptop laptop) {
		Set<Laptop> notebooks = new HashSet<>();
		notebooks.add(laptop);
		return notebooks;
	}

	public static Map<String, String> userChoice(Set<Laptop> laptops) {
		Map<String, String> mapUserChoice = new TreeMap<>();
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		String userChoice;

		System.out.println("Введите цифру критерий отбора: \n " +
				"\t1. Производитель.\n " +
				"\t2. Производитель CPU.\n" +
				"\t3. Цвет корпуса.\n" +
				"\t4. Операционная система.\n" +
				"\t5. Размер ОЗУ (ГБ).\n" +
				"\t6. Размер HDD (ГБ).\n" +
				"\t0. Exit");

		int userInput = scanner.nextInt();
		switch (userInput) {
			case 1: {
				System.out.println("Выберете производителя из списка: \n");
				for (Laptop item : laptops) System.out.println(item.getVendor());
				userChoice = scanner1.nextLine();
				mapUserChoice.put("Vendor", userChoice);
				if (resultChoiceByVendor(mapUserChoice, laptops) == null) System.out.println("NOT FOUND\n");
				else System.out.println(resultChoiceByVendor(mapUserChoice, laptops) + "\n");
			}
			case 2: {
				System.out.println("Выберете производителя CPU из списка: ");
				for (Laptop item : laptops) System.out.println(item.getCpuVendor());
				userChoice = scanner1.nextLine();
				mapUserChoice.put("CPU", userChoice);
				if (resultChoiceByCPUVendor(mapUserChoice, laptops) == null) System.out.println("NOT FOUND\n");
				else System.out.println(resultChoiceByCPUVendor(mapUserChoice, laptops) + "\n");
			}
			case 3: {
				System.out.println("Выберете цвет: ");
				for (Laptop item : laptops) System.out.println(item.getColor());
				userChoice = scanner1.nextLine();
				mapUserChoice.put("Color", userChoice);
				if (resultColor(mapUserChoice, laptops) == null) System.out.println("NOT FOUND\n");
				else System.out.println(resultColor(mapUserChoice, laptops) + "\n");
			}
			case 4: {
				System.out.println("Выберете операционную систему: ");
				for (Laptop item : laptops) System.out.println(item.getOperatingSystem());
				userChoice = scanner1.nextLine();
				mapUserChoice.put("OS", userChoice);
				if (resultOS(mapUserChoice, laptops) == null) System.out.println("NOT FOUND\n");
				else System.out.println(resultOS(mapUserChoice, laptops) + "\n");
			}
			case 5: {
				System.out.println("Выберете объем ОЗУ: ");
				for (Laptop item : laptops) System.out.println(item.getRandomAccessMemory());
				userChoice = scanner1.nextLine();
				mapUserChoice.put("RAM", userChoice);
				if (resultRAM(mapUserChoice, laptops) == null) System.out.println("NOT FOUND\n");
				else System.out.println(resultRAM(mapUserChoice, laptops) + "\n");
			}
			case 6: {
				System.out.println("Выберете объем HDD: ");
				for (Laptop item : laptops) System.out.println(item.getHddValue());
				userChoice = scanner1.nextLine();
				mapUserChoice.put("HDD", userChoice);
				if (resultHDD(mapUserChoice, laptops) == null) System.out.println("NOT FOUND\n");
				else System.out.println(resultHDD(mapUserChoice, laptops) + "\n");
			}
			case 0:
				break;
		}
		return mapUserChoice;
	}

	public static Laptop resultChoiceByVendor(Map<String, String> map, Set<Laptop> laptopSet) {
		Laptop temp = null;
		for (Laptop item : laptopSet) if (map.containsValue(item.getVendor())) temp = item;
		return temp;
	}

	public static Laptop resultChoiceByCPUVendor(Map<String, String> map, Set<Laptop> laptopSet) {
		Laptop temp = null;
		for (Laptop item : laptopSet) if (map.containsValue(item.getCpuVendor())) temp = item;
		return temp;
	}

	public static Laptop resultColor(Map<String, String> map, Set<Laptop> laptopSet) {
		Laptop temp = null;
		for (Laptop item : laptopSet) if (map.containsValue(item.getColor())) temp = item;
		return temp;
	}

	public static Laptop resultOS(Map<String, String> map, Set<Laptop> laptopSet) {
		Laptop temp = null;
		for (Laptop item : laptopSet)if (map.containsValue(item.getOperatingSystem())) temp = item;
		return temp;
	}

	public static Laptop resultRAM(Map<String, String> map, Set<Laptop> laptopSet) {
		Laptop temp = null;
		for (Laptop item : laptopSet) if (map.containsValue(item.getRandomAccessMemory())) temp = item;
		return temp;
	}

	public static Laptop resultHDD(Map<String, String> map, Set<Laptop> laptopSet) {
		Laptop temp = null;
		for (Laptop item : laptopSet) {	if (map.containsValue(item.getHddValue())) temp = item;	}
		return temp;
	}

	public Map<String, String> minPrice(){
		Map<String, String> price = new HashMap<>();
		System.out.println("Введите минимальную цену:\n");
		Scanner userIn = new Scanner(System.in);
		String a = userIn.nextLine();
		price.put("Минимальная цена:", a);
		return price;
	}

}
//Сделать отрицательный результат проверки!



