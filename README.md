# MyBudgetApp

MyBudgetApp is an Android application designed to help users manage their finances using AI predictions. This app provides features for tracking income, expenses, current balance, savings goals, and AI forecasted spendable amounts.

## Features
- Add and categorize income and expenses
- Input current balance and automatically calculate forecasts
- Set and track savings goals
- View transaction history and export to PDF
- AI-powered predictions for daily, weekly, and monthly spendable amounts

## Getting Started
1. Clone the repository: `git clone https://github.com/your-username/MyBudgetApp.git`
2. Open the project in Android Studio
3. Build and run the application on your device or emulator

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

#MyBudgetApp

MyBudgetApp は、AI 予測を使用してユーザーが財務を管理できるように設計された Android アプリケーションです。このアプリは、収入、支出、現在の残高、貯蓄目標、AI が予測した支出可能額を追跡する機能を提供します。

＃＃ 特徴
- 収入と支出を追加して分類する
- 現在の残高を入力し、予測を自動計算します
- 貯蓄目標を設定および追跡する
- 取引履歴の表示と PDF へのエクスポート
- AI を活用した日次、週次、月次の支出可能額の予測

＃＃ はじめる
1. リポジトリのクローンを作成します: `git clone https://github.com/your-username/MyBudgetApp.git`
2. Android Studioでプロジェクトを開きます
3. デバイスまたはエミュレータ上でアプリケーションをビルドして実行します。

## ライセンス
このプロジェクトは MIT ライセンスに基づいてライセンスされています。詳細については、[LICENSE](LICENSE) ファイルを参照してください。

主要な機能

    データ収集と入力
        収入、支出、現在の残金、貯金設定の入力フォーム
        ＋ボタンを押して金額の項目を追加可能

    データの表示と管理
        タブで収入、支出、現在の残金、貯金設定、AI予測の使える金額を切り替えて表示
        タイムスタンプ付きで自動収入と支出の記録

    AI予測
        毎日、毎週、毎月の金銭状況をグラフで表示
        支出項目ごとの推移と予測をグラフで可視化
        残金と貯金設定に基づくAIによる目標使用額の提案

    貯金設定
        毎月、毎週、毎日の目標金額を入力し、それに基づいて使える金額を調整
        ＋ボタンを押して貯金項目を追加可能

    レポート機能
        各タブの内容をPDF形式で印刷可能

フローのイメージ

    初期設定
        アプリを開いたら、最初に現在の残金、月々の収入、支出の入力フォームが表示される
        貯金目標を設定

    日々の利用
        支出が発生した際に、その都度＋ボタンで支出項目を追加して金額を入力
        支出や収入のデータは自動でタイムスタンプ付きで記録

    AI予測と管理
        AIが入力されたデータを基に今後の金銭状況を予測し、グラフで表示
        毎日、毎週、毎月の使える金額や貯金可能額をリアルタイムで更新

    レポート作成
        必要に応じて、各タブの内容をPDFで保存または印刷

    トップページ

トップページにはシンプルに6つのボタンを配置します。各ボタンをタップすると、対応する詳細画面が開きます。

    収入
    支出
    残金
    預金設定
    金銭通帳
    AI予測

各ボタンの詳細画面

    収入
        固定収入の一覧表示
        ＋ボタンで任意のカテゴリーや項目を追加
        収入金額の入力フィールド
        カテゴリー名の入力フィールド
        保存ボタン

    支出
        固定支出の一覧表示
        ＋ボタンで任意のカテゴリーや項目を追加
        支出金額の入力フィールド
        カテゴリー名の入力フィールド
        保存ボタン

    残金
        現在の残金を入力するフィールド
        入力された残金に基づいて自動計算されるAI予測、支出、金銭通帳への反映

    預金設定
        目標金額の入力フィールド
        目標達成日を設定するカレンダー
        現在のAI予測に基づく達成見込み日を自動表示

    金銭通帳
        収入と支出の履歴を日時順に一覧表示
        各エントリに対する編集・削除オプション

    AI予測
        収入、支出、残金の推移をグラフで表示
        預金設定に基づく目標達成の進捗を表示
        毎月・毎週・毎日の使える予測金額を表示

ユーザーの入力フロー

    初期設定
        収入と支出の固定費を入力
        残金を入力

    日々の利用
        収入や支出が発生する度に＋ボタンで項目を追加して入力
        残金が変動する度に更新

    AI予測と管理
        AIによる金銭状況の予測を確認
        毎月、毎週、毎日の使える予測金額を確認

