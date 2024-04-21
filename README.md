#TechConsultantManagement
This is a mini-project based of Tulsko's lesson and demo on YouTube on Servlet, JSP, Eclipse, Tomcat, JDBC, and Maven technologies.
Project Requirements
From the home page
1. Create a button when clicked should create a database in MySQL and populate it with sample data.
2. Get user input (techid) and display tech consultant's information

#DLL
----
CREATE DATABASE tech_consultant;
USE tech_consultant;

CREATE TABLE `techconsultant` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(200) NOT NULL,
	`field` VARCHAR(200) NOT NULL,	
	PRIMARY KEY (`id`)
);

SHOW TABLES;

INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (1, 'vero', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (2, 'id', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (3, 'veritatis', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (4, 'et', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (5, 'adipisci', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (6, 'ratione', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (7, 'alias', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (8, 'qui', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (9, 'qui', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (10, 'quisquam', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (11, 'voluptatem', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (12, 'velit', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (13, 'officiis', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (14, 'ut', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (15, 'ex', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (16, 'voluptas', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (17, 'ut', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (18, 'quasi', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (19, 'rerum', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (20, 'similique', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (21, 'temporibus', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (22, 'minus', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (23, 'ut', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (24, 'ut', 'Port');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (25, 'corrupti', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (26, 'consectetur', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (27, 'aliquid', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (28, 'nostrum', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (29, 'ipsum', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (30, 'exercitationem', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (31, 'incidunt', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (32, 'a', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (33, 'maiores', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (34, 'delectus', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (35, 'eius', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (36, 'beatae', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (37, 'iusto', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (38, 'sint', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (39, 'explicabo', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (40, 'dolorem', 'Port');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (41, 'et', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (42, 'officiis', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (43, 'quidem', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (44, 'asperiores', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (45, 'et', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (46, 'ut', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (47, 'impedit', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (48, 'aut', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (49, 'sed', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (50, 'quae', 'Port');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (51, 'ut', 'Port');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (52, 'quia', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (53, 'veniam', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (54, 'quia', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (55, 'sunt', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (56, 'reprehenderit', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (57, 'rerum', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (58, 'at', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (59, 'illum', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (60, 'aut', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (61, 'et', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (62, 'cupiditate', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (63, 'voluptatem', 'Port');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (64, 'sit', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (65, 'ut', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (66, 'qui', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (67, 'iure', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (68, 'voluptas', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (69, 'eaque', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (70, 'facere', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (71, 'voluptate', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (72, 'quam', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (73, 'consequatur', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (74, 'earum', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (75, 'nostrum', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (76, 'libero', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (77, 'ea', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (78, 'praesentium', 'North');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (79, 'tenetur', 'Port');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (80, 'cum', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (81, 'non', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (82, 'sequi', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (83, 'ipsam', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (84, 'facere', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (85, 'corrupti', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (86, 'voluptas', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (87, 'occaecati', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (88, 'ut', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (89, 'sit', 'Port');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (90, 'assumenda', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (91, 'sapiente', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (92, 'eos', 'South');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (93, 'architecto', 'Port');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (94, 'tenetur', 'East');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (95, 'similique', 'Port');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (96, 'vero', 'Lake');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (97, 'placeat', 'West');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (98, 'sed', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (99, 'necessitatibus', 'New');
INSERT INTO `techconsultant` (`id`, `name`, `field`) VALUES (100, 'eligendi', 'New');# TechConsultantManagement
