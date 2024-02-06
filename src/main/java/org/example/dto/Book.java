package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String category;
    private Integer qty;
}

//[
//        {
//        "isbn": "978-0-13-235088-4",
//        "title": "Clean Code",
//        "author": "Robert C. Martin",
//        "category": "Software",
//        "qty": 10
//       },
//        {
//        "isbn": "978-1-60309-057-5",
//        "title": "The Pragmatic Programmer",
//        "author": "Andrew Hunt, David Thomas",
//        "category": "Software",
//        "qty": 8
//        },
//        {
//        "isbn": "978-0-321-58461-3",
//        "title": "Effective Java",
//        "author": "Joshua Bloch",
//        "category": "Software",
//        "qty": 15
//        },
//        {
//        "isbn": "978-0-596-52068-7",
//        "title": "Design Patterns",
//        "author": "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides",
//        "category": "Software",
//        "qty": 12
//        },
//        {
//        "isbn": "978-0-07-352332-3",
//        "title": "Database System Concepts",
//        "author": "Abraham Silberschatz, Henry F. Korth, S. Sudarshan",
//        "category": "Database",
//        "qty": 7
//        },
//        {
//        "isbn": "978-0-672-33751-2",
//        "title": "The Art of Computer Programming",
//        "author": "Donald E. Knuth",
//        "category": "Computer Science",
//        "qty": 20
//        },
//        {
//        "isbn": "978-0-596-00797-1",
//        "title": "Introduction to Algorithms",
//        "author": "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein",
//        "category": "Computer Science",
//        "qty": 18
//        },
//        {
//        "isbn": "978-0-262-53092-3",
//        "title": "Artificial Intelligence: A Modern Approach",
//        "author": "Stuart Russell, Peter Norvig",
//        "category": "Artificial Intelligence",
//        "qty": 14
//        },
//        {
//        "isbn": "978-1-4919-0163-1",
//        "title": "Python Crash Course",
//        "author": "Eric Matthes",
//        "category": "Programming",
//        "qty": 25
//        },
//        {
//        "isbn": "978-0-596-52068-8",
//        "title": "Head First Java",
//        "author": "Kathy Sierra, Bert Bates",
//        "category": "Java",
//        "qty": 11
//        },
//        {
//        "isbn": "978-0-321-87933-4",
//        "title": "JavaScript: The Good Parts",
//        "author": "Douglas Crockford",
//        "category": "JavaScript",
//        "qty": 9
//        },
//        {
//        "isbn": "978-1-4493-8613-4",
//        "title": "Learning Python",
//        "author": "Mark Lutz",
//        "category": "Python",
//        "qty": 22
//        },
//        {
//        "isbn": "978-0-596-80425-2",
//        "title": "Learning SQL",
//        "author": "Alan Beaulieu",
//        "category": "SQL",
//        "qty": 16
//        },
//        {
//        "isbn": "978-1-4919-9486-5",
//        "title": "Django for Beginners",
//        "author": "William S. Vincent",
//        "category": "Python",
//        "qty": 13
//        },
//        {
//        "isbn": "978-1-59059-737-4",
//        "title": "Pro C# 5.0 and the .NET 4.5 Framework",
//        "author": "Andrew Troelsen",
//        "category": ".NET",
//        "qty": 10
//        },
//        {
//        "isbn": "978-0-672-33601-0",
//        "title": "C Programming Absolute Beginner's Guide",
//        "author": "Perry, Miller",
//        "category": "C",
//        "qty": 8
//        },
//        {
//        "isbn": "978-0-596-52740-3",
//        "title": "Java Concurrency in Practice",
//        "author": "Brian Goetz, Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, Doug Lea",
//        "category": "Java",
//        "qty": 14
//        },
//        {
//        "isbn": "978-0-201-89683-4",
//        "title": "Code Complete",
//        "author": "Steve McConnell",
//        "category": "Software",
//        "qty": 19
//        },
//        {
//        "isbn": "978-0-13-110362-7",
//        "title": "Operating System Concepts",
//        "author": "Abraham Silberschatz, Peter B. Galvin, Greg Gagne",
//        "category": "Operating Systems",
//        "qty": 15
//        },
//        {
//        "isbn": "978-0-13-468599-1",
//        "title": "Computer Networking: Principles, Protocols, and Practice",
//        "author": "Olivier Bonaventure",
//        "category": "Networking",
//        "qty": 11
//        }
//        ]
