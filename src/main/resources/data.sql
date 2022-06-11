INSERT INTO tb_user (name, email, password) VALUES ('Bob', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('ana', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES ('O Poderoso Chefão', 'Lorem ipsum', 2022, 'https://br.web.img3.acsta.net/c_310_420/medias/nmedia/18/90/93/20/20120876.jpg', 'Lorem ipsum Lorem');
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES ('A Lista de Schindler', 'Lorem ipsum', 2019, 'https://br.web.img3.acsta.net/c_310_420/pictures/19/04/10/19/44/2904073.jpg', 'Lorem ipsum Lorem');
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES ('Um Sonho de Liberdade', 'Lorem ipsum', 2018, 'https://br.web.img3.acsta.net/c_310_420/medias/nmedia/18/90/16/48/20083748.jpg', 'Lorem ipsum Lorem');
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES ('O rei leão', 'Lorem ipsum', 2021, 'https://br.web.img3.acsta.net/c_310_420/medias/nmedia/18/87/84/28/19962110.jpg', 'Lorem ipsum Lorem');
INSERT INTO tb_movie (title, sub_Title, year, img_Url, synopsis) VALUES ('Forrest Gump', 'O Contador de Histórias', 2010, 'https://br.web.img3.acsta.net/c_310_420/medias/nmedia/18/87/84/28/19962110.jpg', 'Lorem ipsum Lorem');