# 📅 Date class project in Java

## 📖 Overview
This project implements a custom `Date` class in Java that models calendar dates and supports:

- Date validation, including leap year validation
- Updating date values
- Retrieving the day of the week (e.g., Monday)
- Calculating the difference in days between two dates
- Printing dates in human-readable form
- Sorting dates via `Comparable<Date>`

## 🚀 How to compile and run

1. **Save the code** to a file named `Date.java`.
2. Open a terminal or command prompt.
3. Navigate to the directory containing this file.
4. Compile:

``bash
javac Date.java
``

5. Run:

``bash
java Main
``

## Notes and Issues

- **Leap year logic** and extreme cases like February 29 were complex and required precise handling.
- The constructor threw an exception on invalid dates, demonstrating proper error handling.
- `java.time.LocalDate` is used to handle date operations, such as getting the day of the week and calculating day differences.
- Sorting is implemented using `Comparable`, which allows `Collections.sort()` to arrange dates in chronological order.

## Screenshots
![изображение](https://github.com/user-attachments/assets/fdbd9a12-8b34-491c-92a6-dd66034702b8)

