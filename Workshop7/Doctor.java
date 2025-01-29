package Workshop7;

public class Doctor extends Person {
    private String doctorID;
    String department;

    public void seePatientDetails() {
        System.out.println("Viewing patient details...");
    }

  
    public void prescribeTreatment() {
        System.out.println("Prescribing treatment...");
    }
}
