package com.example.cs330_dz07_4550

import android.os.Bundle
import android.preference.CheckBoxPreference
import android.preference.Preference
import android.preference.PreferenceFragment

class PrviFragment : PreferenceFragment() {
    val cb1: CheckBoxPreference
    get() { return findPreference("odg1") as CheckBoxPreference }
    val cb2: CheckBoxPreference
    get() { return findPreference("odg2") as CheckBoxPreference }
    val cb3: CheckBoxPreference
    get() { return findPreference("odg3") as CheckBoxPreference }

    val rez: Preference
    get() { return findPreference("rezultat") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addPreferencesFromResource(R.xml.preferences)

        cb1.setOnPreferenceChangeListener { preference, any -> processCbClick() }
        cb2.setOnPreferenceChangeListener { preference, any -> processCbClick() }
        cb3.setOnPreferenceChangeListener { preference, any -> processCbClick() }
    }

    fun processCbClick(): Boolean {
        // veoma buggy kontrole, jedno dugme menja svojstvo drugog u nekim slucajevima
        // zakomentarisana linija(40) prikazuje pogresan rad ovih dugmica

        // resenje bi bilo da napravimo niz od 3 bool-a koji je povezan sa svakim dugmetom
        // onda bi za proveru koristili taj niz umesto vrednosti dugmica
        if (cb1.isChecked && !cb2.isChecked && cb3.isChecked)
            rez.title = "                                 TACAN ODGOVOR"
        else
            rez.title = "                                 NETACAN ODGOVOR"

//        rez.title = "${cb1.isChecked} ${cb2.isChecked} ${cb3.isChecked}"
        return true;
    }
}