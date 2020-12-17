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
