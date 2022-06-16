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
        List<OngModel> listaGestor1 = new ArrayList<>();
        List<OngModel> listaGestor2 = new ArrayList<>();

        EnderecoModel EnderecoGestor1 = new EnderecoModel("Araucarias", "Canoas", "118", "92310790");
        EnderecoModel EnderecoGestor2 = new EnderecoModel("Pedroso Câmara", "São Paulo", "290", "92330002");

        enderecoRepository.save(EnderecoGestor1);
        enderecoRepository.save(EnderecoGestor2);

        GestorModel Gestor1 = new GestorModel("05046035076", listaGestor1, "Leonardo Zanardi",
                "leo_zanardi", "5199999999", "leo_za@gmail.com", EnderecoGestor1, false );
        GestorModel Gestor2 = new GestorModel("05046059018", listaGestor2,"Guilherme Weber",
                "gui_weber", "51992760429", "gui_we@gmail.com", EnderecoGestor2, false);

        gestorRepository.save(Gestor1);
        gestorRepository.save(Gestor2);

        EnderecoModel EnderecoOng1 = new EnderecoModel("Republica", "Rio de Janeiro", "2255", "98652304");
        EnderecoModel EnderecoOng2 = new EnderecoModel("Guilherme Schell", "Santa Rita", "590", "89547516");
        EnderecoModel EnderecoOng3 = new EnderecoModel("Boqueirão", "Santa Maria", "619", "65321759");

        enderecoRepository.save(EnderecoOng1);
        enderecoRepository.save(EnderecoOng2);
        enderecoRepository.save(EnderecoOng3);

        OngModel Ong1 = new OngModel("Ong Do Leo", EnderecoOng1, Gestor1);
        OngModel Ong2 = new OngModel("Ong do Igor", EnderecoOng2, Gestor2);
        OngModel Ong3 = new OngModel("Ong Do Pedro", EnderecoOng3, Gestor1);

        ongRepository.save(Ong1);
        ongRepository.save(Ong2);
        ongRepository.save(Ong3);

        listaGestor1.add(Ong1);
        listaGestor1.add(Ong3);
        listaGestor2.add(Ong2);

        CaoModel cao1 = new CaoModel(Ong1, "Faísca e Fagulha", 2, "P", "Cão muito dócil e feliz");
        CaoModel cao2 = new CaoModel(Ong1, "Juma", 1, "G", "Parece Onça de tão braba");
        CaoModel cao3 = new CaoModel(Ong2, "Beterraba", 1, "M", "Cão fedido que só");
        CaoModel cao4 = new CaoModel(Ong2, "Espeto", 2, "P", "Cão brabo");
        CaoModel cao5 = new CaoModel(Ong3, "Safira", 1, "G", "Cão aloprado");
        CaoModel cao6 = new CaoModel(Ong2, "Jordan", 1, "M", "Cão muito pistola");

        caoRepository.save(cao1);
        caoRepository.save(cao2);
        caoRepository.save(cao3);
        caoRepository.save(cao4);
        caoRepository.save(cao5);
        caoRepository.save(cao6);

        AnuncioCaoModel anuncioCao1 = new AnuncioCaoModel(cao1, false);
        AnuncioCaoModel anuncioCao2 = new AnuncioCaoModel(cao2, false);
        AnuncioCaoModel anuncioCao3 = new AnuncioCaoModel(cao3, false);
        AnuncioCaoModel anuncioCao4 = new AnuncioCaoModel(cao4, false);
        AnuncioCaoModel anuncioCao5 = new AnuncioCaoModel(cao5, false);
        AnuncioCaoModel anuncioCao6 = new AnuncioCaoModel(cao6, false);

        anuncioCaoRepository.save(anuncioCao1);
        anuncioCaoRepository.save(anuncioCao2);
        anuncioCaoRepository.save(anuncioCao3);
        anuncioCaoRepository.save(anuncioCao4);
        anuncioCaoRepository.save(anuncioCao5);
        anuncioCaoRepository.save(anuncioCao6);

        GestorModel gestor_1_1 = gestorRepository.findById("05046035076").get();
        gestor_1_1.setOngs(listaGestor1);
        gestorRepository.save(gestor_1_1);

        GestorModel gestor_2_1 = gestorRepository.findById("05046059018").get();
        gestor_2_1.setOngs(listaGestor2);
        gestorRepository.save(gestor_2_1);
    }
}
