package com.todolist.web.service.list;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todolist.web.domain.list.ListRepository;
import com.todolist.web.dto.ListSaveRequestDto;
import com.todolist.web.dto.ListsAllResponseDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class ListService {
	@Autowired
	private ListRepository listRepository;

	@Transactional
	public Long save(ListSaveRequestDto requestDto) {
		return listRepository.save(requestDto.ToEntity()).getId();
	}

	@Transactional(readOnly = true)
	public List<ListsAllResponseDto> findAllDesc() {
		return listRepository.findAllDesc().stream()
				.map(ListsAllResponseDto::new)
				.collect(Collectors.toList());
	}
}
