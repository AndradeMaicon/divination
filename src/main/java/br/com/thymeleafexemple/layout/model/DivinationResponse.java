package br.com.thymeleafexemple.layout.model;

public class DivinationResponse {
  private String response;
  private String question;

  public DivinationResponse(String response, String question) {
    this.response = response;
    this.question = question;
  }

  public DivinationResponse() {
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }
}
