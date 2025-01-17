package com.devSense.trials.enums;

public enum EmployeeEnum {

    Developer {
        @Override
        public String work () {
            return "Coding";
        }
    },
    Supervisor {
        @Override
        public String work () {
            return "supervise";
        }
    },

    Manager{
        @Override
        public String work(){
            return "Manage";
        }
    };

    abstract String work();
}
