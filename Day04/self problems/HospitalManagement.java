import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");

        Patient patientAlice = new Patient("Alice");
        Patient patientBob = new Patient("Bob");

        // Add Doctors and Patients to Hospital
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(patientAlice);
        hospital.addPatient(patientBob);

        // Show Consultations
        System.out.println("Consultations at " + hospital.getName() + ":");
        drSmith.consult(patientAlice);
        drSmith.consult(patientBob);
        drJones.consult(patientAlice);

        // Display List of Doctors and Patients in the Hospital
        System.out.println("Doctors in " + hospital.getName() + ":");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println("- Dr. " + doctor.getName());
        }

        System.out.println("Patients in " + hospital.getName() + ":");
        for (Patient patient : hospital.getPatients()) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Patient Class
class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Doctor Class
class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Consult Method 
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName() + ".");
    }
}

// Hospital Class
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public String getName() {
        return name;
    }
}

