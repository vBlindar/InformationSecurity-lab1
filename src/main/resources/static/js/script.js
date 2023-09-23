const readFile = document.getElementById("read-file");

readFile.addEventListener('submit', getTextFromFile);

async function getTextFromFile(e) {
    e.preventDefault();
    const data = new FormData(e.target);


    const response = await fetch("/read-file", {
        method: 'POST',
        body: data
    });

    const text = await response.text();

    const originalText = document.getElementById("text-original");
    originalText.value = text;
}
async function caesarEncoding(){
    const originalText = document.getElementById("text-original").value;
    const response = await fetch(`/caesar/encoding?original=${originalText}?key=${null}`);
    const object = await response.json();

    const encodingArea = document.getElementById('text-encoding');
    encodingArea.value = object.encodeText;
    await updateAlphabetTwoArrays(object.key);

}


async function twoArraysEncoding(){
    const originalText = document.getElementById("text-original").value;
    const response = await fetch(`/encoding?original=${originalText}`);
    const object = await response.json();

    const encodingArea = document.getElementById('text-encoding');
    encodingArea.value = object.encodeText;
    await updateAlphabetTwoArrays(object.alphabet, object.key);
}

async function updateAlphabetTwoArrays(alphabet, key){
    const response = await fetch(`/update-two-arrays-table?alphabet=${alphabet}&key=${key}`);
    const twoArraysTable = document.getElementById('two-arrays-table');
    twoArraysTable.innerHTML = await response.text();
    change('two-arrays-table');
}

function change(id) {
    const elements = ['two-arrays-table'];
    elements.forEach(elementId => {
        const element = document.getElementById(elementId);
        element.style.display = elementId === id ? 'block' : 'none';
    });
}

async function decodingText(type){
    const encodingText = document.getElementById('text-encoding').value;
    const response = await fetch(`/decoding?encoding=${encodingText}&type=${type}`);
    const decodingText = await response.text();
    const decodingArea = document.getElementById('text-original');
    decodingArea.value = decodingText;
}

function changeEncoder(id) {
    const elements = ['two-arrays', 'caesar'];

    elements.forEach(elementId => {
        const element = document.getElementById(elementId);
        // Проверяем, есть ли у элемента класс "none"
        const isHidden = element.classList.contains('none');

        if (elementId === id) {
            // Если класс "none" есть, удаляем его
            if (isHidden) {
                element.classList.remove('none');
            }

        } else {
            // Если класс "none" отсутствует, добавляем его
            if (!isHidden) {
                element.classList.add('none');
            }

        }
    });
}
