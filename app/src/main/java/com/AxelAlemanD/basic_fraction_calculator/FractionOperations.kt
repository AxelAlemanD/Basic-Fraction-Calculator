package com.upv.pm_2022.iti_27849_u1_aleman_delgado_axel_issai

import android.util.Log
import android.widget.EditText
import android.widget.TextView
import com.AxelAlemanD.basic_fraction_calculator.MainActivity

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
    var val1                        : Int
    var val2                        : Int
    val numeratorFirstFraction      : EditText
    val denominatorFirstFraction    : EditText
    val numeratorSecondFraction     : EditText
    val denominatorSecondFraction   : EditText
    var resultNumerator             : TextView
    var resultDenominator           : TextView


    init {
        this.val1                        = 0
        this.val2                        = 0
        this.numeratorFirstFraction      = mainActivity.numeratorFirstFraction
        this.denominatorFirstFraction    = mainActivity.denominatorFirstFraction
        this.numeratorSecondFraction     = mainActivity.numeratorSecondFraction
        this.denominatorSecondFraction   = mainActivity.denominatorSecondFraction
        this.resultNumerator             = mainActivity.resultNumerator
        this.resultDenominator           = mainActivity.resultDenominator
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
        if(getNumericValue(denominatorFirstFraction) == getNumericValue(denominatorSecondFraction)){
            resultNumerator.text = String.format("%d", getNumericValue(numeratorFirstFraction) + getNumericValue(numeratorSecondFraction))
            resultDenominator.text = getNumericValue(denominatorFirstFraction).toString()
        }
        else{
            val1 = getNumericValue(numeratorFirstFraction)   * getNumericValue(denominatorSecondFraction)
            val2 = getNumericValue(denominatorFirstFraction) * getNumericValue(numeratorSecondFraction)

            resultNumerator.text    = String.format("%d", val1 + val2)
            resultDenominator.text  = String.format("%d", getNumericValue(denominatorFirstFraction) * getNumericValue(denominatorSecondFraction))
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
        if(getNumericValue(denominatorFirstFraction) == getNumericValue(denominatorSecondFraction)){
            resultNumerator.text = String.format("%d", getNumericValue(numeratorFirstFraction) - getNumericValue(numeratorSecondFraction))
            resultDenominator.text = getNumericValue(denominatorFirstFraction).toString()
        }
        else{
            val1 = getNumericValue(numeratorFirstFraction)   * getNumericValue(denominatorSecondFraction)
            val2 = getNumericValue(denominatorFirstFraction) * getNumericValue(numeratorSecondFraction)

            resultNumerator.text    = String.format("%d", val1 - val2)
            resultDenominator.text  = String.format("%d", getNumericValue(denominatorFirstFraction) * getNumericValue(denominatorSecondFraction))
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
        resultNumerator.text    = String.format("%d", getNumericValue(numeratorFirstFraction)    * getNumericValue(numeratorSecondFraction))
        resultDenominator.text  = String.format("%d", getNumericValue(denominatorFirstFraction)  * getNumericValue(denominatorSecondFraction))
    }


    /***
     * division of two fractions
     * Example:
     *          2     3     8
     *         --- / --- = ----
     *          5     4     15
     */
    fun div() {
        resultNumerator.text    = String.format("%d", getNumericValue(numeratorFirstFraction)    * getNumericValue(denominatorSecondFraction))
        resultDenominator.text  = String.format("%d", getNumericValue(numeratorSecondFraction)   * getNumericValue(denominatorFirstFraction))
    }


    /***
     * Get the value of a TextEdit
     * @return Int
     */
    private fun getNumericValue(EditText: EditText): Int{
        try{
            return EditText.text.toString().toInt()
        } catch(e: NumberFormatException){
            EditText.setError("Please, enter a value")
        }
        return 0
    }
}