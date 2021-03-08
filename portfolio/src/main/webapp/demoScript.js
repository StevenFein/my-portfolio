/**Fetches the quotes array in NewServletDemo.java and adds one to index.html */
async function displayMessage(){
    const responseFromServer = await fetch('/demo');
    const arrayFromResponse = await responseFromServer.json();

    const demoContainer = document.getElementById('demo-container');
    demoContainer.innerText = arrayFromResponse[Math.floor(Math.random() * arrayFromResponse.length)];
}