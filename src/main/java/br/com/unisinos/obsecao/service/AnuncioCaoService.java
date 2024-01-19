package br.com.unisinos.obsecao.service;

import br.com.unisinos.obsecao.exception.EmptyDataException;
import br.com.unisinos.obsecao.model.AnuncioCaoModel;
import br.com.unisinos.obsecao.model.CaoModel;
import br.com.unisinos.obsecao.model.dto.AnuncioCaoDto;
import br.com.unisinos.obsecao.repository.AnuncioCaoRepository;
import br.com.unisinos.obsecao.repository.CaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnuncioCaoService {

    @Autowired
    AnuncioCaoRepository anuncioCaoRepository;

    @Autowired
    CaoRepository caoRepository;

    public List<AnuncioCaoDto> getAllAnuncios(){
        List<AnuncioCaoModel> anuncioCaoModelList = new ArrayList<>(anuncioCaoRepository.findAll());

        List<AnuncioCaoDto> anuncioCaoDtoList = new ArrayList<>();

        if (anuncioCaoModelList.size() > 0){
            for(AnuncioCaoModel anuncio : anuncioCaoModelList){
                CaoModel caoModel =  caoRepository.getById(anuncio.getId());

                anuncioCaoDtoList.add(
                        AnuncioCaoDto.builder()
                        .nome(caoModel.getNome())
                        .idade(caoModel.getIdade())
                        .porte(caoModel.getPorte())
                        .descricao(caoModel.getDescricao())
                        .nomeOng(caoModel.getOng().getNome())
                        .enderecoOng(caoModel.getOng().getEndereco())
                        .adotado(anuncio.isAdotado())
                        .build()
                );
            }
        } else {
            throw new EmptyDataException("Não existem anúncios no momento");
        }
        return anuncioCaoDtoList;
    }
}