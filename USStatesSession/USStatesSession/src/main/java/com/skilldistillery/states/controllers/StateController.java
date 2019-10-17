package com.skilldistillery.states.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.states.data.State;
import com.skilldistillery.states.data.StateDAO;

@Controller
public class StateController {
  @Autowired
  private StateDAO stateDAO;
  
  public void setStateDAO(StateDAO stateDAO) {
    this.stateDAO = stateDAO;
  }

  @RequestMapping(path="GetStateData.do", params="name", method=RequestMethod.GET)
  public ModelAndView getStateByName(String name) {
    ModelAndView mv = new ModelAndView();
    State s = stateDAO.getStateByName(name);
    mv.addObject("state", s);
    mv.setViewName("WEB-INF/result.jsp");
    return mv;
  }

  @RequestMapping(path="GetStateData.do", params="abbr", method=RequestMethod.GET)
  public ModelAndView getStateByAbbreviation(String abbr) {
    ModelAndView mv = new ModelAndView();
    State s = stateDAO.getStateByAbbreviation(abbr);
    mv.addObject("state", s);
    mv.setViewName("WEB-INF/result.jsp");
    return mv;
  }
  
}
