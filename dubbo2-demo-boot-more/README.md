# dubbo2-demo-boot-more

## 项目简介
这是一个基于 Java Dubbo 2.6.12 版本的springboot代码示例项目，用于演示 Dubbo 微服务框架的基本使用方法。


## 使用说明
1. 默认使用 ZooKeeper 作为服务注册中心
2. 如需更换其他注册中心，只需修改application.properties 注册中心地址即可

## 服务
   - dubbo-demo-api 公共接口抽象
   - dubbo-demo-basics 服务基础模块
   - dubbo-demo-provider 服务提供者
   - dubbo-demo-consumer 服务消费者

dubbo-demo-consumer 调用 dubbo-demo-provider 调用 dubbo-demo-basics

## 已验证组件
**ZooKeeper版本**:
- [x]  3.9.4

**SpringBoot版本**:
- [x]  2.1.18.RELEASE