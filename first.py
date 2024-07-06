
# Name=input("Enter your name")
# yob=input("Enter your year of brith")
# print("Hey",Name,"you are",(2024- int(yob))," years old")
# id="Deepak"
# domain="gmail.com"
# print(id,domain,sep="@")
# ncards=int(52)
# one_colour=int(13)
# probablity=ncards/one_colour
# print("Probablity of getting one colour card from one desk is::",probablity)
# def new_func():
#     n=int(input("Enter the value of n::"))
#     sum=n*(n+1)/2
#     print(int(sum))
#     print("%d"%sum)
# new_func()
# x=1+2j
# y=complex(1,-2)
# z=x-y
# print(z)
# print("My answer is ",3*"No!")
# n=int(input("Enter the value of n::"))
# print(n*" Deepak ")
# age=20
# if(age>=21):
#     print("Can vote and apply for license")
# else:
#     print("You can't Vote") 
# light="green"
# if(light=="red"):
#     print("You can't go")
# elif(light=="green"):
#     print("you can go")
# elif(light=="Yellow"):
#     print("ready")

# for grading
# marks = float(input("Enter your marks: "))
# print(marks)
# if(marks>=90):
#     print("You got Grade A ")
# elif(90>marks>=80):
#     print("You got Grade B ")
# elif(80>marks>=70):
#     print("You got Grade C ")
# elif(70>marks>=60):
#     print("You got Grade D ")
# elif(60>marks>=50):
#     print("You got Grade P ")
# elif(50>marks):
#    print("Better luck next time ")
marks=[21,34,54,654,76,88,97,67]
# print(marks)
# print(type(marks))
# print(marks[4])
# print(len(marks))
# print(marks[ : 5])
# marks.sort()
# print(marks)
# tup=(1,438,"d7456","84765")
# print(tup)
# print(type(tup))
# # print(tup.index(438))
# dict = {
#     "Name": "Deepak",
#     "Subjects": {
#         "phy":98,
#         "Maths":99,
#         "Python":100,
#         "DSA":95,
#     }
# }
# print(dict["Subjects"]["Python"])

# Hi={}
# n=int(input("Enter the number of entries::"))
# for i in range(n):
#     k=input("Enter key: ")
#     v=input("Enter value: ")
#     Hi.update({k:v})
# print(Hi)
# for i in range(n):
#     print("Final dictionary",Hi)
    
    #  SET
    
# collection = set() #empety set
# print(type(collection))
# n=int(input("Enter the range of set::"))
# for i in range(n):
#     k=input("Enter the value::")
#     collection.add(k)
# print(collection)
# print(len(collection))
# set1={22,434,55,7667,7,4}
# print(collection.intersection(set1))


# loops (While loop)

# n=int(input("Enter the value of n::"))
# a=0
# b=1
# print(a)
# for i in range(n):
#     c=a+b
#     b=a
#     a=c
#     print(a)
# nums=(1,4,16,345,456,46,67,36,234,24,22,42,42)
# x=36
# i=0
# while i<len(nums):
#     if(nums[i]==x):
#         print("x is found at index ::",i)
#         break
#     else:
#         print("Finding...")
#     i+=1
# print("End of loop")
# for i in range(100,1,-2):
#     print(i)
#     i-=1
# def sum(a,b):
#     a=int(input("Enter the value of a::"))
#     b=int(input("Enter the value of b::"))
#     s=a+b
#     return s
# print(sum(2,3)) 
# n=int(input("Enter the value of n::"))
# fact=1
# for i in range(1,n+1):
#     fact=fact*i
# print("Factorial of ",n,"is",fact)
# def fact(n):
#     if n == 0:
#         return 1
#     else:
#         return n * fact(n - 1)
# print(fact(5))  # This will print the factorial of 5
# def C_I():
#     p=int(input("Enter the principal amt::"))
#     r=float(input("Enter the rate::"))
#     t=float(input("Enter the time period::"))
#     Amt=p*(pow((1+r/100),t))
#     Ci=Amt-p
#     print("Compound Intrest is",Ci)
# C_I()
# def Ci(p,r,t):
#     Amt=p*(pow((1+r/100),t))
#     ci=Amt-p
#     print("Compound Intrest is",ci)
# a=int(input("Enter the principal amt::"))
# b=float(input("Enter the rate::"))
# c=float(input("Enter the time period::"))
# Ci(a,b,c)
# def prime(n):
#     flag=True
#     for i in range(2,n):
#         if n%i==0:
#             flag=False
#             break
#     if flag:
#         return "Number is Prime"
#     else:
#         return "Not Prime"
# def pnum():
#     number=int(input("Enter your number::"))
#     result=prime(number)
#     print(result)
# pnum()
length=5
width=8
def calc_Area(length,width):
    global area
    area=length*width
    return area
def main():
    global length , width
    length=float(input("Enter the Length ::"))
    width=float(input("Enter the Width ::"))
    area=calc_Area(length,width)
    print("The area of rectangle is ::",area)
print(length,width,area)
main()
print(length,width,area)
