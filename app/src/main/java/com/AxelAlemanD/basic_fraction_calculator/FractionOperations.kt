package com.AxelAlemanD.basic_fraction_calculator

import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView

/***
 * This class provides the methods to perform operations with two fractions.
 *
 * A fraction is made up of:
 *
 *       numerator
 *     -------------
 *      denominator
 *
 */
class FractionOperations(mainActivity: MainActivity) {

    // Attributes
    var a                               : Int
    var b                               : Int
    var c                               : Int
    val numeratorFirstFraction          : EditText
    val denominatorFirstFraction        : EditText
    val numeratorSecondFraction         : EditText
    val denominatorSecondFraction       : EditText
    var resultNumerator                 : TextView
    var resultDenominator               : TextView
    // Step 1 variables
    var firstStepCard                   : CardView
    var instructionsStep1               : TextView
    var resultNumeratorStep1            : TextView
    var resultDenominatorStep1          : TextView
    var secondFractionStep1             : LinearLayout
    var numeratorSecondFractionStep1    : TextView
    var operatorStep1                   : TextView
    var denominatorSecondFractionStep1  : TextView
    // Step 2 variables
    var secondStepCard                  : CardView
    var instructionsStep2               : TextView
    var resultNumeratorStep2            : TextView
    var resultDenominatorStep2          : TextView
    var secondFractionStep2             : LinearLayout
    var numeratorSecondFractionStep2    : TextView
    var operatorStep2                   : TextView
    var denominatorSecondFractionStep2  : TextView
    // Step 3 variables
    var thirdStepCard              : CardView
    var instructionsStep3          :  TextView
    var resultNumeratorStep3       :  TextView
    var resultDenominatorStep3     :  TextView
    // Step 4 variables
    var fourStepCard               : CardView
    var instructionsStep4          :  TextView
    var resultNumeratorStep4       :  TextView
    var resultDenominatorStep4     :  TextView


    init {
        this.a                          = 0
        this.b                          = 0
        this.c                          = 0
        this.numeratorFirstFraction      = mainActivity.numeratorFirstFraction
        this.denominatorFirstFraction    = mainActivity.denominatorFirstFraction
        this.numeratorSecondFraction     = mainActivity.numeratorSecondFraction
        this.denominatorSecondFraction   = mainActivity.denominatorSecondFraction
        this.resultNumerator             = mainActivity.resultNumeratorStep1
        this.resultDenominator           = mainActivity.resultDenominatorStep1
        // Step 1 variables
        this.firstStepCard                  = mainActivity.firstStepCard
        this.instructionsStep1              = mainActivity.instructionsStep1
        this.resultNumeratorStep1           = mainActivity.resultNumeratorStep1
        this.resultDenominatorStep1         = mainActivity.resultDenominatorStep1
        this.secondFractionStep1            = mainActivity.secondFractionStep1
        this.numeratorSecondFractionStep1   = mainActivity.numeratorSecondFractionStep1
        this.operatorStep1                  = mainActivity.operatorStep1
        this.denominatorSecondFractionStep1 = mainActivity.denominatorSecondFractionStep1
        // Step 2 variables
        this.secondStepCard                 = mainActivity.secondStepCard
        this.instructionsStep2              = mainActivity.instructionsStep2
        this.resultNumeratorStep2           = mainActivity.resultNumeratorStep2
        this.resultDenominatorStep2         = mainActivity.resultDenominatorStep2
        this.secondFractionStep2            = mainActivity.secondFractionStep2
        this.numeratorSecondFractionStep2   = mainActivity.numeratorSecondFractionStep2
        this.operatorStep2                  = mainActivity.operatorStep2
        this.denominatorSecondFractionStep2 = mainActivity.denominatorSecondFractionStep2
        // Step 3 variables
        this.thirdStepCard          = mainActivity.thirdStepCard
        this.instructionsStep3      = mainActivity.instructionsStep3
        this.resultNumeratorStep3   = mainActivity.resultNumeratorStep3
        this.resultDenominatorStep3 = mainActivity.resultDenominatorStep3
        // Step 4 variables
        this.fourStepCard           = mainActivity.fourStepCard
        this.instructionsStep4      = mainActivity.instructionsStep4
        this.resultNumeratorStep4   = mainActivity.resultNumeratorStep4
        this.resultDenominatorStep4 = mainActivity.resultDenominatorStep4
    }


