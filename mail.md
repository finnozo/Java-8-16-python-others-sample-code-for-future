```properties
  spring.mail.host=email-smtp.us-east-1.amazonaws.com
  spring.mail.username=<your-aws-access-key-id>
  spring.mail.password=<your-aws-secret-access-key>
```

```maven
<dependency>
  <groupId>com.amazonaws</groupId>
  <artifactId>aws-java-sdk-ses</artifactId>
  <version>1.11.853</version>
</dependency>

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-mail</artifactId>
</dependency>

```


```java
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

@Service
public class EmailService {

  @Autowired
  private JavaMailSender javaMailSender;

  public void sendEmailWithAttachment(String to, String subject, String body, String fileName, byte[] file) throws MessagingException {
    MimeMessage message = javaMailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(message, true);

    helper.setTo(to);
    helper.setSubject(subject);
    helper.setText(body);
    helper.addAttachment(fileName, new ByteArrayResource(file));

    javaMailSender.send(message);
  }
}

```

```java
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class EmailService {

  @Autowired
  private JavaMailSender javaMailSender;

  public void sendEmail(String to, String subject, String body) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setTo(to);
    message.setSubject(subject);
    message.setText(body);

    javaMailSender.send(message);
  }
}

```
