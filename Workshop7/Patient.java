package Workshop7;
public class Patient extends Person {
    private String patientID;

   
    public void bookAppointment() {
        System.out.println("Booking an appointment for patient: " + name);
    }
}
