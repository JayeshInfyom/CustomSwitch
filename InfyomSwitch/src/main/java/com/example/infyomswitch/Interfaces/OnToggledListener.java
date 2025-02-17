package com.example.infyomswitch.Interfaces;


import com.example.infyomswitch.View.ToggleableView;

public interface OnToggledListener {

    void onSwitched(ToggleableView toggleableView, boolean isOn);
}