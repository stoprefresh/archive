package com.skilldistillery.states.controllers;

import javax.servlet.http.HttpSession;

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

	@RequestMapping(path = "GetStateData.do", params = "name", method = RequestMethod.GET)
	public ModelAndView getStateByName(String name, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		State s = stateDAO.getStateByName(name);
//		mv.addObject("state", s);
		session.setAttribute("state", s);
		mv.setViewName("WEB-INF/result.jsp");
		return mv;
	}

	@RequestMapping(path = "GetStateData.do", params = "abbr", method = RequestMethod.GET)
	public ModelAndView getStateByAbbreviation(String abbr, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		State s = stateDAO.getStateByAbbreviation(abbr);
//		mv.addObject("state", s);
		session.setAttribute("state", s);
		mv.setViewName("WEB-INF/result.jsp");
		return mv;
	}
	
	@RequestMapping(path = "GetNextState.do", method = RequestMethod.GET)
	public String getNextState(HttpSession session) {
		State curr = (State) session.getAttribute("state");
		if(curr != null) {
			State next  = stateDAO.getNextState(curr);
			session.setAttribute("state", next);
		}
		
		return "WEB-INF/result.jsp";
		
	}
	
	@RequestMapping(path = "GetLastState.do", method = RequestMethod.GET)
	public String getLastState(HttpSession session) {
		State curr = (State) session.getAttribute("state");
		if(curr != null) {
			State next  = stateDAO.getLastState(curr);
			session.setAttribute("state", next);
		}
		
		return "WEB-INF/result.jsp";
		
	}
	
	
	

}
