def call(string url, string branch){
   echo "cloning the code"
   git branch: 'branch', url: 'url'
   echo "cloned succesfully"
}
