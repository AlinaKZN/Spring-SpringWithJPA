-- -----------------------------------------------------
-- Schema employee_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `employee_db` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `employee_db` ;

-- -----------------------------------------------------
-- Table `employee_db`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee_db`.`employee` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `surname` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;

