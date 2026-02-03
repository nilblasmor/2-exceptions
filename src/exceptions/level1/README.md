### Exercici 1 – Excepcions personalitzades i control d’errors

#### Objectius

- Crear una excepció personalitzada i saber com es llença i es captura.
- Treballar amb col·leccions (`ArrayList<Product>`) i càlculs sobre dades.
- Detectar i gestionar errors habituals com `IndexOutOfBoundsException`.

#### Enunciat

Imagina que estàs desenvolupant una petita aplicació per gestionar vendes. Cada venda pot incloure diversos productes, i el sistema ha de ser capaç de calcular el total. Ara bé, no tindria sentit fer aquest càlcul si encara no s'ha afegit cap producte. Per això, implementarem una comprovació per evitar-ho.

Comença definint una classe `Product` amb dos atributs: `name` i `price`. Aquesta classe representarà un producte individual dins la venda.

Després, crea una classe `Sale`, que ha de contenir una col·lecció de productes (per exemple, una `ArrayList<Product>`) i una variable per emmagatzemar el total (`totalPrice`). Aquesta classe inclourà un mètode `calculateTotal()` que:

- Comprovi si la col·lecció està buida.
- Si està buida, llenci una excepció personalitzada anomenada `EmptySaleException`, amb el missatge: _"Per fer una venda primer has d’afegir productes"_.
- Si hi ha productes, sumi els preus i desi el total a l’atribut `totalPrice`.

La classe `EmptySaleException` ha de ser filla de `Exception`, i ha d’incloure aquest missatge en el seu constructor.

A més, afegeix una prova per generar una excepció `IndexOutOfBoundsException`, per exemple intentant accedir a una posició inexistent d'una llista, i captura-la mostrant el missatge d'error. Aquesta és una excepció habitual en Java quan es manipulen col·leccions sense fer les comprovacions adequades.

Per acabar, canvia la classe EmptySaleException perquè extengui d’una excepció en temps d’execució, com per exemple RuntimeException.

Saps què significa això? Quina diferència hi ha entre una excepció verificada (checked) i una no verificada (unchecked) com RuntimeException?
