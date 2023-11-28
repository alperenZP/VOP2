import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Blabla", 4, BigDecimal.valueOf(393.3), 300, "Intel");
        OpslagSchijf opslagSchijf = new OpslagSchijf("EE", 500, 0);
        Lichaam lichaam = new Lichaam("Ex22", Kleur.GEEL, 0, 0);
        Robot robo = new Robot("EHRJE", "Rob", BigDecimal.valueOf(1), true, lichaam, opslagSchijf, processor);

        System.out.println(robo.toString());
        System.out.println(robo.geefHuidigeLocatie());
        System.out.println(robo.getAccuPercentage());
        robo.loopLinks();
        System.out.println(robo.geefHuidigeLocatie());
        System.out.println(robo.getAccuPercentage());
        for (int i = 0; i < 30; i++) {
            robo.loopRechts();
        }
        System.out.println(robo.geefHuidigeLocatie());
        System.out.println(robo.getAccuPercentage());
        System.out.println(robo.maakBerekening(1, 4, Teken.PLUS));
        System.out.println(robo.getAccuPercentage());

        robo.slaDataOp("REJR");
        System.out.println(robo.getAccuPercentage());
        System.out.println(robo.geefHuidigeLocatie());
        robo.setActief(false);
        robo.loopLinks();
        System.out.println(robo.geefHuidigeLocatie());
    }
}