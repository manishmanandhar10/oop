package Workshop7;

public class Appointment {
String appointmentID;
String appointmentDate;
String appointmentTime;

/**
 * Reschedules the appointment.
 */
public void rescheduleAppointment() {
    System.out.println("Rescheduling appointment...");
}

/**
 * Cancels the appointment.
 */
public void cancelAppointment() {
    System.out.println("Cancelling appointment...");
}

/**
 * Displays appointment details.
 */
public void viewAppointmentDetails() {
    System.out.println("Appointment ID: " + appointmentID + ", Date: " + appointmentDate);
}
}
