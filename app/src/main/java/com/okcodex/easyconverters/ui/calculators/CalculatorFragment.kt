package com.okcodex.easyconverters.ui.calculators

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.okcodex.easyconverters.R
import com.okcodex.easyconverters.ui.calculators.activity.*

class CalculatorFragment : Fragment(), View.OnClickListener {

    private lateinit var age: CardView
    private lateinit var bmi: CardView
    private lateinit var tip: CardView
    private lateinit var tax: CardView
    private lateinit var unitPrice: CardView
    private lateinit var loan: CardView
    private lateinit var discount: CardView
    private lateinit var interest: CardView
    private lateinit var caloricBurn: CardView
    private lateinit var bodyFat: CardView
    private lateinit var date: CardView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calculator, container, false)

        age = view.findViewById(R.id.ageCardId)
        bmi = view.findViewById(R.id.bmicardId)
        tip = view.findViewById(R.id.tipcardId)
        tax = view.findViewById(R.id.taxcardID)
        unitPrice = view.findViewById(R.id.unitpricecardID)
        loan = view.findViewById(R.id.loancardID)
        discount = view.findViewById(R.id.discountcardID)
        interest = view.findViewById(R.id.imterestcardID)
        caloricBurn = view.findViewById(R.id.calooricburnID)
        bodyFat = view.findViewById(R.id.bodayfatcardID)
        date = view.findViewById(R.id.datecardID)

        age.setOnClickListener(this)
        bmi.setOnClickListener(this)
        tip.setOnClickListener(this)
        tax.setOnClickListener(this)
        unitPrice.setOnClickListener(this)
        loan.setOnClickListener(this)
        discount.setOnClickListener(this)
        interest.setOnClickListener(this)
        caloricBurn.setOnClickListener(this)
        bodyFat.setOnClickListener(this)
        date.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        if (v == age) {
            startActivity(Intent(context, AgeCalculatorActivity::class.java))
        }

        if (v == bmi) {
            startActivity(Intent(context, BMIActivity::class.java))
        }

        if (v == tip) {
            startActivity(Intent(context, TipActivity::class.java))
        }

        if (v == unitPrice) {
            startActivity(Intent(context, UnitPriceActivity::class.java))
        }
        if (v == loan) {
            startActivity(Intent(context, LoanActivity::class.java))
        }
        if (v == tax) {
            startActivity(Intent(context, TaxActivity::class.java))
        }
        if (v == interest) {
            startActivity(Intent(context, InterestActivity::class.java))
        }
        if (v == discount) {
            startActivity(Intent(context, DiscountsActivity::class.java))
        }

    }



}