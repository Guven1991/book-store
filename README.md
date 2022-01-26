# Spring Boot Seller

### Endpoints

#### Sign-Up

...
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"name":"user",
"username":"user",
"password":"user"
}
...

#### Sign-In

...
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
"username":"user",
"password":"user"
}
...

#### Make admin

...
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!
...

#### Save Book

...
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
Content-Type: application/json
Content-Length: 123

{
"title":"The Book 3",
"price":"10",
"description":"TEst description 3",
"author":"Test author 3"

}
...

#### Delete Book

...
DELETE /api/book/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...admin
...

#### Get All Books

...
GET /api/book HTTP/1.1
Host: localhost:8080
...

#### Save Purchase

...
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin
Content-Type: application/json
Content-Length: 58

{
"userId": 3,
"bookId": 1,
"price":10

}
...

#### Get User Purchase

...
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ... user or admin
...