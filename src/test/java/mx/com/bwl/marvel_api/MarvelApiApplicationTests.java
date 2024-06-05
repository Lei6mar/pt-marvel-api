package mx.com.bwl.marvel_api;

import mx.com.bwl.marvel_api.service.MarvelApiService;
import mx.com.bwl.marvel_api.service.impl.MarvelApiServiceImpl;
import mx.com.bwl.marvel_api.vo.marvel.ResponseVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.web.servlet.MockMvc;
import static org.assertj.core.api.Assertions.assertThat;


@TestComponent
class MarvelApiApplicationTests {


    @Test
    void findAllCharacters(){
        MarvelApiService marvelApiService = new MarvelApiServiceImpl("a6c573c4a1a36fff296ab0c545b30a58", "9b43537b543599a78d1974154955946d", "1716933812", "https://gateway.marvel.com/v1/public/characters");
        assertThat(marvelApiService.findAllCharacters())
                .isNotNull()
                .isInstanceOf(ResponseVO.class)
                .matches(responseVO -> responseVO.getData().getCount() == 20);

    }

    @Test
    void findCharacterById(){
        MarvelApiService marvelApiService = new MarvelApiServiceImpl("a6c573c4a1a36fff296ab0c545b30a58", "9b43537b543599a78d1974154955946d", "1716933812", "https://gateway.marvel.com/v1/public/characters");
        ResponseVO resp = marvelApiService.findCharacterById(1011136L);
        assertThat(resp)
                .isNotNull()
                .isInstanceOf(ResponseVO.class)
                .matches(responseVO -> responseVO.getData().getCount() == 1);
    }

}