    /***
     * Sum of two fractions
     * Example:
     *  Case 1 - When the denominator is the same:
     *          2     1     3
     *         --- + --- = ---
     *          5     5     5
     *
     *  Case 2 - When the denominator is different:
     *          1     2     (1 * 3) + (5 * 2)     3 + 10     13
     *         --- + --- = ------------------- = -------- = ----
     *          5     3         (5 * 3)             15       15
     */
    fun sum() {
        // Case 1 - When the denominator is the same
        if(getNumericValue(denominatorFirstFraction) == getNumericValue(denominatorSecondFraction)){
            // Step 1
            firstStepCard.visibility        = View.VISIBLE
            secondFractionStep1.visibility  = View.INVISIBLE
            operatorStep1.visibility        = View.INVISIBLE
            secondFractionStep2.visibility  = View.INVISIBLE
            operatorStep2.visibility        = View.INVISIBLE
            instructionsStep1.text          = "Step 1: Apply properties of fractions";
            resultNumeratorStep1.text       = ""+numeratorFirstFraction.text + " + " + numeratorSecondFraction.text
            resultDenominatorStep1.text     = denominatorFirstFraction.text

            // Step 2
            secondStepCard.visibility       = View.VISIBLE
            a                               = getNumericValue(numeratorFirstFraction) + getNumericValue(numeratorSecondFraction);
            instructionsStep2.text          = "Step 2: Add: " + numeratorFirstFraction.text + " + " + numeratorSecondFraction.text + " = " + String.format("%d", a);
            resultNumeratorStep2.text       = String.format("%d", a);
            resultDenominatorStep2.text     = denominatorFirstFraction.text;

            // Step 3
            thirdStepCard.visibility        = View.INVISIBLE

            // Step 4
            fourStepCard.visibility         = View.INVISIBLE
        }
        // Case 2 - When the denominator is different
        else{
            // Step 1
            firstStepCard.visibility        = View.VISIBLE
            secondFractionStep1.visibility  = View.INVISIBLE
            operatorStep1.visibility        = View.INVISIBLE
            c                               = getNumericValue(denominatorFirstFraction) * getNumericValue(denominatorSecondFraction);
            instructionsStep1.text          = "Step 1: get least common multiple of " + numeratorFirstFraction.text + ", " + numeratorSecondFraction.text +": "+ String.format("%d", c);
            resultNumeratorStep1.text       = ""+denominatorFirstFraction.text + " x " + denominatorSecondFraction.text +" = "+ String.format("%d", c);
            resultDenominatorStep1.text     = ""

            // Step 2
            secondStepCard.visibility           = View.VISIBLE
            secondFractionStep2.visibility      = View.VISIBLE
            operatorStep2.visibility            = View.VISIBLE
            a                                   = getNumericValue(numeratorFirstFraction) * getNumericValue(denominatorSecondFraction);
            b                                   = getNumericValue(denominatorFirstFraction) * getNumericValue(numeratorSecondFraction);
            instructionsStep2.text              = "Step 2: Rewrite the fractions based on the lowest common denominator";
            resultNumeratorStep2.text           = String.format("%d", a);
            resultDenominatorStep2.text         = String.format("%d", c);
            operatorStep2.text                  = "+"
            numeratorSecondFractionStep2.text   = String.format("%d", b);
            denominatorSecondFractionStep2.text = String.format("%d", c);

            // Step 3
            thirdStepCard.visibility        = View.VISIBLE
            instructionsStep3.text          = "Step 3: Apply the properties of fractions";
            resultNumeratorStep3.text       = String.format("%d", a) + " + " + String.format("%d", b);
            resultDenominatorStep3.text     = String.format("%d", c)

            // Step 4
            fourStepCard.visibility         = View.VISIBLE
            instructionsStep4.text          = "Step 4: Add: " + String.format("%d", a) + " + " + String.format("%d", b) + " = " + String.format("%d", a + b);
            resultNumeratorStep4.text       = String.format("%d", a + b);
            resultDenominatorStep4.text     = String.format("%d", c)
        }
    }


