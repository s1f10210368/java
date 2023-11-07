package sample1.pkg2;

import sample1.pkg1.Member;

public class Teacher extends Member {
    private String title;

    public Teacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }

    @Override
    protected String getEmail() {
        // ここに実際のメールアドレス生成ロジックを実装する必要があります
        // 仮の実装例:
        return name + Member.DOMAIN;
    }

    @Override
    public String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Teacher -----\n");
        sb.append(super.getProfile());
        sb.append("Title: ").append(title).append("\n");
        return sb.toString();
    }

    @Override
    public boolean canReserveRoom() {
        // ここに実際の部屋予約の判定ロジックを実装する必要があります
        // 仮の実装例:
        return true; // すべての教師は予約可能とする
    }
}
