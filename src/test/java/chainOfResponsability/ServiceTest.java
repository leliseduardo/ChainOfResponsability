package chainOfResponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
    ReceptionistEmployee receptionist;
    NurseEmployee nurse;
    ResidentDoctorEmployee residentDoctor;
    DoctorEmployee doctor;

    @BeforeEach
    void setUp() {
        doctor = new DoctorEmployee(null);
        residentDoctor = new ResidentDoctorEmployee(doctor);
        nurse = new NurseEmployee(residentDoctor);
        receptionist = new ReceptionistEmployee(nurse);
    }

    @Test
    void shouldReturnReceptionistService() {
        assertEquals("Receptionist", receptionist.performService(new Service(RecordServiceType.getRecordServiceType())));
    }

    @Test
    void shouldReturnNurseService() {
        assertEquals("Nurse", receptionist.performService(new Service(TriageServiceType.getTriageServiceType())));
    }

    @Test
    void shouldReturnResidentDoctorService() {
        assertEquals("Resident Doctor", receptionist.performService(new Service(FollowUpServiceType.getFollowUpServiceType())));
    }

    @Test
    void shouldReturnDoctorService() {
        assertEquals("Doctor", receptionist.performService(new Service(MedicalServiceType.getMedicalServiceType())));
    }
}
