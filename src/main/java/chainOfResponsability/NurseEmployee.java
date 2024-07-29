package chainOfResponsability;

public class NurseEmployee extends Employee {

    public NurseEmployee(Employee next) {
        serviceList.add(TriageServiceType.getTriageServiceType());
        setNextEmployee(next);
    }

    public String getJobDescription() {
        return "Nurse";
    }
}

