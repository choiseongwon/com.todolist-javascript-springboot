package com.todolist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.todolist.web.service.list.ListService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class IndexController {
	private final ListService listService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("lists", listService.findAllDesc());

		return "index";
	}
}