UIデザインのポイント

    シンプルで直感的なインターフェース
        各ボタンと画面はシンプルで分かりやすく
        色使いを抑え、重要な情報を目立たせる
    一貫性のあるデザイン
        全ての画面で一貫したデザインと操作感
        タップ、スワイプ、ドラッグなどの操作を統一
    ホームスクリーン
    ---------------------------------
    |          家計簿アプリ          |
    ---------------------------------
    | 収入  |  支出  |  残金        |
    ---------------------------------
    | 預金設定 | 金銭通帳 | AI予測 |
    ---------------------------------
    
    収入スクリーン
    
    ---------------------------------
    |           収入                |
    ---------------------------------
    | カテゴリー名 | 金額            |
    ---------------------------------
    | 給料         | ¥300,000        |
    ---------------------------------
    | 副収入       | ¥50,000         |
    ---------------------------------
    | ボーナス     | ¥100,000        |
    ---------------------------------
    | ＋ ボタン                        |
    ---------------------------------
    | 新しいカテゴリー名 | 金額       |
    ---------------------------------
    | [テキスト入力] | [テキスト入力] |
    ---------------------------------
    | [保存ボタン]                    |
    ---------------------------------
    
    支出スクリーン
    
    ---------------------------------
    |           支出                |
    ---------------------------------
    | カテゴリー名 | 金額            |
    ---------------------------------
    | 食費         | ¥30,000         |
    ---------------------------------
    | 交通費       | ¥10,000         |
    ---------------------------------
    | 光熱費       | ¥15,000         |
    ---------------------------------
    | ＋ ボタン                        |
    ---------------------------------
    | 新しいカテゴリー名 | 金額       |
    ---------------------------------
    | [テキスト入力] | [テキスト入力] |
    ---------------------------------
    | [保存ボタン]                    |
    ---------------------------------
    
    残金スクリーン
    
    ---------------------------------
    |           残金                |
    ---------------------------------
    | 現在の残金 | ¥100,000         |
    ---------------------------------
    | [テキスト入力]                |
    ---------------------------------
    | [更新ボタン]                   |
    ---------------------------------
    | [AI予測: 使える金額]           |
    ---------------------------------
    | 日: ¥5,000  週: ¥35,000        |
    | 月: ¥150,000                   |
    ---------------------------------
    
    預金設定スクリーン
    
    ---------------------------------
    |         預金設定              |
    ---------------------------------
    | 目標金額 | ¥500,000           |
    ---------------------------------
    | 目標日   | [カレンダー入力]   |
    ---------------------------------
    | [保存ボタン]                    |
    ---------------------------------
    | [AI予測: 達成見込み]            |
    ---------------------------------
    | 見込み日: 2024年12月           |
    ---------------------------------
    
    
    金銭通帳スクリーン
    
    ---------------------------------
    |         金銭通帳              |
    ---------------------------------
    | 日時          | 収入        | 支出         |
    ---------------------------------
    | 2024/06/24    | +¥300,000   |              |
    | 2024/06/25    |             | -¥30,000     |
    ---------------------------------
    | 今の貯金額: ¥270,000          |
    ---------------------------------
    | [編集ボタン]  [削除ボタン]    |
    ---------------------------------
    | [PDF出力ボタン]                |
    ---------------------------------
    
    AI予測画面
    
    ---------------------------------
    |          AI予測               |
    ---------------------------------
    | [グラフ表示]                   |
    | 収入と支出と残金の推移         |
    ---------------------------------
    | [リスト表示]                   |
    | 1. 給料      ¥300,000          |
    | 2. 副収入    ¥50,000           |
    | 3. ボーナス  ¥100,000          |
    ---------------------------------
    | [保存ボタン]                   |
    ---------------------------------
    | [調整後の使える金額表示]       |
    | 運用額: +¥5,000  (+10％)       |
    | 毎月使える金額: ¥50,000        |
    | 毎週使える金額: ¥12,500        |
    | 毎日使える金額: ¥1,785         |
    ---------------------------------
    | 残金が平均値を下回ると調整額を表示 |
    | [平均値調整後の使える金額]      |
    ---------------------------------
    | [更新ボタン]                   |
    ---------------------------------
    | [PDF出力ボタン]                |
    ---------------------------------





