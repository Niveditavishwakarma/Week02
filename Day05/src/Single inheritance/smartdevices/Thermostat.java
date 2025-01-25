package smartdevices;

public class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting)
    {
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting );
    }
    public double getTemperatureSetting(){
        return temperatureSetting;
    }
}
