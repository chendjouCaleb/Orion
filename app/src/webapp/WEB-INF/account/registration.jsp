<!doctype html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/dist/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="/dist/css/style.css">
    <title>Inscription</title>
</head>
<body>
    <div class="container-fluid">
        <form method="post" class="col-4 offset-lg-4 mt-5 border py-3">
            <h3 class="col font-weight-bold">Inscription</h3>
            <hr>
            <div class="col-12 form-group">
                <label for="name">Nom</label>
                <input id="name" name="name" class="form-control">
            </div>

            <div class="col-12 form-group">
                <label for="surname">Prénom</label>
                <input id="surname" name="surname" class="form-control">
            </div>

            <div class="col-12 form-group">
                <label for="email">Adresse électronique</label>
                <input id="email" name="email" class="form-control">
            </div>

            <div class="col-12 form-group">
                <label for="password">Mot de passe</label>
                <input id="password" name="password" class="form-control">
            </div>

            <div class="col-12 form-group">
                <label for="passwordMatcher">Mot de passe(Confirmation)</label>
                <input id="passwordMatcher" name="passwordMatcher" class="form-control">
            </div>

            <div class="col text-right">
                <button class="btn btn-info">S'INSCRIRE</button>
            </div>

        </form>
    </div>
</body>
</html>