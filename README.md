# springboot-test
## first spring-boot Demo
#### 1.设置端口号和访问路径 application.properties
```
server.port = 8085
server.context-path=/springBoot
```
#### 2.添加启动类
```
@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String args[]) {

        SpringApplication.run(HelloWorldApplication.class,args);

    }

}
```
#### 3.添加控制层
```
@RestControllerpublic class HelloWorldController {  

     @RequestMapping("/hello")    
     public String helloMethod(){       
         return  "hello spring-boot";   
     }
}
```
