package org.example;

import org.example.servicos.Banho;
import org.example.servicos.ConsultaVeterinaria;
import org.example.servicos.Servico;
import org.example.servicos.Tosa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

    private  static Date parseData(String daString){
        //Implementação do método para fazer o parse da data para obter a data de nascimento dos animais.
        return null;
    }

    private static Animal criarCachorro(String nome, String raca, String dataNascimento, String proprietario){
        // Implementação para criar um cachorro
        return null;
    }
    private static Animal criarGato(String nome, String raca, String dataNascimento, String proprietario){
        return null;
    }

    private static Agenda criarAgenda(Animal animal, Servico servico, String data, String horario) {
        // Implementação para criar uma agenda
        return null;
    }

    private static void venderProduto(Produto produto, int quantidade) {
        // Implementação para vender um produto
    }

    private static void imprimirAgendamentos(List<Agenda> agendamentos) {
        // Implementação para imprimir agendamentos
    }

    public static void main(String[] args) {

        // Criar alguns animais
        Animal cachorro = criarCachorro("Bolinha", "Viralata", "2020-11-05", "Luiz");
        Animal gato = criarGato("Leão", "viralata", "2019-10-20", "Letycia");

        // Criando alguns produtos
        Produto produto1 = new Produto("Ração", "Alimento", 100.0, 20);
        Produto produto2 = new Produto("Mordedor", "Brinquedo", 5.0, 30);

        // Criar alguns serviços
        Servico banho = new Banho();
        Servico tosa = new Tosa();
        Servico consulta = new ConsultaVeterinaria();

        // Criar uma agenda
        Agenda agenda1 = criarAgenda(cachorro, banho, "2023-10-15", "10:00");
        Agenda agenda2 = criarAgenda(gato, tosa, "2023-10-18", "15:30");

        // Lista para armazenar produtos
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);

        // Vender um produto
        venderProduto(produtos.get(0), 15);

        // Imprimir informações
        imprimirAgendamentos(Arrays.asList(agenda1, agenda2));

    }
}