# HGOJ在线判题系统

基于Spring Cloud 微服务 + MQ + Docker 的编程题目评测系统。系统能够根据管理员预设的题目例对用户提交的代码进行执行和评测

## 模块说明
- common：万用的类，比如通用响应类
- gateway：网关模块
- judge-service：判题模块
- model：公用实体类
- question-service：问题信息模块
- service-client：内部服务模块
- user-service：用户信息模块
