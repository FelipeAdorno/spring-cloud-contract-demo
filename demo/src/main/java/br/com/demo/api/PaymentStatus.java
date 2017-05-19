package br.com.demo.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentStatus {
    private Boolean approved;
}