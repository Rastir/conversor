# Bienvenidos al projecto de ejercicio "Conversor de Monedas 💰"  

##  
Este es un conversor de monedas desarrollado en **Java** que obtiene tasas de conversión en tiempo real utilizando la API de ExchangeRate-API.  
Permite al usuario seleccionar una moneda de origen, una moneda destino y calcular el valor de la conversión.  

## Características  
- La Interfaz de línea de comandos es interactiva, tu podrás ingresar los datos que desees.  
- La validación de entrada del usuario se encuentra activa osea que evita ingresar caracteres no válidos o datos no correspondientes a los solicitados. 
- Integración de la API de conversión de moneda en tiempo real, así que siempre tendrás los datos de todas las monedas soportadas (revisar lista más abajo)
- Se ha integrado un bucle para permitir múltiples conversiones en una sola sesión  

## 🔧 Tecnologías utilizadas  
- **Java 17**  
- **ExchangeRate-API**  
- **Gson (para manejar JSON)**  

## Instalación y ejecución  
1. Clona el repositorio:
2. Abre el proyecto en tu IDE favorito.
3. Asegúrate de tener acceso a Internet para obtener datos de la API.
4. Ejecuta el método main en ConversorMonedas.java.

## Uso
Al ejecutar el programa, el usuario puede:
- Ingresar la cantidad que desea convertir.
- Seleccionar la moneda de origen (Ejemplo: USD, EUR, MXN).
- Seleccionar la moneda de destino (Ejemplo: JPY, CAD, BRL).
- Ver el resultado de la conversión en pantalla.
- Elegir continuar o salir del programa.
  
## Contribuciones
Si deseas mejorar el proyecto, ¡siempre son bienvenidas las contribuciones! Puedes hacer un fork, proponer cambios o mejorar la documentación.

## Licencia
Este proyecto está bajo la licencia MIT.

## Contacto
Si tienes dudas o sugerencias, puedes contactarme aquí, será un placer intercambiar ideas.

## Monedas soportadas

Aquí están todas las monedas que soporta la API encontradas en la documentación de la propia API "https://www.exchangerate-api.com/docs/supported-currencies"

Organizada por SIGLAS // NOMBRE DE LA MONEDA // PAÍS DE ORIGEN

