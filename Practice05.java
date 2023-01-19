// 小数（小数点以下を持つ数。「3.0」も該当する）を表すデータ型の一つにdouble型がある

class Practice05 {
  public static void main(String[] args) {

    // 小数（小数点以下を持つ数。「3.0」も該当する）を表すデータ型の一つにdouble型がある
    double number1 = 8.5;
    double number2 = 3.4;
    System.out.println(number1 + number2);

    // 同じデータ型同士でないと演算は行えないため、型の違うものを演算するときは型を変換し同じ型にする必要がある。
    // Javaでは型変換の方法として自動型変換と手動型変換がある。

    // String型とint型を足すと、int型が自動でString型に変換され文字列が結合される。
    int month = 12;
    int date = 31;
    System.out.println(month + "月" + date + "日");

    // int型同士の計算は結果もint型になり、double型同士の計算は、結果もdouble型になる。
    // int型同士の割り算は割り切れない場合でも小数点以下が切り捨てられて結果はint型になるため特に注意すること。
    // int型とdouble型の計算を行った場合、計算の過程でint型がdouble型に変換されるため。（整数は必ず小数でも表せるため、Javaが自動で型変換を行う）
    System.out.println(7 / 2);
    System.out.println(7.0 / 2.0);
    System.out.println(7 / 2.0);

    // int型同士の計算で正確な数値を出したいときなどは強制的に型変換を行う（キャスト）。キャストするときは(変換したいデータ型)値と記述する。
    // int型同士の値から、最終的にdouble型の計算結果を得たい場合、どちらか1つをキャストする。（片方がdouble型であれば結果はdouble型になるため）
    System.out.println((double)number1 / number2);

  }
}