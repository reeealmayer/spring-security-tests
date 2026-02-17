INSERT INTO users (username, password, role, status)
VALUES ('admin', '$2a$12$IrO8TeZ7eKkBTByAT.MQq.ve2bifEzrsE08n.Uj3OagNJJJzaqxLO', 'ADMIN', 'ACTIVE'),
       ('user', '$2a$12$M.LKlr64h3fXKkFDCgFiO.4Nvd/FQaSuZLPJmvDNjRPh6qvNvphsK', 'USER', 'BANNED')
on conflict do nothing;