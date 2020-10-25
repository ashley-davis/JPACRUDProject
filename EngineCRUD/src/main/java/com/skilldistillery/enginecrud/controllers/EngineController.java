package com.skilldistillery.enginecrud.controllers;


//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.enginecrud.data.EngineDAO;
import com.skilldistillery.jpacrud.entities.Engine;

@Controller
public class EngineController {
	
	@Autowired
	private EngineDAO engineDao;
	
//	@RequestMapping(path = "/")
//	public String index(Model model) {
//		List<Engine> engineList = engineDao.findAll();
//		model.addAttribute("engine", engineList);
//		return "index";
//	}
	
	@RequestMapping(path = "getEngine.do")
	public String showEngine(Integer fid, Model model) {
		Engine engine = engineDao.findById(fid);
		model.addAttribute("engine", engine);
		return "engine/show";
	}
}
