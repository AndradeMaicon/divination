package br.com.thymeleafexemple.layout.model;

import java.util.ArrayList;
import java.util.List;

public class Divination {
  
  private List<String> responses;
  
  public Divination() {
  }

  public void setResponses() {
    this.responses = new ArrayList<String>();

    this.responses.add("Concetre-se! " + "É preciso confiança para perguntar");
    this.responses.add("Com certeza, " + "Boas surpresas estão reservadas para você");
    this.responses.add("Continue trabalhando duro e as portas irão se abrir");
  }

  public List<String> getResponses() {
    return responses;
  }

}
