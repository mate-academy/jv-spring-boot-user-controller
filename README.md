
### Spring Boot web
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