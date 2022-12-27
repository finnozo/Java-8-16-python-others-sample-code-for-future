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
