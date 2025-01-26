package hospitalpatientmanagement;
import java.util.*;
public class Main {
    public static void processPatients(List<Patient> patients) {
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                medicalRecord.viewRecords();
            }

            System.out.println("---------------------------------------");
        }
    }

    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient(1, "Alice", 30, 2000.0, 5);
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("Post-surgery recovery");

        OutPatient outPatient = new OutPatient(2, "Bob", 45, 500.0);
        outPatient.addRecord("Routine check-up");

        patients.add(inPatient);
        patients.add(outPatient);

        System.out.println("Hospital Patient Management System");
        processPatients(patients);
    }
}

