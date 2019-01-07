package com.example.khouloud.scpv2.views.visiteClient;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.khouloud.scpv2.R;
import com.example.khouloud.scpv2.views.visiteClient.stepper.StepCodeTiers;
import com.example.khouloud.scpv2.views.visiteClient.stepper.StepDateDebut;
import com.example.khouloud.scpv2.views.visiteClient.stepper.StepHeureDebut;
import com.example.khouloud.scpv2.views.visiteClient.stepper.StepObjRdv;
import com.example.khouloud.scpv2.views.visiteClient.stepper.StepPersonneAVisiter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import ernestoyaquello.com.verticalstepperform.VerticalStepperFormView;
import ernestoyaquello.com.verticalstepperform.listener.StepperFormListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class VisiteClientFragment extends Fragment implements StepperFormListener {

    private VerticalStepperFormView verticalStepperForm;

    private StepCodeTiers codeTiersStep;
    private StepDateDebut dateDebutStep;
    private StepHeureDebut heureDebutStep;
    private StepObjRdv objRdvStep;
    private StepPersonneAVisiter personneAVisiterStep;
    private View view;

    public VisiteClientFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_visite_client, container, false);
        verticalStepperForm = view.findViewById(R.id.visite_stepper_form);
        codeTiersStep = new StepCodeTiers("Code Tiers");
        dateDebutStep = new StepDateDebut("Date Début");
        heureDebutStep = new StepHeureDebut("Heure Début");
        objRdvStep = new StepObjRdv("Objectif RDV");
        personneAVisiterStep = new StepPersonneAVisiter("Personne à visiter");
        verticalStepperForm.setup(this, codeTiersStep, dateDebutStep, heureDebutStep, objRdvStep, personneAVisiterStep).init();

        return view;
    }

    @Override
    public void onCompletedForm() {

    }

    @Override
    public void onCancelledForm() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (view != null) {
            ViewGroup parent = (ViewGroup) view.getParent();
            if (parent != null) {
                parent.removeAllViews();
            }
        }
    }


}
