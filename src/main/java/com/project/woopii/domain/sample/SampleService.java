package com.project.woopii.domain.sample;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.woopii.core.entity.Sample;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SampleService {

    /* SERVICES */
    private final SampleDomainService sampleDomainService;

    /* GET METHODS */

    public List<Sample> getSamples () {

        List<Sample> samples = sampleDomainService.getSamples();

        return samples;
    }

    /* CREATE METHODS */

    /* UPDATE METHODS */

    /* DELETE METHODS */

}
