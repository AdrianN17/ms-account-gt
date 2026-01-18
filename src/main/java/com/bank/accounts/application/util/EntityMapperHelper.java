package com.bank.accounts.application.util;

import com.bank.accounts.domain.entities.enums.CardType;
import com.bank.accounts.domain.entities.enums.Currency;
import com.bank.accounts.domain.entities.enums.DebitAccountType;
import com.bank.accounts.domain.entities.enums.DocumentType;

import java.time.LocalDate;

public class EntityMapperHelper {

    // DocumentType
    public DocumentType stringToDocumentType(String s) {
        if (s == null) return null;
        return DocumentType.fromCode(s);
    }

    public String documentTypeToString(DocumentType d) {
        return d == null ? null : d.getCode();
    }

    // CardType
    public CardType stringToCardType(String s) {
        if (s == null) return null;
        return CardType.fromCode(s);
    }

    public String cardTypeToString(CardType c) {
        return c == null ? null : c.getCode();
    }

    // Currency
    public Currency stringToCurrency(String s) {
        if (s == null) return null;
        return Currency.fromCode(s);
    }

    public String currencyToString(Currency c) {
        return c == null ? null : c.getCode();
    }

    // DebitAccountType
    public DebitAccountType stringToDebitAccountType(String s) {
        if (s == null) return null;
        return DebitAccountType.fromCode(s);
    }

    public String debitAccountTypeToString(DebitAccountType d) {
        return d == null ? null : d.getCode();
    }

    // LocalDate <-> String
    public LocalDate stringToLocalDate(String s) {
        if (s == null || s.isEmpty()) return null;
        return LocalDate.parse(s);
    }

    public String localDateToString(LocalDate d) {
        return d == null ? null : d.toString();
    }
}

