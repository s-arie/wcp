// 変数の値の代入は変数定義と同時に行うこと(変数の初期化)ができる。
// 数値が入った変数なら、数値と同様に計算することができる。数値と変数の計算も、変数同士の計算も可能。
// 文字列の入った変数であれば、文字列と同様に、文字列の連結を行うことが可能。
// 文字列の変数にダブルクォーテーションは付けない。（変数ではなく文字列として扱われてしまうため）


class Practice03 {
  public static void main(String[] args) {
    int number1 = 3;

    // int型の変数number2を定義し、7を代入
    int number2 = 7;

    // number1 * number2を出力
    System.out.println(number1 * number2);

    // String型の変数textを定義し、「とってもおいしい食べ物」を代入
    String text = "とってもおいしい食べ物";

    // 文字列「お寿司は」と変数textを連結して出力
    System.out.println("お寿司は" + text);

  }
}

