# Java Backend Lab

Hands-on Java backend learning, from core Java and JVM to Spring Boot and backend engineering.

> 本仓库记录**通用原理、可复现实验和学习笔记**。具体业务实现留在各自的项目仓库；面试复盘留在 `interview-notes`。

## 学习路线

| 阶段 | 主题 | 产出 |
| --- | --- | --- |
| 1 | Java 语法、面向对象、集合、泛型、异常 | 能独立编译和运行小练习 |
| 2 | JVM、IO/NIO、线程和 JUC | 能解释行为，并用实验验证 |
| 3 | Maven、JUnit、Spring / Spring Boot | 建立可测试的 REST API |
| 4 | 持久化、事务、认证、缓存与异步任务 | 串联实际后端调用链 |
| 5 | 可靠性、观测、部署和性能 | 形成能复现的工程实验 |

具体学习顺序见 [docs/learning-path.md](docs/learning-path.md)。

## 仓库目录

- [core-java/](core-java/)：不依赖框架的 Java 小实验；已提供集合示例。
- [spring-boot/](spring-boot/)：Spring Boot 学习和项目初始化说明；**尚未生成应用模板**。
- [docs/](docs/)：学习路线和实验记录约定。

## 运行第一个实验

**要求：JDK 17 或更高版本**。示例以 Java 17 语法为基线，即使用 JDK 25 也可以学习。

在仓库根目录使用 PowerShell：

```powershell
java -version
javac -version
New-Item -ItemType Directory -Force .\build\classes | Out-Null
javac --release 17 -d .\build\classes .\core-java\src\main\java\dev\sorenjing\lab\collections\WordFrequencyDemo.java
java -cp .\build\classes dev.sorenjing.lab.collections.WordFrequencyDemo
```

预期输出：

```text
java=2
spring=2
docker=1
```

无需安装 Spring Boot 就可以运行这个入门例子。Spring Boot 实践见 [spring-boot/README.md](spring-boot/README.md)。

## 边界与原则

1. 每个实验写清 **目的、环境、操作、预期、实际结果**；未验证不得写成“已通过”。
2. 不把毕业设计的业务代码、真实数据、私有配置和个人面试记录复制进来。
3. 数据库专项 SQL / Docker 实验放在 [database-lab](https://github.com/sorenjing/database-lab)。
4. 算法题解放在 [algorithms](https://github.com/sorenjing/algorithms)。
5. 不提交密码、Token、`.env` 或 IDE 本机文件。

## License

[MIT](LICENSE)。第三方教材与依赖代码遵循其各自的许可证。
