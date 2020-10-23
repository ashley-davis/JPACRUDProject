-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='';

-- -----------------------------------------------------
-- Schema EngineDB
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `EngineDB` ;

-- -----------------------------------------------------
-- Schema EngineDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `EngineDB` DEFAULT CHARACTER SET utf8 ;
USE `EngineDB` ;

-- -----------------------------------------------------
-- Table `engine_db`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `engine_db` ;

CREATE TABLE IF NOT EXISTS `engine_db` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS engineuser@localhost;
SET SQL_MODE='';
CREATE USER 'engineuser'@'localhost' IDENTIFIED BY 'engineuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'engineuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `engine_db`
-- -----------------------------------------------------
START TRANSACTION;
USE `EngineDB`;
INSERT INTO `engine_db` (`id`, `name`) VALUES (1, 'EJ25');

COMMIT;

