# pet-helper-api-gateway-service

Данный микросервис является единой точкой входа в приложение.

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

- pet-helper-admin-service (микросервис администрирования)
- pet-helper-user-service (микросервис для работы с пользователями)
- pet-helper-message-service (микросервис для работы с чатами и сообщениями)
- pet-helper-auth-service (микросервис авторизации/аутентификации/проверки токена)


- pet-helper-api-gateway-service (единая точка входа)
- pet-helper-cloud-service (микросервис для хранения настроек (yml файлов) сторонних микросервисов)
- pet-helper-discovery-service (сервис обнаружения микросервисов)

#### lids:

- pet-helper-dto-lib (хранит необходимые DTO для проектов back-end`a)

#### стартеры:

- logging-spring-boot-starter (логирование на уровне контроллеров)
- exception-handler-spring-boot-starter (отлов исключений на стророне фронта)

#### front-end:

- support-service-front-end (проект фронта для пользователей ADMIN и SUPPORT)