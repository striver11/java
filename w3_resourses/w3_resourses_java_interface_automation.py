import time
import os
import webbrowser
j=0
i=1
l=  ['https://www.w3resource.com/java-exercises/java-interface-exercise-1.php', 'https://www.w3resource.com/java-exercises/java-interface-exercise-2.php', 'https://www.w3resource.com/java-exercises/java-interface-exercise-3.php', 'https://www.w3resource.com/java-exercises/java-interface-exercise-4.php']










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
