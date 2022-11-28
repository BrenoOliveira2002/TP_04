/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao;

/**
 *
 * @author breno
 */
public class Funcionario {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the cod_cargo
     */
    public int getCod_cargo() {
        return cod_cargo;
    }

    /**
     * @param cod_cargo the cod_cargo to set
     */
    public void setCod_cargo(int cod_cargo) {
        this.cod_cargo = cod_cargo;
    }
    
    private int id;
    private String nome;
    private double salario;
    private int cod_cargo;
}
