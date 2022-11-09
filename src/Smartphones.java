public class Smartphones {
    private String cameraModel;
    private Integer year;
    private Integer battery;
    private String manufacturer;
    private Integer versionAndroid;

    public String getManufacturer() {
        return manufacturer;
    }

    public Integer getVersionAndroid() {
        return versionAndroid;
    }

    public Smartphones(String cameraModel, Integer year, Integer battery, String manufacturer, Integer versionAndroid) {
        this.cameraModel = cameraModel;
        this.year = year;
        this.battery = battery;
        this.manufacturer = manufacturer;
        this.versionAndroid = versionAndroid;
    }

    public String getCameraModel() {
        return cameraModel;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getBattery() {
        return battery;
    }
}
