# Заметки по Java: Exceptions (часть 1)

Разбор базовой обработки ошибок на примере `FileNotFoundException` (из лекций Алишева).

Если файла нет, Java кидает `FileNotFoundException`. Есть два пути решения:

### 1. Бросить throws в сигнатуру метода
Просто делегируем ошибку наверх. Если ее никто не обработает, программа упадет с красным стэктрейсом в консоли. Для пользователя это выглядит пугающе.
```java
public void read() throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("test.txt"));
}
```

### 2. Обернуть в try-catch
Перехватываем ошибку на месте. Программа не падает, а продолжает нормально выполняться дальше. Внутри catch можно вывести нормальный текст для человека вместо системной ошибки.
```java
try {
    Scanner scanner = new Scanner(new File("test.txt"));
} catch (FileNotFoundException e) {
    System.out.println("Файл не найден, проверьте путь");
}
System.out.println("Код после блока тоже выполнится");
```
