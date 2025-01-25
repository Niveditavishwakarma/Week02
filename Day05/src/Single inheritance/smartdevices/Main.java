package smartdevices;

public class Main {
    public static void main(String args[])
    {
        Thermostat thermostat = new Thermostat("TH-101","Active",22.5);
        System.out.println("Smart home Device status:") ;
        System.out.println("--------------------");
        thermostat.displayStatus();
    }
}
