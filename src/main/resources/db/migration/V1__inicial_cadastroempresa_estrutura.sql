DROP TABLE IF EXISTS credencial;
CREATE TABLE credencial (
                            bloqueada BOOLEAN,
                            expirada VARCHAR(255),
                            senha VARCHAR(255)
);

DROP TABLE IF EXISTS Documentacao;
CREATE TABLE Documentacao (
                              numero VARCHAR(255),
                              orgaoEmissor VARCHAR(255),
                              estadoEmissor VARCHAR(255),
                              dataValidade DATE
);

DROP TABLE IF EXISTS Domicilio;
CREATE TABLE Domicilio (
                           id INT AUTO_INCREMENT PRIMARY KEY
);

DROP TABLE IF EXISTS Endereco;
CREATE TABLE Endereco (
                          cep VARCHAR(20),
                          logradouro VARCHAR(255),
                          numero VARCHAR(20),
                          bairro VARCHAR(100),
                          complemento VARCHAR(255),
                          pontoReferencia VARCHAR(255),
                          uf VARCHAR(2),
                          cidade VARCHAR(100),
                          ibge INT,
                          PRIMARY KEY (cep)
);

DROP TABLE IF EXISTS Identificacao;
CREATE TABLE Identificacao (
                               empresa INT,
                               identificador VARCHAR(255),
                               PRIMARY KEY (empresa)
);

DROP TABLE IF EXISTS Inscrito;
CREATE TABLE Inscrito (
                          assinante BOOLEAN,
                          associado BOOLEAN,
                          afiliado BOOLEAN
);

DROP TABLE IF EXISTS Parceiro;
CREATE TABLE Parceiro (
                          cliente BOOLEAN,
                          fornecedor BOOLEAN,
                          prestador BOOLEAN,
                          colaborador BOOLEAN
);

DROP TABLE IF EXISTS Telefone;
CREATE TABLE Telefone (
                          numero BIGINT,
                          celular BOOLEAN,
                          whatsapp BOOLEAN,
                          telegram BOOLEAN
);

INSERT INTO pessoa (id, cpf_cnpj, nome, nome_fantasia, email, aniversario, token) VALUES
                                                                                      ( '98765432100', 'Maria Oliveira', 'Maria Modas', 'maria@example.com', '1985-10-20', 'token2'),
                                                                                      ( '45678912300', 'Pedro Souza', 'Pedro Informática', 'pedro@example.com', '1988-03-25', 'token3'),
                                                                                      ( '78912345600', 'Ana Santos', 'Ana Cosméticos', 'ana@example.com', '1995-07-08', 'token4'),
                                                                                      ('65432198700', 'Lucas Lima', 'Lima & Associados', 'lucas@example.com', '1983-12-12', 'token5');