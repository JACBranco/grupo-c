package PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.models;

import javax.persistence.Entity;

@Entity
public class Physician extends Employee {

    public Physician() {
    }

    private String cedulaProfissional;
    private String especialidade;

}