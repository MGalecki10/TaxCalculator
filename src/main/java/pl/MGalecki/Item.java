package pl.MGalecki;
import java.math.BigDecimal;
import java.math.MathContext;

public class Item {
    private String name;
    private BigDecimal nettoPrice;
    private BigDecimal vat;

    public Item(String name, BigDecimal nettoPrice, BigDecimal vat) {
        this.name = name;
        this.nettoPrice = nettoPrice;
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getNettoPrice() {
        return nettoPrice;
    }

    public void setNettoPrice(BigDecimal nettoPrice) {
        this.nettoPrice = nettoPrice;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    BigDecimal getTax() {
        return (nettoPrice.multiply(vat.divide(new BigDecimal(100), MathContext.DECIMAL64)));
    }

    BigDecimal getBruttoPrice() {
        return nettoPrice.add(getTax());
    }
}
