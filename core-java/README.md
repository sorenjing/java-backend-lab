# Core Java

从无第三方依赖的可运行小实验开始，先理解语言和标准库，再引入 Spring Boot。

## 01 · Map 统计词频

源码：[WordFrequencyDemo.java](src/main/java/dev/sorenjing/lab/collections/WordFrequencyDemo.java)

本实验使用 `LinkedHashMap` 统计字符串出现次数，并保留**首次出现的顺序**。普通 `HashMap` 不承诺遍历顺序。

PowerShell（在仓库根目录）：

```powershell
New-Item -ItemType Directory -Force .\build\classes | Out-Null
javac --release 17 -d .\build\classes .\core-java\src\main\java\dev\sorenjing\lab\collections\WordFrequencyDemo.java
java -cp .\build\classes dev.sorenjing.lab.collections.WordFrequencyDemo
```

练习建议：把输入换成空数组、只有一个词、全部重复词，观察结果并补充断言。

> 当前仅初始化一个入门例子；后续按实际学习进度添加 OOP、异常、泛型、并发等专题，不预建空文件夹。
