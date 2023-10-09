package com.backend.desafio01.model.entities;

import com.backend.desafio01.model.constants.TypePersonEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private int id;
    @Column(length = 100)
    private String email;

    @Column(length = 100)
    private String name;

    @Column(length = 20, name = "cpf_cnpj")
    private String cpfCnpj;

    @Enumerated(EnumType.STRING)
    private TypePersonEnum typePerson;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public TypePersonEnum getTypePerson() {
        return typePerson;
    }

    public String getTypePersonDesc(){
        if (typePerson.equals("F")){
            return "Física";
        }else{
            return "Jurídica";
        }
    }

    public void setTypePerson(TypePersonEnum typePerson) {
        this.typePerson = typePerson;
    }
}
