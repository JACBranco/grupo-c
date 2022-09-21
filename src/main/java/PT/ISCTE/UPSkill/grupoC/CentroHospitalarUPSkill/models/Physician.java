package PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.models;

import javax.persistence.Entity;

@Entity
public class Physician extends Employee {

    private String cedulaProfissional;
    private String especialidade;

}
