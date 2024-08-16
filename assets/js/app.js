const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name'); //Se agrega "."
const $b = document.querySelector('.blog'); //Se agrega "."
const $l = document.querySelector('.location');

//  Se declara función asíncrona
async function displayUser(username) {
  $n.textContent = 'cargando...';
  
  // await valido para funciones asíncronas
  const response = await fetch(`${usersEndpoint}/${username}`);
  
  console.log(data);
  $n.textContent = '${data.name}';
  $b.textContent = '${data.blog}';
  $l.textContent = '${data.location}';
}

function handleError(err) {
  console.log('OH NO!');
  console.log(`${err}`);
  $n.textContent = `Algo salió mal: ${err}`;
}

displayUser('stolinski').catch(handleError);

