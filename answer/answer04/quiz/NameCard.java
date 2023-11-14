public class NameCard {
    final String familyName;
    final String firstName;
    // コンストラクタ以外からアクセスできない = final がついている
    final int id;
    static int count = 1;

    // コンストラクタ NameCard(String firstName, String familyName) をもつ。
    // 引数の値は、対応するインスタンス・フィールドに設定される。また、 id には1から連番が振られる。
    NameCard(String firstName, String familyName) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.id = count++;
    }

    String getLabel() {
        return String.format(" %d: %s %s", id, firstName, familyName);
    }
}
