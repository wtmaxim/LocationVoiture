package com.example.administrateur.projet.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrateur.projet.BO.Utilisateur;
import com.example.administrateur.projet.R;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InscriptionFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link InscriptionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InscriptionFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private Button boutonConnexion;
    private Button boutonInscription;
    private EditText editTextNom;
    private EditText editTextMotDePasse;
    private EditText editTextConfirmationMotDePasse;
    private EditText editTextToken;
    private String nom;
    private String motDePasse;
    private String confirmationMotDePasse;
    private String token;

    public InscriptionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InscriptionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InscriptionFragment newInstance(String param1, String param2) {
        InscriptionFragment fragment = new InscriptionFragment();
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
        View view = inflater.inflate(R.layout.fragment_inscription, container, false);

        boutonConnexion = view.findViewById(R.id.inscription_connexion);
        boutonInscription = view.findViewById(R.id.inscription_inscription);
        editTextNom = view.findViewById(R.id.inscription_nom);
        editTextMotDePasse = view.findViewById(R.id.inscription_motDePasse);
        editTextConfirmationMotDePasse = view.findViewById(R.id.inscription_ConfirmationMotDePasse);
        editTextToken = view.findViewById(R.id.inscription_token);

        boutonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.Connexion();
            }
        });

        boutonInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utilisateur utilisateur = new Utilisateur();
                    utilisateur.setId(1 + (int)(Math.random() * 2147483647));
                    utilisateur.setNom(editTextNom.getText().toString());
                    utilisateur.setMotDePasse(editTextMotDePasse.getText().toString());
                    utilisateur.setAgenceId(1);

                    mListener.Inscription(utilisateur);
            }
        });

        return view;
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
        void Inscription(Utilisateur utilisateur);
        void Connexion();
    }
}
