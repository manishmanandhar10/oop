package Workshop7;


public class Treatment {
    String treatmentID;
    String type;
    String description;

    /**
     * Updates the description of the treatment.
     */
    public void updateDescription(String newDescription) {
        this.description = newDescription;
        System.out.println("Updated treatment description.");
    }

    /**
     * Displays treatment details.
     */
    public void viewTreatmentDetails() {
        System.out.println("Treatment ID: " + treatmentID + ", Type: " + type + ", Description: " + description);
    }
}
