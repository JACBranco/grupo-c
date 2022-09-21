package PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.repositories;

import PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.models.Physician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhysicianRepository extends JpaRepository<Physician, String> {

    List<Physician> findPhysiciansByEspecialidade(String especialidade);

}
