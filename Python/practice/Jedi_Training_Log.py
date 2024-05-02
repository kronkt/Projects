# list of minutes / hours
hours = []
minutes = []
# prompt user for session count
sessions = int(input("Amount of sessions: "))
# goes through each session, logs name and duration
for i in range(0, sessions):
    name = input("Jedi name: ")
    duration = int(input("Session duration(in minutes): "))
    # hour(s)
    if duration % 60 == 0:
        hours.append(duration // 60)
        minutes.append(0)
        print(name + " has trained for " + str(hours[i]) +" hour[s].")
    # hours & minutes
    elif duration >= 60:
        hours.append(duration // 60)
        minutes.append(duration % 60)
        print(name + " has trained for " + str(hours[i]) + " hour[s] and " + str(minutes[i]) + " minute[s].")
    # for wrong inputs
    elif duration <= 0:
        print("Wrong input.", "\n" ,"Please restart.")
        break
    # minutes
    else:
        hours.append(0)
        minutes.append(duration)
        print(name + " has trained for " + str(minutes[i]) + " minute[s].")

# calculating the total
total_hours = sum(hours) + (sum(minutes) % 60)
total_minutes = (sum(minutes) % 60)

for i in range(0, sessions):
    if total_minutes > 0 & total_hours > 0:
        print("Total time trained: " + str(total_hours) + " hour[s] and " + str(total_minutes) + " minute[s].")
    elif total_minutes == 0 & total_hours > 0:
        print("Total time trained: " + str(total_hours) + " hour[s].")
    else:
        print("Total time trained: " + str(total_minutes) + " minute[s].")
        



# getting total time



#print(jedi_log)
print(hours[:])
print(minutes[:])