GET http://localhost:9000/hello

HTTP/1.1 200

[Asserts]
header "Content-Type" == "text/plain;charset=UTF-8"

`Hello world!`

GET http://localhost:9000/not-found


HTTP/1.1 404
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json
Transfer-Encoding: chunked
