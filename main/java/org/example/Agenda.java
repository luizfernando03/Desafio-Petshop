package org.example;

import org.example.servicos.Servico;

import java.util.Date;

public class Agenda {
    private Animal animal;
    private Servico servico;
    private Date data;
    private String horario;

    //Construtor


    public Agenda(Animal animal, Servico servico, Date data, String horario) {
        this.animal = animal;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }

    //Getters e Setters

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
