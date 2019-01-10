INSERT INTO `test`.`body` (`id`, `armor`, `arms`, `feet`, `gloves`, `head`, `legs`, `neck`, `shoulders`) VALUES ('1', 'armor1', 'arms1', 'feet1', 'gloves1', 'head1', 'legs1', 'neck1', 'shoulders1');
INSERT INTO `test`.`body` (`id`, `armor`, `arms`, `feet`, `gloves`, `head`, `legs`, `neck`, `shoulders`) VALUES ('2', 'armor2', 'arms2', 'feet2', 'gloves2', 'head2', 'legs2', 'neck2', 'shoulders2');

INSERT INTO `test`.`clothing` (`id`, `body_id`) VALUES ('1', '1');

INSERT INTO `test`.`item` (`id`, `category`, `description`, `name`, `price`, `weight`) VALUES ('1', 'category1', 'description1', 'name1', '10', '10');
INSERT INTO `test`.`item` (`id`, `category`, `description`, `name`, `price`, `weight`) VALUES ('2', 'category2', 'description2', 'name2', '20', '20');

INSERT INTO `test`.`player` (`id`, `charactername`, `gamerclass`, `gamername`, `level`, `vitality`, `clothing_id`) VALUES ('1', 'charactername1', 'gamerclass1', 'gamername1', '10', '200', '1');


INSERT INTO `test`.`qualities` (`id`, `charisma`, `intelligence`, `physique`, `power`, `skill`, `wisdom`) VALUES ('1', '21', '23', '56', '52', '21', '89');
INSERT INTO `test`.`qualities` (`id`, `charisma`, `intelligence`, `physique`, `power`, `skill`, `wisdom`) VALUES ('2', '56', '54', '89', '52', '20', '45');

INSERT INTO `test`.`weapon` (`id`, `bonus`, `critical`, `damage`, `munition`, `name`, `otherinfo`, `scope`, `type`) VALUES ('1', '20', '30', '45', '58', '52', 'other info', '26', '65');
INSERT INTO `test`.`weapon` (`id`, `bonus`, `critical`, `damage`, `munition`, `name`, `otherinfo`, `scope`, `type`) VALUES ('2', '30', '50', '66', '88', '52', 'other info2', '22', '22');

INSERT INTO `test`.`player_weapon` (`player_id`, `weapon_id`) VALUES ('1', '1');
INSERT INTO `test`.`player_weapon` (`player_id`, `weapon_id`) VALUES ('1', '2');

INSERT INTO `test`.`player_inventory` (`player_id`, `inventory_id`) VALUES ('1', '1');
INSERT INTO `test`.`player_inventory` (`player_id`, `inventory_id`) VALUES ('1', '2');

