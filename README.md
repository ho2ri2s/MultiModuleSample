# MultiModuleSample

## 用途

multi moduleの依存関係の差が、ビルド時間やそのばらつきにどう影響がでるかを測定する。

※ [DroidKaigi2019 multi-module Androidアプリケーション](https://droidkaigi.jp/2019/timetable/70971/) を参考にしています。

## 測定方法

1. 手動でmoduleを生成する

2. pythonファイルで `package` と `class` を自動生成。

`package_generator.py` で、クラスを生成したいPathやmodule名を書き換える

実行

```
python3 package_generator.py
```

3. module間の依存関係を調整

3. shellScriptで任意の回数ビルドする

```
sh measure-build-time.sh
```

4. プロジェクトルートの buildtimeディレクトリに生成されたテキストファイルでビルド時間を確認する
