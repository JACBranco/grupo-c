package PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.models;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Physician extends Employee {

    private String cedulaProfissional;
    private String especialidade;

    public Physician() {
    }

    public Physician(String nomeCompleto, String username, String password, LocalDate dataNascimento, String morada, String email, String telemovel, String localidade, String cedulaProfissional, String especialidade){
        super(nomeCompleto, username, password, dataNascimento, morada, email, telemovel, localidade);
        this.cedulaProfissional=cedulaProfissional;
        this.especialidade=especialidade;
    }


}