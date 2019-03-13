# springboot-xss-demo
用于演示springboot中处理xss攻击

参考博文
https://dzone.com/articles/anti-cross-site-scripting-xss-for-spring-boot-apps

实验步骤：
httpmethod=post 
url=http://localhost:8080
requst={"name":"<script>alert('43');</script>09"}
response=DemoReq{name='09'} 