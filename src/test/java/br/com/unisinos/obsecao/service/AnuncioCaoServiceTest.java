package br.com.unisinos.obsecao.service;

import br.com.unisinos.obsecao.exception.EmptyDataException;
import br.com.unisinos.obsecao.model.dto.AnuncioCaoDto;
import br.com.unisinos.obsecao.repository.AnuncioCaoRepository;
import br.com.unisinos.obsecao.repository.CaoRepository;
import br.com.unisinos.obsecao.service.AnuncioCaoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static br.com.unisinos.obsecao.utils.DtosBuilder.buildAnuncioCaoModel;
import static br.com.unisinos.obsecao.utils.DtosBuilder.buildCaoModel;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("AnuncioCaoService Testes")
public class AnuncioCaoServiceTest {

  @InjectMocks
  AnuncioCaoService anuncioCaoService;

  @Mock
  AnuncioCaoRepository anuncioCaoRepository;

  @Mock
  CaoRepository caoRepository;

  @Test
  @DisplayName("Deve retornar todos os anuncios")
  void shouldGetAllAnuncios(){
    //given
    when(anuncioCaoRepository.findAll()).thenReturn(List.of(buildAnuncioCaoModel()));
    when(caoRepository.getById(anyInt())).thenReturn(buildCaoModel());

    //when
    List<AnuncioCaoDto> list = anuncioCaoService.getAllAnuncios();

    //then
    assertEquals(list.size(), 1);
    assertEquals(list.get(0).getNome(), "Faísca e Fagulha");
  }

  @Test
  @DisplayName("Deve retornar uma exception quando não existir anuncios")
  void shouldThrowException(){
    //given
    when(anuncioCaoRepository.findAll()).thenReturn(List.of());

    //when
    EmptyDataException thrown = assertThrows(EmptyDataException.class, () -> anuncioCaoService.getAllAnuncios());

    //then
    assertEquals("Não existem anúncios no momento", thrown.getMessage());
  }
}
