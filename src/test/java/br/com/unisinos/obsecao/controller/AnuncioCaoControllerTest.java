package br.com.unisinos.obsecao.controller;

import br.com.unisinos.obsecao.exception.CustomException;
import br.com.unisinos.obsecao.exception.EmptyDataException;
import br.com.unisinos.obsecao.service.AnuncioCaoService;
import br.com.unisinos.obsecao.service.PopulaDBService;
import br.com.unisinos.obsecao.utils.DtosBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;

@WebMvcTest
@DisplayName("AnuncioCaoController Testes")
class AnuncioCaoControllerTest {

    DtosBuilder dtosBuilder = new DtosBuilder();

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    AnuncioCaoService anuncioCaoService;

    @MockBean
    PopulaDBService populaDBService;

    @Test
    @DisplayName("Deve retornar status 200")
    void Http_Status_OK_200() throws Exception{
        //given
        when(anuncioCaoService.getAllAnuncios()).thenReturn(dtosBuilder.listAnuncioCaoDto());

        //when - then
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/anuncios"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    @DisplayName("Deve retornar status 418")
    void Http_Status_I_AM_A_TEAPOT_418() throws Exception{
        //given
        when(anuncioCaoService.getAllAnuncios()).thenThrow(EmptyDataException.class);

        //when - then
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/anuncios"))
                .andExpect(MockMvcResultMatchers.status().is(418));
    }

    @ParameterizedTest
    @ValueSource(ints = {500, 503, 412})
    @DisplayName("Deve validar os status -> 500 e 503")
    void souldValidadeController5xxExceptions(int status) throws Exception {
        //given
        when(anuncioCaoService.getAllAnuncios()).thenThrow(new CustomException(String.format("Error %s", status), HttpStatus.valueOf(status)));

        //when - then
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/anuncios"))
                .andExpect(MockMvcResultMatchers.status().is(status));
    }
}
