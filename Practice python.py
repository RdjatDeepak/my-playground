class Student:
    def __init__(self, student_id, name, maths, science, english):
        self.id = student_id
        self.name = name
        self.maths = maths
        self.science = science
        self.english = english
    
    def st_info(self):
        print(f"Student ID: {self.id}")
        print(f"Student Name: {self.name}")
        print(f"Maths Grade: {self.maths}")
        print(f"Science Grade: {self.science}")
        print(f"English Grade: {self.english}")
    def __str__(self):
        return f"ID: {self.id}, Name: {self.name}, Maths: {self.maths}, Science: {self.science}, English: {self.english}"

class Ranking(Student):
    def average(self):
        avg = (self.maths + self.science + self.english) / 3
        return avg
    

students = [
    Ranking(1, "Deepak", 98, 87, 88),
    Ranking(2, "Roshan", 66, 57, 78),
    Ranking(3, "Prashant", 45, 85, 83),
    Ranking(4, "Rajjo", 56, 80, 51),
    Ranking(5, "Eysa", 68, 77, 99)
]
for student in students:
    print("\nStudent Information:")
    print(student)
    print(f"Average Grade: {student.average():.2f}")


