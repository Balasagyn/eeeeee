public class Main {
    public static void main(String[] args) {
        createObject("Pixel");
        createObject("Xiaomi");
        createObject("Samsung");
    }

    static Smartphones createObject(String className) {

        switch (className) {
            case "Pixel" -> {
                Pixel pixel = new Pixel("Не указан", 2022, 100, "Google", 11);
                pixel.print();
                return pixel;
            }
            case ("Xiaomi") -> {
                Xiaomi xiaomi = new Xiaomi("Sony", 2022, 100, "Xiaomi", 12, "Note 10", 11);
                xiaomi.print();
                return xiaomi;
            }
            case ("Samsung") -> {
                Samsung samsung = new Samsung("Sony", 2022, 100, "Samsung", 12, "S 21", 9,"Amoled");
                samsung.print();
                return samsung;
            }
        }
        return null;
    }

}
