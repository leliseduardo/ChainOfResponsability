package chainOfResponsability;

public class DoctorEmployee extends Employee {

    public DoctorEmployee(Employee next) {
        serviceList.add(MedicalServiceType.getMedicalServiceType());
        setNextEmployee(next);
    }

    public String getJobDescription() {
        return "Doctor";
    }
}

