package mx.com.bwl.marvel_api.service.impl;

import mx.com.bwl.marvel_api.service.MarvelApiService;
import mx.com.bwl.marvel_api.vo.marvel.ResponseVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class MarvelApiServiceImpl implements MarvelApiService {


    public MarvelApiServiceImpl(String publicKey, String privateKey, String apiTimeStamp){
        this.apiPublicKey = publicKey;
        this.apiPrivateKey = privateKey;
        this.apiTimestampValue = apiTimeStamp;
        this.apiUrl = System.getenv("API_URL");
    }

    public MarvelApiServiceImpl(String publicKey, String privateKey, String apiTimeStamp, String apiUrl){
        this.apiPublicKey = publicKey;
        this.apiPrivateKey = privateKey;
        this.apiTimestampValue = apiTimeStamp;
        this.apiUrl = apiUrl;
    }

    private final String apiUrl;

    private final String apiPublicKey;

    private final String apiPrivateKey;

    private final String apiTimestampValue;


    @Override
    public ResponseVO findAllCharacters() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl.concat("?apikey=").concat(apiPublicKey).concat("&ts=").concat(apiTimestampValue).concat("&hash=").concat(apiPrivateKey), ResponseVO.class);
    }

    @Override
    public ResponseVO findCharacterById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl.concat("/").concat(String.valueOf(id)).concat("?apikey=").concat(apiPublicKey).concat("&ts=").concat(apiTimestampValue).concat("&hash=").concat(apiPrivateKey), ResponseVO.class);
    }
}
