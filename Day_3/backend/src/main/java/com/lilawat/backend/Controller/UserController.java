package com.lilawat.backend.Controller;

import com.lilawat.backend.dto.UserDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/dummy/users")
public class UserController {

    @GetMapping({"{userId}/posts/{postId}", "/users/{userId}"})
    public ResponseEntity<String> SearchUserPostWithMultiPathVariables(@PathVariable Long userId,
                                                                       @PathVariable(required = false)
                                                                       Long postId) {
        String response;
        if (postId == null) {
            response = "Fetched user with id : " + userId;
        } else{
            response = "Fetched user with id : " + userId + " and post id : " + postId;
        }
//        return response;
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{userId}/orders/{orderId}")
    public String searchUserOrderWithMultiPathVariables(@PathVariable(name = "userId")
                                                            Long customerId,
                                                        @PathVariable(required = false)
    Long orderId) {
        return "Fetch user with id : " + customerId + " and post id : " + orderId;
    }

    @GetMapping({"/{userId}/address/{addressId}"})
    public String searchUserAddressWithMultiPathVariables(@PathVariable Map<String ,
            String> pathVariableMap) {
        return "Fetch user with id : " + pathVariableMap.get("userId")
                + "add address id : " + pathVariableMap.get("addressId");
    }

    @GetMapping("/search")
    public String searchUserWithQueryParams(@RequestParam(required = false,defaultValue = "Guest")
                                                String name,
                                            @RequestParam(name = "gender") String sex) {
        return "Fetch user with query params : " + name + " and gender : " + sex;
    }

    @GetMapping("/search/map")
    public String searchUserWithMapQueryParams(@RequestParam Map<String , String> requestParam) {
        return "Fetch user with query params : " +
                requestParam.get("name") + " and gender : " + requestParam.get("gender");
    }

    @GetMapping("/headers")
    public String readRequestHeaders(@RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader(value = "User-Location",
                                             required = false, defaultValue = "mumbai")
                                     String userLocation) {
        return "Received : " + userAgent + " " + userLocation;
    }

    @GetMapping("/headers/map")
    public String readRequestHeadersWithMap(@RequestHeader Map<String, String> requestHeaders) {
        return "Received : " + requestHeaders.get("User-Agent") + " " +
                requestHeaders.get("User-Location");
    }

    @GetMapping("/headers/http-headers")
    public String readRequestHeadersHttpHeaders(@RequestHeader HttpHeaders requestHeaders) {
        return "Received : " + requestHeaders.get("User-Agent") + " " +
                requestHeaders.get("User-Location");
    }

    @PostMapping
    public String createUser(@RequestBody UserDto userDto) {
        return "Created User with the data : " + userDto.toString();
    }

    @PostMapping("request-entity")
    public ResponseEntity<String> createUserWithRequestEntity(RequestEntity<UserDto> requestEntity) {
        HttpHeaders httpHeaders = requestEntity.getHeaders();
        UserDto userDto = requestEntity.getBody();
       String queryParams =  requestEntity.getUrl().getQuery();
       String path =  requestEntity.getUrl().getPath();
//        return "Created User with the data : " + userDto.toString();
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Custom-Header", "ExampleValue")
                .body("Created user with the data : " + userDto.toString());
    }
}
