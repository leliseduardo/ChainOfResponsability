package chainOfResponsability;

public class FollowUpServiceType implements ServiceType {
    private static FollowUpServiceType followUpServiceType = new FollowUpServiceType();

    private FollowUpServiceType() {}

    public static FollowUpServiceType getFollowUpServiceType() {
        return followUpServiceType;
    }
}
