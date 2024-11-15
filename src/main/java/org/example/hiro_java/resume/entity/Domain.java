package org.example.hiro_java.resume.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Domain {
    @Id @GeneratedValue
    @Column(name = "domain_id")
    private Long id;

    @JoinColumn(name = "resume_id")
    @ManyToOne
    private Resume resume;

    private String name;
}