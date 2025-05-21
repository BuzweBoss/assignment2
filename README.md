Purpose Of The App
The Help Me Study App is a native Android application that I developed using Kotlin and Android Studio. The app is designed to help students to revise and test their knowledge of history-related true/false questions in a fun and interactive way.
The app has features like:
•	5 history based quiz questions
•	Final score result message
•	Feedback available immediate after a question
•	Simple user interface for all ages
   

The design of the app is clean and has a minimal layout with a single activity and dynamic content. The buttons and feedback are shown and hidden depending on the state of the quiz, this is to keep the app clean and unclustered. The text is large, clear buttons and flows easily.
User Flow
1.	There is a welcome screen: shows app introduction and Start Quiz button.
2.	Flashcard Screen: This displays one question at a time with 2 options True or False and Next option once done with the question.
3.	Score Screen Display: This screen shows you the total and a personliazed message saying (Great Job or Keep Learning)
4.	The last screen Review Screen: This screen displays all questions and correct answers for the self assements.

   ![image](https://github.com/user-attachments/assets/15a13d90-caa1-42c6-8428-ecc2ad2befb7)
   ![image](https://github.com/user-attachments/assets/7ba1dad8-51f5-486d-a6fe-a19ba3495fa1)
   ![image](https://github.com/user-attachments/assets/8cf28cfd-b438-41dd-ab0b-2510c7b3cfd2)



Logic Of  The App
We have used two parallel arrays, one is for the questions and one for the corresponding Boolean answers. A score counter that tracks the number of correct responses is also included on the app. Then the questions are all presented in a sequence using an index variable. Lastly, we have also used Kotlin’s Toast messages and TextView. Updates to provide the user with instant feedback. 
As seen: Toasts overview, https://developer.android.com/guide/topics/ui/notifiers/toasts (accessed May 18, 2025) 

I have also made use of Git and GitHub, to implement version control with the code hosted on GitHub for backup purposes, and if anyone wants to collaborate with me on the app.
We have used git-init to initialize the repository locally, and the project is also pushed to a remote GitHub repository.
![image](https://github.com/user-attachments/assets/14d64158-adbd-41a7-8f20-579bdcf2fee2)

 
This is the GitHub Link
https://github.com/BuzweBoss/assignment2.git

This is the Youtube Video Link Showing How the App Works
https://www.youtube.com/watch?v=YxELh3-w5Qg

References

1.	ChatGpt (GPT-4). OpenAI. Accessed: May 15, 2025. [Online]. Available: https://chatgpt.com/c/682b96e5-05d0-8007-8853-daeedc8476b1

2.	Toasts overview, https://developer.android.com/guide/topics/ui/notifiers/toasts (accessed May 18, 2025) 

