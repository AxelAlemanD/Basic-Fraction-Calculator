package com.AxelAlemanD.basic_fraction_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.widget.*
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    // Attributes
    lateinit var numeratorFirstFraction     :  EditText
    lateinit var denominatorFirstFraction   :  EditText
    lateinit var spOperators                :  Spinner
    lateinit var numeratorSecondFraction    :  EditText
    lateinit var denominatorSecondFraction  :  EditText
    lateinit var btnCalculate               :  Button
    lateinit var btnClear                   :  Button
    lateinit var adapterOperators           :  ArrayAdapter<CharSequence>
    // Step 1 variables
    lateinit var firstStepCard                  :  CardView
    lateinit var expandableLayoutStep1          :  LinearLayout
    lateinit var instructionsStep1              :  TextView
    lateinit var resultNumeratorStep1           :  TextView
    lateinit var resultDenominatorStep1         :  TextView
    lateinit var btnExpandStep1                 :  Button
    lateinit var operatorStep1                  :  TextView
    lateinit var secondFractionStep1            :  LinearLayout
    lateinit var numeratorSecondFractionStep1   :  TextView
    lateinit var denominatorSecondFractionStep1 :  TextView
    // Step 2 variables
    lateinit var secondStepCard                 :  CardView
    lateinit var expandableLayoutStep2          :  LinearLayout
    lateinit var instructionsStep2              :  TextView
    lateinit var resultNumeratorStep2           :  TextView
    lateinit var resultDenominatorStep2         :  TextView
    lateinit var btnExpandStep2                 :  Button
    lateinit var operatorStep2                  :  TextView
    lateinit var secondFractionStep2            :  LinearLayout
    lateinit var numeratorSecondFractionStep2   :  TextView
    lateinit var denominatorSecondFractionStep2 :  TextView
    // Step 3 variables
    lateinit var thirdStepCard              :  CardView
    lateinit var expandableLayoutStep3      :  LinearLayout
    lateinit var instructionsStep3          :  TextView
    lateinit var resultNumeratorStep3       :  TextView
    lateinit var resultDenominatorStep3     :  TextView
    lateinit var btnExpandStep3             :  Button
    // Step 4 variables
    lateinit var fourStepCard              :  CardView
    lateinit var expandableLayoutStep4      :  LinearLayout
    lateinit var instructionsStep4          :  TextView
    lateinit var resultNumeratorStep4       :  TextView
    lateinit var resultDenominatorStep4     :  TextView
    lateinit var btnExpandStep4             :  Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numeratorFirstFraction      = findViewById(R.id.numeratorFirstFraction)
        denominatorFirstFraction    = findViewById(R.id.denominatorFirstFraction)
        spOperators                 = findViewById(R.id.operator)
        numeratorSecondFraction     = findViewById(R.id.numeratorSecondFraction)
        denominatorSecondFraction   = findViewById(R.id.denominatorSecondFraction)
        btnCalculate                = findViewById(R.id.btnCalculate)
        btnClear                    = findViewById(R.id.btnClear)
        adapterOperators            = ArrayAdapter.createFromResource(this, R.array.operators, android.R.layout.simple_spinner_item);
        // Step 1
        firstStepCard                   = findViewById(R.id.firstStepCard)
        instructionsStep1               = findViewById(R.id.instructionsStep1)
        expandableLayoutStep1           = findViewById(R.id.expandableLayoutStep1)
        resultNumeratorStep1            = findViewById(R.id.resultNumeratorStep1)
        resultDenominatorStep1          = findViewById(R.id.resultDenominatorStep1)
        operatorStep1                   = findViewById(R.id.operatorStep1)
        secondFractionStep1             = findViewById(R.id.secondFractionStep1)
        numeratorSecondFractionStep1    = findViewById(R.id.numeratorSecondFractionStep1)
        denominatorSecondFractionStep1  = findViewById(R.id.denominatorSecondFractionStep1)
        btnExpandStep1                  = findViewById(R.id.btnExpandStep1)
        btnExpandStep1.setOnClickListener {
            if (expandableLayoutStep1.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(firstStepCard, AutoTransition())
                expandableLayoutStep1.visibility = View.VISIBLE
                btnExpandStep1.text = "-"
            } else {
                TransitionManager.beginDelayedTransition(firstStepCard, AutoTransition())
                expandableLayoutStep1.visibility = View.GONE
                btnExpandStep1.text = "+"
            }
        }

        // Step 2
        secondStepCard                  = findViewById(R.id.secondStepCard)
        instructionsStep2               = findViewById(R.id.instructionsStep2)
        expandableLayoutStep2           = findViewById(R.id.expandableLayoutStep2)
        resultNumeratorStep2            = findViewById(R.id.resultNumeratorStep2)
        resultDenominatorStep2          = findViewById(R.id.resultDenominatorStep2)
        operatorStep2                   = findViewById(R.id.operatorStep2)
        secondFractionStep2             = findViewById(R.id.secondFractionStep2)
        numeratorSecondFractionStep2    = findViewById(R.id.numeratorSecondFractionStep2)
        denominatorSecondFractionStep2  = findViewById(R.id.denominatorSecondFractionStep2)
        btnExpandStep2                  = findViewById(R.id.btnExpandStep2)
        btnExpandStep2.setOnClickListener {
            if (expandableLayoutStep2.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(secondStepCard, AutoTransition())
                expandableLayoutStep2.visibility = View.VISIBLE
                btnExpandStep2.text = "-"
            } else {
                TransitionManager.beginDelayedTransition(secondStepCard, AutoTransition())
                expandableLayoutStep2.visibility = View.GONE
                btnExpandStep2.text = "+"
            }
        }

        // Step 3
        thirdStepCard           = findViewById(R.id.thirdStepCard)
        instructionsStep3       = findViewById(R.id.instructionsStep3)
        expandableLayoutStep3   = findViewById(R.id.expandableLayoutStep3)
        resultNumeratorStep3    = findViewById(R.id.resultNumeratorStep3)
        resultDenominatorStep3  = findViewById(R.id.resultDenominatorStep3)
        btnExpandStep3          = findViewById(R.id.btnExpandStep3)
        btnExpandStep3.setOnClickListener {
            if (expandableLayoutStep3.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(thirdStepCard, AutoTransition())
                expandableLayoutStep3.visibility = View.VISIBLE
                btnExpandStep3.text = "-"
            } else {
                TransitionManager.beginDelayedTransition(thirdStepCard, AutoTransition())
                expandableLayoutStep3.visibility = View.GONE
                btnExpandStep3.text = "+"
            }
        }

        // Step 4
        fourStepCard           = findViewById(R.id.fourStepCard)
        instructionsStep4       = findViewById(R.id.instructionsStep4)
        expandableLayoutStep4   = findViewById(R.id.expandableLayoutStep4)
        resultNumeratorStep4    = findViewById(R.id.resultNumeratorStep4)
        resultDenominatorStep4  = findViewById(R.id.resultDenominatorStep4)
        btnExpandStep4          = findViewById(R.id.btnExpandStep4)
        btnExpandStep4.setOnClickListener {
            if (expandableLayoutStep4.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(fourStepCard, AutoTransition())
                expandableLayoutStep4.visibility = View.VISIBLE
                btnExpandStep4.text = "-"
            } else {
                TransitionManager.beginDelayedTransition(fourStepCard, AutoTransition())
                expandableLayoutStep4.visibility = View.GONE
                btnExpandStep4.text = "+"
            }
        }

        val operations              = FractionOperations(this)

        adapterOperators.setDropDownViewResource(android.R.layout.simple_spinner_item);
        // Bind adapter with operator spinner
        spOperators.setAdapter(adapterOperators);

        // Actions to execute when the Calculate button is pressed
        btnCalculate.setOnClickListener {
            if(validateFields()){
                var selectedOperator = spOperators.getSelectedItem().toString()
                when (selectedOperator) {
                    "+" -> operations.sum()
                    "-" -> operations.sub()
                    "x" -> operations.mult()
                    "/" -> operations.div()
                }
                Toast.makeText(applicationContext, "Done!", Toast.LENGTH_SHORT).show()
            }
        }

        // Clear all input fields and result
        btnClear.setOnClickListener {
            numeratorFirstFraction.text.clear()
            denominatorFirstFraction.text.clear()
            numeratorSecondFraction.text.clear()
            denominatorSecondFraction.text.clear()
            resultNumeratorStep1.setText("0")
            resultDenominatorStep1.setText("0")

            // Hide CardViews
            val cards : List<CardView> = listOf(firstStepCard, secondStepCard, thirdStepCard, fourStepCard)
            cards.forEach{ card ->
                card.visibility = View.INVISIBLE
            }
            Toast.makeText(applicationContext, "Done!", Toast.LENGTH_SHORT).show()
        }
    }

    /***
     * Validate that the fields contain a value, otherwise it shows a warning
     * @return Boolean isValid
     */
    private fun validateFields(): Boolean{
        var isValid = true
        val fields : List<EditText> = listOf(numeratorFirstFraction, denominatorFirstFraction, numeratorSecondFraction, denominatorSecondFraction)
        fields.forEach{ field ->
            if(field.text.toString().isEmpty()) {
                field.setError("Please, enter a value")
                field.requestFocus();
                isValid = false
            }
        }
        return isValid
    }
}
