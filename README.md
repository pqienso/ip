# Duke project template

This is a project template for a greenfield Java project. It's named after the Java mascot _Duke_. Given below are instructions on how to use it.

## Setting up in Intellij

Prerequisites: JDK 11, update Intellij to the most recent version.

1. Open Intellij (if you are not in the welcome screen, click `File` > `Close Project` to close the existing project first)
1. Open the project into Intellij as follows:
   1. Click `Open`.
   1. Select the project directory, and click `OK`.
   1. If there are any further prompts, accept the defaults.
1. Configure the project to use **JDK 11** (not other versions) as explained in [here](https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk).<br>
   In the same dialog, set the **Project language level** field to the `SDK default` option.
3. After that, locate the `src/main/java/Duke.java` file, right-click it, and choose `Run Duke.main()` (if the code editor is showing compile errors, try restarting the IDE). If the setup is correct, you should see something like the below as the output:
   ```
   Hello from
    ____        _        
   |  _ \ _   _| | _____ 
   | | | | | | | |/ / _ \
   | |_| | |_| |   <  __/
   |____/ \__,_|_|\_\___|
   ```
```
PS C:\Users\bucks\Downloads> java -jar bean.jar
    Loading tasks...
   -------------------------------------------------
    Hello! I'm Bean.
    What can I do for you?
   -------------------------------------------------
```

## Commands and features
Once you've gotten Bean up and running (with the welcome message showing), the following are the commands that can be used:
### Viewing your tasks
Bean keeps a list of all your tasks. To view them, simply type `list`. If this your first time using Bean, Bean will display an empty list:
```
list
    These are the tasks in your list:
    1.[T][ ] go to the gym
    2.[T][ ] return books to the library
    3.[E][ ] staycation (from: Mar 1 2024 to: Mar 4 2024)
    4.[D][ ] submit assignment (by: Apr 3 2024)
   -------------------------------------------------
```
### Delete a task
To remove any task from the list, use `delete {tasknumber}`:
```
delete 3
    Alright, this task has been removed:
    [E][ ] staycation (from: Mar 1 2024 to: Mar 4 2024)
   -------------------------------------------------
```

### Add a to-do
To add a to-do to the list, use `todo {description}`:
```
todo do laundry
    Hey, I've added:
    [T][ ] do laundry
    You currently have 4 tasks.
   -------------------------------------------------
```
### Add a deadline
To add a deadline to the list, use `deadline {description} /by {duedate}`:
```
deadline apply internships /by 2024-04-14
    Hey, I've added:
    [D][ ] apply internships (by: Apr 14 2024)
    You currently have 5 tasks.
   -------------------------------------------------
```
### Add an event
To add an event to the list, use `event {description} /start {startdate} /end {enddate}`:
```
event hackathon /start 2024-06-22 /end 2024-06-24
    Hey, I've added:
    [E][ ] hackathon (from: Jun 22 2024 to: Jun 24 2024)
    You currently have 6 tasks.
   -------------------------------------------------
```
### Mark a task as done/not done
Say we have the following list of tasks:
```
list
    These are the tasks in your list:
    1.[T][ ] go to the gym
    2.[T][ ] return books to the library
    3.[D][ ] submit assignment (by: Apr 3 2024)
    4.[T][ ] do laundry
    5.[D][ ] apply internships (by: Apr 14 2024)
    6.[E][ ] hackathon (from: Jun 22 2024 to: Jun 24 2024)
   -------------------------------------------------
```
To mark any of these tasks as done, simply use `mark {tasknumber}`:
```
mark 5
    Hey, looks like you're done with this task:
   [D][X] apply internships (by: Apr 14 2024)
   -------------------------------------------------
```
When listed again, the task's checkbox will be crossed:
```
list
    These are the tasks in your list:
    1.[T][ ] go to the gym
    2.[T][ ] return books to the library
    3.[D][ ] submit assignment (by: Apr 3 2024)
    4.[T][ ] do laundry
    5.[D][X] apply internships (by: Apr 14 2024)
    6.[E][ ] hackathon (from: Jun 22 2024 to: Jun 24 2024)
   -------------------------------------------------
```
To unmark the task (uncheck the checkbox), use `unmark {tasknumber}`:
```
unmark 5
    Oops, looks like you're still not done with this:
   [D][ ] apply internships (by: Apr 14 2024)
   -------------------------------------------------
```
### Find tasks
To search for any task that contains your query inside its description, use `find {query}`:
```
find books
    Hey, these are the matching tasks in your list:
    1.[T][ ] return books to the library
   -------------------------------------------------
```
### Exit the program and save
To save your list of tasks and exit the program, use `bye`. **Note that you will lose all changes you made to the tasklist during the session if you do not use `bye` to close the program.**
```
bye
    Saving tasks...
   -------------------------------------------------
    Bean will take a nap now. Bye!
   -------------------------------------------------
```
## That's all
Have fun using Bean!
