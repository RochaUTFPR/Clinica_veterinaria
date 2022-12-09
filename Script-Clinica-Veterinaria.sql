-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema clinica
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema clinica
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clinica` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `clinica` ;

-- -----------------------------------------------------
-- Table `clinica`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinica`.`cliente` (
  `id_cli` INT NOT NULL AUTO_INCREMENT,
  `nome_cli` VARCHAR(60) NOT NULL,
  `cpf_cli` VARCHAR(20) NOT NULL,
  `telefone_cli` VARCHAR(20) NOT NULL,
  `endereco_cli` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id_cli`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clinica`.`animal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinica`.`animal` (
  `id_animal` INT NOT NULL AUTO_INCREMENT,
  `id_cli` INT NOT NULL,
  `especie` VARCHAR(45) NOT NULL,
  `raca` VARCHAR(45) NOT NULL,
  `nome_animal` VARCHAR(45) NULL DEFAULT NULL,
  `idade` VARCHAR(45) NULL DEFAULT NULL,
  `sexo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_animal`, `id_cli`),
  INDEX `id_cli_idx` (`id_cli` ASC) VISIBLE,
  CONSTRAINT `id_cli`
    FOREIGN KEY (`id_cli`)
    REFERENCES `clinica`.`cliente` (`id_cli`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clinica`.`funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinica`.`funcionario` (
  `cpf_func` VARCHAR(20) NOT NULL,
  `id_func` INT NOT NULL AUTO_INCREMENT,
  `nome_func` VARCHAR(60) NOT NULL,
  `datanasc_func` VARCHAR(20) NOT NULL,
  `usuario` VARCHAR(10) NOT NULL,
  `senha` VARCHAR(10) NOT NULL,
  `perfil` VARCHAR(20) NOT NULL,
  `cargo` VARCHAR(30) NOT NULL,
  `salario` FLOAT NOT NULL,
  `crvm` INT NULL DEFAULT NULL,
  `telefone_func` VARCHAR(20) NOT NULL,
  `endereco_func` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id_func`, `cpf_func`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clinica`.`consulta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinica`.`consulta` (
  `codigo_cons` INT NOT NULL AUTO_INCREMENT,
  `data` VARCHAR(20) NOT NULL,
  `hora` VARCHAR(15) NOT NULL,
  `servico` VARCHAR(30) NOT NULL,
  `peso` FLOAT NULL DEFAULT NULL,
  `altura` FLOAT NULL DEFAULT NULL,
  `pressao` VARCHAR(20) NULL DEFAULT NULL,
  `gravidade` VARCHAR(30) NULL DEFAULT NULL,
  `valor` FLOAT NOT NULL,
  `procedimento` VARCHAR(2000) NULL DEFAULT NULL,
  `diagnostico` VARCHAR(2000) NULL DEFAULT NULL,
  `medicacao` VARCHAR(2000) NULL DEFAULT NULL,
  `id_func` INT NOT NULL,
  `id_animal` INT NOT NULL,
  `id_cli` INT NOT NULL,
  PRIMARY KEY (`codigo_cons`, `id_func`, `id_animal`, `id_cli`),
  INDEX `fk_consulta_funcionario1_idx` (`id_func` ASC) VISIBLE,
  INDEX `fk_consulta_animal1_idx` (`id_animal` ASC, `id_cli` ASC) VISIBLE,
  CONSTRAINT `fk_consulta_funcionario1`
    FOREIGN KEY (`id_func`)
    REFERENCES `clinica`.`funcionario` (`id_func`),
  CONSTRAINT `fk_consulta_animal1`
    FOREIGN KEY (`id_animal` , `id_cli`)
    REFERENCES `clinica`.`animal` (`id_animal` , `id_cli`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clinica`.`estoque`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinica`.`estoque` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(30) NOT NULL,
  `descricao` VARCHAR(45) NULL DEFAULT NULL,
  `dataval` VARCHAR(20) NOT NULL,
  `quantidade` INT NOT NULL,
  `fornecedor` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



-- -----------------------------------------------------
-- usuario para testes
-- -----------------------------------------------------

insert into funcionario (cpf_func,nome_func,datanasc_func,usuario,senha,perfil,cargo,salario,crvm,telefone_func,endereco_func) 
values ('111.111.111-11','Pedro Rocha','07/10/1994','adm','123','Administrador','testador', 1900 , 9876,'(11)12345-6789','rua joaquim dias castanho, numero 19');

insert into funcionario (cpf_func,nome_func,datanasc_func,usuario,senha,perfil,cargo,salario,crvm,telefone_func,endereco_func) 
values ('222.222.222-22','Luciano gutler','23/06/2003','user','123','Comum','chefe', 5000 ,null,'(27)98765-4321','rua bahia da silva, numero 69');




