# FileInputOutputExamSystem


## Overview

The Exam Management System is a Java-based application designed to conduct exams using questions stored in text files. The application features a user interface for starting the exam, displaying questions with multiple-choice answers, and scoring user responses.

## Project Structure

### Main Components

1. **`Main` Class**
   - **Description:** Entry point of the application that reads questions from a file and initializes the `Question` object.
   - **Location:** `com.mrudula.o1.Main`

2. **`Main2` Class**
   - **Description:** Launches the `ExamConsole` to start the exam process.
   - **Location:** `com.mrudula.o1.Main2`

3. **`ExamConsole` Class**
   - **Description:** Provides the user interface for starting and conducting the exam. It displays questions, options, and evaluates user answers.
   - **Location:** `com.mrudula.o1.ExamConsole`

4. **`Question` Class**
   - **Description:** Represents a single question with its options and the correct answer. Includes methods for getting and setting question details and displaying them.
   - **Location:** `com.mrudula.o1.Question`

5. **`QuestionDB` Class**
   - **Description:** Manages a collection of `Question` objects. Initializes with questions read from files via `QuestionFileService`.
   - **Location:** `com.mrudula.o1.QuestionDB`

6. **`QuestionFileService` Class**
   - **Description:** Handles reading question files from a specified folder and parsing the content into `Question` objects.
   - **Location:** `com.mrudula.o1.QuestionFileService`

## File Structure

- **`question/`**: Directory containing question text files.
- **`Main.java`**: Main class to initialize the application.
- **`Main2.java`**: Starts the exam console.
- **`ExamConsole.java`**: User interface for the exam.
- **`Question.java`**: Defines the question structure.
- **`QuestionDB.java`**: Manages the list of questions.
- **`QuestionFileService.java`**: Reads questions from files.


   

## Dependencies
Java Development Kit (JDK): Ensure JDK 8 or above is installed.

## Notes
The question files should be formatted with questions and options separated by # and placed in the question/ directory.
The QuestionFileService class assumes all files in the question/ directory contain valid question data.
## License
This project is licensed under the Apache License 2.0. See the LICENSE file for details.
