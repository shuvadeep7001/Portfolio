#include <iostream>
#include <vector>
#include <string>

using namespace std;

struct Student {
    int rollNumber;
    string name;
    float marks1, marks2, marks3;
    float total;
    float percentage;
    char grade;
};

// Function to calculate Grade based on percentage
char calculateGrade(float percentage) {
    if (percentage >= 90) return 'A';
    else if (percentage >= 75) return 'B';
    else if (percentage >= 60) return 'C';
    else if (percentage >= 40) return 'D';
    else return 'F';
}

int main() {
    vector<Student> students;
    int choice;

    while (true) {
        cout << "\n==========================================";
        cout << "\n  STUDENT GRADE MANAGEMENT SYSTEM";
        cout << "\n==========================================";
        cout << "\n1. Add New Student Record";
        cout << "\n2. Display All Student Records";
        cout << "\n3. Search Student by Roll Number";
        cout << "\n4. Exit";
        cout << "\nEnter your choice (1-4): ";
        cin >> choice;

        if (choice == 1) {
            Student s;
            cout << "\nEnter Roll Number: ";
            cin >> s.rollNumber;
            cin.ignore(); // buffer clear karne ke liye

            cout << "Enter Student Name: ";
            getline(cin, s.name);

            cout << "Enter Marks for Subject 1 (out of 100): ";
            cin >> s.marks1;
            cout << "Enter Marks for Subject 2 (out of 100): ";
            cin >> s.marks2;
            cout << "Enter Marks for Subject 3 (out of 100): ";
            cin >> s.marks3;

            s.total = s.marks1 + s.marks2 + s.marks3;
            s.percentage = (s.total / 300.0) * 100;
            s.grade = calculateGrade(s.percentage);

            students.push_back(s);
            cout << "\n[Success] Record added successfully!\n";

        } else if (choice == 2) {
            if (students.empty()) {
                cout << "\n[Notice] No records found to display.\n";
            } else {
                cout << "\n-------------------------------------------------------------";
                cout << "\nRoll No | Name\t\t| Total | Percentage | Grade";
                cout << "\n-------------------------------------------------------------";
                for (const auto& s : students) {
                    cout << "\n" << s.rollNumber << "\t| " << s.name << "\t| " 
                         << s.total << "\t| " << s.percentage << "%\t     | " << s.grade;
                }
                cout << "\n-------------------------------------------------------------\n";
            }

        } else if (choice == 3) {
            if (students.empty()) {
                cout << "\n[Notice] No records found.\n";
            } else {
                int searchRoll;
                bool found = false;
                cout << "\nEnter Roll Number to search: ";
                cin >> searchRoll;

                for (const auto& s : students) {
                    if (s.rollNumber == searchRoll) {
                        cout << "\n--- Student Details ---";
                        cout << "\nRoll Number : " << s.rollNumber;
                        cout << "\nName        : " << s.name;
                        cout << "\nTotal Marks : " << s.total << " / 300";
                        cout << "\nPercentage  : " << s.percentage << "%";
                        cout << "\nGrade       : " << s.grade << "\n";
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    cout << "\n[Error] Student with Roll Number " << searchRoll << " not found.\n";
                }
            }

        } else if (choice == 4) {
            cout << "\nExiting system. Have a great day!\n";
            break;
        } else {
            cout << "\n[Invalid] Invalid choice! Please enter a number between 1 and 4.\n";
        }
    }

    return 0;
}
