# Toy_Web_Browser
I used to wonder how web browsers work on the backend and ruminate on how they were built so down the rabit hole I went which lead me to create this wonderful Toy Web Browser page built using JavaFX which uses an embedded web rendering engine called WebKit
I hope you guys take the time out of your day and try it out for fun not only does it diverisfy your coding skills but you also end up learning how different applications work on a root basis.

Lets get Started !!

I have used the IntelliJ IDEA platform here to create the Toy Web Browser , I highly recommend y'all to install it as well to execute this project ( when you download it make sure it is compatible with your OS System).
The project demonstartes the below concepts
    1. JavaFX application structure
    2. Embedded web rendering
    3. Navigation controls implementation
    4. Basic browser architecture concepts
This is a LightWeight Browser shell built around the JavaFX's built-in WebKit engine **this is not a custom engine**

The Toy Web Browser has the following features:
    1. URL Bar
    2. Forward Navigation
    3. Backward Navigation
    4. Reload button
    
The Tech Stack is as follows:(make sure that you install the correct versions and the tech as stated below else the code wouldn't work)
    Language: Java
    GUI Framework: JavaFX
    Web Rendering Engine: WebKit (via JavaFX WebView)
    Platform: Windows (JavaFX SDK configured)
    
So you would need to have all these pre-installed
   1. JDK 17+
   2. JavaFX SDK
   3. IntelliJ IDEA

You would need to edit configurations for your run process
  1. Go to your project structure and add the Javafx-sdk pointing to the lib file specifically to your library
  2. Then write your main code
  3. Edit configurations for your run process
  4. Create a run "browser process" and make sure you have added the vm option

 DISCLAIMER : you would not be able to open google.com as this Uses an older WebKit engine and google recognizes it as automated traffic     
 but you can open any domain directly 
<img width="1502" height="1030" alt="image" src="https://github.com/user-attachments/assets/eef698ad-2ce6-458f-aa26-f661cb0d6459" />

 