- AED	UAE Dirham	United Arab Emirates
- AFN	Afghan Afghani	Afghanistan
- ALL	Albanian Lek	Albania
- AMD	Armenian Dram	Armenia
- ANG	Netherlands Antillian Guilder	Netherlands Antilles
- AOA	Angolan Kwanza	Angola
- ARS	Argentine Peso	Argentina
- AUD	Australian Dollar	Australia
- AWG	Aruban Florin	Aruba
- AZN	Azerbaijani Manat	Azerbaijan
- BAM	Bosnia and Herzegovina Mark	Bosnia and Herzegovina
- BBD	Barbados Dollar	Barbados
- BDT	Bangladeshi Taka	Bangladesh
- BGN	Bulgarian Lev	Bulgaria
- BHD	Bahraini Dinar	Bahrain
- BIF	Burundian Franc	Burundi
- BMD	Bermudian Dollar	Bermuda
- BND	Brunei Dollar	Brunei
- BOB	Bolivian Boliviano	Bolivia
- BRL	Brazilian Real	Brazil
- BSD	Bahamian Dollar	Bahamas
- BTN	Bhutanese Ngultrum	Bhutan
- BWP	Botswana Pula	Botswana
- BYN	Belarusian Ruble	Belarus
- BZD	Belize Dollar	Belize
- CAD	Canadian Dollar	Canada
- CDF	Congolese Franc	Democratic Republic of the Congo
- CHF	Swiss Franc	Switzerland
- CLP	Chilean Peso	Chile
- CNY	Chinese Renminbi	China
- COP	Colombian Peso	Colombia
- CRC	Costa Rican Colon	Costa Rica
- CUP	Cuban Peso	Cuba
- CVE	Cape Verdean Escudo	Cape Verde
- CZK	Czech Koruna	Czech Republic
- DJF	Djiboutian Franc	Djibouti
- DKK	Danish Krone	Denmark
- DOP	Dominican Peso	Dominican Republic
- DZD	Algerian Dinar	Algeria
- EGP	Egyptian Pound	Egypt
- ERN	Eritrean Nakfa	Eritrea
- ETB	Ethiopian Birr	Ethiopia
- EUR	Euro	European Union
- FJD	Fiji Dollar	Fiji
- FKP	Falkland Islands Pound	Falkland Islands
- FOK	Faroese Króna	Faroe Islands
- GBP	Pound Sterling	United Kingdom
- GEL	Georgian Lari	Georgia
- GGP	Guernsey Pound	Guernsey
- GHS	Ghanaian Cedi	Ghana
- GIP	Gibraltar Pound	Gibraltar
- GMD	Gambian Dalasi	The Gambia
- GNF	Guinean Franc	Guinea
- GTQ	Guatemalan Quetzal	Guatemala
- GYD	Guyanese Dollar	Guyana
- HKD	Hong Kong Dollar	Hong Kong
- HNL	Honduran Lempira	Honduras
- HRK	Croatian Kuna	Croatia
- HTG	Haitian Gourde	Haiti
- HUF	Hungarian Forint	Hungary
- IDR	Indonesian Rupiah	Indonesia
- ILS	Israeli New Shekel	Israel
- IMP	Manx Pound	Isle of Man
- INR	Indian Rupee	India
- IQD	Iraqi Dinar	Iraq
- IRR	Iranian Rial	Iran
- ISK	Icelandic Króna	Iceland
- JEP	Jersey Pound	Jersey
- JMD	Jamaican Dollar	Jamaica
- JOD	Jordanian Dinar	Jordan
- JPY	Japanese Yen	Japan
- KES	Kenyan Shilling	Kenya
- KGS	Kyrgyzstani Som	Kyrgyzstan
- KHR	Cambodian Riel	Cambodia
- KID	Kiribati Dollar	Kiribati
- KMF	Comorian Franc	Comoros
- KRW	South Korean Won	South Korea
- KWD	Kuwaiti Dinar	Kuwait
- KYD	Cayman Islands Dollar	Cayman Islands
- KZT	Kazakhstani Tenge	Kazakhstan
- LAK	Lao Kip	Laos
- LBP	Lebanese Pound	Lebanon
- LKR	Sri Lanka Rupee	Sri Lanka
- LRD	Liberian Dollar	Liberia
- LSL	Lesotho Loti	Lesotho
- LYD	Libyan Dinar	Libya
- MAD	Moroccan Dirham	Morocco
- MDL	Moldovan Leu	Moldova
- MGA	Malagasy Ariary	Madagascar
- MKD	Macedonian Denar	North Macedonia
- MMK	Burmese Kyat	Myanmar
- MNT	Mongolian Tögrög	Mongolia
- MOP	Macanese Pataca	Macau
- MRU	Mauritanian Ouguiya	Mauritania
- MUR	Mauritian Rupee	Mauritius
- MVR	Maldivian Rufiyaa	Maldives
- MWK	Malawian Kwacha	Malawi
- MXN	Mexican Peso	Mexico
- MYR	Malaysian Ringgit	Malaysia
- MZN	Mozambican Metical	Mozambique
- NAD	Namibian Dollar	Namibia
- NGN	Nigerian Naira	Nigeria
- NIO	Nicaraguan Córdoba	Nicaragua
- NOK	Norwegian Krone	Norway
- NPR	Nepalese Rupee	Nepal
- NZD	New Zealand Dollar	New Zealand
- OMR	Omani Rial	Oman
- PAB	Panamanian Balboa	Panama
- PEN	Peruvian Sol	Peru
- PGK	Papua New Guinean Kina	Papua New Guinea
- PHP	Philippine Peso	Philippines
- PKR	Pakistani Rupee	Pakistan
- PLN	Polish Złoty	Poland
- PYG	Paraguayan Guaraní	Paraguay
- QAR	Qatari Riyal	Qatar
- RON	Romanian Leu	Romania
- RSD	Serbian Dinar	Serbia
- RUB	Russian Ruble	Russia
- RWF	Rwandan Franc	Rwanda
- SAR	Saudi Riyal	Saudi Arabia
- SBD	Solomon Islands Dollar	Solomon Islands
- SCR	Seychellois Rupee	Seychelles
- SDG	Sudanese Pound	Sudan
- SEK	Swedish Krona	Sweden
- SGD	Singapore Dollar	Singapore
- SHP	Saint Helena Pound	Saint Helena
- SLE	Sierra Leonean Leone	Sierra Leone
- SOS	Somali Shilling	Somalia
- SRD	Surinamese Dollar	Suriname
- SSP	South Sudanese Pound	South Sudan
- STN	São Tomé and Príncipe Dobra	São Tomé and Príncipe
- SYP	Syrian Pound	Syria
- SZL	Eswatini Lilangeni	Eswatini
- THB	Thai Baht	Thailand
- TJS	Tajikistani Somoni	Tajikistan
- TMT	Turkmenistan Manat	Turkmenistan
- TND	Tunisian Dinar	Tunisia
- TOP	Tongan Paʻanga	Tonga
- TRY	Turkish Lira	Turkey
- TTD	Trinidad and Tobago Dollar	Trinidad and Tobago
- TVD	Tuvaluan Dollar	Tuvalu
- TWD	New Taiwan Dollar	Taiwan
- TZS	Tanzanian Shilling	Tanzania
- UAH	Ukrainian Hryvnia	Ukraine
- UGX	Ugandan Shilling	Uganda
- USD	United States Dollar	United States
- UYU	Uruguayan Peso	Uruguay
- UZS	Uzbekistani So'm	Uzbekistan
- VES	Venezuelan Bolívar Soberano	Venezuela
- VND	Vietnamese Đồng	Vietnam
- VUV	Vanuatu Vatu	Vanuatu
- WST	Samoan Tālā	Samoa
- XAF	Central African CFA Franc	CEMAC
- XCD	East Caribbean Dollar	Organisation of Eastern Caribbean States
- XDR	Special Drawing Rights	International Monetary Fund
- XOF	West African CFA franc	CFA
- XPF	CFP Franc	Collectivités d'Outre-Mer
- YER	Yemeni Rial	Yemen
- ZAR	South African Rand	South Africa
- ZMW	Zambian Kwacha	Zambia
- ZWL	Zimbabwean Dollar	Zimbabwe
