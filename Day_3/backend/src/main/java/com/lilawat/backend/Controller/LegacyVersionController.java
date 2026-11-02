package com.lilawat.backend.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/legacy/versions")
public class LegacyVersionController {

    @GetMapping({"", "/", "/v1"})
    public ResponseEntity<String> defaultPathVersion() {
        return ResponseEntity.ok("Response from default Path Version api 1.0.0");
    }

    @GetMapping("/v2")
    public ResponseEntity<String> pathV2Version() {
        return ResponseEntity.ok("Response from path v2 version api 2.0.0");
    }


    @GetMapping(params = "version=1")
    public ResponseEntity<String> defaultReqParamVersion() {
        return ResponseEntity.ok("Response from default Path Version api 1.0.0");
    }

    @GetMapping(params = "version=2")
    public ResponseEntity<String> v2ReqParamVersion() {
        return ResponseEntity.ok("Response from v2 Req Param version api 2.0.0");
    }


    @GetMapping(headers = "X-API-VERSION=1")
    public ResponseEntity<String> defaultReqHeaderVersion() {
        return ResponseEntity.ok("Response from default Headers Version api 1.0.0");
    }

    @GetMapping(headers = "X-API-VERSION=2")
    public ResponseEntity<String>v2ReqHeaderVersion() {
        return ResponseEntity.ok("Response from Headers v2 version api 2.0.0");
    }



    @GetMapping(produces = "application/vnd.lilawat.v1+json")
    public ResponseEntity<String> defaultMediaVersion() {
        return ResponseEntity.ok("Response from default Media Type Version api 1.0.0");
    }

    @GetMapping(produces = "application/vnd.lilawat.v2+json")
    public ResponseEntity<String> v2MediaVersion() {
        return ResponseEntity.ok("Response from Media Type v2 version api 2.0.0");
    }
}

