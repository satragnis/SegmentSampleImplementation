# Segment Opensource Implementation
This is a sample opensource implementation of Segment using your own analytics setup
For client side initialisation and reporting events refer the following 
https://segment.com/docs/connections/sources/catalog/libraries/mobile/android/


The application class contains the intitial segment setup with the write key 
The Write key to be setup on the client side and sent to the server end 


In the ConnectionFactory Class search for the following line:-
HttpURLConnection connection = openConnection("http://192.168.0.66:3000");
We need to change the url which is currently a local machine ip. 
Once your endpoint is setup you can start reporting events onto your own server setup.

