package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.DebitorDetails;


@Repository
public interface debitorDetailsRepo extends JpaRepository<DebitorDetails, Long> {}
