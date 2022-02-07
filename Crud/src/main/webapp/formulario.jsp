<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	
	<nav class="navbar navbar-dark bg-success mb-5"
		aria-label="First navbar example">
		<div class="container-fluid">
			<div class="col-4 col-md-4 col-xl-4">
				<a class="navbar-brand" href="index.jsp">Raia Drogasil</a> <a
					class="navbar-brand" href="/formulario.jsp">Usuário</a>
			</div>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarsExample01"
				aria-controls="navbarsExample01" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarsExample01">
				<ul class="navbar-nav me-auto mb-2">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item"><a class="nav-link disabled">Disabled</a>
					</li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="dropdown01"
						data-bs-toggle="dropdown" aria-expanded="false">Dropdown</a>
						<ul class="dropdown-menu" aria-labelledby="dropdown01">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>
				</ul>
				<form>
					<input class="form-control" type="text" placeholder="Search"
						aria-label="Search">
				</form>
			</div>
		</div>
	</nav>

	<div class="container col-12 col-md-4 col-lg-4 col-xl-4 shadow p-3">
		<h3 class="card-title">Adicionar usuário</h3>

		<form action="Servlet" method="post">

			

				<c:when test="${ user == null }">


					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Nome</label> <input
							type="text" class="form-control" name="name">

					</div>

					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Email</label>
						<input type="text" class="form-control" name="email">
					</div>

					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">País</label>
						<input type="text" class="form-control" name="pais">
					</div>

					<c:choose>
						<c:when teste="${user == null}">
							<div class="mb-3">
								<button class="btn btn-primary" type="submit" name="option"
									value="insert">Salvar</button>
							</div>
		

						</c:when>

						<c:otherwise>
								<div class="mb-3">
								<button class="btn btn-primary" type="submit" name="option"
									value="update">Atualizar</button>
							</div>

						</c:otherwise>


					</c:choose>


				</c:when>



		</form>
	</div>
	

</body>
</html>