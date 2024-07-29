package chainOfResponsability;

public class ReceptionistEmployee extends Employee {

    public ReceptionistEmployee(Employee next) {
        serviceList.add(RecordServiceType.getRecordServiceType());
        setNextEmployee(next);
    }

    public String getJobDescription() {
        return "Receptionist";
    }
}
