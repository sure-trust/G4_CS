#Encryprion

txt=input("Enter the text to Encrypt: ")
even=""
odd=""
for i in range(len(txt)):
    if(i%2==0):
        even+=txt[i]
    else:
        odd+=txt[i]
msg=even+odd
new_one=""
key=3
for i in msg:
    value=ord(i)+key
    char=chr(value)
    new_one+=char
print("your Encrypted: ",new_one)


















#decryption
txt=new_one
new_msg=""
key=3
for i in txt:
    value=ord(i)-key
    char=chr(value)
    new_msg+=char
msg=new_msg
s1=""
s2=""
if(len(msg)%2==0):
    l=(int)(len(msg)/2)
else:
    l=(int)(len(msg)/2)+1
for i in range(0,l):
    s1+=msg[i]
for i in range(l,len(msg)):
    s2+=msg[i]
if(len(s1)>len(s2)):
    mid=len(s2)
else:
    mid=len(s1)
p=0
j=0
out=""
for i in range(0,mid):
    out=out+s1[i]
    out=out+s2[i]
    p=p+1
    if(len(s1)>len(s2)):
        rem=s1
    else:
        rem=s2
for i in range(mid,len(rem)):
    out+=rem[i]
print("your actual text: ",out)