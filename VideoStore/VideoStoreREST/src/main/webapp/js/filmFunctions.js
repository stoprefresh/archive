window.addEventListener('load', function(e) {
  console.log('document loaded');
  init();
});

function init() {
  document.filmForm.lookup.addEventListener('click', function(event) {
    event.preventDefault();
    var filmId = document.filmForm.filmId.value;
    if (!isNaN(filmId) && filmId > 0) {
      getFilm(filmId);
    }
  })
}

function getFilm(filmId) {
	const url = `api/films/${filmId}`;
  // TODO:
  // * Use XMLHttpRequest to perform a GET request to "api/films/"
  //   with the filmId appended.
  // * On success, if a response was received parse the film data
  //   and pass the film object to displayFilm().
  // * On failure, or if no response text was received, put "Film not found" 
  //   in the filmData div.
  var xhr = new XMLHttpRequest();
  xhr.open('GET', url, true);

  console.log(filmId);

   xhr.onreadystatechange = () => {
    this.console.log(`readyState: ${xhr.readyState}`);
    this.console.log(`status: ${xhr.status}`);

    if(xhr.readyState === 4) {
      let data = JSON.parse(xhr.responseText);

      
      displayFilm(data);
    }
  };
  xhr.send(null);
 }


function displayFilm(film) {

  var block = document.getElementById('output');

  var dataDiv = document.getElementById('filmData');
  
  var actorDiv = document.getElementById('actorData')
 

  dataDiv.appendChild(document.createElement("br"));
  dataDiv.append(document.createTextNode(`Title: ${film.title}`));
  dataDiv.appendChild(document.createElement("br"));
  dataDiv.append(document.createTextNode(`Description: ${film.description}`));
  dataDiv.appendChild(document.createElement("br"));
  dataDiv.append(document.createTextNode(`Release Year: ${film.releaseYear}`));
  dataDiv.appendChild(document.createElement("br"));
  dataDiv.append(document.createTextNode(`Rental Rate: ${film.rentalRate}`));
  dataDiv.appendChild(document.createElement("br"));
  dataDiv.append(document.createTextNode(`Replacement Cost: ${film.replacementCost}`));
  dataDiv.appendChild(document.createElement("br"));
  dataDiv.append(document.createTextNode(`Rating: ${film.rating}`));
  dataDiv.appendChild(document.createElement("br"));
  dataDiv.append(document.createTextNode(`Language: ${film.language.name}`));
  dataDiv.appendChild(document.createElement("br"));
  dataDiv.appendChild(document.createElement("br"));

  for (let [key, value] of Object.entries(film.actors)){
    
    dataDiv.append(document.createTextNode(`Actor ${value.id}: ${value.lastName}, ${value.firstName} `));
    dataDiv.appendChild(document.createElement("br"));
    
  }

}