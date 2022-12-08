import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Seminar {
	public static void main(String[] args) {

		//Задание 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
		Laptop laptop1 = new Laptop("Xiaomi", "Intel", "Black", "Windows 11", 8,
				500, 24000.0f);
		Laptop laptop2 = new Laptop("Apple", "Apple", "White", "MacOS", 16,
				1000, 36000.0f);
		Laptop laptop3 = new Laptop("Samsung", "AMD", "Blue", "Windows 10", 32,
				250, 18000.0f);

		//Задание 2. Создать множество ноутбуков.
		Set<Laptop> notebooks = new HashSet<>();
		notebooks.add(laptop1);
		notebooks.add(laptop2);
		notebooks.add(laptop3);
		for(Laptop item: notebooks)	System.out.println(item.getVendor() + "\t" + item.getHddValue());
		System.out.println();

		//Задание 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
		// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
		// Введите цифру, соответствующую необходимому критерию:
		//1 - ОЗУ
		//2 - Объем ЖД
		//3 - Операционная система
		//4 - Цвет …

		System.out.println("Введите цифру критерий отбора: \n " +
				"\t1. Производитель.\n " +
				"\t2. Производитель CPU.\n" +
				"\t3. Цвет корпуса.\n" +
				"\t4. Операционная система.\n" +
				"\t5. Размер ОЗУ (ГБ).\n" +
				"\t6. Размер HDD (ГБ).\n" +
				"\t0. Exit");

		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		switch (userInput) {
			case 1: {
				System.out.println("Производитель");
				break;
			}
			case 2: {
				System.out.println("Производитель CPU");
				break;
			}
			case 3: {
				System.out.println("Цвет");
				break;
			}
			case 4: {
				System.out.println("ОС");
				break;
			}
			case 5: {
				System.out.println("ОЗУ");
				break;
			}
			case 6: {
				System.out.println("HDD");
				break;
			}
			case 0:
				break;
		}
	}
}