    /***
     * Substraction of two fractions
     * Example:
     *  Case 1 - When the denominator is the same:
     *          6     4     2
     *         --- - --- = ---
     *          7     7     7
     *
     *  Case 2 - When the denominator is different:
     *          3     5     (3 * 7) - (5 * 4)     21 - 20     1
     *         --- - --- = ------------------- = -------- = ----
     *          4     7         (4 * 7)             28       28
     */
    fun sub() {
        // Case 1 - When the denominator is the same
        if(getNumericValue(denominatorFirstFraction) == getNumericValue(denominatorSecondFraction)){
            // Step 1
            firstStepCard.visibility        = View.VISIBLE
            secondFractionStep1.visibility  = View.INVISIBLE
            operatorStep1.visibility        = View.INVISIBLE
            secondFractionStep2.visibility  = View.INVISIBLE
            operatorStep2.visibility        = View.INVISIBLE
            instructionsStep1.text          = "Step 1: Apply properties of fractions";
            resultNumeratorStep1.text       = ""+numeratorFirstFraction.text + " - " + numeratorSecondFraction.text
            resultDenominatorStep1.text     = denominatorFirstFraction.text

            // Step 2
            secondStepCard.visibility       = View.VISIBLE
            a                               = getNumericValue(numeratorFirstFraction) - getNumericValue(numeratorSecondFraction);
            instructionsStep2.text          = "Step 2: Add: " + numeratorFirstFraction.text + " - " + numeratorSecondFraction.text + " = " + String.format("%d", a);
            resultNumeratorStep2.text       = String.format("%d", a);
            resultDenominatorStep2.text     = denominatorFirstFraction.text;

            // Step 3
            thirdStepCard.visibility        = View.INVISIBLE

            // Step 4
            fourStepCard.visibility         = View.INVISIBLE
        }
        // Case 2 - When the denominator is different
        else{
            // Step 1
            firstStepCard.visibility        = View.VISIBLE
            secondFractionStep1.visibility  = View.INVISIBLE
            operatorStep1.visibility        = View.INVISIBLE
            c                               = getNumericValue(denominatorFirstFraction) * getNumericValue(denominatorSecondFraction);
            instructionsStep1.text          = "Step 1: get least common multiple of " + numeratorFirstFraction.text + ", " + numeratorSecondFraction.text +": "+ String.format("%d", c);
            resultNumeratorStep1.text       = ""+denominatorFirstFraction.text + " x " + denominatorSecondFraction.text +" = "+ String.format("%d", c);
            resultDenominatorStep1.text     = ""

            // Step 2
            secondStepCard.visibility           = View.VISIBLE
            secondFractionStep2.visibility      = View.VISIBLE
            operatorStep2.visibility            = View.VISIBLE
            a                                   = getNumericValue(numeratorFirstFraction) * getNumericValue(denominatorSecondFraction);
            b                                   = getNumericValue(denominatorFirstFraction) * getNumericValue(numeratorSecondFraction);
            instructionsStep2.text              = "Step 2: Rewrite the fractions based on the lowest common denominator";
            resultNumeratorStep2.text           = String.format("%d", a);
            resultDenominatorStep2.text         = String.format("%d", c);
            operatorStep2.text                  = "-"
            numeratorSecondFractionStep2.text   = String.format("%d", b);
            denominatorSecondFractionStep2.text = String.format("%d", c);

            // Step 3
            thirdStepCard.visibility        = View.VISIBLE
            instructionsStep3.text          = "Step 3: Apply the properties of fractions";
            resultNumeratorStep3.text       = String.format("%d", a) + " - " + String.format("%d", b);
            resultDenominatorStep3.text     = String.format("%d", c)

            // Step 4
            fourStepCard.visibility         = View.VISIBLE
            instructionsStep4.text          = "Step 4: Add: " + String.format("%d", a) + " - " + String.format("%d", b) + " = " + String.format("%d", c);
            resultNumeratorStep4.text       = String.format("%d", a - b);
            resultDenominatorStep4.text     = String.format("%d", c)
        }
    }


