from sqlite3 import *

connection = connect('test.db')
cursor = connection.cursor()

#cursor.execute('CREATE TABLE users(id test,pw test,name text,birthday text)')
#cursor.execute("INSERT INTO users VALUES ('planb','pw','JoMingyu','2001-01-05')")

#connection.commit();

#id = 'planb'
#cursor.execute("SELECT * FROM users WHERE id='{}'".format(id))
#print(cursor.fetchone)

values = [
    ('planb','pw','JoMingyu','2001-02-05'),
    ('geni429','pw','JeongGeunCheol','2000-04-05')
]
cursor.executemany("INSERT INTO users VALUES (?,?,?,?)",values)
connection.commit

cursor.execute("SELECT * FROM users")
print(cursor.fetchall())

for row in cursor.execute("SELECT * FROM users ORDER BY birthday"):
    print(row)