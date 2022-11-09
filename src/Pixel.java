public class Pixel extends Smartphones implements Printable {

    public Pixel (String cameraModel, Integer year, Integer battery, String manufacturer, Integer versionAndroid) {
        super(cameraModel, year, battery, manufacturer, versionAndroid);
    }

    @Override
    public void print() {
        System.out.println(
                "������������� " + getManufacturer() +
                        "\nAndroid " + getVersionAndroid() +
                        "\n��� ������� " + getYear() +
                        "\n������� " + getBattery() +
                        "\n������ " + getCameraModel()
        );
    }
}
