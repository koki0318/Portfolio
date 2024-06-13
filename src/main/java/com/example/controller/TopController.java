package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Item;
import com.example.service.TopService;

@Controller
@RequestMapping("/portfolio")
public class TopController {

	@Autowired
	private TopService topService;

	@GetMapping("/top")
	public String portfolioController(Model model, @RequestParam(name = "name", defaultValue = "") String name) {

		List<Item> itemList = topService.showTopPage(name);
		model.addAttribute("itemList", itemList);

		return "portfolio";
	}

	@GetMapping("/search")
	public String searchController(Model model, @RequestParam(name = "name", defaultValue = "") String name) {

		List<Item> itemList = topService.showTopPage(name);
		model.addAttribute("itemList", itemList);

		return "portfolio";
	}
}
