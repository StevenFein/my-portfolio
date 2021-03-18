/**Fetches the harcoded message in NewServletDemo.java and adds it to index.html */
async function displayMessage(){
    const responseFromServer = await fetch('/demo');
    const textFromResponse = await responseFromServer.text();

    const demoContainer = document.getElementById('demo-container');
    demoContainer.innerText = textFromResponse;
}