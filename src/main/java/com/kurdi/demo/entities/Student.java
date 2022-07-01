package com.kurdi.demo.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
}