    /***
     * multiplication of two fractions
     * Example:
     *          6     7     42
     *         --- * --- = ----
     *          2     9     18
     */
    fun mult() {
        // Step 1
        firstStepCard.visibility        = View.VISIBLE
        secondFractionStep1.visibility  = View.INVISIBLE
        operatorStep1.visibility        = View.INVISIBLE
        secondFractionStep2.visibility  = View.INVISIBLE
        operatorStep2.visibility        = View.INVISIBLE
        instructionsStep1.text          = "Step 1: Apply properties of fractions";
        resultNumeratorStep1.text       = ""+numeratorFirstFraction.text + " x " + numeratorSecondFraction.text
        resultDenominatorStep1.text     = ""+denominatorFirstFraction.text + " x " + denominatorSecondFraction.text

        // Step 2
        secondStepCard.visibility       = View.VISIBLE
        a                               = getNumericValue(numeratorFirstFraction) * getNumericValue(numeratorSecondFraction);
        instructionsStep2.text          = "Step 2: Multiply the numbers: " + numeratorFirstFraction.text + " x " + numeratorSecondFraction.text + " = " + String.format("%d", a);
        resultNumeratorStep2.text       = String.format("%d", a);
        resultDenominatorStep2.text     = ""+denominatorFirstFraction.text + " x " + denominatorSecondFraction.text

        // Step 3
        thirdStepCard.visibility        = View.VISIBLE
        b                               = getNumericValue(denominatorFirstFraction) * getNumericValue(denominatorSecondFraction);
        instructionsStep3.text          = "Step 3: Multiply the numbers: " + denominatorFirstFraction.text + " x " + denominatorSecondFraction.text + " = " + String.format("%d", a);
        resultNumeratorStep3.text       = String.format("%d", a);
        resultDenominatorStep3.text     = String.format("%d", b);

        // Step 4
        fourStepCard.visibility         = View.INVISIBLE
    }


    /***
     * division of two fractions
     * Example:
     *          2     3     8
     *         --- / --- = ----
     *          5     4     15
     */
    fun div() {
        // Step 1
        firstStepCard.visibility            = View.VISIBLE
        secondFractionStep1.visibility      = View.VISIBLE
        operatorStep1.visibility            = View.VISIBLE
        secondFractionStep2.visibility      = View.INVISIBLE
        operatorStep2.visibility            = View.INVISIBLE
        instructionsStep1.text              = "Step 1: Apply properties of fractions";
        resultNumeratorStep1.text           = numeratorFirstFraction.text
        resultDenominatorStep1.text         = denominatorFirstFraction.text
        operatorStep1.text                  = "x"
        numeratorSecondFractionStep1.text   = denominatorSecondFraction.text
        denominatorSecondFractionStep1.text = numeratorSecondFraction.text

        // Step 2
        secondStepCard.visibility       = View.VISIBLE
        instructionsStep2.text          = "Step 2: Multiply fractions";
        resultNumeratorStep2.text       = ""+numeratorFirstFraction.text + " x " + denominatorSecondFraction.text
        resultDenominatorStep2.text     = ""+denominatorFirstFraction.text + " x " + numeratorSecondFraction.text

        // Step 3
        thirdStepCard.visibility        = View.VISIBLE
        a                               = getNumericValue(numeratorFirstFraction) * getNumericValue(denominatorSecondFraction);
        instructionsStep3.text          = "Step 3: Multiply the numbers: " + numeratorFirstFraction.text + " x " + denominatorSecondFraction.text + " = " + String.format("%d", a);
        resultNumeratorStep3.text       = String.format("%d", a);
        resultDenominatorStep3.text     = ""+denominatorFirstFraction.text + " x " + numeratorSecondFraction.text

        // Step 4
        fourStepCard.visibility         = View.VISIBLE
        b                               = getNumericValue(denominatorFirstFraction) * getNumericValue(numeratorSecondFraction);
        instructionsStep4.text          = "Step 4: Multiply the numbers: " + denominatorFirstFraction.text + " x " + numeratorSecondFraction.text + " = " + String.format("%d", b);
        resultNumeratorStep4.text       = String.format("%d", a);
        resultDenominatorStep4.text     = String.format("%d", b);
    }

    /***
     * Get the value of a TextEdit
     * @return Int
     */
    private fun getNumericValue(EditText: EditText): Int{
        return EditText.text.toString().toInt()
    }
}