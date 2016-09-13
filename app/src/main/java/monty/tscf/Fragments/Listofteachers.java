package monty.tscf.Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import monty.tscf.R;

/**
 * Created by badebaba on 9/12/2016.
 */

public class Listofteachers extends android.support.v4.app.Fragment implements AdapterView.OnItemClickListener {

    ImageView launcher;
    ListView list;
    String teach[] = {"Hitesh Vakharia",
            " Kekul Vakharia",
            " Janki Barodia(French)",
            " Kanika Maheshwari(French)",
            " Priti Vora(Maths) ",
            "  Sonal Jain (Maths) ",
            " Manoj Mishra (History) ",
            "  Juliet Sequeira (Social Science) ",
            "  Vandana Nagar(English/History) ",
            "   Aarti Ganatra(English/Social Sciences) ",
            "   Tushar Bhatt(English Grammar) ",
            "    Pravin Parab (Sanskrit/Marathi) ",
            "   Shashi Singh(Hindi) ",
            "  Sejal Bhave(Hindi/Marathi) ",
            "   Shabina Sayyad(Science) ",
            "   Ruddhi Salvi (Science) ",
            "   Harshil Jariwala(Science)"};
    ArrayAdapter<String> adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.listofteachers, container, false);
        launcher = (ImageView) root.findViewById(R.id.imagelauncher);

        //Code for the teachers list of names.
        //Introduce the feature on click on the names too
        adapter = new ArrayAdapter<String>(root.getContext(), android.R.layout.simple_list_item_1, teach);
        list = (ListView) root.findViewById(R.id.list_teacher);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        return root;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Intent intent = new Intent(getContext(), DetailTeacher.class);
        intent.putExtra("teachername", teach[position]);
        startActivity(intent);
    }
}
