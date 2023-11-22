package com.asx.holdiay.HolidayCalender.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asx.holdiay.HolidayCalender.model.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday, Long> {
  List<Holiday> findAll();

  List<Holiday> findByJurisdiction(String jurisdiction);
}