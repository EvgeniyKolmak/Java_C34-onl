package org.example;

public record PrintService(InputService inputService, DrawService drawService) {

    public PrintService (InputService inputService, DrawService drawService, Integer count) {
        this(inputService, drawService);
    }


}
