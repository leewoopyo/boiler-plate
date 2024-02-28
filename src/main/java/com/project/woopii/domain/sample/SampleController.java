package com.project.woopii.domain.sample;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.woopii.core.entity.Sample;
import com.project.woopii.core.response.CommonResponse;

import lombok.RequiredArgsConstructor;

//TODO: swagger annotaion 추가

@RequiredArgsConstructor
@RequestMapping("/v1/sample")
@RestController
public class SampleController {

    /* SERVICES */ 
    private final SampleService sampleService;
    
    /* GET ENDPOINT */

    /**
     * Sample 전체 조회
     */
    @GetMapping
    public CommonResponse<List<Sample>> getSamples() {
        return CommonResponse.successWithData(sampleService.getSamples());
    }

    /* POST ENDPOINT */

    /* PATCH ENDPOINT */

    /* DELETE ENDPOINT */

}
