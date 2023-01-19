class Practice04{
  public static void main(String[] args) {
    int number = 11;
    String text = "イカ";
    System.out.println(number);
    System.out.println(text);

    // 変数の値は変更できる。一度値を代入した変数に違う値を代入すると、変数の中身は後で代入した値に上書きされる。
    //同じ処理内で同一名の変数を定義できないため、値を上書きするときはデータ型をつけないように注意すること。
    number = 9;
    System.out.println(number);

    text = "タコ";
    System.out.println(text);

    // 定義した変数を用いて（自己代入して）値を上書きすることができる。
    number = number + 7;
    System.out.println(number);

    // 自己代入の省略
    // number = number + 10;　を省略して　number += 10;　と記述できる。（ほかの四則演算も同様）
    number *= 7;
    System.out.println(number);

    // 変数に1を足す、もしくは1を引く場合は、さらに省略した書き方がある。変数に「++」を付けると変数に「1を足す」ことができ、「--」は「1を引く」ことができる。
    number ++;
    System.out.println(number);

  }
}