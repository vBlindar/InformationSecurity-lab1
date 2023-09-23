<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Шифровальщик</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<div class="header">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark py-3">
        <div class="container">
            <button class="btn btn-outline-light" onclick="changeEncoder('two-arrays')">Два массива</button>
            <button class="btn btn-outline-light" onclick="changeEncoder('caesar')">Шифр цезаря</button>
        </div>
    </nav>
</div>
<div class="container">
    <form id="read-file">
        <div class="container">
            <div id="attach-file">
                <label for="file" class="form-label">Выберите файл</label>
                <input type="file" class="form-control my-2" name="file" accept=".txt"/>
            </div>
        </div>
        <button type="submit" class="btn btn-outline-dark my-2">Подтвердить</button>
    </form>

    <div id="two-arrays-table" style="display: none">

    </div>

    <div class="textarea-block">
        <div class="textarea">
            <label for="text-original" class="form-label">Оригинал текста</label>
            <textarea id="text-original" class="form-control textarea-input"></textarea>
        </div>
        <div class="buttons">
            <div id="two-arrays" class="buttons">
                <button onclick="twoArraysEncoding()" class="btn btn-outline-dark my-2">Закодировать</button>
                <button onclick="decodingText()" class="btn btn-outline-dark my-2">Раскодировать</button>
            </div>
            <div id="caesar" class="buttons none">
                <button onclick="caesarEncoding()" class="btn btn-outline-dark my-2">Закодировать cesar</button>
                <button onclick="caesarDecoding()" class="btn btn-outline-dark my-2">Раскодировать</button>
            </div>
        </div>

        <div class="textarea">
            <label for="text-encoding" class="form-label">Закодированный текст</label>
            <textarea id="text-encoding" class="form-control textarea-input"></textarea>
        </div>


    </div>
</div>
</body>
<script src="/js/script.js"></script>
</html>