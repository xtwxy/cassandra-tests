create keyspace monitordb with replication = { 'class': 'SimpleStrategy', 'replication_factor': 3};
use monitordb;
create table history_ai_minute(id int, ts bigint, value double, primary key(id, ts));
create table history_ai_quarter(id int, ts bigint, value double, primary key(id, ts));
create table history_ai_hour(id int, ts bigint, value double, primary key(id, ts));
create table history_ai_day(id int, ts bigint, value double, primary key(id, ts));
