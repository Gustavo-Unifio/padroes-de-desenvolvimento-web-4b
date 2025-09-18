/* INSERTS DE PAGAMENTOS */
INSERT INTO pagamentos (valor, metodoPagamento, status, data_pagamento, comprovante_url, contratacoes_id)
VALUES (150.00, 'Cartão de Crédito', 'APROVADO', '2025-09-10', 'https://exemplo.com/comprovante1.jpg', 1);

INSERT INTO pagamentos (valor, metodoPagamento, status, data_pagamento, comprovante_url, contratacoes_id)
VALUES (200.50, 'Boleto', 'PENDENTE', '2025-09-11', 'https://exemplo.com/comprovante2.jpg', 2);

INSERT INTO pagamentos (valor, metodoPagamento, status, data_pagamento, comprovante_url, contratacoes_id)
VALUES (320.75, 'Pix', 'APROVADO', '2025-09-12', 'https://exemplo.com/comprovante3.jpg', 3);

INSERT INTO pagamentos (valor, metodoPagamento, status, data_pagamento, comprovante_url, contratacoes_id)
VALUES (99.90, 'Cartão de Débito', 'RECUSADO', '2025-09-13', 'https://exemplo.com/comprovante4.jpg', 4);

INSERT INTO pagamentos (valor, metodoPagamento, status, data_pagamento, comprovante_url, contratacoes_id)
VALUES (500.00, 'Transferência Bancária', 'APROVADO', '2025-09-14', 'https://exemplo.com/comprovante5.jpg', 5);


/* INSERTS DE SERVICOS */
INSERT INTO servicos (nome, descricao, categoria)
VALUES ('Faxina Residencial', 'Serviço de limpeza completa em residências, incluindo pisos, janelas e organização geral', 'Serviços Domésticos');

INSERT INTO servicos (nome, descricao, categoria)
VALUES ('Cuidado com Idosos', 'Acompanhamento, auxílio em tarefas diárias e atenção especial à saúde e bem-estar de idosos', 'Cuidados Especiais');

INSERT INTO servicos (nome, descricao, categoria)
VALUES ('Babá', 'Cuidado com crianças, incluindo alimentação, higiene e atividades recreativas', 'Cuidados Especiais');

INSERT INTO servicos (nome, descricao, categoria)
VALUES ('Passadoria de Roupas', 'Serviço de passar roupas de forma organizada e profissional, com atenção a tecidos delicados', 'Serviços Domésticos');

INSERT INTO servicos (nome, descricao, categoria)
VALUES ('Cozinha Caseira', 'Preparo de refeições simples e saudáveis para o dia a dia da família', 'Serviços Domésticos');
