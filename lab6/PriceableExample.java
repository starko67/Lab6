package lab6;
// Интерфейс для объектов с ценой
interface Priceable {
    double getPrice();
}

// Пример класса, реализующего интерфейс Priceable
class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

// Другой пример класса с ценой
class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;

    public Service(String serviceName, double hourlyRate) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate;
    }

    @Override
    public String toString() {
        return serviceName + " per hour";
    }
}

public class PriceableExample {
    public static void main(String[] args) {
        // Создаем объекты с ценами
        Product product = new Product("Laptop", 1200.0);
        Service service = new Service("Plumbing", 50.0);

        // Вызываем метод getPrice() для каждого объекта
        double productPrice = product.getPrice();
        double servicePrice = service.getPrice();

        // Выводим цены на экран
        System.out.println("Product: " + product + " - Price: $" + productPrice);
        System.out.println("Service: " + service + " - Price: $" + servicePrice);
    }
}
