package br.com.thymeleafexemple.layout.controller;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.thymeleafexemple.layout.model.Divination;
import br.com.thymeleafexemple.layout.model.DivinationResponse;

@Controller
public class DivinationController {
  
  DivinationResponse data;
  
  @GetMapping("/index")
  public String home() {
    return "index";
  }

  @PostMapping("/index")
  public String create(String question) {

    Divination divination = new Divination();
    divination.setResponses();
    List<String> responses = divination.getResponses();

    int valor = new Random().nextInt(3);

    data = (new DivinationResponse(responses.get(valor), question));

    return "redirect:/resposta";
  }

  @GetMapping("/resposta")
  public ModelAndView responsePage() {
    ModelAndView mv = new ModelAndView("resposta");

    mv.addObject("response", data);

    return mv;
  }
}
