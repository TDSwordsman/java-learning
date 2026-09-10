public class WrapperClasses {

    public static void main(String[] args) {
        System.out.println("=== НАЧАЛО ДЕМОНСТРАЦИИ КЛАССОВ-ОБЁРТОК ===\n");

        demonstrateAutoboxingAndUnboxing();
        System.out.println("\n-------------------------------------------\n");

        demonstrateIntegerCache();
        System.out.println("\n-------------------------------------------\n");

        demonstrateUtilityMethods();

        System.out.println("\n=== ДЕМОНСТРАЦИЯ УСПЕШНО ЗАВЕРШЕНА ===");
    }

    private static void demonstrateAutoboxingAndUnboxing() {
        System.out.println("1. Автоупаковка и автораспаковка:");

        // Автоупаковка: примитив int автоматически превращается в объект Integer
        Integer primitiveToWrapper = 42;
        System.out.println("Автоупакованный Integer: " + primitiveToWrapper);

        // Автораспаковка: объект Integer автоматически превращается в примитив int
        int wrapperToPrimitive = primitiveToWrapper;
        System.out.println("Автораспакованный int: " + wrapperToPrimitive);

        // ВАЖНО: Опасность NullPointerException при распаковке null
        Integer nullableInteger = null;
        System.out.println("Попытка распаковать null объект в примитив...");
        try {
            // Вызываем распаковку напрямую. Java попытается сделать .intValue() у null, что приведет к ошибке
            nullableInteger.toString();
        } catch (NullPointerException e) {
            System.out.println("⚠ Перехвачена ошибка: Нельзя работать с null объектом как с примитивом!");
        }
    }

    private static void demonstrateIntegerCache() {
        System.out.println("2. Кэширование Integer (диапазон от -128 до 127):");

        // Числа входят в диапазон кэша (-128...127). Ссылаются на один объект в памяти.
        Integer cachedFirst = 100;
        Integer cachedSecond = 100;
        System.out.println("Сравнение через '==' для 100: " + (cachedFirst == cachedSecond)); // true

        // Числа НЕ входят в диапазон кэша. Создаются два абсолютно разных объекта.
        Integer nonCachedFirst = 200;
        Integer nonCachedSecond = 200;
        System.out.println("Сравнение через '==' для 200: " + (nonCachedFirst == nonCachedSecond)); // false

        // Правильный способ сравнения объектов-обёрток всегда через .equals()
        System.out.println("Правильное сравнение через '.equals()' для 200: " + nonCachedFirst.equals(nonCachedSecond)); // true
    }

    private static void demonstrateUtilityMethods() {
        System.out.println("3. Полезные встроенные методы:");

        // Парсинг строки в число
        String numberString = "2026";
        int parsedInt = Integer.parseInt(numberString);
        System.out.println("Успешно распарсенная строка в int: " + parsedInt);

        // Использование констант для поиска границ типов данных
        System.out.println("Минимальное значение Byte: " + Byte.MIN_VALUE);
        System.out.println("Максимальное значение Integer: " + Integer.MAX_VALUE);

        // Безопасное сравнение двух примитивов без создания объектов
        int compareResult = Double.compare(10.5, 20.5);
        System.out.println("Результат сравнения 10.5 и 20.5 (метод Double.compare): " + compareResult); // -1 (так как первое меньше второго)
    }
}
