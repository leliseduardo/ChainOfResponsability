package chainOfResponsability;

public class Service {

    private ServiceType serviceType;

    public Service(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
