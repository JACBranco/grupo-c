package PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.services;

import PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.models.Physician;

import java.util.ArrayList;
import java.util.List;

public interface PhysicianService {

    List<Physician> getPhysicians();

    List<Physician> getByEspecialidade(String especialidade);

}
