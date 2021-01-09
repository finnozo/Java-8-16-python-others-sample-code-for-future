```Java

 mediaAddress = poi.map(pointOfInterest -> pointOfInterest.getName() + "/" + sMedia.getAddress())
                                            .orElseGet(sMedia::getAddress);
```

# Map list of data


```Java
storeDataRepository.findAllAndActiveTrue()
                .stream()
                .map(storeData -> {
                    StoreDataResponse res = new StoreDataResponse();
                    res.setStoreName(storeData.getStoreName());
                    res.set_id(storeData.getId());
                    res.setLocation(storeData.getLocation());
                    res.setType(storeData.getType());
                    return res;
                }).collect(Collectors.toList());
```


# Map list of Data

```Java

private List<InventoryTransactionDTO> feedInventoryTransactionDTO(List<InventoryTransaction> inventoryTransactions) {
        return inventoryTransactions
                .stream().map(InventoryServiceImpl::apply)
                .collect(Collectors.toList());
    }

    private static InventoryTransactionDTO apply(InventoryTransaction inventoryTransaction) {
        InventoryTransactionDTO dto = new InventoryTransactionDTO();
        dto.setId(inventoryTransaction.getId());
        dto.setInvoiceId(inventoryTransaction.getInvoiceId());
        dto.setSku(inventoryTransaction.getSku());
        dto.setBatch(inventoryTransaction.getBatch());
        dto.setQuantity(inventoryTransaction.getQuantity());
        dto.setExpiryDate(inventoryTransaction.getExpiryDate());
        dto.setInvoiceDateETA(inventoryTransaction.getInvoiceDateETA());
        dto.setArrivalDateETA(inventoryTransaction.getArrivalDateETA());
        dto.setMFGDate(inventoryTransaction.getMFGDate());
        dto.setQCDateETA(inventoryTransaction.getQCDateETA());
        dto.setInventoryTransitModeId(inventoryTransaction.getInventoryTransitMode().getId());
        dto.setInventoryTransitModeValue(inventoryTransaction.getInventoryTransitMode().getValue());
        return dto;
    }


```
