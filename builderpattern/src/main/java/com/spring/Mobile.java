package com.spring;

public class Mobile {

    private String processor;
    private String os;
    private int ram;
    private int display;

    private Mobile(MobileBuilder mobileBuilder) {
        this.processor = mobileBuilder.processor;
        this.os = mobileBuilder.os;
        this.ram = mobileBuilder.ram;
        this.display = mobileBuilder.display;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public int getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "processor='" + processor + '\'' +
                ", os='" + os + '\'' +
                ", ram=" + ram +
                ", display=" + display +
                '}';
    }

    public static class MobileBuilder {
        private String processor;
        private String os;
        private int ram;
        private int display;

        public MobileBuilder(String processor, String os) {
            this.processor = processor;
            this.os = os;
        }

        public com.spring.Mobile.MobileBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public com.spring.Mobile.MobileBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public com.spring.Mobile.MobileBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public com.spring.Mobile.MobileBuilder setDisplay(int display) {
            this.display = display;
            return this;
        }

        public String getProcessor() {
            return processor;
        }

        public String getOs() {
            return os;
        }

        public int getRam() {
            return ram;
        }

        public int getDisplay() {
            return display;
        }

        public Mobile buildMobile() {
            return new Mobile(this);
        }
    }

}
