package com.project.woopii.domain.sample;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.woopii.core.entity.Sample;

import lombok.RequiredArgsConstructor;


@Transactional(readOnly = true) // Class에 read-onlu를 설정하고, 개별 메소드에 CUD가 있다면 해당 메소드에 거기에 read-only를 false로 설정한다.
@RequiredArgsConstructor
@Service
public class SampleService {

    /* SERVICES */
    private final SampleDomainService sampleDomainService;

    /* GET METHODS */

    /**
     * Sample List 조회
     * @return
     */
    public List<Sample> getSamples () {
        return sampleDomainService.getSamples();
    }

    /**
     * Id로 조회된 Sample 조회
     * @param id
     * @return
     */
    public Sample getSample (Long id) {
        return sampleDomainService.getSample(id);
    }

    /* CREATE METHODS */

    /* UPDATE METHODS */

    /* DELETE METHODS */

}
