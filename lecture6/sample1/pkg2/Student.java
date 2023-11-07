package sample1.pkg2;

import sample1.pkg1.Member;

public class Student extends Member {
    private int grade;

    public Student(String id, String name, int grade) {
        super(id, name);
        this.grade = grade;
    }

    @Override
    protected String getEmail() {
        // ここに実際のメールアドレス生成ロジックを実装する必要があります
        // 仮の実装例:
        return id + Member.DOMAIN;
    }

    @Override
    public String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append(super.getProfile());
        sb.append("Grade: ").append(grade).append("\n");
        return sb.toString();
    }

    @Override
    public boolean canReserveRoom() {
        // ここに実際の部屋予約の判定ロジックを実装する必要があります
        // 仮の実装例:
        return grade >= 10; // 10学年以上の学生は予約可能とする
    }
}
