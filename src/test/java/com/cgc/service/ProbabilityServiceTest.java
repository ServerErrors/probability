package com.cgc.service;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ProbabilityServiceTest {

    @Test
    public void getFacadeProbabilityOfTimes() {
        // given
        ProbabilityService probabilityService = new ProbabilityService();
        BigDecimal result = new BigDecimal("0.6");
        // when
        BigDecimal probability = probabilityService.getFacadeProbabilityOfTimes(1);

        // then
        Assert.assertEquals("期望结果值应该是0.6", result, probability);
    }

    @Test
    public void getBehindProbabilityOfTimes() {
        // given
        ProbabilityService probabilityService = new ProbabilityService();
        BigDecimal result = new BigDecimal("0.16");

        // when
        BigDecimal probability = probabilityService.getBehindProbabilityOfTimes(2);
        // then
        Assert.assertEquals("期望结果值应该是0.16", result, probability);
    }
}
