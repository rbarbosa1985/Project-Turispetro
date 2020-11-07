INSERT INTO tb_category (name) VALUES ('Restaurante');
INSERT INTO tb_category (name) VALUES ('Hotel');
INSERT INTO tb_category (name) VALUES ('Ponto Turistico');

INSERT INTO tb_establishment (name, street, number, neighborhood, city, state , zip, addon, site, email, capacity, lat, lon, avarage, category_id) VALUES ('Ace Morada e Chalet', 'Av. Pres. Kennedy', 473, 'Centro', 'Petropolis' , 'Rio de Janeiro', '25680-030',	'', 'ACE Morada & Chalet', '' , 19, '-22.50384', '-43.18773', 5.0, 1);

INSERT INTO tb_phone (phone, establishment_id) VALUES ('21971414389', 1);
INSERT INTO tb_phone (phone, establishment_id) VALUES ('21984467508', 1);

INSERT INTO tb_admin (name, email, phone, birthdate, password) VALUES ('Gabi', 'gabi@gmail.com', '21984467508', null, '123');
