package PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.services;

import PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.models.Physician;
import PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.repositories.PhysicianRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PhysicianServiceImpl implements PhysicianService {

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

    private void initPhysicians() {
        List<Physician> physicians = new ArrayList<>();
        physicians.add(new Physician("Joao Bugalho","jbugalho","adoromedicina", LocalDate.of(1985, 6,22),"Rua das Bolachas 24","joao.bugalho@gmail.com","912345678","Lumiar","12345","Cardiologia"));
        physicians.add(new Physician("Rita Cristina Silva","rcsilva","1mais1iguala2", LocalDate.of(1992, 3,12),"Avenida Fontes Pereira de Melo 2","rita.tina@hotmail.com","912222678","Lisboa","32145","Pediatria"));
        physicians.add(new Physician("Crespo Luis Chuva","clchuva","umdiadecadavez123", LocalDate.of(1968, 12,2),"Rua Augusto Gil","Crespo.Chuva@hotmail.com","912355618","Porto","12435","Clinica Geral"));

    }
}
