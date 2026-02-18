Тесты по Spring Security

Запуск
- docker-compose up
- запустить SpringSecurityTestsApplication

Эндпоинты

- /api/v1/login - jwt auth user/user, admin/admin
- /api/v1/logout - jwt auth (GET для всех, POST для админа только)
- /api/v1/developers - Вставить token в хидер Authorization