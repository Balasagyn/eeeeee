public class Samsung extends Smartphones implements Printable {
    private String model, screen;
    private Integer versionGalaxy;

    public Samsung(String cameraModel, Integer year, Integer battery, String manufacturer, Integer versionAndroid, String model, Integer versionGalaxy, String screen) {
        super(cameraModel, year, battery, manufacturer, versionAndroid);
        this.model = model;
        this.versionGalaxy = versionGalaxy;
        this.screen = screen;
    }

    @Override
    public void print() {
        System.out.println(
                "Производитель " + getManufacturer() +
                        "\nМодель " + model +
                        "\nЭкран " + screen +
                        "\nВерсия Galaxy " + versionGalaxy +
                        "\nГод выпуска " + getYear() +
                        "\nБатарея " + getBattery() +
                        "\nКамера " + getCameraModel());
    }
}
