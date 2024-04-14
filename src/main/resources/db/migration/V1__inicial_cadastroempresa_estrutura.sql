DROP TABLE IF EXISTS `empresa_cadastro`;
CREATE TABLE `empresa_cadastro` (
                            `id` int(11) NOT NULL AUTO_INCREMENT,
                            `email` varchar(45) DEFAULT NULL,
                            `nomeFantasia` varchar(45) DEFAULT NULL,
                            `sobrenomeSocial` varchar(45) DEFAULT NULL,
                            `empresa` varchar(45) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;