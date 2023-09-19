package com.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

import com.spring.IssueReport;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<IssueReport, Long> {
	@Query(value = "SELECT i FROM IssueReport i WHERE markedAsPrivate = false")
	List<IssueReport> findAllButPrivate();

	List<IssueReport> findAllByEmail(String email);
}