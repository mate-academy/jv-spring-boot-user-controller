# Implement a simple User Management REST API

In this task, you are required to create a simple REST API for managing users. You will be working with Spring Boot to
set up the application and create the necessary endpoints.

### Requirements:

- Verify all necessary dependencies (starters) are added to the `pom.xml`.

- There is a class UserController. Complete its implementation to have the following endpoints:

    - GET: `/users` - will return the hardcoded list of two
      users: `List.of(new User(1L, "bob@i.ua"), new User(2L, "alice@i.ua"))`
    - POST: `/users` - will accept User object as an input data, and return the String in the following
      format: `User created. Id: %s, email: %s`, where instead of `%s` the received user id and email should be provided

### Testing Your Application:

- Once you have implemented the above functionalities, test your application to ensure everything is working as
  expected.
- You can use tools like Postman or curl to send HTTP requests to your endpoints.
- There is one test present in this project. Don't deep dive into what is happening there, we will learn how to write
  tests later.

### Task 2 - Spring Boot web
### Requirements 
Add BookDto.class as a response DTO, and CreateBookRequestDto.class as a request DTO
Add Mapstruct and mappers
Return and accept DTOs on the service layer
Add BookController with methods:
public List getAll()
public BookDto getBookById(Long id)
public BookDto createBook(CreateBookRequestDto bookDto)
Add missing methods in the BookService and BookRepository
Create and use EntityNotFoundException class
Remove CommandLineRunner bean
Endpoints
Book Endpoints:

GET: /api/books (Retrieve book catalog)
Example of response body:

```json
[
  {
    "id": 1,
    "title": "Sample Book 1",
    "author": "Author A",
    "isbn": "9781234567897",
    "price": 19.99,
    "description": "This is a sample book description.",
    "coverImage": "http://example.com/cover1.jpg"
  },
  {
    "id": 2,
    "title": "Sample Book 2",
    "author": "Author B",
    "isbn": "9789876543210",
    "price": 24.99,
    "description": "Another sample book description.",
    "coverImage": "http://example.com/cover2.jpg"
  }
]


GET: /api/books/{id} (Retrieve book details)
Example of response body:

{
"id": 1,
"title": "Sample Book 1",
"author": "Author A",
"isbn": "9781234567897",
"price": 19.99,
"description": "This is a sample book description.",
"coverImage": "http://example.com/cover1.jpg"
}

POST: /api/books (Create a new book)
Example of request body:

{ 
"title": "Sample Book 3", 
"author": "Author C", 
"isbn": "9781122334455",
"price": 29.99,
"description": "Yet another sample book description.",
"coverImage": "http://example.com/cover3.jpg"
}