package com.aparicioamaral.apprecycleview.activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aparicioamaral.apprecycleview.R;
import com.aparicioamaral.apprecycleview.adapter.Adapter;
import com.aparicioamaral.apprecycleview.model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Disciplina> disciplinas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);

        //Listagens de Disciplinas
        this.criarDisciplinas();

        //Configurar o Adapter
        Adapter adapter = new Adapter( disciplinas );

        //COnfigaurar o ReciclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setHasFixedSize( true );

        //inserindo uma linha entre cada item
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter( adapter );
    } //fim do OnCreat

    public void criarDisciplinas() {

        Disciplina d = new Disciplina("Lógica de Programação","JuanBaptista","SEG","LAB05" );
        disciplinas.add(d);

        d = new Disciplina("Estatística Computacional","WellingtonAvila","SEG","SALA107" );
        disciplinas.add(d);

        d = new Disciplina("Teoria de Sistemas da Informação","WellingtonAvila","TER","SALA109" );
        disciplinas.add(d);

        d = new Disciplina("Banco de DadosI","FabrícioCurvello","QUA","LAB05");
        disciplinas.add(d);

        d = new Disciplina("Arquitetura deComputadores","WellingtonAvila","QUA","LAB05");
        disciplinas.add(d);

        d = new Disciplina("Programação Orientada a Objetos","FabrícioCurvello","QUA","LAB04");
        disciplinas.add(d);

        d = new Disciplina("Computação para Dispositivos Móveis","FabrícioCurvello","QUI","LAB02");
        disciplinas.add(d);

        d = new Disciplina("Estrutura de Dados","JuanBaptista","QUI","LAB04");
        disciplinas.add(d);

        d = new Disciplina("Interface Humano-Computador","WellingtonAvila","SEX","SALA109");
        disciplinas.add(d);

        d = new Disciplina("Desevolvimentode Software para Web","JuanBaptista","SEX","LAB02");
        disciplinas.add(d);

        d = new Disciplina("Estatística Computacional","WellingtonAvila","SEG","SALA107" );
        disciplinas.add(d);

        d = new Disciplina("Teoria de Sistemas da Informação","WellingtonAvila","TER","SALA109" );
        disciplinas.add(d);

        d = new Disciplina("Banco de DadosI","FabrícioCurvello","QUA","LAB05");
        disciplinas.add(d);

        d = new Disciplina("Arquitetura deComputadores","WellingtonAvila","QUA","LAB05");
        disciplinas.add(d);

        d = new Disciplina("Programação Orientada a Objetos","FabrícioCurvello","QUA","LAB04");
        disciplinas.add(d);

        d = new Disciplina("Computação para Dispositivos Móveis","FabrícioCurvello","QUI","LAB02");
        disciplinas.add(d);

        d = new Disciplina("Estrutura de Dados","JuanBaptista","QUI","LAB04");
        disciplinas.add(d);

        d = new Disciplina("Interface Humano-Computador","WellingtonAvila","SEX","SALA109");
        disciplinas.add(d);

        d = new Disciplina("Desevolvimentode Software para Web","JuanBaptista","SEX","LAB02");
        disciplinas.add(d);

        d = new Disciplina("Estatística Computacional","WellingtonAvila","SEG","SALA107" );
        disciplinas.add(d);

        d = new Disciplina("Teoria de Sistemas da Informação","WellingtonAvila","TER","SALA109" );
        disciplinas.add(d);

        d = new Disciplina("Banco de DadosI","FabrícioCurvello","QUA","LAB05");
        disciplinas.add(d);

        d = new Disciplina("Arquitetura deComputadores","WellingtonAvila","QUA","LAB05");
        disciplinas.add(d);

        d = new Disciplina("Programação Orientada a Objetos","FabrícioCurvello","QUA","LAB04");
        disciplinas.add(d);

        d = new Disciplina("Computação para Dispositivos Móveis","FabrícioCurvello","QUI","LAB02");
        disciplinas.add(d);

        d = new Disciplina("Estrutura de Dados","JuanBaptista","QUI","LAB04");
        disciplinas.add(d);

        d = new Disciplina("Interface Humano-Computador","WellingtonAvila","SEX","SALA109");
        disciplinas.add(d);

        d = new Disciplina("Desevolvimentode Software para Web","JuanBaptista","SEX","LAB02");
        disciplinas.add(d);
    }
}