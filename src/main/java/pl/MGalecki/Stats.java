package pl.MGalecki;

import java.math.BigDecimal;

public class Stats {
    private BigDecimal nettoSum;
    private BigDecimal taxSum;
    private BigDecimal bruttoSum;

    public Stats(BigDecimal nettoSum, BigDecimal taxSum, BigDecimal bruttoSum) {
        this.nettoSum = nettoSum;
        this.taxSum = taxSum;
        this.bruttoSum = bruttoSum;
    }

    public BigDecimal getNettoSum() {
        return nettoSum;
    }

    public void setNettoSum(BigDecimal nettoSum) {
        this.nettoSum = nettoSum;
    }

    public BigDecimal getTaxSum() {
        return taxSum;
    }

    public void setTaxSum(BigDecimal taxSum) {
        this.taxSum = taxSum;
    }

    public BigDecimal getBruttoSum() {
        return bruttoSum;
    }

    public void setBruttoSum(BigDecimal bruttoSum) {
        this.bruttoSum = bruttoSum;
    }
}
