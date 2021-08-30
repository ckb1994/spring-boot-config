<h2>Microservice Configuration</h2>
Examples
<ul>
    <li>Database connections</li>
    <li>Credentials</li>
    <li>Feature flags</li>
    <li>Business Logic configuration parameters</li>
    <li>Scenario Testing</li>
    <li>Spring Boot configuration</li>
</ul>

<h4>For only config changes, It is not required to do build, test the application etc. We can do
it directly without impacting anything</h4>

<h3>Goal</h3>
<ul>
<li>Externalized</li>
<li>Environment specific</li>
<li>Consistent</li>
<li>Version History</li>
<li>Real-time Management</li>
</ul>

<h3>Application.properties are part of jar then what is benefits 
of keeping data in application.properties??</h3>

Because It can be overridden from outside.

===========================
Accessing external properties in Spring Boot

1. maven clean
2. maven install

Jar will be created in target folder

run the jar, 
java -jar jarfilename

once server is started, run localhost and see the o/p

Now, copy the app.prop file and paste in target and modify value.
again run 
java -jar jarfilename

Here, we have not done maven install so using same jar.
now after running localhost we will get value overridden from target
folder app properties file.


Here we did not generate new jar but we used externalised app.prop file.

<h3>We can modify properties directly also using command line</h3>
java -jar jarfilename --my.greet="Hey from command line"

so this prop value will be populated

========= 3 @Value annotation ========
suppose, In application.properties,
app.name=spring-boot-config



Inside Controller,

@Value("${app.name}")
String appName;

//In this case, Value is not in app.prop so using default
@Value("${app.desc:default desc}")
String desc;


============= Configuration Properties =========
