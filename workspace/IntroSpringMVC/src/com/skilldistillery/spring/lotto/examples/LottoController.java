package com.skilldistillery.spring.lotto.examples;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.spring.lotto.Hopper;

@Controller
public class LottoController {
  @Autowired
  private Hopper hopper;

  @RequestMapping("lotto.do")
  public String welcome() {
    return "form.jsp";
  }

  @RequestMapping("GetNumbers.do")
  public ModelAndView getNumbers(@RequestParam("howmany") int count) {
    hopper.reset();

    List<String> nums = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      nums.add(hopper.drawBall().getValue());
    }

    ModelAndView mv = new ModelAndView();
    mv.setViewName("form.jsp");
    mv.addObject("listOfNumbers", nums);
    return mv;
  }
}
