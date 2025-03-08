package com.jitto.harbor_management.repositorys;

import com.jitto.harbor_management.models.MechanicAppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicAppointmentRepository extends JpaRepository<MechanicAppointmentModel, Integer> {
    MechanicAppointmentModel findByBoatNumber(String BoatNumber);
}
