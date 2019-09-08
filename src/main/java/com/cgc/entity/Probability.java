package com.cgc.entity;

import java.math.BigDecimal;

public class Probability {
    private BigDecimal facadeProbability;
    private BigDecimal behindProbability;

    public Probability(BigDecimal facadeProbability) {
        this.facadeProbability = facadeProbability;
        this.behindProbability = new BigDecimal("1").subtract(this.facadeProbability);
    }

    public BigDecimal getFacadeProbability() {
        return facadeProbability;
    }

    public BigDecimal getBehindProbability() {
        return behindProbability;
    }

}
