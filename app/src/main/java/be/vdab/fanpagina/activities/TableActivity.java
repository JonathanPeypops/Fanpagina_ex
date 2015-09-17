package be.vdab.fanpagina.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import be.vdab.fanpagina.R;
import be.vdab.fanpagina.adapter.FanAdapter;

public class TableActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    private String[] strings = {"Think of me like Yoda, but instead of being little and green, I wear suits and I’m awesome. I’m your bro — I’m Broda!",
            "Okay, pep talk! You can do this, but to be more accurate, you probably can’t. You’re way out of practice and she’s way too hot for you. So, remember, it’s not about scoring. It’s about believing you can do it, even though you probably can’t. Go get ’em, tiger!",
            "It’s gonna be legend… wait for it… and I hope you’re not lactose intolerant because the second half of that word is DAIRY!",
            "When I get sad, I stop being sad and be awesome instead.",
            "God, it’s me, Barney. What up? I know we don’t talk much, but I know a lot of girls call out your name because of me.",
            "A Bro is always entitled to do something stupid, as long as the rest of his Bros are all doing it.",
            "A bro reserves the right to simply walk away during the first five minutes of a date.",
            "In the event that two bros “lock on” to the same target, the bro who calls dibbs first, has dibbs.\n" +
                    "If both call dibbs at the same time, the bro who counts aloud to ten fastest, has dibbs.\n" +
                    "If both arrive at the number ten at the same time, the bro who bought the last round of drinks has dibbs.\n" +
                    "If they haven't purchased drinks yet, the taller of the two bros has dibbs.\n" +
                    "If they're the same height, the bro with the longer “dry spell” has dibbs.\n" +
                    "Should the dry spell be of equal length, a game of discreet rock-paper-scissors shall determine right of way — provided the chick is still there.",
            "A bro automatically upgrades another bro's job description, when introducing him to a chick."};


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        adapter = new FanAdapter(strings);
        recyclerView.setAdapter(adapter);
    }

}
