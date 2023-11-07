package sample1.pkg1;

public abstract class Member {
    protected static final String DOMAIN = "@iniad.org";
    private String id;
    protected String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // サブクラスでオーバーライドする抽象メソッド
    protected abstract String getEmail();
    
    public String getProfile() {
        StringBuffer sb = new StringBuffer(); 
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        if (canReserveRoom()) {
            sb.append("Room: OK").append("\n");
        } else {
            sb.append("Room: NG").append("\n");
        }
        return sb.toString();
    }
    
    public abstract boolean canReserveRoom();
}

