package com.project.woopii.domain.sample;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.woopii.core.entity.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
