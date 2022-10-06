/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author USER EAT
 */
@Entity
@Table(name = "message")

public class Message {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer idMessage;
     private String messageText;

    @ManyToOne
    @JoinColumn(name = "toolId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Tool tool;
     
    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;

    public Integer getIdMessage() {
        return idMessage;
    }}