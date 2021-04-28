# JavaCamp 

# Instructor Service
```Java
InstructorService instructorService = new InstructorService();
```
### Get All Instructors : 
```Java
for (Instructor instructor : instructorService.getAll()) {
	System.out.println(instructor.getId()+" "+instructor.getName()+" "+instructor.getSurname());
}
 ```

### Result : 
-------------------------

|id|name|surname|
|--|---|---|
|1|Engin|Demiroğ|
|2|Tuğrul|Bayrak|

-------------------------


# Student Service
```Java
StudentService studentService=new StudentService();
```
### Get All Students : 
```Java
for (Student student : studentService.getAll()) {
	System.out.println(student.getId()+" "+student.getName()+" "+student.getSurname()+" "+student.getMail());
}
 ```

### Result : 
-------------------------

|id|name|surname|mail|description|
|--|---|---|---|---|
|1|Ömer|Acar|test1@gmail.com|test1|
|2|Karcan|Özbal|test2@gmail.com|test2|
|3|Uğur|Yıldız|test3@gmail.com|test3|
|4|Uğur|Yıldız|test3@gmail.com|test3|

-------------------------

# Lecture Service
```Java
LectureService lectureService=new LectureService();
```
### Get All Lectures : 
```Java
for (Lecture lecture : lectureService.getAll()) {
	System.out.println(lecture.getId()+" "+lecture.getName()+" --> "+lecture.getDescription());
}
 ```

### Result : 
-------------------------

|id|name|description|
|--|---|---|
|1|C#|C# OOP2|
|2|Java|Java OOP3|

-------------------------





