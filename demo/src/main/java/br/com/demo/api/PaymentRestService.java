package br.com.demo.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("v1/payments/{id}/status")
public class PaymentRestService {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<PaymentStatus> getPayment(@PathVariable Integer id) {
        if (id > 10) {
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED)
                    .body(PaymentStatus.builder().approved(false).build());
        } else {
            return ResponseEntity.ok(PaymentStatus.builder().approved(true).build());
        }
    }
}
