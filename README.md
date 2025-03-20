## Easy-Stay 视频在线分享平台

EasyStay 是一个基于Spring Boot的视频分享平台，支持用户上传、审核、评论视频等功能。该项目使用了MyBatis作为持久层框架，MySQL作为数据库，Elasticsearch进行全文搜索，Redis作为缓存。

## 功能特性

- 用户注册与登录
- 视频上传与审核
- 视频评论与弹幕功能
- 个人中心系统
- 视频搜索功能

## 技术栈

- **后端**: Spring Boot, MyBatis, MySQL, Elasticsearch, Redis
- **前端**: Vue3,element-plus
- **构建工具**: Maven

## 安装与运行

### 环境准备

- JDK 1.8
- Maven 3.6+
- MySQL 5.7+
- Redis 5.0+
- Elasticsearch 7.0+

### 项目构建

1. 克隆项目到本地 `git clone https://github.com/yourusername/easylive-server.git`
2. 构建项目   `mvn clean install`
3. 启动Elasticsearch
4. 修改配置文件关键配置
5. 启动服务
`mvn spring-boot:run -pl easystay-web`
`mvn spring-boot:run -pl easystay-admin`


### 数据库初始化

1. 导入数据库脚本

## 使用说明

- 用户注册与登录
- 上传视频
- 视频审核
- 视频评论与弹幕功能
- 个人中心系统
- 视频搜索功能

## 贡献指南

欢迎任何形式的贡献，包括但不限于代码提交、文档改进、问题报告等。


