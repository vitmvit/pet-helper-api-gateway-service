# pet-helper-api-gateway-service

Данный микросервис является единой точкой входа в приложение.

## Pet-Helper Service

Приложение-помощник по уходу за домашними животными.

### Технологии:

#### back-end:

- java 17
- Spring (Boot, MVC, Security, Cloud, Data)
- Feign
- Lombok
- PostgreSQL
- MongoDB
- Redis (необходимо установить и запустить)

#### front-end:

- Angular
- Ionic
- TypeScript

### Составляющие:

#### back-end:

- [pet-helper-admin-service](https://github.com/vitmvit/pet-helper-admin-service) (микросервис администрирования)
- [pet-helper-user-service](https://github.com/vitmvit/pet-helper-user-service) (микросервис для работы с
  пользователями)
- [pet-helper-message-service](https://github.com/vitmvit/pet-helper-message-service) (микросервис для работы с чатами и
  сообщениями)
- [pet-helper-auth-service](https://github.com/vitmvit/pet-helper-auth-service) (микросервис
  авторизации/аутентификации/проверки токена)
- [pet-helper-image-service](https://github.com/vitmvit/pet-helper-image-service) (микросервис обработки
  изображений/аватаров)
- [pet-helper-editor-service](https://github.com/vitmvit/pet-helper-editor-service) (микросервис для работы со
  справочными таблицами)
- [pet-helper-service](https://github.com/vitmvit/pet-helper-service) (микросервис для работы с мобильной частью
  приложения)


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

- [vet-service-front-end](https://github.com/vitmvit/vet-service-front-end) (проект фронта для пользователей VET)
- [support-service-front-end](https://github.com/vitmvit/support-service-front-end) (проект фронта для пользователей
  ADMIN и SUPPORT)
- [pet-helper-service-front-end](https://github.com/vitmvit/pet-helper-service-front-end) (проект фронта для
  пользователей USER)