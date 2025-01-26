package hospitalpatientmanagement;
import java.util.*;
class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;
    private List<String> medicalRecords;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for Out-Patient " + getName() + ": " + medicalRecords);
    }
}

