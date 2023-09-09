# Install postgreSQL on Linux

https://www.postgresql.org/download/linux/ubuntu/

```
sudo sh -c 'echo "deb https://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -
sudo apt-get update
sudo apt-get -y install postgresql-12
```

# Execute postgreSQL
Switch to postgres user
```
sudo -i -u postgres
```

Access the PostgreSQL using the psql by typing the following command
```
psql
```

# Create the schema 'hexagonal'
```
create database hexagonal;
```

# List the databases
```
\l
```

# Create the user 'hexagonal'
```
create user hexagonal with password 'hexagonal';

```

# créer les privilèges du user hexagonal
```
GRANT ALL PRIVILEGES ON DATABASE hexagonal TO hexagonal;
```

# List the users
```
\du
```