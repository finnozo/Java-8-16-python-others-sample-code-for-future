```Java

 mediaAddress = poi.map(pointOfInterest -> pointOfInterest.getName() + "/" + sMedia.getAddress())
                                            .orElseGet(sMedia::getAddress);
```
