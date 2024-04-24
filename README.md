<h1>Conversor_de_Monedas</h1> 

El programa presentado es un conversor básico de divisas, usando sólo cuatro monedas de diferentes países, siendo el dólar la moneda en la que se basan las conversiones.
Es desarrollado en lenguaje Java y haciendo uso de la API Exchange Rate API (https://www.exchangerate-api.com/).
Sólo implementado a través de la consola.
Programado con elementos básicos del lenguaje Java y siguiendo los video-tutoriales del programa ONE Oracle Next Education, en la formación Java Orientado a Objetos G6-ONE.

La estructura del proyecto se divide solo en dos clases.

Clase Principal.

Encargada de la lógica del conversor y del menú que se mostrará en consola.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                ******************************************
                Bienvenido/a al conversor de monedas 

                Elige el número de la opción deseada:
                1) Dólar ==> Peso mexicano
                2) Peso mexicano ==> Dólar
                3) Dólar ==> Real brasileño
                4) Real brasileño ==> Dólar
                5) Dólar ==> Peso colombiano
                6) Peso colombiano ==> Dólar
                7) Salir
 ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------             

Encargada de hacer la peticón al servidor y obtener el JSON donde se encuentran los valores de las monedas tomando como encuenta el valor de 1 USD (dólar)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
{
 "result":"success",
 "documentation":"https://www.exchangerate-api.com/docs",
 "terms_of_use":"https://www.exchangerate-api.com/terms",
 "time_last_update_unix":1713916801,
 "time_last_update_utc":"Wed, 24 Apr 2024 00:00:01 +0000",
 "time_next_update_unix":1714003201,
 "time_next_update_utc":"Thu, 25 Apr 2024 00:00:01 +0000",
 "base_code":"USD",
 "conversion_rates":{
  "USD":1,
  "AED":3.6725,
  "AFN":72.1000,
  "ALL":94.6546,
  "AMD":390.7676,
  "ANG":1.7900,
  "AOA":844.5301,
  "ARS":864.7500,
  "AUD":1.5439,
  "AWG":1.7900,
  "AZN":1.6998,
  "BAM":1.8294,
  "BBD":2.0000,
  "BDT":109.7277,
  "BGN":1.8297,
  "BHD":0.3760,
  "BIF":2864.0561,
  "BMD":1.0000,
  "BND":1.3618,
  "BOB":6.9192,
  "BRL":5.1680,
  "BSD":1.0000,
  "BTN":83.3320,
  "BWP":13.8741,
  "BYN":3.2603,
  "BZD":2.0000,
  "CAD":1.3675,
  "CDF":2750.4354,
  "CHF":0.9114,
  "CLP":952.5158,
  "CNY":7.2512,
  "COP":3901.8504,
  "CRC":500.3506,
  "CUP":24.0000,
  "CVE":103.1387,
  "CZK":23.6320,
  "DJF":177.7210,
  "DKK":6.9750,
  "DOP":58.9203,
  "DZD":134.5954,
  "EGP":48.0602,
  "ERN":15.0000,
  "ETB":56.9442,
  "EUR":0.9354,
  "FJD":2.2884,
  "FKP":0.8041,
  "FOK":6.9749,
  "GBP":0.8041,
  "GEL":2.6758,
  "GGP":0.8041,
  "GHS":13.5661,
  "GIP":0.8041,
  "GMD":66.2169,
  "GNF":8579.0659,
  "GTQ":7.7643,
  "GYD":209.1788,
  "HKD":7.8357,
  "HNL":24.6714,
  "HRK":7.0476,
  "HTG":132.3134,
  "HUF":367.9302,
  "IDR":16218.4078,
  "ILS":3.7720,
  "IMP":0.8041,
  "INR":83.3266,
  "IQD":1310.2365,
  "IRR":41972.2722,
  "ISK":140.9037,
  "JEP":0.8041,
  "JMD":155.7172,
  "JOD":0.7090,
  "JPY":154.7149,
  "KES":133.4702,
  "KGS":89.2167,
  "KHR":4051.3544,
  "KID":1.5438,
  "KMF":460.1726,
  "KRW":1374.3428,
  "KWD":0.3080,
  "KYD":0.8333,
  "KZT":443.7126,
  "LAK":21727.2583,
  "LBP":89500.0000,
  "LKR":300.1413,
  "LRD":192.6762,
  "LSL":19.1272,
  "LYD":4.8750,
  "MAD":10.1411,
  "MDL":17.8443,
  "MGA":4404.4420,
  "MKD":57.8428,
  "MMK":2094.0610,
  "MNT":3427.0187,
  "MOP":8.0709,
  "MRU":39.7395,
  "MUR":46.4702,
  "MVR":15.4354,
  "MWK":1741.7699,
  "MXN":17.0172,
  "MYR":4.7792,
  "MZN":63.9781,
  "NAD":19.1272,
  "NGN":1160.4530,
  "NIO":36.7666,
  "NOK":10.9308,
  "NPR":133.3312,
  "NZD":1.6863,
  "OMR":0.3845,
  "PAB":1.0000,
  "PEN":3.7003,
  "PGK":3.7939,
  "PHP":57.5187,
  "PKR":278.6376,
  "PLN":4.0344,
  "PYG":7352.1918,
  "QAR":3.6400,
  "RON":4.6615,
  "RSD":109.7591,
  "RUB":93.3046,
  "RWF":1301.4736,
  "SAR":3.7500,
  "SBD":8.3897,
  "SCR":13.5714,
  "SDG":449.1187,
  "SEK":10.8249,
  "SGD":1.3618,
  "SHP":0.8041,
  "SLE":22.6394,
  "SLL":22639.3931,
  "SOS":571.2587,
  "SRD":34.7895,
  "SSP":1592.2707,
  "STN":22.9166,
  "SYP":12902.5894,
  "SZL":19.1272,
  "THB":36.9466,
  "TJS":10.9568,
  "TMT":3.5000,
  "TND":3.1517,
  "TOP":2.3480,
  "TRY":32.5742,
  "TTD":6.7651,
  "TVD":1.5438,
  "TWD":32.5448,
  "TZS":2586.9851,
  "UAH":39.5766,
  "UGX":3808.8048,
  "UYU":38.4850,
  "UZS":12760.0858,
  "VES":36.3877,
  "VND":25398.7708,
  "VUV":121.5879,
  "WST":2.7728,
  "XAF":613.5635,
  "XCD":2.7000,
  "XDR":0.7591,
  "XOF":613.5635,
  "XPF":111.6198,
  "YER":250.1750,
  "ZAR":19.1258,
  "ZMW":25.9907,
  "ZWL":13.2536
 }
 
 ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Al final de elegir la opción deseada solo de 7 opciones la ultima es salir del programa.


Nota: Existen muchas faltas al proyecto propuesto por Alura, debido al poco conocimiento de la desarralladora. 



