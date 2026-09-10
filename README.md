
# Unit Converter

A small Spring Boot service for converting values: length, weight, and temperature. It features a simple web interface (jQuery) and a REST API.

## Stack

- Java 17
- Spring Boot 3
- Gradle
- Lombok
- Frontend: HTML/CSS + jQuery

## How to Run

### Prerequisites

- JDK 17 installed locally
- Internet access to download dependencies

### Running via Gradle Wrapper

Linux/macOS:
./gradlew bootRun

Windows:
gradlew.bat bootRun

The application will be available at http://localhost:8080.

### Build and Run JAR
./gradlew clean build
java -jar build/libs/unit-converter-0.0.1-SNAPSHOT.jar


## Web Interface
Open http://localhost:8080/ in your browser. The interface contains three tabs:
* Length
* Weight
* Temperature

The result is displayed dynamically below the form.
## REST API
Base path: "/convert"

Request body format:
json
{
  "from": "source_unit",
  "to": "target_unit",
  "value": 10.0
}

### Length
"POST /convert/length"
Supported units: "mm", "cm", "m", "km", "in", "ft", "yd", "mi"

Request:
curl -X POST http://localhost:8080/convert/length \
  -H "Content-Type: application/json" \
  -d '{"from":"m","to":"ft","value":10}'


Response:
32.80839895


### Weight
"POST /convert/weight"

Supported units: "mg", "g", "kg", "oz", "lb"

Request:
curl -X POST http://localhost:8080/convert/weight \
  -H "Content-Type: application/json" \
  -d '{"from":"kg","to":"lb","value":2.5}'

Response:
5.511556554621939

### Temperature
"POST /convert/temperature"

Supported units: "C","F", "K"

Request:
curl -X POST http://localhost:8080/convert/temperature \
  -H "Content-Type: application/json" \
  -d '{"from":"C","to":"F","value":36.6}'

Response:

97.88000000000001


### Errors

If an unsupported unit is provided, the API returns "400 Bad Request":
Incorrect values


## Project Structure

* "src/main/java/" — backend controllers, services, and DTOs
* "src/main/resources/static/" — frontend assets ("index.html", "script.js", "style.css")
* "build.gradle" — dependencies and build settings

## Notes

* Default port: "8080" (can be changed in 'application.properties").
* Lombok is used — make sure annotation processing is enabled in your IDE.
