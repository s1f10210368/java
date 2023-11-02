package sample2;

class Teacher extends Member {
    private String title;

    public Teacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }

    @Override
    String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Teacher -----\n");
        sb.append(super.getProfile()); //MemberクラスのgetProfileを呼び出す
        sb.append("Title: ").append(title).append("\n");
        return sb.toString();
   }

   @Override
   String getEmail(){
    return name + DOMAIN;
   }
}
