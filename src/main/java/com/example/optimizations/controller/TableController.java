package com.example.optimizations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.optimizations.repository.TableRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TableController {

  private final TableRepository repository;

  @GetMapping("/table")
  public String getTable(Model model) {
    model.addAttribute("wires", repository.findAll());
    return "table";
  }
}
