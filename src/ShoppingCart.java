public class ShoppingCart {
    public final double COST_WURST;
    public final double COST_BROT;
    public final double COST_DVD;
    public final double COST_KAESE;
    public final double COST_BUTTER;
    public final int AMOUNT_WURST;
    public final int AMOUNT_BROT;
    public final int AMOUNT_DVD;
    public final int AMOUNT_KEASE;
    public final int AMOUNT_BUTTER;
    public final double AVAILABLE_MONEY;
    public final double SUM_COST;

    public ShoppingCart(double cw, double cbr, double cd, double ck, double cbu, int aw, int abr, int ad, int ak, int abu, double am) {
        COST_WURST = cw;
        COST_BROT = cbr;
        COST_DVD = cd;
        COST_KAESE = ck;
        COST_BUTTER = cbu;
        AMOUNT_WURST = aw;
        AMOUNT_BROT = abr;
        AMOUNT_DVD = ad;
        AMOUNT_KEASE = ak;
        AMOUNT_BUTTER = abu;
        AVAILABLE_MONEY = am;
        SUM_COST = COST_WURST * AMOUNT_WURST + COST_BROT * AMOUNT_BROT + COST_DVD * AMOUNT_DVD + COST_KAESE * AMOUNT_KEASE + COST_BUTTER * AMOUNT_BUTTER;
    }

    public String printReceipt() {
        if (AVAILABLE_MONEY < SUM_COST) {
            throw new IllegalArgumentException(String.format("Not enough money for the whole cart! Needed: %.2f EUR - Given: %.2f EUR%n", SUM_COST, AVAILABLE_MONEY));
        } else return String.format(
                """
                        Wurst         %d x %.2f EUR
                                          %.2f EUR
                        Brot          %d x %.2f EUR
                                          %.2f EUR
                        DVD          %d x %.2f EUR
                                         %.2f EUR
                        Kaese         %d x %.2f EUR
                                          %.2f EUR
                        Butter        %d x %.2f EUR
                                          %.2f EUR
                        ------------------------------
                        Gesamt               %.2f EUR
                        Gegeben              %.2f EUR

                        Zurueck              %.2f EUR
                        """,
                AMOUNT_WURST, COST_WURST, AMOUNT_WURST * COST_WURST, AMOUNT_BROT, COST_BROT, AMOUNT_BROT * COST_BROT, AMOUNT_DVD, COST_DVD, AMOUNT_DVD * COST_DVD, AMOUNT_KEASE, COST_KAESE, AMOUNT_KEASE * COST_KAESE, AMOUNT_BUTTER, COST_BUTTER, AMOUNT_BUTTER * COST_BUTTER, SUM_COST, AVAILABLE_MONEY, AVAILABLE_MONEY - SUM_COST
        );
    }
}
