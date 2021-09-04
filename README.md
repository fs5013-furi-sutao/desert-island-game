## 無人島生活ゲーム

無人島生活ゲームの課題内容については、以下のページで確認してください。

作成課題 ⭐ 無人島生活ゲーム | Java Bootcamp:  
https://fs5013-furi-sutao.github.io/java-bootcamp/mid/19-uninhabited-island

## ゲームの仕様

1. 初期の体力は 50（最大は 100）
2. プレイヤーは、毎日食べ物の情報(品名、危険度、回復量)を見た上で、「食べる」か「食べない」か「ヒント」を選択することができる
3. 「食べない」の場合は、体力が１０減少して翌日に生き延びる
4. 「食べる」の場合は、乱数判定を行い食べることができたか判定を行う
5. 食べることができた場合は体力が回復するが、食べるのに失敗したら即死
6. ヒント機能は３回まで使用できる
7. 「ヒント」の場合は、翌日の食べ物を知ることができる ヒントを見た後、再度、「食べる」か「食べない」を選ぶ
8. 食べ物毎に以下のパラメータを設定できる
  - 食べた時に回復する体力
  - 危険度を設定できる
  - 死因（面白い死因で！）
9. クリアもしくはゲームオーバー時に、１日目からのＨＰ、食べ物、危険度、食べたかどうかの履歴を生存日数分表示する

## 食べ物の一覧
|品名 |危険度 |回復量 |死因 |
|:-- |:-- |:-- |:-- |
|毒蛇 |15% |30 |毒蛇の毒に負けた… |
|漂流物（缶詰） |30% |50 |歯では開けられなかった。歯が全部折れて出血死… |
|流木 |8% |20 |バイキンだらけだった… |
|落ち葉 |5% |20 |口の中の水分を全部持っていかれた… |
|毒々しいキノコ |10% |30 |笑いが止まらず疲れて死んだ… |
|カラフルフルーツ |5% |30 |種が喉に詰まった… |
