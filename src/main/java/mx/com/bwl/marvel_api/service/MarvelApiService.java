package mx.com.bwl.marvel_api.service;

import mx.com.bwl.marvel_api.vo.marvel.ResponseVO;

public interface MarvelApiService {
     ResponseVO findAllCharacters();
     ResponseVO findCharacterById(Long id);
}
