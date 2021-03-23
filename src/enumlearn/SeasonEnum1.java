package enumlearn;

public enum SeasonEnum1 implements Info{
    Winter("冬天","窗含西岭千秋雪"){
        @Override
        public void show() {
            System.out.println("测试");
        }
    };
    private final String seasonName;
    private final String seasonDesc;
    SeasonEnum1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }

}
