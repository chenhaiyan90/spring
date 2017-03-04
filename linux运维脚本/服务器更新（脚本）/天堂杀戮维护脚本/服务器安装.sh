#!/bin/bash
#author zss
##����������ip
serverIP=$1
###������id
serverId=$2
###���ݿ�ip
dbserverIp=$3
###ƽ̨id ��׿���=2 Ӧ�ñ�=20 iosԽ��=19 ios�ٷ�=17
deptid=$4
###��������
openDate=$5
###�汾��
ver=$6
flag='&amp'
yum install rsync
mkdir -p /usr/local/heeking_install
cd /usr/local/heeking_install
##���ذ�װ�ļ�
rsync -az 10.10.107.249::update_saintkill/jdk1.8/jdk-8u73-linux-x64.gz  /usr/local/heeking_install/
rsync -az 10.10.107.249::update_saintkill/jdk1.8/install_jdk.sh  /usr/local/heeking_install/
rsync -az 10.10.107.249::update_saintkill/mysqlclient/MySQL-client-5.6.19-1.linux_glibc2.5.x86_64.rpm  /usr/local/heeking_install/
rsync -az 10.10.107.249::update_saintkill/apache-tomcat-8.0.26.tar.gz  /usr/local/heeking_install/
rsync -az 10.10.107.249::update_saintkill/install_version${ver}/gameserver.tar.gz /usr/local/heeking_install/
rsync -az 10.10.107.249::update_saintkill/install_version${ver}/db.tar.gz /usr/local/heeking_install/
##��װJDK
chmod 777 install_jdk.sh
./install_jdk.sh
#####2��װ mysqlclient
rpm -ivh MySQL-client-5.6.19-1.linux_glibc2.5.x86_64.rpm 
####��װtomcat8.0.26
mkdir -p /data/heeking/
mv /usr/local/heeking_install/apache-tomcat-8.0.26.tar.gz /data/heeking/
cd /data/heeking/
tar -zxvf apache-tomcat-8.0.26.tar.gz
rm -rf /data/heeking/apache-tomcat-8.0.26/webapps/*
rm -rf /data/heeking/apache-tomcat-8.0.26/conf/context.xml
####�޸� context.xml 
echo "<?xml version='1.0' encoding='utf-8'?>
<Context>
        <Resource name=\"jdbc/account\" factory=\"org.apache.tomcat.dbcp.dbcp2.BasicDataSourceFactory\" auth=\"Container\" type=\"javax.sql.DataSource\"
               maxActive=\"30\" maxIdle=\"5\" maxWait=\"10000\" validationQuery=\"select 1\"
               username=\"saintdbcon\" password=\"87ohB07jG7\" driverClassName=\"com.mysql.jdbc.Driver\"
               url=\"jdbc:mysql://${dbserverIp}/heeking_account?autoReconnect=true${flag};useUnicode=true${flag};characterEncoding=utf8\"/>
        <Resource name=\"jdbc/role\" factory=\"org.apache.tomcat.dbcp.dbcp2.BasicDataSourceFactory\" auth=\"Container\" type=\"javax.sql.DataSource\"
               maxActive=\"30\" maxIdle=\"5\" maxWait=\"10000\" validationQuery=\"select 1\"
              username=\"saintdbcon\" password=\"87ohB07jG7\" driverClassName=\"com.mysql.jdbc.Driver\"
               url=\"jdbc:mysql://${dbserverIp}/heeking_role?autoReconnect=true${flag};useUnicode=true${flag};characterEncoding=utf8\"/>
        <Resource name=\"jdbc/gamedata\" factory=\"org.apache.tomcat.dbcp.dbcp2.BasicDataSourceFactory\" auth=\"Container\" type=\"javax.sql.DataSource\"
               maxActive=\"30\" maxIdle=\"5\" maxWait=\"10000\" validationQuery=\"select 1\"
               username=\"saintdbcon\" password=\"87ohB07jG7\" driverClassName=\"com.mysql.jdbc.Driver\"
               url=\"jdbc:mysql://${dbserverIp}/heeking_gamedata?aautoReconnect=true${flag};useUnicode=true${flag};characterEncoding=utf8\"/>
    <WatchedResource>WEB-INF/web.xml</WatchedResource>
</Context>
" > /data/heeking/apache-tomcat-8.0.26/conf/context.xml
###�޸� serverparam.properties 
sed -i "/server.sid=/ {s/.*/server.sid=${serverId}/}" /data/heeking/apache-tomcat-8.0.26/conf/serverparam.properties
sed -i "/server.dept=/ {s/.*/server.dept=${deptid}/}" /data/heeking/apache-tomcat-8.0.26/conf/serverparam.properties

mv /usr/local/heeking_install/gameserver.tar.gz /data/heeking/apache-tomcat-8.0.26/webapps/
cd /data/heeking/apache-tomcat-8.0.26/webapps/
tar -zxvf gameserver.tar.gz
###�������ݿ� 
cd /usr/local/heeking_install
tar -zxvf db.tar.gz 
mysql -usaintdbcon -p87ohB07jG7 -h${dbserverIp} -e 'create database heeking_account';
mysql -usaintdbcon -p87ohB07jG7 -h${dbserverIp} -e 'create database heeking_gamedata';
mysql -usaintdbcon -p87ohB07jG7 -h${dbserverIp} -e 'create database heeking_role';

mysql -usaintdbcon -p87ohB07jG7 -h${dbserverIp} heeking_account < heeking_account.sql 
mysql -usaintdbcon -p87ohB07jG7 -h${dbserverIp} heeking_gamedata < heeking_gamedata.sql 
mysql -usaintdbcon -p87ohB07jG7 -h${dbserverIp} heeking_role < heeking_role.sql 

mysql -usaintdbcon -p87ohB07jG7 -h${dbserverIp} -e 'delete from heeking_gamedata.server_list'

mysql -usaintdbcon -p87ohB07jG7 -h${dbserverIp} -e "INSERT INTO heeking_gamedata.server_list VALUES (${serverId},10000,'${serverId}��','${serverIP}','443','0','http://115.159.147.94/uuid_server/uuidservice',1,0,'0')"

mysql -usaintdbcon -p87ohB07jG7 -h${dbserverIp} -e "update heeking_gamedata.game_param set v='${openDate}' where id=45"