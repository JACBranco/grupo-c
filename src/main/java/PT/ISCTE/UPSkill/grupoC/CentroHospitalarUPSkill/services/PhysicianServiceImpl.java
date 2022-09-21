package PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.services;

import PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.models.Physician;
import PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.repositories.PhysicianRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PhysicianServiceImpl implements PhysicianService{

    @Autowired
    PhysicianRepository physicianRepository;

    @Override
    public List<Physician> getPhysicians() {
        return physicianRepository.findAll();
    }

    @Override
    public List<Physician> getByEspecialidade(String especialidade) {
        return null;
    }
}
