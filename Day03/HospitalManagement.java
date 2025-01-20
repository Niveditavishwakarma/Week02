public class VehicleManagement
{
	public static void main(String[] args) {
        Patient patient1 = new Patient("Alice Smith", 30, "Flu", "P001");
        Patient patient2 = new Patient("Bob Johnson", 45, "Cold", "P002");

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        System.out.println("Total Patients Admitted in hospital: " + Patient.getTotalPatients());
    }
}

class Patient {
   
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final String patientID;
	
    String name;
    int age;
    String ailment;

    // Constructor
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
	
    public static int getTotalPatients() {
        return totalPatients;
    }
	
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
			System.out.println();
        }
    }
}

