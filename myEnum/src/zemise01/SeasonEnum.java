package zemise01;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @since 2023/10/28
 */
public enum SeasonEnum { // 四季枚举
    SPRING("万物复苏"), SUMMER, AUTUMN, WINTER;


    private String remarks;

    public String getRemarks() {
        return remarks;
    }

    // 为枚举添加构造方法
    SeasonEnum(String remarks) {
        this.remarks = remarks;
    }

    SeasonEnum() {
    }


}
