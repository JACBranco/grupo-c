package PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.services;

import PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.models.Physician;

import java.util.List;

public class PhysicianServiceImpl implements PhysicianService{


    @Override
    public List<Physician> getPhysicians() {
        return physicianRepository.findAll();
    }

    @Override
    public List<Physician> getByEspecialidade(String especialidade) {
        return null;
    }
}
