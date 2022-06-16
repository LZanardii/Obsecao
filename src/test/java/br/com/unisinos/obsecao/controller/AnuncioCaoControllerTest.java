package br.com.unisinos.obsecao.controller;

import br.com.unisinos.obsecao.exception.EmptyDataException;
import br.com.unisinos.obsecao.service.AnuncioCaoService;
import br.com.unisinos.obsecao.service.PopulaDBService;
import br.com.unisinos.obsecao.utils.DtosBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;

@WebMvcTest
class AnuncioCaoControllerTest {

    DtosBuilder dtosBuilder = new DtosBuilder();

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    AnuncioCaoService anuncioCaoService;

    @MockBean
    PopulaDBService populaDBService;

    @Test
    void Http_Status_OK_200() throws Exception{
        //given
        when(anuncioCaoService.getAllAnuncios()).thenReturn(dtosBuilder.listAnuncioCaoDto());

        //when - then
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/anuncios"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void Http_Status_I_AM_A_TEAPOT_418() throws Exception{
        //given
        when(anuncioCaoService.getAllAnuncios()).thenThrow(EmptyDataException.class);

        //when - then
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/api/anuncios"))
                .andExpect(MockMvcResultMatchers.status().is(418));
    }

}
