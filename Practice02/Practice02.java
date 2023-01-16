// 文字列や数値は「データ型」と呼ばれ、文字列はString型、は整数はint型と呼ばれる。
// String型のSは大文字、int型(integer)のiは小文字である点に注意。

// 変数はデータ（値）をいれておく箱のようなもの。箱には名前がついており、その名前を用いていつでも変数から値を取り出すことが可能。
// 変数を使うには変数を定義する必要がある。「変数にいれる値のデータ型を指定」し「変数の名前を決める」ことで定義できる。

// 変数を定義したら変数に値を代入する際は「変数名 = 値」の形で記述する。

// 変数に対して何らかの処理を行うと変数から値が取り出されて処理が行われる。
// 例えばSystem.out.println()の()に変数をいれると、変数の中に入っている値が出力される。


class Practice02 {
  public static void main(String[] args) {
    // 「int型」の変数「number」を定義する
    int number;
    // 変数「number」に「3」を代入する
    number = 3;
    // 変数「number」を出力する
    System.out.println(number);
    // 「String型」の変数「name」を定義する
    String name;
    // 変数「name」に「まぐろ」を代入する
    name = "まぐろ";
    // 変数「name」を出力する
    System.out.println(name);

  }
}