package com.AxelAlemanD.basic_fraction_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    // Attributes
    lateinit var numeratorFirstFraction      :  EditText
    lateinit var denominatorFirstFraction    :  EditText
    lateinit var spOperators                 :  Spinner
    lateinit var numeratorSecondFraction     :  EditText
    lateinit var denominatorSecondFraction   :  EditText
    lateinit var resultNumerator             :  TextView
    lateinit var resultDenominator           :  TextView
    lateinit var btnCalculate                :  Button
    lateinit var btnClear                    :  Button
    lateinit var adapterOperators            :   ArrayAdapter<CharSequence>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numeratorFirstFraction      = findViewById(R.id.numeratorFirstFraction)
        denominatorFirstFraction    = findViewById(R.id.denominatorFirstFraction)
        spOperators                 = findViewById(R.id.operator)
        numeratorSecondFraction     = findViewById(R.id.numeratorSecondFraction)
        denominatorSecondFraction   = findViewById(R.id.denominatorSecondFraction)
        resultNumerator             = findViewById(R.id.resultNumerator)
        resultDenominator           = findViewById(R.id.resultDenominator)
        btnCalculate                = findViewById(R.id.btnCalculate)
        btnClear                    = findViewById(R.id.btnClear)
        adapterOperators            = ArrayAdapter.createFromResource(this, R.array.operators, android.R.layout.simple_spinner_item);

        adapterOperators.setDropDownViewResource(android.R.layout.simple_spinner_item);
        // Bind adapter with operator spinner
        spOperators.setAdapter(adapterOperators);
    }
}