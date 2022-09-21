package PT.ISCTE.UPSkill.grupoC.CentroHospitalarUPSkill.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Employee {

    private String nomeCompleto;
    private String username;
    private String password;
    private LocalDate dataNascimento;
    private String morada;
    private String email;
    private String telemovel;
    private String localidade;
    @Id
    @GeneratedValue
    private long id;

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getMorada() {
        return morada;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public String getLocalidade() {
        return localidade;
    }

    public long getId() {
        return id;
    }
}
