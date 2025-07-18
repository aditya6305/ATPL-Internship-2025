use intern;
-- Create Tables: departments (dept_id, dept_name) --

CREATE TABLE DepartmentsAditya (
    id VARCHAR(20) PRIMARY KEY,
    Dept_name VARCHAR(30)
);

-- Create Tables: courses (course_id, course_name, dept_id)--
CREATE TABLE CoursesAditya(
	Course_id VARCHAR(20) PRIMARY KEY,
	Course_name VARCHAR(30) NOT NULL,
    Dept_id VARCHAR(20),
    foreign key (Dept_id) REFERENCES DepartmentsAditya(id));

-- Create Tables:students (student_id, student_name, dob, age, dept_id)--
  
CREATE TABLE StudentsAditya(
	Student_id VARCHAR(20) PRIMARY KEY,
    Student_name VARCHAR(30) NOT NULL,
    age INT,
    DOB date,
    Dept_id VARCHAR(20),
    FOREIGN KEY (Dept_id) REFERENCES DepartmentsAditya(id));

-- Insert Sample RecordsInsert at least 3 records for each table -- 
    
INSERT INTO DepartmentsAditya(id,Dept_name) values ('D1','Computer Science'),('D2','Mathematics'),('D3','Physics');

INSERT INTO CoursesAditya(Course_id,Course_name,Dept_id) values ('C1','DBMS','D1'),('C2','Linear Algebra','D2'),('C3','Quantum Mechanics','D3');

INSERT INTO StudentsAditya(Student_id,Student_name,DOB,age,Dept_id) values 
('S1','Ravi','2002-06-10',22,'D1'),
('S2','Sneha','2001-03-15',23,'D2'),
('S3', 'Arjun','2003-01-20',21,'D1');

-- Alter Table Add a new column duration (in weeks) to the courses table. --

ALTER TABLE CoursesAditya ADD COLUMN duration int;

-- Update Date Update student name from "Sneha" to "Sneha Reddy" in students table. --

UPDATE  StudentsAditya set Student_name= 'Sneha Reddy' WHERE Student_name = 'Sneha';

-- Delete Data Delete the course with course_id = 'C3' from courses table. --

DELETE FROM CoursesAditya WHERE course_id = 'C3';

-- 6. SELECT Queries & Filtering --

-- Fetch all students older than 21. --

SELECT *FROM StudentsAditya WHERE age>21;

-- List student names & DOBs ordered by age (youngest to oldest). --

SELECT Student_name, DOB 
from StudentsAditya 
ORDER BY AGE;

-- Retrieve the top 2 youngest students from the table --

SELECT *FROM StudentsAditya
order by DOB DESC LIMIT 2;

-- 7. Aggregates & GROUP BY --

--  Show student count per department. --

SELECT dept_id,COUNT(*) AS COUNT_PER_DEPARTMENT
FROM StudentsAditya
GROUP BY dept_id;

-- Display average age of students in each department. --

SELECT ( SELECT Dept_name from DepartmentsAditya d
WHERE d.id = s.dept_id) AS DEPARTMENT_NAME,
AVG(s.age) AS AVERAGE_AGE FROM
StudentsAditya s GROUP BY s.dept_id;

-- Show the maximum and minimum student ages. --

SELECT MAX(age) as MAX_AGE,MIN(age) as MIN_AGE
FROM StudentsAditya;

-- 8. Transaction Control Language --


CREATE TABLE Accounts_Aditya(account_id VARCHAR(30) PRIMARY KEY,
Holder_name Varchar(40) not null,
balance double);

-- After creating the Account table you need to insert account details-- 

-- 1. Insert Initial Records into accounts table --

INSERT INTO Accounts_Aditya(account_id, Holder_name, balance) VALUES
('Account1','Alice',5000),('Account2','Bob',3000),('Account3','Charlie',4000);

-- 2. Start a Transaction – Transfer ₹1000 from Alice to Bob --

-- Start the transaction -- 
BEGIN;

-- Debit 1000 from Alice account to Bob Accunt --
UPDATE Accounts_Aditya SET balance=balance-1000
WHERE Holder_name = 'Alice';

UPDATE Accounts_Aditya SET balance=balance+1000
WHERE Holder_name = 'Bob';

ROLLBACK;

select *from Accounts_Aditya;

-- 3. New Transaction with SAVEPOINT -- 

BEGIN;
-- Again deduct 1000 from Alice account then he had left with 4000
UPDATE Accounts_Aditya SET balance=balance-1000
WHERE Holder_name = 'Alice';

-- created savepoint to store the transaction explicitly in a log. If we perform any opeations after this then we use rollback with the savepoint name to get back to the old values --

SAVEPOINT after_debit;
-- Add 1000 to the Bob's account --
UPDATE Accounts_Aditya SET balance=balance+1000
WHERE Holder_name = 'Bob';
-- Add 500 to the charlies's account --
UPDATE Accounts_Aditya SET balance=balance+500
WHERE Holder_name = 'Charlie';

-- We will see the amount that was there in the account holders here --
select *from Accounts_Aditya;

-- To get back to the older transaction for some wrong transaction purpose we get back to after debit savepoint--
ROLLBACK TO SAVEPOINT after_debit;

COMMIT;

SELECT *FROM Accounts_Aditya;

-- 9. Joins, Set Operations & Advanced Querying --

-- Display student names along with their department names (INNER JOIN). --

SELECT s.Student_name,d.dept_name 
from DepartmentsAditya d
INNER JOIN StudentsAditya s 
on d.id = s.dept_id;

--  List all departments even if they have no students (LEFT JOIN). --

SELECT de.Dept_name,st.Student_name
from  DepartmentsAditya de
LEFT JOIN  StudentsAditya st
on de.id = st.dept_id;

--  Use SELF JOIN to show employee–manager pairs. --





-- Write a correlated subquery to list students older than their department’s average age.--

SELECT Student_name 
from StudentsAditya where age > (
SELECT AVG(s.age) FROM
StudentsAditya s GROUP BY s.dept_name);




--  10. Data Integrity & Constraints --

-- Add a new column to courses: Add course_code to the courses table. --

ALTER TABLE CoursesAditya ADD COLUMN courses_code varchar(30) UNIQUE;

-- Add Course code foreach row in the courses table--
-- Add a UNIQUE constraint on the course_code column. --

UPDATE  CoursesAditya SET courses_code = 'CS101' WHERE Course_id='C1';

UPDATE  CoursesAditya SET courses_code = 'MATH205' WHERE Course_id='C2';

UPDATE  CoursesAditya SET courses_code = 'PHY303' WHERE Course_id='C3';

-- Add CHECK constraint to courses table Add a column credits to the courses table and enforce--
-- a constraint: Allowed values: Between 1 and 5 only.--

ALTER TABLE CoursesAditya ADD COLUMN credits INT CHECK (credits BETWEEN 1 AND 5);

UPDATE CoursesAditya SET credits = 4 where course_name = 'DBMS';

UPDATE CoursesAditya SET credits = 3 where course_name = 'Linear Algebra';

UPDATE CoursesAditya SET credits = 5 where course_name = 'Quantum Mechanics';


select * from CoursesAditya;

CREATE VIEW student_names AS SELECT s.Student_name,d.Dept_name 
from StudentsAditya s join DepartmentsAditya d
on s.dept_id = d.id;

SELECT *FROM student_names;
select *from StudentsAditya;
-- we are creating the table using joins so we cannot update a view the view is read only --
UPDATE VIEW student_names SET dept_name = 'Electrical' where Student_name = 'Ravi';