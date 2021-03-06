package code.config;

/**
 * contextholder
 *
 * @author wangwenjie
 * @date 2020-12-02
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> LOCAL = new ThreadLocal<>();
    public static final String MASTER = "master";
    public static final String SLAVE = "slave";

    public static ThreadLocal<String> getLOCAL() {
        return LOCAL;
    }

    public static void setMaster() {
        System.out.println("切换数据源到master...");
        LOCAL.set(MASTER);
    }

    public static void setSlave() {
        System.out.println("切换数据源到slave...");
        LOCAL.set(SLAVE);
    }

    public static String getMasterOrSlave(){
        return LOCAL.get();
    }

    public static void clear(){
        LOCAL.remove();
    }
}
