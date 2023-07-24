package com.example.optimizations.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class Wire {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column
  private String ltg;
  @Column
  private String changeNumber;
  @Column
  private Integer oldLength;
  @Column
  private Integer currentLength;
  @Column
  private Integer newLength;
  @Column
  private String oldZuschnitt;
  @Column
  private String newZuschnitt;
}
