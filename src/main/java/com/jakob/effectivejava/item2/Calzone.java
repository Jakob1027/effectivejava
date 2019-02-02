package com.jakob.effectivejava.item2;

/**
 * @author Jakob
 */
public class Calzone extends Pizza {

    private final Boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private Boolean sauceInside = false;

        public Builder sauceInside() {
            this.sauceInside = true;
            return self();
        }

        @Override
        public Pizza build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }


    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }
}
