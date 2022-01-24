package com.guven.bookstore.service;

import com.guven.bookstore.model.PurchaseHistory;
import com.guven.bookstore.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchaseItemsOfUser(Long userId);
}
