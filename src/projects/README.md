# 📝 Projects ideas for Week 3

1. **Library Management System** 📚

    * Classes: `Library`, `Book`, `Member` (with `StudentMember`, `TeacherMember`).
    * Use **composition** (`Library HAS-A List<Book>`).
    * Store books in a `Map<ISBN, Book>`.
    * ISBN can be a String
    * Features: add/remove books, search by title, list members.

---

2. **Banking Application** 💰

    * Classes: `BankAccount`, `CheckingAccount`, `SavingsAccount`.
    * Use **inheritance** for account types.
    * **Encapsulation** for balance (private + getters/setters).
    * Store accounts in a `Map<String, BankAccount>`.

---

3. **Student Management System** 🎓

    * Classes: `Student`, `Course`, `Teacher`.
    * A `Course` **HAS-A List<Student>`.
    * Store students in a `List<Student>`.
    * Features: enroll students, print course students.

---

4. **E-Commerce Shopping Cart** 🛒

    * Classes: `Product`, `Cart`, `User`.
    * Use `Map<Product, Integer>` for product quantities.
    * Features: add/remove products, calculate total price.
    
---

5. **Library of Music / Playlist Manager** 🎵

    * Classes: `Song`, `Playlist`, `Artist`.
    * A `Playlist` **HAS-A List<Song>`.
    * Use `List<String>`. check if the List contains a song before adding.
    * Features: add/remove songs, shuffle playlist.

---

6. **Employee Management System** 🏢

    * Abstract class: `Employee` (fields: name, salary).
    * Subclasses: `Developer`, `Manager`.
    * Store employees in a `List<Employee>`.
    * Features: print payroll, give raises, list managers separately.

---

7. **Library of Movies (Movie Catalog)** 🎬

    * Classes: `Movie`, `Actor`, `Director`.
    * Store movies in a `Map<String, Movie>` (key = movie title).
    * Features: add movies, search by genre, list movies by actor.


---

9. **School Library Borrowing System** 🏫

* Classes: `Book`, `Student`, `Teacher`, `Loan`.
* A `Loan` **HAS-A Book and Member**.
* Use a `Map<Member, List<Book>>` to track who borrowed what.
* Features: borrow/return books, list borrowed books by member.

---


