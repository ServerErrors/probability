package com.cgc.entity;

public class Probability {
    private Double facadeProbability;
    private Double behindProbability;

    public Probability(Double facadeProbability) {
        this.facadeProbability = facadeProbability;
        this.behindProbability = 1 - this.facadeProbability;
    }

    public Double getFacadeProbability() {
        return facadeProbability;
    }

    public Double getBehindProbability() {
        return behindProbability;
    }

}
