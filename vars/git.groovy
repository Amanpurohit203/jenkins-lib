def call(string url, string branch){
   echo "cloning the code"
                git branch: 'main', url: 'https://github.com/Amanpurohit203/django-notes-app.git'
                echo "cloned succesfully"
}
