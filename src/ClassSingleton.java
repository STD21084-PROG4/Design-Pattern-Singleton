public class ClassSingleton {

    private static ClassSingleton INSTANCE ;
    private String description = " Initial description class ";

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton() ;
        }
        return INSTANCE ;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
