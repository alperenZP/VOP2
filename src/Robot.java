import java.math.BigDecimal;
import java.util.ArrayList;

public class Robot {
    private String code;
    private String naam;
    private BigDecimal accuPercentage;
    private boolean isActief;
    private Lichaam lichaam;

    public String getCode() {
        return code;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public BigDecimal getAccuPercentage() {
        return accuPercentage;
    }

    public void setAccuPercentage(BigDecimal accuPercentage) {
        this.accuPercentage = accuPercentage;
    }

    public boolean isActief() {
        return isActief;
    }

    public void setActief(boolean actief) {
        isActief = actief;
    }

    public void loopVooruit(){
        if (isActief && (accuPercentage.compareTo(BigDecimal.ZERO) > 0)){
            lichaam.setPositieY(lichaam.getPositieY() + 1);
            accuPercentage = accuPercentage.subtract(BigDecimal.valueOf(0.01));
        }
    }

    public void loopTerug(){
        if (isActief && (accuPercentage.compareTo(BigDecimal.ZERO) > 0)){
            lichaam.setPositieY(lichaam.getPositieY() - 1);
            accuPercentage = accuPercentage.subtract(BigDecimal.valueOf(0.01));
        }
    }

    public void loopRechts(){
        if (isActief && (accuPercentage.compareTo(BigDecimal.ZERO) > 0)){
            lichaam.setPositieX(lichaam.getPositieX() + 1);
            accuPercentage = accuPercentage.subtract(BigDecimal.valueOf(0.01));
        }
    }

    public void loopLinks(){
        if (isActief && (accuPercentage.compareTo(BigDecimal.ZERO) > 0)){
            lichaam.setPositieX(lichaam.getPositieX() - 1);
            accuPercentage = accuPercentage.subtract(BigDecimal.valueOf(0.01));
        }
    }
}
