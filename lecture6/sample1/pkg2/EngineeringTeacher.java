package sample1.pkg2;

import sample1.pkg1.Member;
import sample1.pkg1.Programmer;

public class EngineeringTeacher extends Member implements Programmer {
    private String title;

    public EngineeringTeacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }

    @Override
    protected String getEmail() {
        // メールアドレス生成の実装
        return name + Member.DOMAIN;
    }

    @Override
    public String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Engineering Teacher -----\n");
        sb.append(super.getProfile());
        sb.append("Title: ").append(title).append("\n");
        return sb.toString();
    }

    @Override
    public boolean canReserveRoom() {
        // 部屋予約の実装
        return true;
    }

    @Override
    public boolean canWritePython() {
        // Pythonのスキルを評価する実装
        return true; // 仮の実装例: すべてのエンジニア教師はPythonを書けるとする
    }

    @Override
    public boolean canWriteC() {
        // C言語のスキルを評価する実装
        return true; // 仮の実装例: すべてのエンジニア教師はC言語を書けるとする
    }

    @Override
    public boolean canWriteJava() {
        // Javaのスキルを評価する実装
        return true; // 仮の実装例: すべてのエンジニア教師はJavaを書けるとする
    }
}

