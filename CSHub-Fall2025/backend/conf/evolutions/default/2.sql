# --- !Ups

alter table mail alter column content varchar(4000);

# --- !Downs

alter table mail alter column content varchar(255);
