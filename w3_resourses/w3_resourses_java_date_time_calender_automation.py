import time
import os
import webbrowser
j=0
i=1
l=['https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-1.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-2.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-3.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-4.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-5.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-6.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-7.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-8.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-9.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-10.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-11.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-12.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-13.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-14.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-15.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-16.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-17.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-18.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-19.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-20.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-21.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-22.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-23.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-24.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-25.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-26.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-27.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-28.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-29.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-30.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-31.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-32.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-33.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-34.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-35.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-36.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-37.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-38.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-39.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-40.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-41.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-42.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-43.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-44.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-45.php', 'https://www.w3resource.com/java-exercises/datetime/java-datetime-exercise-46.php']




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
