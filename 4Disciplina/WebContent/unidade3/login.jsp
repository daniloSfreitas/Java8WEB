<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Pagina Login</title>
<link rel="stylesheet" type="text/css" href="lib/css/estilo.css" />
</head>
<body>
      <form name="form" action="http://localhost/4Disciplina/unidade3/autenticacao" method="post">
           CPF: <br />
           <input type="text" name="cpf" pattern ="\d{3}\.\d{3}\.\d{3}\-\d{2}\" maxlength="11" title="Digite o CPF no formato: XXX.XXX.XXX-XX" required/><br />
           SENHA: <br />
           <input type="password" name="senha" title="Preencha o campo senha" required/><br />
           <input type="submit" value="Entrar"/><br />
           
           
      </form>
      
      <p>$(mensagem)</p>
</body>
</html>