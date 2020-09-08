-- 自动构建数据库表
CREATE DATABASE IF NOT EXISTS myblog CHARACTER SET UTF8;

USE myblog;
-- 用户表，包括超级管理员
CREATE TABLE  IF NOT EXISTS `user` (
`uid` int(11) NOT NULL AUTO_INCREMENT,
`account` varchar(20) NOT NULL,
`password` varchar(20) NOT NULL,
`actived` tinyint(1) NOT NULL,
PRIMARY KEY (`uid`) ,
UNIQUE INDEX `uni_account` (`account` ASC) USING BTREE
);

-- 用户信息表
CREATE TABLE IF NOT EXISTS `user_info` (
`id` int NOT NULL AUTO_INCREMENT,
`user_name` varchar(20) NOT NULL,
`uid` int NOT NULL,
`user_head` varchar(30) NOT NULL,
`phone` varchar(11) NULL,
`email` varchar(20) NULL,
`create_time` datetime NULL ON UPDATE CURRENT_TIMESTAMP,
`update_time` datetime NULL ON UPDATE CURRENT_TIMESTAMP,
`motto` varchar(200) NULL,
`read_music` varchar(30) NULL,
PRIMARY KEY (`id`) ,
INDEX `IDX_account` (`user_name` ASC)
);

-- 文章类型表
CREATE TABLE  IF NOT EXISTS  `article_type` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`type_name` varchar(15) NOT NULL,
PRIMARY KEY (`id`) ,
INDEX `IDX_type_name` (`type_name` ASC) USING BTREE
);

-- 文章基本信息
CREATE TABLE IF NOT EXISTS  `article_info` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`user_id` int(11) NOT NULL,
`type_id` int(11) NOT NULL,
`art_content_id` int NOT NULL,
`art_title` varchar(20) NOT NULL,
`create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
`read_count` int NULL,
`like_count` int NULL,
`down_count` int NULL,
PRIMARY KEY (`id`) ,
INDEX `IDX_art_title` (`art_title` ASC) USING BTREE
);

-- 文章内容
CREATE TABLE IF NOT EXISTS  `artcle_content` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`art_content` text CHARACTER SET utf8 NOT NULL,
PRIMARY KEY (`id`)
);

ALTER TABLE `user_info` ADD CONSTRAINT `fk_userinfo_uid` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `article_info` ADD CONSTRAINT `FK_art_type` FOREIGN KEY (`type_id`) REFERENCES `article_type` (`id`);
ALTER TABLE `article_info` ADD CONSTRAINT `FK_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`uid`);
ALTER TABLE `article_info` ADD CONSTRAINT `FK_art_content_id` FOREIGN KEY (`art_content_id`) REFERENCES `artcle_content` (`id`);

