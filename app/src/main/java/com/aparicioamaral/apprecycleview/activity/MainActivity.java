package com.aparicioamaral.apprecycleview.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

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
import com.aparicioamaral.apprecycleview.util.RecyclerItemClickListener;

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

        //evento de click
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Disciplina d = disciplinas.get(position);

                                //no clique simples vamos exibir apeanas o dia e a sala
                                Toast.makeText(MainActivity.this,
                                        d.getDiaSemanda() + " - " + d.getSala(), Toast.LENGTH_SHORT).show();

                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Disciplina d = disciplinas.get(position);

                                //no click longo vamos exibir o nome da disciplina e professor
                                Toast.makeText(MainActivity.this,
                                        d.getNomeDisciplina() + " - " + d.getProfessor(),Toast.LENGTH_SHORT).show();

                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );

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