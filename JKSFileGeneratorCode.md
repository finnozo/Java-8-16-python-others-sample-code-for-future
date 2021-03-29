```bash

keytool -genkey -alias springsecurity -keyalg RSA -keystore springsecurity.jks -keysize 2048
keytool -importkeystore -srckeystore springsecurity.jks -destkeystore springsecurity.jks -deststoretype pkcs12

```
