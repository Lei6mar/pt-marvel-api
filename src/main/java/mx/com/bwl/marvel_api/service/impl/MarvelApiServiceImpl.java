package mx.com.bwl.marvel_api.service.impl;

import mx.com.bwl.marvel_api.service.MarvelApiService;
import mx.com.bwl.marvel_api.vo.marvel.ResponseVO;
import org.springframework.web.client.RestTemplate;

public class MarvelApiServiceImpl implements MarvelApiService {


    public MarvelApiServiceImpl(String publicKey, String privateKey, String apiTimeStamp){
        this.apiPublicKey = publicKey;
        this.apiPrivateKey = privateKey;
        this.apiTimestampValue = apiTimeStamp;
    }

    private static final String API_URL = "https://gateway.marvel.com/v1/public/characters";

    private final String apiPublicKey;

    private final String apiPrivateKey;

    private final String apiTimestampValue;


    @Override
    public ResponseVO findAllCharacters() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL.concat("?apikey=").concat(apiPublicKey).concat("&ts=").concat(apiTimestampValue).concat("&hash=").concat(apiPrivateKey), ResponseVO.class);
    }

    @Override
    public ResponseVO findCharacterById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL.concat("/").concat(String.valueOf(id)).concat("?apikey=").concat(apiPublicKey).concat("&ts=").concat(apiTimestampValue).concat("&hash=").concat(apiPrivateKey), ResponseVO.class);
    }
}
