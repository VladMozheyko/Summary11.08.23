/*
Задача
Сделать класс для вывода данных в финтес клубе.
1) Для одного экрана данные только по имени и весу
2) Для другого данные по балансу финансов, возрасту и имени
Для третьего все данные по объекту
 */
public class Human {
    // Поля класса - свойства сущности
    private String name;
    private double weight;
    private double balance;
    private int age;

    // Полиморфизм объектов
    /**
     *Пустой конструктор, если конструкторы не указаны, то будет по умолчанию вызваться он
     */
    public Human() {
    }
    /**
     * Конструктор для первой задачи
     * @param name имя
     * @param weight вес
     */
    public Human(String name, double weight) {     // Создаем объект для тренера
        this.name = name;
        this.weight = weight;
        // Инкапсуляция(погружение) проверки в класс позволяет избежать проверок в точке создания объекта(дублирования кода), потому что проверка будет в самом объекте
        if(weight < 0){          // Инкапсулируем проверку на корректность ввода веса
            System.out.println("Вес не может быть меньше нуля!");  // Выводим сообщение об ошибке
            this.weight = 0;    // Делаем вес равным нулю
        }
        System.out.println("Имя: " + this.name + " Вес:" + this.weight);   // Трассировка
    }
    /**
     * Конструктор для второй задачи
     * @param name имя
     * @param balance финансовый баланс
     * @param age возраст
     */
    public Human(String name, double balance, int age) {  // Создаем объект для бухгалтера
        this.name = name;
        this.balance = balance;
        this.age = age;
        System.out.println("Имя: " + this.name + " Баланс: " + this.balance + " Возраст: " + this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
