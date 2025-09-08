package com.designpattern.builder;

public class House {
    private int rooms;
    private int floors;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasSwimmingPool;

    // Private constructor (only builder can create)
    private House(HouseBuilder builder) {
        this.rooms = builder.rooms;
        this.floors = builder.floors;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House [rooms=" + rooms + ", floors=" + floors +
                ", garage=" + hasGarage +
                ", garden=" + hasGarden +
                ", swimmingPool=" + hasSwimmingPool + "]";
    }

    // Builder inner class
    public static class HouseBuilder {
        private int rooms;
        private int floors;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasSwimmingPool;

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}

