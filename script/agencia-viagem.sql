CREATE DATABASE agencia_viagens;
antes de executar o restante do script:
\c agencia_viagens;

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE roles (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE
);

Usuários e Papéis
CREATE TABLE user_roles (
    user_id INT NOT NULL,
    role_id INT NOT NULL,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES roles (id) ON DELETE CASCADE
);

CREATE TABLE destinos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    localizacao VARCHAR(100) NOT NULL,
    descricao TEXT,
    media_avaliacoes DOUBLE PRECISION DEFAULT 0,
    quantidade_avaliacoes INT DEFAULT 0
);

INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO users (username, password) VALUES ('admin', 'ecKYUghtOreNTicisHeoNTe'); 
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);
