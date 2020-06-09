DROP TABLE IF EXISTS ITEM;
 
CREATE TABLE ITEM (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  NOME VARCHAR(250) NOT NULL,
  LINK VARCHAR(250) NOT NULL,
  LINK_CURTO VARCHAR(250) DEFAULT NULL,
  COMPRADO BOOLEAN
);
 
INSERT INTO ITEM (NOME, LINK, LINK_CURTO) VALUES
  ('Aspirador de pó', 'http://teste.com.be/aspirador', 'link curto'),
  ('Cama de casal', 'http://teste.com.be/aspirador', 'link curto'),
  ('Fogao', 'http://teste.com.be/aspirador', 'link curto');