package com.todolist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.web.dto.ListSaveRequestDto;
import com.todolist.web.service.list.ListService;

@RestController
public class ListApiController {
	@Autowired
	private ListService listService;
	
	@PostMapping("/api/v1/lists")
	public Long save(@RequestBody ListSaveRequestDto requestDto) {
		return listService.save(requestDto);
	}
}
