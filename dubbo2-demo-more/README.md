# dubbo2-demo-more

## 项目简介
这是一个基于 Java Dubbo 2.6.12 版本的多个服务调用代码示例项目，用于演示 Dubbo 微服务框架的基本使用方法。


## 使用说明
1. 默认使用 ZooKeeper 作为服务注册中心
2. 如需更换其他注册中心，只需修改以下配置文件：
    - pom.xml 依赖配置
    - applicationContext.xml  注册中心类型及地址配置

## 服务
   - dubbo-demo-api 公共接口抽象
   - dubbo-demo-basics 服务基础提供者
   - dubbo-demo-provider 服务提供者
   - dubbo-demo-consumer 服务消费者

dubbo-demo-consumer 调用 dubbo-demo-provider 调用 dubbo-demo-basics

## 已验证组件
**ZooKeeper版本**:
- [x]  3.9.4

**Tomcat版本**:
- [x]  9.0.109