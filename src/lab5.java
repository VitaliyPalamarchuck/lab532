public class lab5 {
    public static void main(String[] args) {
        int count = 0; //лічильник для к-сті однакових комбінацій
        for (int hours = 3; hours < 24; hours++) { //задайте потрібну вам к-сть годин
            for (int minutes = 30; minutes < 60; minutes++) { //задайте потрібну вам к-сть хвилин
                // Перевірка, чи поточний час є симетричним
                if (hours / 10 == minutes % 10 && hours % 10 == minutes / 10) {
                    // Вивід симетричної комбінації
                    System.out.printf("Симетрична комбінація: %02d:%02d\n", hours, minutes);
                    count++;
                }
            }
        }
        // Вивід загальної кількості симетричних комбінацій
        System.out.println("Загальна кількість симетричних комбінацій: " + count);
    }
}

