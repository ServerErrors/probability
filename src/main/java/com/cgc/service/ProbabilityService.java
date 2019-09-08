package com.cgc.service;

import com.cgc.entity.Probability;

public class ProbabilityService {
    private static double facadeProbability = 0.6;

    public Double getFacadeProbabilityOfTimes(int times) {
        Double result = 1.0;
        for (int i = 0; i < times; i++) {
            result *= new Probability(facadeProbability).getFacadeProbability();
        }
        return result;
    }

    public Double getBehindProbabilityOfTimes(int times) {
        Double result = 1.0;
        for (int i = 0; i < times; i++) {
            result *= new Probability(facadeProbability).getBehindProbability();
        }
        return result;
    }
}
