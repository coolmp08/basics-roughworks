package com.devSense;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * You have given the availability time slots 'slots1' and 'slots2' of two people and a meeting duration 'd', for any i, slots[i] = {starti , endi}. return the earliest time slot that works for both of them and is of 'd' duration.
 * <p>
 * If there is no common time slot that satisfies the requirements, return an empty array.
 * <p>
 * It is guaranteed that no two availability slots of the same person intersect with each other. That is, for any two time slots [start1, end1] and [start2, end2] of the same person, either start1 > end2 or start2 > end1.
 * <p>
 * Examples:
 * <p>
 * Input: slots1 = [[10,50],[60,120],[140,210]], slots2 = [[0,15],[60,70]], d = 8
 * Output: [60,68]
 * <p>
 * <p>
 * <p>
 * Input: slots1 = [[10,50],[60,120],[140,210]], slots2 = [[0,15],[60,70]], d = 12
 * Output: []
 * <p>
 * This problem can be solved using two pointers, We will sort both slots1 and slots2 by the start time first,
 * then initialize two pointers, each of which points to the beginning of the two arrays.
 * From there, we will compare the two slots, and move one pointer at a time if the common slot is smaller than duration.
 * To decide which pointer should be incremented, we will always move the one that ends earlier.
 * Assuming that we are comparing slots1[i] and slots2[j] and slots1[i][1] > slots2[j][1],
 * we would always choose to move the pointer j. The reason is that, as both slots are sorted,
 * if slots1[i][1] > slots2[j][1], we know slots1[i+1][0] > slots2[j][1]
 * so that there will be no intersection between slots1[i+1] and slots2[j].
 * <p>
 * <p>
 * Steps to solve this problem:
 * <p>
 * Sort both slots (slots1 and slots2) are on start times.
 * Keep two pointers (pointer1 and pointer2) and initialized to start at the beginning of both sorted arrays.
 * Intersection Check:
 * While both pointers are within the bounds of their respective arrays:
 * Find the intersection boundaries (intersectLeft and intersectRight) of the current slots pointed to by pointer1 and pointer2.
 * If the duration 'd' of the common slot (intersectRight - intersectLeft) is greater than or equal to the required duration:
 * Return the earliest common time slot.
 * Move the pointer of the slot that ends earlier.
 * If no common time slot satisfies the duration requirement, return an empty array.
 */
public class MeetingSchedulerTwoPersons {

    public static void main(String[] args) {
        System.out.println("Hello Guys! Welcome to scheduler! ");

        //duration is in minutes
        int duration = 8;

        List<List<Integer>> person1AvailableSlots = new ArrayList<>();
        person1AvailableSlots.add(List.of(10, 50));
        person1AvailableSlots.add(List.of(60, 120));
        person1AvailableSlots.add(List.of(140, 210));

        List<List<Integer>> person2AvailableSlots = new ArrayList<>();
        person2AvailableSlots.add(List.of(0, 15));
        person2AvailableSlots.add(List.of(60, 70));

        List<Integer> earliestAvailableSlot = availableSlots(person1AvailableSlots, person2AvailableSlots, duration);
        System.out.println("Earliest available slot is:" + earliestAvailableSlot);

    }


    static List<Integer> availableSlots(List<List<Integer>> person1, List<List<Integer>> person2, int duration) {

        Collections.sort(person1, (a, b) -> a.get(0) - b.get(0));
        Collections.sort(person2, (a, b) -> a.get(0) - b.get(0));

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < person1.size() &&
                pointer2 < person2.size()) {

            int intersectLeft = Math.max(person1.get(pointer1).get(0),
                    person2.get(pointer2).get(0));

            int intersectRight = Math.min(person1.get(pointer1).get(1),
                    person2.get(pointer2).get(1));

            if (intersectRight - intersectLeft > duration) {
                List<Integer> result = new ArrayList<>();
                result.add(intersectLeft);
                result.add(intersectLeft + duration);

                return result;
            }

            /*Always move the pointer of the slot that ends earlier */

            if (person1.get(pointer1).get(1) < person2.get(pointer2).get(1))
                pointer1++;
            else
                pointer2++;
        }
        return new ArrayList<>();
    }
}
