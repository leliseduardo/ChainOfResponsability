package chainOfResponsability;
import java.util.ArrayList;

public abstract class Employee {

    protected ArrayList serviceList = new ArrayList();
    private Employee nextEmployee;

    public Employee getNextEmployee() {
        return nextEmployee;
    }

    public void setNextEmployee(Employee nextEmployee) {
        this.nextEmployee = nextEmployee;
    }

    public abstract String getJobDescription();

    public String performService(Service service) {

        if (serviceList.contains(service.getServiceType())) {
            return getJobDescription();
        } else {
            if (nextEmployee != null) {
                return nextEmployee.performService(service);
            } else {
                return "No service was performed";
            }
        }
    }
}

