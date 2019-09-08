package com.cgc.service;

import org.junit.Assert;
import org.junit.Test;

public class ProbabilityServiceTest {

    @Test
    public void getFacadeProbabilityOfTimes() {
        // given
        ProbabilityService probabilityService = new ProbabilityService();

        // when
        Double probability = probabilityService.getFacadeProbabilityOfTimes(1);

        // then
        Assert.assertEquals(0.6, probability, 0.0);
    }

    @Test
    public void getBehindProbabilityOfTimes() {
        // given
        ProbabilityService probabilityService = new ProbabilityService();

        // when
        Double probability = probabilityService.getBehindProbabilityOfTimes(2);
        // then
        Assert.assertEquals(0.16, probability, 0.0);
    }
}
