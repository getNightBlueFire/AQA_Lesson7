package base;

public enum Days {
    Mo("Понедельник"),
    Tu(""),
    We(""),
    Tr(""),
    Fr(""),
    Sa(""),
    So("");

    public String name;


    Days(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
