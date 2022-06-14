package br.com.unisinos.obsecao.service;

import br.com.unisinos.obsecao.model.*;
import br.com.unisinos.obsecao.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PopulaDBService {

    @Autowired
    AnuncioCaoRepository anuncioCaoRepository;

    @Autowired
    OngRepository ongRepository;

    @Autowired
    GestorRepository gestorRepository;

    @Autowired
    CaoRepository caoRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    public void populaBanco() {
//        List<OngModel> listaGestor1 = new ArrayList<>();
//        List<OngModel> listaGestor2 = new ArrayList<>();
//
//        EnderecoModel enderecoGestor = new EnderecoModel();
//
//        OngModel Ong1 = new OngModel();
//        OngModel Ong2 = new OngModel();


//        GestorModel Gestor1 = new GestorModel("05046035076", listaGestor1, "Leonardo Zanardi",
//                "leo_zanardi", "5199999999", "leo_za@gmail.com", );
//        GestorModel Gestor2 = new GestorModel("05046059018", listaGestor2,"Guilherme Weber");

//        OngModel Ong1 = new OngModel();
//        OngModel Ong2 = new OngModel();
//
//        CaoModel cao1 = new CaoModel();
//        CaoModel cao2 = new CaoModel();
//        CaoModel cao3 = new CaoModel();
//
//
//
//        EnderecoModel enderecoOng = new EnderecoModel();
//        EnderecoModel enderecoGestor = new EnderecoModel();
//
//
//        AnuncioCaoModel anuncioCao1 = new AnuncioCaoModel();
//        AnuncioCaoModel anuncioCao2 = new AnuncioCaoModel();
//        AnuncioCaoModel anuncioCao3 = new AnuncioCaoModel();
    }
}
