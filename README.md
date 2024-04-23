# InMemoryDatabase

How to run the code:

    1 - Clone the repository.
    2 - To run the code simply run main. Currently, any test cases that result in an error being thrown are commented out.
    3 - If you want to use the interface implementation:
        1 - Import InMemoryDB.java and memDB.java files to your program.
        2 - Create a new instance of memDB in your class, and then you will have access to all of its methods.
   
    There are 3 files in this program:
        1 - InMemoryDB
            Interface definition. Contains the method declarations as specified in the assignment documentation.
        2 - memDB
            Class that implements the InMemoryDB interface and defines all of its methods.
            It uses two hashmaps to keep track of the database (actual db and mid-transaction db).
            It also uses a boolean to keep track of transaction state.
        3 - Main
            Creates a new memDB object and runs the example testcases provided in the assignment documentation.

How can the assignment be improved:

    To improve this assignment, I suggest making it a little more interesting by providing a main.java file that uses the code the 
    students make and displays it as an example/test suite at the same time. The documentation could be improved by having 
    the methods listed out with their requirements in order, so that the students don't have to go back and forth between methods 
    when going through the list of requirements. My last recommendation would be to make a new method that clears the database entirely.
