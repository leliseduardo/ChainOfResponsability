package chainOfResponsability;

public class ResidentDoctorEmployee extends Employee {

    public ResidentDoctorEmployee(Employee next) {
        serviceList.add(FollowUpServiceType.getFollowUpServiceType());
        setNextEmployee(next);
    }

    public String getJobDescription() {
        return "Resident Doctor";
    }
}

