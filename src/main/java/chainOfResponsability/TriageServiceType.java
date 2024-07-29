package chainOfResponsability;

public class TriageServiceType implements ServiceType {
    private static TriageServiceType triageServiceType = new TriageServiceType();

    private TriageServiceType() {}

    public static TriageServiceType getTriageServiceType() {
        return triageServiceType;
    }
}