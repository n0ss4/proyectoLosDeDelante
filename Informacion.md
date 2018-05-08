# Información sobre que hace cada casilla del juego.

- **Oca**: Cuando se cae en una de estas casillas, se avanza hasta la siguiente oca y, en ocasiones, se vuelve a tirar.
- **Puente**: Cuando se cae en una de estas casillas, se avanza o retrocede hasta el otro puente y, en ocasiones, se vuelve a tirar.
- **Posada**: Cuando se cae en esta casilla, suelen perderse 2 turnos.
- **Dados**: Cuando se cae en una de estas dos casillas, se suman las cifras que aparezcan en la casilla y se avanza ese número de casillas.
- **Pozo**: Cuando se cae en esta casilla, suelen o bien perderse 2 turnos o bien permanecer el jugador sin jugar hasta que otro caiga en su lugar.
- **Laberinto**: Cuando se cae en el laberinto, se está obligado a retroceder a la casilla 30.
- **Carcel**: Cuando se cae en la cárcel, suelen perderse 3 turnos.
- **Calavera**: Cuando se cae en la calavera o muerte, se vuelve a empezar desde la casilla de inicio.
- **Meta**: Finaliza el juego.

```
5 - Oca
6 - Puente
9 - Oca
12 - Puente
14 - Oca
18 - Oca
19 - Posada
23 - Oca
26 - Dados
27 - Oca
31 - Pozo
32 - Oca
36 - Oca
41 - Oca
42 - Laberinto
45 - Oca
50 - Oca
52 - Carcel
53 - Dados
54 - Oca
58 - Calavera
59 - Oca
63 - Meta / Oca
```

- Ejemplo con Java

```
for (int i = 0; i <= 63; i++) {
    switch(i){
        case 5 : break; //Oca
        case 6 : break; //Puente
        case 9 : break; //Oca
        case 12 : break; //Puente
        case 14 : break; //Oca
        case 18 : break; //Oca
        case 19 : break; //Posada
        case 23 : break; //Oca
        case 26 : break; //Dados
        case 27 : break; //Oca
        case 31 : break; //Pozo
        case 32 : break; //Oca
        case 36 : break; //Oca
        case 41 : break; //Oca
        case 42 : break; //Laberinto 
        case 45 : break; //Oca
        case 50 : break; //Oca
        case 52 : break; //Carcel
        case 53 : break; //Dados
        case 54 : break; //Oca
        case 58 : break; //Calavera
        case 59 : break; //Oca
        case 63 : break; // Meta / Oca
        default : break;
    }
}
```
