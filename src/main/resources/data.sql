INSERT INTO `test`.`body` (`id`, `armor`, `arms`, `feet`, `gloves`, `head`, `legs`, `neck`, `shoulders`) VALUES ('1', 'armor1', 'arms1', 'feet1', 'gloves1', 'head1', 'legs1', 'neck1', 'shoulders1');
INSERT INTO `test`.`body` (`id`, `armor`, `arms`, `feet`, `gloves`, `head`, `legs`, `neck`, `shoulders`) VALUES ('2', 'armor2', 'arms2', 'feet2', 'gloves2', 'head2', 'legs2', 'neck2', 'shoulders2');

INSERT INTO `test`.`clothing` (`id`, `body_id`) VALUES ('1', '1');
INSERT INTO `test`.`clothing` (`id`, `body_id`) VALUES ('2', '2');

INSERT INTO `test`.`item` (`id`, `category`, `description`, `name`, `price`, `weight`) VALUES ('1', 'category1', 'description1', 'name1', '11', '11');
INSERT INTO `test`.`item` (`id`, `category`, `description`, `name`, `price`, `weight`) VALUES ('2', 'category2', 'description2', 'name2', '22', '22');
INSERT INTO `test`.`item` (`id`, `category`, `description`, `name`, `price`, `weight`) VALUES ('3', 'category3', 'description3', 'name3', '33', '33');
INSERT INTO `test`.`item` (`id`, `category`, `description`, `name`, `price`, `weight`) VALUES ('4', 'category4', 'description4', 'name4', '44', '44');

INSERT INTO `test`.`qualities` (`id`, `charisma`, `intelligence`, `physique`, `power`, `skill`, `wisdom`) VALUES ('1', '11', '11', '11', '11', '11', '11');
INSERT INTO `test`.`qualities` (`id`, `charisma`, `intelligence`, `physique`, `power`, `skill`, `wisdom`) VALUES ('2', '22', '22', '22', '22', '22', '22');

INSERT INTO `test`.`weapon` (`id`, `bonus`, `critical`, `damage`, `munition`, `name`, `otherinfo`, `scope`, `type`) VALUES ('1', '11', '11', '11', '11', '11', 'other info1', '11', '11');
INSERT INTO `test`.`weapon` (`id`, `bonus`, `critical`, `damage`, `munition`, `name`, `otherinfo`, `scope`, `type`) VALUES ('2', '12', '12', '12', '12', '12', 'other info2', '12', '12');
INSERT INTO `test`.`weapon` (`id`, `bonus`, `critical`, `damage`, `munition`, `name`, `otherinfo`, `scope`, `type`) VALUES ('3', '21', '21', '21', '21', '21', 'other info3', '21', '21');
INSERT INTO `test`.`weapon` (`id`, `bonus`, `critical`, `damage`, `munition`, `name`, `otherinfo`, `scope`, `type`) VALUES ('4', '22', '22', '22', '22', '22', 'other info4', '22', '22');

INSERT INTO `test`.`player` (`id`, `charactername`, `gamerclass`, `gamername`, `level`, `vitality`, `clothing_id`, `qualities_id`) VALUES ('1', 'charactername1', 'gamerclass1', 'gamername1', '11', '111', '1', '1');
INSERT INTO `test`.`player` (`id`, `charactername`, `gamerclass`, `gamername`, `level`, `vitality`, `clothing_id`, `qualities_id`) VALUES ('2', 'charactername2', 'gamerclass2', 'gamername2', '22', '222', '2', '2');

INSERT INTO `test`.`player_weapon` (`player_id`, `weapon_id`) VALUES ('1', '1');
INSERT INTO `test`.`player_weapon` (`player_id`, `weapon_id`) VALUES ('1', '2');
INSERT INTO `test`.`player_weapon` (`player_id`, `weapon_id`) VALUES ('2', '3');
INSERT INTO `test`.`player_weapon` (`player_id`, `weapon_id`) VALUES ('2', '4');

INSERT INTO `test`.`player_inventory` (`player_id`, `inventory_id`) VALUES ('1', '1');
INSERT INTO `test`.`player_inventory` (`player_id`, `inventory_id`) VALUES ('1', '2');
INSERT INTO `test`.`player_inventory` (`player_id`, `inventory_id`) VALUES ('2', '3');
INSERT INTO `test`.`player_inventory` (`player_id`, `inventory_id`) VALUES ('2', '4');