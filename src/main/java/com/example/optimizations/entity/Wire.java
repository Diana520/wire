package com.example.optimizations.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Data
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
