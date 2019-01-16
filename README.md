# Android HTTP client
All requests sent to the server are executed synchronously.

### Functions for sending requests
Functions return the result received from the server in case of successful execution of the request, and an empty string in case of an error.
> GET (String url, String[2] data...)
> 
> POST (String url, String[2] data...)

### Usage example
```sh
LoadThread lt = new LoadThread();

String GETPayload = lt.GET("http://localhost", 
    new String[]{"param1","value1"}, new String[]{"param2","value2"});
    
String POSTPayload = lt.GET("http://localhost", 
    new String[]{"param1","value1"}, new String[]{"param2","value2"})
```

To display errors on the device screen as a toast, you must initialize the loader class with the transfer of the application context.
```sh
LoadThread lt = new LoadThread(MainActivity.this);
```
