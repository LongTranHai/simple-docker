FROM mysql:8.0

MAINTAINER teks

RUN chown -R mysql:root /var/lib/mysql/

ARG MYSQL_DATABASE
ARG MYSQL_USER
ARG MYSQL_PASSWORD
ARG MYSQL_ROOT_PASSWORD

ENV MYSQL_DATABASE="demo"
ENV MYSQL_USER="adfilex"
ENV MYSQL_PASSWORD="Adfilex#2019"
ENV MYSQL_ROOT_PASSWORD="Adfilex#2019"
ENV MYSQL_ALLOW_EMPTY_PASSWORD="no"

ADD data.sql /etc/mysql/data.sql

RUN sed -i 's/MYSQL_DATABASE/'$MYSQL_DATABASE'/g' /etc/mysql/data.sql
RUN cp /etc/mysql/data.sql /docker-entrypoint-initdb.d

EXPOSE 3306
