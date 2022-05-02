# JAVA MySql Connector Template

![alt text](./assets/javalogo2.jpg)

### A template to connect my project to  mysql project
* Notes

**Specify the connection parameters**
```java
String username = "root";
String url = "jdbc:mysql://localhost:3306/university";
String password = "valarMorgolis125";
```
**returns the number of the columns, to avoid out of range  error**
```java
int column_count = resultSetMeta.getColumnCount()
```


