public class Miles {
    public static void main(String[] args) {
        BonusMilesService bonusMilesService = new BonusMilesService();

        int miles = bonusMilesService.calculate(36410, 20);

        System.out.println(miles);

    }
}
