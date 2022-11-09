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
                "������������� " + getManufacturer() +
                        "\n������ " + model +
                        "\n����� " + screen +
                        "\n������ Galaxy " + versionGalaxy +
                        "\n��� ������� " + getYear() +
                        "\n������� " + getBattery() +
                        "\n������ " + getCameraModel());
    }
}
