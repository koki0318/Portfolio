package com.example.controller.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Item;
import com.example.service.TopService;

@RestController
@RequestMapping("api")
public class RestTopController {

    @Autowired
    private TopService topService;

    @PostMapping("/search")
	public List<Item> searchController(Model model, @RequestParam(name = "name", defaultValue = "") String name) {

		List<Item> itemList = topService.showTopPage(name);
		model.addAttribute("itemList", itemList);

		return itemList;
	}
}
