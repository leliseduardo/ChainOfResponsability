package chainOfResponsability;

public class RecordServiceType implements ServiceType {
    private static RecordServiceType recordServiceType = new RecordServiceType();

    private RecordServiceType() {}

    public static RecordServiceType getRecordServiceType() {
        return recordServiceType;
    }
}

