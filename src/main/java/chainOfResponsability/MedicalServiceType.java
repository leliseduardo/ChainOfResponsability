package chainOfResponsability;

public class MedicalServiceType implements ServiceType {
    private static MedicalServiceType medicalServiceType = new MedicalServiceType();

    private MedicalServiceType() {}

    public static MedicalServiceType getMedicalServiceType() {
        return medicalServiceType;
    }
}

