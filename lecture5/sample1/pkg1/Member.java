package sample1.pkg1;

public class Member {
    // サブクラスから参照される DOMAIN / nameは protected
    protected static final String DOMAIN = "@iniad.org";
    private String id;
    protected String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // サブクラスでオーバーライドするので protected
    protected String getEmail() {
        return this.id + DOMAIN;
    }
    
    public String getProfile() {
        StringBuffer sb = new StringBuffer(); 
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        return sb.toString();
    }
}
