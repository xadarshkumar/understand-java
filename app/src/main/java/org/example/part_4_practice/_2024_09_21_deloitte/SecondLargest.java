package org.example.part_4_practice._2024_09_21_deloitte;

/*
 * Deloitte interview - 21 Sep 2024
 *
 * Important note: when you say you've worked on all frontend, backend and devops
 * that attracts lots of questions
 * If you're not able to address them, it is better to limit yourself to a domain only
 *
 * My introduction:
 * My name is Adarsh Kumar. I have over 3 years of experience in full stack development.
 * I'm currently working as a Software Engineer where my role is to actively code new features,
 * and develop solutions for digitalising factories in Yara International.
 *
 * My core expertise lies in developing microservices.
 * I'm well-versed in technologies like Java, Spring Boot, Kotlin, Quarkus, AWS, Docker.
 * Also, on frontend side, I've worked with React, Javascript/Typescript.
 *
 * In past, I've worked on modernisation project also. We've shifted our legacy billing systems,
 * soil test lab report generation systems which was 20 years ol, fully to microservices architecture
 * hosted on AWS.
 *
 *
 *
 * Prepare about these ->
 * What is microservices architecture?
 * How frontend and backend is connect through?
 *
 *
 * Q: Find the 2nd smallest integer in the list
 *
 * Notes:
 * 1. Always start java program with Class name
 * 2. Then write a main function
 * 3. Write the program in IDE, prepare IDE and then go in interview
 * 4. Run the program, check output
 * 5. Finally confirm with the interviewer
 *
 */
public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {6, 1, 87, 58, 6, 58, 7, 6, 33, 66, 44, 6};
        int small = a[0];
        int small2 = a[1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= small2) {
                if (a[i] <= small) {
                    small2 = small;
                    small = a[i];
                } else {
                    small2 = a[i];
                }
            }
        }
        System.out.println(small2);
    }
}
