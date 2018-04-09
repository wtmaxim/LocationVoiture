package com.example.administrateur.projet.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.administrateur.projet.Adapter.VehiculeDispoAdapter;
import com.example.administrateur.projet.BO.Vehicule;
import com.example.administrateur.projet.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link VehiculesDisponiblesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link VehiculesDisponiblesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VehiculesDisponiblesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private List<Vehicule> vehicules;

    public VehiculesDisponiblesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VehiculesDisponiblesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VehiculesDisponiblesFragment newInstance(String param1, String param2) {
        VehiculesDisponiblesFragment fragment = new VehiculesDisponiblesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vehicules_disponibles, container, false);

        ListView vehiculesDispo = view.findViewById(R.id.listview_vehicules_dispo);
        vehiculesDispo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(vehicules != null) {
                    mListener.clickVehicule(vehicules.get(position));
                }
            }
        });

        return view;
    }

    public void setList(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
        ListView listeViewVehicules = this.getView().findViewById(R.id.listview_vehicules_dispo);
        VehiculeDispoAdapter adapter = new VehiculeDispoAdapter(
                this.getContext(),
                R.layout.ligne_liste_vehicule,
                vehicules);
        listeViewVehicules.setAdapter(adapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void clickVehicule(Vehicule vehicule);
    }
}
