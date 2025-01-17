package com.devSense.leets;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat_count = 0;

        for(int i=0;i<people.length-1;i++)
        {
            if(people[i] ==limit){
                boat_count += 1;
            }
            else if(people[i] < limit){
                if(i+1 < people.length-1){

                }

            }
        }
        return boat_count;
    }
}
