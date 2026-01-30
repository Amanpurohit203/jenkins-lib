def call(String branch, String url){
   echo "cloning the code"
   git branch: "${branch}", url: "${url}"
   echo "cloned succesfully"
}
