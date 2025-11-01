# Dubbo Demo Project

## 项目简介
这是一个基于 Java Dubbo 2.6.12 版本的代码示例项目，用于演示 Dubbo 微服务框架的基本使用方法。


## 已验证组件
**ZooKeeper版本**:
- [x]  3.9.4

**Tomcat版本**:
- [x]  9.0.109


## 使用说明
1. 默认使用 ZooKeeper 作为服务注册中心
2. 如需更换其他注册中心，只需修改以下配置文件：
   - [pom.xml](file://D:\project\java\dubbo-demo\pom.xml) - 依赖配置
   - [applicationContext.xml](file://D:\project\java\dubbo-demo\dubbo-demo-consumer\target\classes\applicationContext.xml) - 注册中心地址配置



