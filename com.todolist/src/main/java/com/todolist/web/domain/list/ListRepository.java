package com.todolist.web.domain.list;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ListRepository extends JpaRepository<MyList, Long>{
    @Query("SELECT l FROM MyList l ORDER BY l.id DESC")
    List<MyList> findAllDesc();

}
