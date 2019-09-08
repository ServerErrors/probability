package com.cgc.service;

import com.cgc.entity.Probability;

import java.math.BigDecimal;

public class ProbabilityService {
    private static BigDecimal facadeProbability = new BigDecimal("0.6");

    public BigDecimal getFacadeProbabilityOfTimes(int times) {
        BigDecimal result = new BigDecimal("1");
        for (int i = 0; i < times; i++) {
            result = result.multiply(new Probability(facadeProbability)
                    .getFacadeProbability());
        }
        return result;
    }

    public BigDecimal getBehindProbabilityOfTimes(int times) {
        BigDecimal result = new BigDecimal("1");
        for (int i = 0; i < times; i++) {
            result = result.multiply(new Probability(facadeProbability)
                    .getBehindProbability());
        }
        return result;
    }
}
