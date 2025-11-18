# CampusReserve 🎓📚
A simple yet effective Java OOP Resource Booking System designed to help students reserve campus resources such as study rooms, lab computers, and equipment.  CampusReserve focuses on clean object‑oriented principles.

📌 Features

🧑‍💻 Create users and manage reservations

🔒 Prevent double‑booking

🕒 Track booking time slots

🗂 Clean OOP architecture (User, Resource, Booking, Manager)

🖥 CLI-based user interaction

📄 Easy to extend with database or GUI

🧩 Tech Stack

Java 17+

Object-Oriented Design

Optional: JavaFX or JDBC for advanced versions

🛠️ Compile & Run Instructions

✅ 1. Navigate to the project folder
      cd CampusReserve
✅ 2. Compile all Java files

(Ensure you're inside the root folder where src/ exists.)

  javac -d out $(find src -name "*.java")

  -d out places compiled classes in an out/ directory.

$(find ...) compiles everything inside src/models, src/services, etc.

If you're on Windows PowerShell, use:

  javac -d out (Get-ChildItem -Recurse src\*.java)
✅ 3. Run the program

Once compiled, execute Main:

📣 Call to Action

If you find this project helpful:

⭐ Star the repo

🍴 Fork it

🧩 Extend the project with your own features!
