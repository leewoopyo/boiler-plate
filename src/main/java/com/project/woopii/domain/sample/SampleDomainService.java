package com.project.woopii.domain.sample;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.woopii.core.entity.Sample;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SampleDomainService {
    
    /* REPOSITORY */ 
    private final SampleRepository sampleRepository;

    /* GET METHODS */

    /**
     * Sample 전체 조회
     * @return 
     */
    public List<Sample> getSamples() {
        List<Sample> samples = sampleRepository.findAll();
        return samples;
    }

    /* CREATE METHODS */

    /* UPDATE METHODS */

    /* DELETE METHODS */

}
