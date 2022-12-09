import java.util.*;

public class Seminar {
	public static void main(String[] args) {

		//Задание 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
		Laptop laptop1 = new Laptop("Xiaomi", "Intel", "Black", "Windows 11", 8,
				500, 24000.0f);
		Laptop laptop2 = new Laptop("Apple", "Apple", "White", "MacOS", 16,
				1000, 36000.0f);
		Laptop laptop3 = new Laptop("Samsung", "AMD", "Blue", "Windows 10", 32,
				250, 18000.0f);
		Laptop laptop4 = new Laptop("Samsung", "Apple", "Green", "Linux", 64, 5000, 54000.0f);

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
				System.out.println("Выберете производителя из списка: ");
				for (Laptop item : laptops) System.out.println(item.getVendor());
				userChoice = scanner1.nextLine();
				mapUserChoice.put("Vendor", userChoice);
				resultChoiceByVendor(mapUserChoice, laptops);
			}
			case 2: {
				System.out.println("Выберете производителя CPU из списка: ");
				for (Laptop item : laptops) System.out.println(item.getCpuVendor());
				System.out.println();
				userChoice = scanner1.nextLine();
				mapUserChoice.put("CPU", userChoice);
				resultChoiceByCPUVendor(mapUserChoice, laptops);//Остановился на добавлении результата поиска
			}
			case 3: {
				System.out.println("Цвет");
				System.out.println("Выберете цвет: ");
				for (Laptop item : laptops) System.out.println(item.getColor());
				System.out.println();
				userChoice = scanner1.nextLine();
				mapUserChoice.put("Color", userChoice);
				resultColor(mapUserChoice, laptops);
			}
			case 4: {
				System.out.println("Выберете операционную систему: ");
				for (Laptop item : laptops) System.out.println(item.getOperatingSystem());
				System.out.println();
				userChoice = scanner1.nextLine();
				mapUserChoice.put("OS", userChoice);
				resultOS(mapUserChoice, laptops);
			}
			case 5: {
				System.out.println("Выберете объем ОЗУ: ");
				for (Laptop item : laptops) System.out.println(item.getRandomAccessMemory());
				System.out.println();
				userChoice = scanner1.nextLine();
				mapUserChoice.put("RAM", userChoice);
				resultRAM(mapUserChoice, laptops);
			}
			case 6: {
				System.out.println("Выберете объем HDD: ");
				for (Laptop item : laptops) System.out.println(item.getHddValue());
				System.out.println();
				userChoice = scanner1.nextLine();
				mapUserChoice.put("HDD", userChoice);
				resultHDD(mapUserChoice, laptops);
			}
			case 0:
				break;
		}
		return mapUserChoice;
	}

	public static void resultChoiceByVendor(Map<String, String> map, Set<Laptop> laptopSet) {
		for (Laptop item : laptopSet) {
			if (map.containsValue(item.getVendor())) {
				System.out.println(item);
			}
		}
		System.out.println();
	}

	public static void resultChoiceByCPUVendor(Map<String, String> map, Set<Laptop> laptopSet) {
		for (Laptop item : laptopSet) {
			if (map.containsValue(item.getCpuVendor())) {
				System.out.println(item);
			}
		}
		System.out.println();
	}

	public static void resultColor(Map<String, String> map, Set<Laptop> laptopSet) {
		for (Laptop item : laptopSet) {
			if (map.containsValue(item.getColor())) {
				System.out.println(item);
			}
		}
		System.out.println();
	}

	public static void resultOS(Map<String, String> map, Set<Laptop> laptopSet) {
		for (Laptop item : laptopSet) {
			if (map.containsValue(item.getOperatingSystem())) {
				System.out.println(item);
			}
		}
		System.out.println();
	}

	public static void resultRAM(Map<String, String> map, Set<Laptop> laptopSet) {
		for (Laptop item : laptopSet) {
			if (map.containsValue(item.getRandomAccessMemory())) {
				System.out.println(item);
			}
		}
		System.out.println();
	}

	public static void resultHDD(Map<String, String> map, Set<Laptop> laptopSet) {
		for (Laptop item : laptopSet) {
			if (map.containsValue(item.getHddValue())) {
				System.out.println(item);
			}
		}
		System.out.println();
	}
}
//Сделать отрицательный результат проверки!



