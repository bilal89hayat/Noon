package com.library.management.exception;

import com.library.management.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@ControllerAdvice
public class GlobalException  {

   /* @ExceptionHandler(BooksException.class)
    public void bookNotFound(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendError(HttpStatus.NOT_FOUND.value());
    }*/

   /* @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> constraintViolationException(HttpServletResponse response, MethodArgumentNotValidException e) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }*/

    /*@Override
    protected ResponseEntity<Object>
    handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                 HttpHeaders headers,
                                 HttpStatus status, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", new Date());
        body.put("status", status.value());

        //Get all fields errors
        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> x.getDefaultMessage())
                .collect(Collectors.toList());

        body.put("errors", errors);
        return new ResponseEntity<>(body, headers, status);

    }*/

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Response> handleValidationExceptions(final MethodArgumentNotValidException ex) {

        BindingResult result = ex.getBindingResult();
        List<org.springframework.validation.FieldError> fieldErrors = result.getFieldErrors();
        Response response = processFieldErrors(fieldErrors);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }

    private Response processFieldErrors(final List<org.springframework.validation.FieldError> fieldErrors) {
        Response response = new Response("validation error", HttpStatus.BAD_REQUEST.toString());
        StringBuffer message = new StringBuffer("Validation error !! ");
        fieldErrors.stream().forEach(fieldError -> {
            message.append(fieldError.getDefaultMessage()).append(" ");
            // response.getDetailedError().add(fieldError.getDefaultMessage());
        });
        return new Response(message.toString(), HttpStatus.BAD_REQUEST.toString());
    }

}
