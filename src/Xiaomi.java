public class Xiaomi extends Smartphones implements Printable {
    private String model;
    private Integer versionMI;

    public Xiaomi(String cameraModel, Integer year, Integer battery, String manufacturer, Integer versionAndroid, String model, Integer versionMI) {
        super(cameraModel, year, battery, manufacturer, versionAndroid);
        this.model = model;
        this.versionMI = versionMI;
    }


    @Override
    public void print() {

        System.out.println(
                "Производитель " + getManufacturer() +
                        "\nМодель " + model +
                        "\nВерсия MI " + versionMI +
                        "\nГод выпуска " + getYear() +
                        "\nБатарея " + getBattery() +
                        "\nКамера " + getCameraModel()
        );
    }
}


