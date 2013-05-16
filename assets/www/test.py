import os
import random

#os.mknod("test.txt")
#fp = open("test.txt", w)
#str = "1,5,6,29"
#fp.write(str)

#str = "The protocols are :"
#num = random.randint(1,100)
#str = str + '%d' %num + ", "
#num = random.randint(1,100)
#str = str + '%d' %num + ", "
#num = random.randint(1,100)
#str = str + '%d' %num
#file = open("db.txt", 'w')
#file.write("1,5,6,29,3")
#file.write(str)
#file.close()

file = open("try.txt", 'w')
for i in range(1, 5):
    str1 = "\"4."+str(i)+"\", "
    file.write(str1)
file.close()
