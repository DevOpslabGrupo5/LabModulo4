package com.devops.dxc.devops.model;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.client.RestTemplate;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

import javax.net.ssl.SSLContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class Util {

    Logger logger = LoggerFactory.getLogger(Util.class);

    /**
     * Método para cacular el 10% del ahorro en la AFP. Las reglas de negocio se
     * pueden conocer en
     * https://www.previsionsocial.gob.cl/sps/preguntas-frecuentes-nuevo-retiro-seguro-10/
     * 
     * @param ahorro
     * @param sueldo
     * @return
     * 
     * 
     *         La Ley estableció un mínimo de entre 0 y 35 UF, y un máximo de 150
     *         UF.
     *         Es decir, entre $1 millón y $4.3 millones aproximadamente.
     *         Para aquellos que tengan un saldo en su cuenta individual menor a $1
     *         millón,
     *         podrán hacer el retiro total de fondos en una cuota.
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * 
     */
    public int getDxc(int ahorro) throws KeyManagementException, NoSuchAlgorithmException {

        if (((ahorro * 0.1) / getUf()) > 150) {
            return (int) (150 * getUf());
        } else if ((ahorro * 0.1) <= 1000000 && ahorro >= 1000000) {
            return 1000000;
        } else if (ahorro <= 1000000) {
            return ahorro;
        } else {
            return (int) (ahorro * 0.1);
        }
    }

    public int diezxciento(int ahorro) {
        double diezxciento = ahorro * 0.1;
        logger.info("diezxciento: {}", diezxciento);
        return (int) diezxciento;
    }

    public Float impuesto(int sueldo) {
        Integer sueldoAnual = sueldo * 12;

        /*
         * 0,08 si estás en el tercer tramo (renta anual entre $17.864.280 y $29.773.800
         * de pesos anuales)
         * 0,135 si estás en el cuarto tramo (renta entre 29,7 a 41,6 millones de pesos
         * anuales)
         * 0,23 si estás en el quinto (entre 41,6 y 53,5 millones de pesos anuales)
         * 0,304 si estás en el sexto (entre 53,5 y 71,4 millones de pesos anuales)
         * 0,35 si estás en el séptimo (más de 71,4 millones de pesos anuales)
         */

        float impuesto = 0.0f;
        if (sueldoAnual > 17864280 && (sueldoAnual < 29773800)) {
            impuesto = 0.08f;
        } else if (sueldoAnual > 29700000 && (sueldoAnual < 41600000)) {
            impuesto = 0.135f;
        } else if (sueldoAnual > 41600000 && (sueldoAnual < 53500000)) {
            impuesto = 0.23f;
        } else if (sueldoAnual > 53500000 && (sueldoAnual < 71400000)) {
            impuesto = 0.304f;
        } else if (sueldoAnual > 71400000) {
            impuesto = 0.35f;
        }

        return impuesto;
    }

    public int saldoAhorro(int ahorro) {
        double noventaxciento = ahorro * 0.9;
        return (int) noventaxciento;
    }

    /**
     * Método que retorna el valor de la UF. Este método debe ser refactorizado por
     * una integración a un servicio
     * que retorne la UF en tiempo real. Por ejemplo mindicador.cl
     * 
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    /*
     * public int getUf() throws NoSuchAlgorithmException, KeyManagementException {
     * 
     * Date date = new Date(System.currentTimeMillis());
     * SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
     * String fechaFormateada = formatter.format(date);
     * 
     * logger.info(fechaFormateada);
     * 
     * SSLContext context = SSLContext.getInstance("TLSv1.2");
     * context.init(null, null, null);
     * 
     * CloseableHttpClient httpClient =
     * HttpClientBuilder.create().setSSLContext(context)
     * .build();
     * HttpComponentsClientHttpRequestFactory factory = new
     * HttpComponentsClientHttpRequestFactory(httpClient);
     * 
     * 
     * RestTemplate plantilla = new RestTemplate(factory);
     * //RestTemplate plantilla = new RestTemplate();
     * 
     * String jasonData = plantilla.getForObject("https://mindicador.cl/api/uf/" +
     * formatter.format(date),
     * String.class);
     * 
     * JSONParser jsonParser = new JSONParser();
     * 
     * Object obj;
     * int valorUF = 0;
     * 
     * try {
     * obj = jsonParser.parse(jasonData);
     * JSONObject miIndicadorObject = (JSONObject) obj;
     * JSONArray serieObjectList = (JSONArray) miIndicadorObject.get("serie");
     * JSONObject serieObject = (JSONObject) serieObjectList.get(0); // UF
     * 
     * valorUF = (int) Math.round((Double) serieObject.get("valor"));
     * } catch (Exception e) {
     * 
     * e.printStackTrace();
     * }
     * 
     * logger.info("Valor UF: {}",valorUF);
     * return valorUF;
     * }
     */

    /*
     * public int getUf() throws NoSuchAlgorithmException, KeyManagementException {
     * return 31000;
     * }
     */
    public double getUf() {

        /*
         * Date date = new Date(System.currentTimeMillis());
         * SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
         */

        RestTemplate plantilla = new RestTemplate();

        /* Creación de fecha */

        Calendar fecha = Calendar.getInstance();
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        String FechaApi = String.valueOf(anio) + "/" + String.valueOf(mes) + "/dias/" + String.valueOf(dia);
        logger.info(FechaApi);

        String jasonData = plantilla.getForObject(
                "https://api.sbif.cl/api-sbifv3/recursos_api/uf/" + FechaApi
                        + "?apikey=e04d42e230ddbc2223a61417e21807727e6cb496&formato=JSON",
                String.class);

        @SuppressWarnings("deprecation")
        JSONParser jsonParser = new JSONParser();

        Object obj;
        String valorUF = "0";
        double valorUF_double = 0;
        try {

            obj = jsonParser.parse(jasonData);
            JSONObject miIndicadorObject = (JSONObject) obj;
            JSONArray serieObjectList = (JSONArray) miIndicadorObject.get("UFs");
            JSONObject serieObject = (JSONObject) serieObjectList.get(0); // UF

            valorUF = (String) serieObject.get("Valor");
            valorUF = valorUF.replace(".", "");
            valorUF = valorUF.replace(',', '.');
            valorUF_double = Double.parseDouble(valorUF);
        } catch (Exception e) {

            e.printStackTrace();
        }

        logger.info(valorUF);
        return valorUF_double;
    }

}
