public class Season {
    private final String seasonName;
    private final String seasonDesc;

    private Season (String seasanName,String seasonDesc){
        this.seasonDesc = seasonDesc;
        this.seasonName = seasanName;
    }

    public static final Season SPRING = new Season ("SPRING","春暖花开");
    public static final Season SUMMER = new Season ("SUMMER","烈日炎炎");
    public static final Season AUTUMN = new Season ("AUTUMN","秋高气爽");
    public static final Season WINTER = new Season ("WINTER","寒冬将至");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }


}
