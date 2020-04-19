public class BonusMilesService {
    public int calculate(int cost) {
        int mile=(int)Math.floor(cost/20);
        return mile;
    }

}
