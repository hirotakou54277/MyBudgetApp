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

MyBudget App Overview and Features

The MyBudget app is an AI household budgeting application that helps users effectively manage their personal finances. The main features are as follows

    Home Screen
        The central screen of the app, providing access to key features such as income, expenses, balance, AI deposit settings, money book, and AI forecasting.

    Income Management
        Allows users to manage income by category and set the next income date. For example, register income from salary, supplemental income, bonuses, etc., and perform periodic income forecasting.

    Expense Management
        Allows management of expenses by category and input of amounts. Register expenses such as food, transportation, utilities, etc., and record daily expenses.

    Remaining balance management
        The current remaining balance can be displayed and updated. Users can input their actual remaining balance and have it reflected in the AI forecast.

    AI Forecasting
        AI analyzes income and expenditure trends and calculates a daily average of the amount of money available until the next income date. In addition, it suggests an adjusted usable amount based on the predicted financial situation.

    Money Passbook
        Records past income and expense history with date and time, and calculates current savings. It clarifies the history of income, expenses, and remaining balance, and visualizes the financial transition.

    AI Deposit Setting
        Set the target savings amount and target achievement date; AI predicts the amount of savings required to reach the target and displays the estimated date of achievement.

Image of the flow

    User registration and initial settings
        After downloading the application, users create an account and perform initial settings for income and expenses.

    Use of Home Screen
        The home screen provides access to income management, expense management, balance management, and AI forecasting.

    Income Management
        Enter amounts by income category and set the next income date. Income is automatically forecasted according to the periodicity of income.

    Expense Management
        Select an expense category and enter the amount. Daily expenses are recorded and reflected in the AI forecast.

    Remaining balance management
        Enter the current balance and click the "Update" button to reflect it in the AI forecast. Changes in the remaining balance will be displayed in a graph.

    Use of AI Forecasting
        AI learns patterns of income and expenditure and calculates the amount of money available until the next income date. It compares the forecasted amount with the actual remaining balance and makes appropriate adjustments.

    Confirmation of money book
        Past income/expense history is displayed with date and time, and the current savings amount is calculated. PDF output is also available.

Detailed screen for each button

    Income Management: Allows entry of each income category and amount, and setting of the next income date.
    Expense Management: Enter expense categories and amounts, and check expense history.
    Balance Management: Enter and update the current balance, and view AI forecast results.
    AI Prediction: Graph income and expense trends, display predicted spendable amounts, and suggest spendable amounts after adjustments.
    Money Passbook: Check past income/expense history and current savings, PDF output function.

User input flow

    Income Input: Input income category and amount, select next income date.
    Expense entry: Enter expense categories and amounts, and record expense history.
    Update Balance: Enter the current balance and click the Update button to reflect it in the AI forecast.
    AI Forecast Confirmation: Review income/expense patterns and forecast results, and make financial plans based on the amount of money available after adjustments.

