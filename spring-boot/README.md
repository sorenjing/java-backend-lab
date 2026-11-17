# Spring Boot 实践

这里将按学习进度维护**独立的最小后端实验**，不将毕业设计业务直接搬进来。

## 当前状态

- 已规划目录和学习入口
- **尚未生成 Spring Boot 工程**，也未声明 REST API 已可运行

## 计划中的首个实验：REST API

1. 使用 [Spring Initializr](https://start.spring.io/) 或 IntelliJ IDEA 创建 Maven + Java 项目。
2. 选与所用 JDK 兼容的稳定 Spring Boot 版本；源码目标建议 Java 17。
3. 最少加入 Spring Web、Validation（测试依赖保持生成器默认配置）。
4. 新建 `GET /hello?name=...`，验证参数、响应、异常。
5. 引入 JUnit 测试后，再增加数据库和服务分层。

具体生成版本、依赖和脚手架在实际创建时记录，避免把未生成的代码当成现状。
