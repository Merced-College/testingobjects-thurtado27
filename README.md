[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22488562)
# testingObjects

this is an example of a ReadMe file.

# Java Objects & Constructors Lab

## Checkpoint Q1
Printing an object with no toString shows: ClassName@hexHash. This happens because Java uses Object.toString() by default.

## Checkpoint Q2
Dog field defaults before assignment:
- name (String): null -> reference type
- age (int): 0 -> primitive
- breed (String): null -> reference type

## Checkpoint Q3
Constructors allow us to control initialization. Without them, fields use default JVM values. Parameterized constructors let us set meaningful values immediately.

## Checkpoint Q4
Before toString, printing an object showed a memory hash. After overriding toString, it prints readable field values. @Override ensures we correctly replace the parent method.

## Checkpoint Q5
Private fields protect data integrity. Getters/setters allow validation. Example: Preventing negative age or negative price values.

## Reflection (4 & 5 answered)
Why is encapsulation (private fields + getters/setters) preferred over public fields? Give one concrete validation rule you could add to a setter.
Encapsulation is preferred because it prevents invalid data and allows future changes without breaking other code. 

Why add @Override to toString()?
Adding @Override helps catch mistakes at compile time and improves code readability.
