package Workshop7;

public class Main {
    public static void main(String[] args) {
        // Create patients
        Patient patient1 = new Patient();
        patient1.personID = "P010";
        patient1.name = "Manish";
        patient1.age = 20;
        patient1.gender = "Male";
        patient1.address = "balaju";
        patient1.contactDetails = "16";
        patient1.bookAppointment();

        // Create doctors
        Doctor doctor1 = new Doctor();
        doctor1.personID = "D001";
        doctor1.name = "Dr. Jane Smith";
        doctor1.age = 45;
        doctor1.gender = "Female";
        doctor1.address = "45 Maple Drive";
        doctor1.contactDetails = "987-654-3210";
        doctor1.department = "Cardiology";

        // Create an appointment
        Appointment appointment1 = new Appointment();
        appointment1.appointmentID = "A001";
        appointment1.appointmentDate = "2025-01-10";
        appointment1.appointmentTime = "10:00 AM";
        appointment1.viewAppointmentDetails();

        // Doctor prescribes treatment
        Treatment treatment1 = new Treatment();
        treatment1.treatmentID = "T001";
        treatment1.type = "Medication";
        treatment1.description = "Blood pressure control medication";
        treatment1.viewTreatmentDetails();

        System.out.println("\nHospital System Demo:");
        patient1.viewPersonalDetails();
        doctor1.viewPersonalDetails();
        doctor1.prescribeTreatment();
        treatment1.updateDescription("Updated: Blood pressure medication with new dosage.");
    }
}
