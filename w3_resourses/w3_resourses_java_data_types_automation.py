import time
import os
import webbrowser
j=0
i=1
l= [ 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-1.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-2.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-3.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-4.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-5.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-6.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-7.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-8.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-9.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-10.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-11.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-12.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-13.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-14.php', 'https://www.w3resource.com/java-exercises/datatypes/java-datatype-exercise-15.php']
# p=[]
# for i in k:
#     if i not in p:
#         p.append(i)

# l=[]
# for i in p:
#     if  i not in l:
#         l.append(i)
# print(l)
while j <len(l):
    while i==1:
        url=l[j]
        def countdown(time_sec):
            global j
            while time_sec:
                mins, secs = divmod(time_sec, 60)
                timeformat = '{:02d}:{:02d}'.format(mins, secs)
                print(timeformat, end='\r')
                time.sleep(1)
                time_sec -= 1
            s=1
            webbrowser.open(url,new=s)
            print(j)
            j=j+1
            return j
        t=countdown(6)
