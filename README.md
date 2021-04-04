# microServiceExample
MicroServices and SpringBoot Learning purpose repository

Creating your own Application:

### Step-1:

Create a Maven Project in any IDE - Intellij or Eclipse.
<br>

### Step-2:

Add spring-boot-starter-parent as parent in the pom.xml file. This plugin contains/extends prerequisites for Java + Spring framework.
<br>

```
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.4.4</version>
</parent>
```

### Step-3:

Add spring-boot-starter-web dependency in the pom.xml file. This dependency includes more dependencies to build a web application such as spring-webmvc, spring-web, and etc. This dependency is responsible for allowing us to use RequestMapping for REST API desinging.

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <version>2.4.4</version>
</dependency>
```


### Step-4.1:

Add a RestController file, which describes your service. In the following example, I'm just adding GET method, which displays a Text.

```
// RestController - Spring assumes this as REST Style Service.
// It is a convenience annotation which is annotated with @Controller and @ResponseBody
@RestController
public class MicroServiceController {

    // RequestMapping - Annotation for mapping web requests onto methods in request-handling classes with flexible method signatures
    @RequestMapping("/")
    String getMainHome(){
        return "MicroService Example achieved";
    }

}
```

### Step-4.2:

This spring application should be made as stand-alone application, so we need to write the main method here.

```
public static void main(String[] args) throws Exception {
// This command will start the auto-configured Tomcat web server.
SpringApplication.run(MicroServiceController.class, args);
}
```

### Step-4.3:

Adding ```@EnableAutoConfiguration``` would be good practice if you don't have different Config changes, Let the SpringBoot assume the Configurations.

### Step-5:

We have done the initial changes needed. Lets try to run the following command -

```mvn clean install spring-boot:run```

Wait for few minutes for firtst run, plugins downloads will happen. After few mins, try this URL in the browser.

```http://localhost:8080/```

This Call will be mapped to the ```RequestMapping("/")``` and whatever method associated with it will get executed.

### Step-6.1:

If you need to create an executable jar file then, we need to added this plugin in the build tag.
This plugin will help us create a executable jar file with necessary dependinces.

```
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

### Step-6.2:

Execute the following commands in terminal.

```mvn clean install```

```java - jar target/<your-project-name>-1.0-SNAPSHOT.jar```

.
