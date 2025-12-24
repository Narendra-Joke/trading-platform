package com.root.model;

import com.root.domain.WalletTransactionType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Wallet wallet;

    private WalletTransactionType type;

    private LocalDate date;

    // buy or sell it will be null
    // it only comes when wallet to wallet transfer
    private String transferId;

    private String purpose;

    private Long amount;

}
