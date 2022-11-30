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

```java

    
        List<User> sortedList = users.stream()
            .sorted(Comparator.comparingInt(User::getAge))
            .collect(Collectors.toList());

```
# SortMap By Key

```java

        //sort by values, and reserve it, 10,9,8,7,6...
        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

```
# SortMap by value

```java

 // sort by keys, a,b,c..., and return a new LinkedHashMap
        // toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
```

# Group By and Sum

```java
list.stream()
  .collect(Collectors.groupingBy(foo -> foo.id,
                                    Collectors.summingInt(foo->foo.targetCost)))
  .forEach((id,sumTargetCost)->System.out.println(id+"\t"+sumTargetCost));
```
