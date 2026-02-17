INSERT INTO users (username, password, role, status)
VALUES ('admin', 'admin', 'ADMIN', 'ACTIVE'),
       ('user', 'user', 'USER', 'BANNED')
on conflict do nothing;