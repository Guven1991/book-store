package com.guven.bookstore.controller;

import com.guven.bookstore.model.PurchaseHistory;
import com.guven.bookstore.security.UserPrincipal;
import com.guven.bookstore.service.IPurchaseHistoryService;
import com.guven.bookstore.service.PurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase-history")
public class PurchaseHistoryController {

    @Autowired
    private IPurchaseHistoryService purchaseHistoryService;

    @PostMapping//api/purchase-history
    public ResponseEntity<?> savePurchaseHistory(@RequestBody PurchaseHistory purchaseHistory) {

        return new ResponseEntity<>(purchaseHistoryService.savePurchaseHistory(purchaseHistory), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<?> getAllPurchase(@AuthenticationPrincipal UserPrincipal userPrincipal){

        return ResponseEntity.ok(purchaseHistoryService.findPurchaseItemsOfUser(userPrincipal.getId()));
    }

}
