# s_usrename = "Deepak"
# s_password=987654
# def user():
#     global s_usrename
#     global s_password
#     u_username=(input("Enter your User name::"))
#     u_password=int(input("Enter your password::"))
#     if u_username==s_usrename and u_password==s_password :
#         print("Login successful! Welcome, " + u_username + "!")
#     elif u_username==s_usrename:
#         print("User name provided is not correct ")
#     elif u_password==s_password:
#         print("your password provided is not correct ")
#     else:
#         print("Try again")
# user()
# import random
# while True:
#     U_input=input("Enter your number between 10-99 or press q for quit the game ::")
#     if U_input.lower()=='q':
#         break
#     system = random.randint(10,99)
#     print(f'your guess id {U_input} and system generated number is {system}')
    
#     try:
#         if int(U_input)==system:
#             print('you win')
#         else:
#             print('loser!!!')
#     except ValueError:
#         print("Invalid input : enter a valid choice ")

total_attempts =3
pin='1234'
attempts= 0
i=0
while attempts<total_attempts:
    user_pin=input("Enter your pin :: ")
    if user_pin ==pin:
        print("Access Granted!!")
        break
    
    attempts +=1
    print("invalid pin,Enter again")      
else:
    print(" \n You achived max Attempts -->> Try after some time")
    