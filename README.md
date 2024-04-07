# pet-helper-api-gateway-service

Данный микросервис является единой точкой входа в приложение.

В текущий момент CORS-политика отключена перезагрузкой браузера со следующими флагами:

```text
open /Applications/Google\ Chrome.app --args --user-data-dir="/var/tmp/chrome-dev-disabled-security" --disable-web-security --disable-site-isolation-trials
```

## Pet-Helper Service

Приложение-помощник по уходу за домашними животными

### Технологии:

#### back-end:

- java 17
- Spring (Boot, MVC, Security, Cloud, Data)
- Feign
- Lombok
- PostgreSQL
- MongoDB

#### front-end:

- Angular

### Составляющие:

#### back-end:

- [pet-helper-admin-service](https://github.com/vitmvit/pet-helper-admin-service) (микросервис администрирования)
- [pet-helper-user-service](https://github.com/vitmvit/pet-helper-user-service) (микросервис для работы с
  пользователями)
- [pet-helper-message-service](https://github.com/vitmvit/pet-helper-message-service) (микросервис для работы с чатами и
  сообщениями)
- [pet-helper-auth-service](https://github.com/vitmvit/pet-helper-auth-service) (микросервис
  авторизации/аутентификации/проверки токена)


- [pet-helper-api-gateway-service](https://github.com/vitmvit/pet-helper-api-gateway-service) (единая точка входа)
- [pet-helper-cloud-service](https://github.com/vitmvit/pet-helper-cloud-service) (микросервис для хранения настроек (
  yml файлов) сторонних микросервисов)
- [pet-helper-discovery-service](https://github.com/vitmvit/pet-helper-discovery-service) (сервис обнаружения
  микросервисов)

#### lids:

- [pet-helper-dto-lib](https://github.com/vitmvit/pet-helper-dto-lib) (хранит необходимые DTO для проектов back-end`a)

#### стартеры:

- [logging-spring-boot-starter](https://github.com/vitmvit/logging-spring-boot-starter) (логирование на уровне
  контроллеров)
- [exception-handler-spring-boot-starter](https://github.com/vitmvit/exception-error-handler-spring-boot-starter) (отлов
  исключений на стророне фронта)

#### front-end:

- [support-service-front-end](https://github.com/vitmvit/support-service-front-end) (проект фронта для пользователей
  ADMIN и SUPPORT)
- [pet-helper-service-front-end](https://github.com/vitmvit/pet-helper-service-front-end) (проект фронта для
  пользователей ГЫУК)