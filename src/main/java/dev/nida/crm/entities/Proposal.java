package dev.nida.crm.entities;

import jakarta.persistence.*;

/**
 * @author Nida Başer
 * July 2024
 */

@Entity
@Table(name = "proposals")
public class Proposal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