Through these flows and features, users can effectively manage their personal finances and support future planning and actions to achieve their goals.

    Homescreen
    ---------------------------------
    | AI Household Budgeting App |
    ---------------------------------
    | Income | Expenses | Balance
    ---------------------------------
    | AI Deposit Settings | Moneybooker | AI Predictor | AI Predictor
    ---------------------------------
    Income Screen
    
    ---------------------------------
    | Income | AI Forecasting
    ---------------------------------
    | Category Name | Amount | | | Next Income Date
    | Next Income Date | [Calendar Entry] |
    ---------------------------------
    | Salary | ¥300,000
    ---------------------------------
    | Additional income
    ---------------------------------
    | Bonus
    ---------------------------------
    | + button
    ---------------------------------
    | New category name | Amount |
    ---------------------------------
    | [text input] | [text input] | [text input] | [text input] | [text input] | [text input] | [text input] | [text input] | [text input
    ---------------------------------
    | [Save button] |
    ---------------------------------
    
    Expense screen
    
    ---------------------------------
    | Expenditure |
    ---------------------------------
    | Category Name | Amount |
    ---------------------------------
    | Food expense | ¥30,000 |
    ---------------------------------
    | Transportation
    ---------------------------------
    | Utilities - ¥15,000
    ---------------------------------
    | + button | ¥10,000
    ---------------------------------
    | New category name | Amount |
    ---------------------------------
    | [text input] | [text input] | [text input] | [text input] | [text input] | [text input] | [text input] | [text input] | [text input
    ---------------------------------
    | [Save button] |
    ---------------------------------
    
    Balance screen
    
    ---------------------------------
    | [Save button] | [Residuals
    ---------------------------------
    | Current balance | ¥100,000 |
    ---------------------------------
    | [Enter text] |
    ---------------------------------
    | [Update button] |
    ---------------------------------
    | [AI Prediction: Amount of money you can spend] |
    ---------------------------------
    day: ¥5,000 week: ¥35,000 | month: ¥150,000 | month: ¥150,000 | month: ¥150,000
    | [AI Prediction: Amount of money you can spend] | [Update button] | [AI Prediction: Amount of money you can spend
    ---------------------------------
    
    Deposit Setup Screen
    ---------------------------------
    | AI Deposit Setup |
    ---------------------------------
    | Target Amount | ¥500,000 |
    ---------------------------------
    | Target Date | [Enter Calendar] |
    ---------------------------------
    | [Save button] |
    ---------------------------------
    | [AI Prediction: Expected achievement] |
    ---------------------------------
    | [Estimated date: December 2024
    ---------------------------------
    
    Moneybooker screen
    ---------------------------------
    | Moneybooks
    ---------------------------------
    | Date | Income | Expenditure | Balance
    ---------------------------------
    | 2024/06/24 | +¥300,000 | | | -¥30,000 | -¥10,000 | -¥10,000 | -¥30,000 | -¥10,000
    | 2024/06/25 | -¥30,000 | -¥10,000 | -¥10,000
    | 2024/06/26 | | -¥10,000 | -¥10,000
    ---------------------------------
    
    ---------------------------------
    | [Edit button] [Delete button] |
    ---------------------------------
    | [Export PDF button] |
    ---------------------------------
    
    AI Prediction Screen
    ---------------------------------
    | AI Prediction |
    ---------------------------------
    | [Graphical Display] |
    | Income, Expenditure and Remaining Balance |
    ---------------------------------
    | [Graph Display 2] |
    | Trends in Investment Amounts |
    --------------------------------- |
    | [Adjusted Available Amount Displayed] |
    | Amount of money invested: +¥5,000 (+10%) |
    | Monthly Available Amount: ¥50,000
    | The amount of money you can spend every week: ¥12,500
    | Daily amount: ¥1,785
    ---------------------------------
    | If the balance is below the average, an adjustment will be shown.
    | [Amount Available After Average Adjustment] |
    ---------------------------------
    | [Refresh button] |
    ---------------------------------

    Calculation of the amount available for the pro-rata average

    The amount available for the pro-rated average is the amount available per day when the remaining balance is divided equally based on the period until the next income date.
        Remaining balance: RR
        Days until next income date: DD

    The available amount of the daily average, AavgAavg, is calculated by the following formula
    Aavg=RD
    Aavg=DR

    For example, if the balance is 100,000 yen and the next income date is in 20 days:
    Aavg=100,00020=5,000 yen
    Aavg=20100,000=5,000 yen

    Calculation of the amount available after AI adjustment

    The AI-adjusted spendable amount is an amount calculated based on the AI's projected future financial situation. This takes into account income, expenses, and changes in the remaining balance, but the specific calculation method depends on the AI's forecasting algorithm.

    For example, the AI predicts expenditures until the next income date, and the AI-adjusted usable amount is the result of the calculation based on the change in the remaining balance.

    Calculation of Operational Amount

    The investment amount AdiffAdiff is the difference between the AI-adjusted usable amount and the daily average usable amount.
    Adiff=Available amount after AI adjustment - Aavg
    Adiff=Avg after AI adjustment - Aavg

    For example, if the AI-adjusted available amount is 5,500 yen and the daily average available amount is 5,000 yen:
    Adiff=5,500-5,000=500 yen
    Adiff=5,500-5,000=500 yen

    Calculation of percentage of operation amount

    Adiff_percentAdiff_percent is the ratio of the amount under management to the daily average amount available.
    Adiff_percent=(AdiffAavg)×100
    Adiff_percent=(AavgAdiff)×100

    For example, if the amount under management is 500 yen and the daily average usable amount is 5,000 yen:
    Adiff_percent=(5005,000)×100=10
    Adiff_percent=(5,000500)×100=10

By implementing these calculations, the AI forecast page can accurately display the daily average amount available, the AI-adjusted amount available, the amount under management, and the percentage of the amount under management, providing useful information to the user.

#MyBudgetApp

MyBudgetアプリの概要と機能

MyBudgetアプリは、ユーザーが個人の財務管理を効果的に行うためのAI家計簿アプリです。主な機能は以下の通りです：

    ホームスクリーン
        アプリの中心となる画面で、収入、支出、残金、AI預金設定、金銭通帳、AI予測などの主要機能へのアクセスが提供されます。

    収入管理
        収入のカテゴリー別管理と次回収入日の設定が可能です。例えば、給料、副収入、ボーナスなどの収入を登録し、周期的な収入予測を行います。

    支出管理
        支出のカテゴリー別管理と金額の入力ができます。食費、交通費、光熱費などの支出を登録し、日々の出費を記録します。

    残金管理
        現在の残金の表示と更新機能があります。ユーザーが実際に持っている残金を入力し、AI予測に反映させます。

    AI予測
        AIが収支の推移を分析し、次回収入日までの使える金額を日割り平均で計算します。さらに、予測された金銭状況に基づいて調整後の使える金額を提案します。

    金銭通帳
        過去の収支履歴を日時とともに記録し、現在の貯金額を計算します。収入、支出、残金の履歴を明確にし、財務の推移を可視化します。

    AI預金設定
        目標の貯金額と目標達成日を設定します。AIが目標達成までの必要な貯金額を予測し、達成見込み日を表示します。

フローのイメージ

    ユーザー登録と初期設定
        アプリをダウンロード後、ユーザーはアカウントを作成し、収入や支出の初期設定を行います。

    ホームスクリーンの利用
        ホームスクリーンから収入管理、支出管理、残金管理、AI予測などへのアクセスが可能です。

    収入管理
        収入のカテゴリー別に金額を入力し、次回収入日を設定します。収入の周期性に合わせて自動的に収入が予測されます。

    支出管理
        支出のカテゴリーを選択し、金額を入力します。毎日の支出が記録され、AI予測に反映されます。

    残金管理
        現在の残金を入力し、更新ボタンでAI予測に反映させます。残金の推移がグラフで表示されます。

    AI予測の活用
        AIが収支のパターンを学習し、次回収入日までの使える金額を計算します。予測金額と実際の残金を比較し、適切な調整を行います。

    金銭通帳の確認
        過去の収支履歴が日時とともに表示され、現在の貯金額が計算されます。PDF出力も可能です。

各ボタンの詳細画面

    収入管理: 各収入カテゴリーと金額の入力、次回収入日の設定が可能。
    支出管理: 各支出カテゴリーと金額の入力、支出の履歴を確認。
    残金管理: 現在の残金の入力と更新、AI予測の結果の表示。
    AI予測: 収入と支出の推移グラフ、予測された使える金額の表示、調整後の使える金額の提案。
    金銭通帳: 過去の収支履歴と現在の貯金額の確認、PDF出力機能。

ユーザーの入力フロー

    収入入力: 収入カテゴリーと金額の入力、次回収入日の選択。
    支出入力: 支出カテゴリーと金額の入力、支出の履歴を記録。
    残金更新: 現在の残金を入力し、更新ボタンでAI予測に反映。
    AI予測確認: 収支のパターンと予測結果を確認し、調整後の使える金額を考慮して財務計画を立てる。

これらのフローと機能を通じて、ユーザーは効果的に個人の財務管理を行い、将来の計画や目標達成に向けたアクションをサポートします。
    ---------------------------------

    ホームスクリーン
    ---------------------------------
    |          AI家計簿アプリ          |
    ---------------------------------
    | 収入  |  支出  |  残金        |
    ---------------------------------
    | AI預金設定 | 金銭通帳 | AI予測 |
    ---------------------------------
    収入スクリーン
    
    ---------------------------------
    |           収入                |
    ---------------------------------
    | カテゴリー名 | 金額 |          |
    | 次回収入日  | [カレンダー入力] |
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
    |         AI預金設定              |
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
    | 日時          | 収入        | 支出         | 残金         |
    ---------------------------------
    | 2024/06/24    | +¥300,000   |              |              |
    | 2024/06/25    |             | -¥30,000     | -¥10,000     |
    | 2024/06/26    |             |              | -¥10,000     |
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
    | [グラフ表示２]                   |
    | 運用額の推移         |
    ---------------------------------              |
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
    日割り平均値の使える金額の計算

    日割り平均値の使える金額は、次回収入日までの期間に基づいて残金を均等に分配した場合の一日あたりの使える金額です。
        残金: RR
        次回収入日までの日数: DD

    日割り平均値の使える金額 AavgAavg​ は以下の式で計算されます：
    Aavg=RD
    Aavg​=DR​

    例えば、残金が100,000円で次回収入日までが20日の場合：
    Aavg=100,00020=5,000円
    Aavg​=20100,000​=5,000円

    AI調整後の使える金額の計算

    AI調整後の使える金額は、AIが予測した将来の金銭状況に基づいて計算される金額です。これには収入、支出、残金の推移などが考慮されますが、具体的な計算方法はAIの予測アルゴリズムに依存します。

    例えば、AIが次回収入日までの支出を予測し、残金の推移から計算した結果がAI調整後の使える金額となります。

    運用額の計算

    運用額 AdiffAdiff​ は、AI調整後の使える金額と日割り平均値の使える金額の差分です。
    Adiff=AI調整後の使える金額−Aavg
    Adiff​=AI調整後の使える金額−Aavg​

    例えば、AI調整後の使える金額が5,500円で日割り平均値の使える金額が5,000円の場合：
    Adiff=5,500−5,000=500円
    Adiff​=5,500−5,000=500円

    運用額の割合の計算

    運用額の割合 Adiff_percentAdiff_percent​ は、日割り平均値の使える金額に対する運用額の割合です。
    Adiff_percent=(AdiffAavg)×100
    Adiff_percent​=(Aavg​Adiff​​)×100

    例えば、運用額が500円で日割り平均値の使える金額が5,000円の場合：
    Adiff_percent=(5005,000)×100=10%
    Adiff_percent​=(5,000500​)×100=10%

これらの計算を実装することで、AI予測ページでの日割り平均値の使える金額、AI調整後の使える金額、運用額、そして運用額の割合を正確に表示し、ユーザーにとって有益な情報を提供できます。









