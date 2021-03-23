package enumlearn;

public class SeasonEnumTest {
    public static void main(String[] args) {
        System.out.println(SeasonEnum.SPRING.getSeasonDesc());
        Info info = SeasonEnum1.Winter;
        info.show();
    }
}
