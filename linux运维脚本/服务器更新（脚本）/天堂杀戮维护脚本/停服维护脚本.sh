#!/bin/bash
#���ݿ�ip
dbip=$1
#�Ƿ���´���
gameserver=$2
#�Ƿ����heeking_account��
account=$3
#�Ƿ����heeking_gamedata��
gamedata=$4
#�Ƿ���¸���heeking_role��
role=$5
opendate=''
back_dir=$(date "+%Y-%m-%d")

mkdir -p /usr/local/updateback/$back_dir
cd /usr/local/updateback/$back_dir
/data/heeking/apache-tomcat-8.0.26/bin/shutdown.sh
echo "sleep 60��ʽ�������� Ҫ�޸�"
sleep 60
##########ǿ�ƹرշ�����################################
echo "��ʼǿ�ƹر���Ϸ������"
kill -9 `ps aux |grep -i apache-tomcat-8.0.26 |grep -v grep |awk '{print $2}'`
##########ɾ����־####################################
rm -rf /data/heeking/apache-tomcat-8.0.26/logs/catalina.out 
##########��ʼ���ݱ���#################################
echo ����ʼ�������ݿ⡱
mysqldump --default-character-set=utf8 -usaintdbcon -p87ohB07jG7 -h${dbip} heeking_account >heeking_account.sql
mysqldump --default-character-set=utf8 -usaintdbcon -p87ohB07jG7 -h${dbip} heeking_role >heeking_role.sql
mysqldump --default-character-set=utf8 -usaintdbcon -p87ohB07jG7 -h${dbip} heeking_gamedata >heeking_gamedata.sql
tar -zcvf db_back.tar.gz *.sql
rm -rf *.sql
echo "��ʼ���ݳ���"
tar czvf webapps.tar.gz -C /data/heeking/apache-tomcat-8.0.26 webapps
########������ɿ�ʼ����#########################################
mkdir -p /usr/local/down_update
cd /usr/local/down_update
rm -rf *.sql
rm -rf db
tar -zxvf db.tar.gz
echo "��ʼ�������ݿ�"

if [ $account -eq 1 ]
then
  mysql --default-character-set=utf8 -usaintdbcon -p87ohB07jG7 -h${dbip} heeking_account < heeking_account.sql
elif [ $account -eq 0 ]
then
   echo "������ account">1.txt
fi

if [ $gamedata -eq 1 ]
then
  opendate=$(mysql -usaintdbcon -p87ohB07jG7 -h${dbip} -e "select v from heeking_gamedata.game_param where id = 45" | head -n 2 | tail -n 1)
  mysqldump --default-character-set=utf8 -usaintdbcon -p87ohB07jG7 -h${dbip} heeking_gamedata server_list > server_list.sql
  mysql --default-character-set=utf8 -usaintdbcon -p87ohB07jG7 -h${dbip} heeking_gamedata < heeking_gamedata.sql
  mysql --default-character-set=utf8 -usaintdbcon -p87ohB07jG7 -h${dbip} heeking_gamedata < server_list.sql  
  mysql --default-character-set=utf8 -usaintdbcon -p87ohB07jG7 -h${dbip} -e "update heeking_gamedata.game_param set v='${opendate}' where id=45 "
elif [ $gamedata -eq 0 ]
then
   echo "������ gamedata" >>1.txt
fi

if [ $role -eq 1 ]
then
  mysql --default-character-set=utf8 -usaintdbcon -p87ohB07jG7 -h${dbip} heeking_role < heeking_role.sql
elif [ $role -eq 0 ]
then
   echo "������ role">>1.txt
fi
echo "�������ݿ����"

if [ $gameserver -eq 1 ]
then
   tar -zxvf gameserver.tar.gz
   rm -rf /data/heeking/apache-tomcat-8.0.26/webapps/gameserver
   echo "��ʼ�������"
   mv gameserver /data/heeking/apache-tomcat-8.0.26/webapps/
   echo "�������"
elif [ $gameserver -eq 0 ]
then
   echo "������ gameserver">>1.txt
fi

echo "�������"
echo "��ʼ����������"
/data/heeking/apache-tomcat-8.0.26/bin/startup.sh