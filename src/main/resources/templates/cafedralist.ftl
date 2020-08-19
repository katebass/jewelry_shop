<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
    <h1>Cafedras list web</h1>
    <div>
        <form name="search">
            <input type="text" name="search_word">
            <input type="submit" value="Search">
        </form>
        <table class="table table-dark">
            <tr>
                <th>Number</th>
                <th>Name</th>
                <th>Description </th>
                <th>Chief</th>
                <th>Action</th>
            </tr>
            <#list list as item>
                <tr>
                    <td>${item?counter}</td>
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>${item.chief}</td>
                    <td><a href="http://localhost:8080/web/cafedra/delete/${item.id}">
                            <input type="button" value="delete" class="btn-danger">

                        </a>
                        <a href="http://localhost:8080/web/cafedra/update/${item.id}">
                            <input type="button" value="update" class="btn-primary">

                        </a>
                    </td>
                </tr>
            </#list>
        </table>

        <a href="http://localhost:8080/web/cafedra/refresh">Refresh all cafedras</a>
        <a href="http://localhost:8080/web/cafedra/create">Create cafedra</a>

        <br>
        <form>
            <input type="text" name="name" placeholder="name">
            <input type="text" name="description" placeholder="description">
            <input type="text" name="chief" placeholder="chief">
            <input type="submit" value="Create">
        </form>

    </div>
</body>
</html>