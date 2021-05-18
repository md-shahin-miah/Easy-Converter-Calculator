package com.okcodex.easyconverters.ui.calculators.activity

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.okcodex.easyconverters.R
import kotlinx.android.synthetic.main.activity_age_calculator.*
import kotlinx.android.synthetic.main.toolbar_menu.*
import kotlinx.android.synthetic.main.toolbar_menu.view.*

import java.text.SimpleDateFormat
import java.util.*

class AgeCalculatorActivity : AppCompatActivity(), View.OnClickListener {


  private  lateinit var textViewNextBirthdayMonths: TextView
    private  lateinit  var textViewNextBirthdayDays: TextView
    private  lateinit  var textViewFinalYears: TextView
    private  lateinit  var textViewFinalMonths: TextView
    private  lateinit  var textViewFinalDays: TextView
    private  lateinit  var textViewCurrentDay: TextView
    private  lateinit   var textViewCalculate: TextView
    private  lateinit   var textViewClear: TextView
    private  lateinit   var imageViewCalenderFirst: ImageView
    private  lateinit   var imageViewCalenderSecond: ImageView
    private  lateinit  var editTextBirthDay: EditText
    private  lateinit   var editTextBirthMonth: EditText
    private  lateinit   var editTextBirthYear: EditText
    private  lateinit  var editTextCurrentDay: TextView
    private  lateinit  var editTextCurrentMonth: TextView
    private  lateinit  var editTextCurrentYear: TextView



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age_calculator)

        supportActionBar?.hide()

        textViewNextBirthdayMonths = findViewById(R.id.textViewNextBirthdayMonths)
        textViewNextBirthdayDays = findViewById(R.id.textViewNextBirthdayDays)
        textViewFinalYears = findViewById(R.id.textViewFinalYears)
        textViewFinalMonths = findViewById(R.id.textViewFinalMonths)

        textViewFinalDays = findViewById(R.id.textViewFinalDays)
        textViewCurrentDay = findViewById(R.id.textViewCurrentDay)
        textViewCalculate = findViewById(R.id.textViewCalculate)
        textViewClear = findViewById(R.id.textViewClear)
        imageViewCalenderFirst = findViewById(R.id.imageViewCalenderFirst)
        imageViewCalenderSecond = findViewById(R.id.imageViewCalenderSecond)
        editTextBirthDay = findViewById(R.id.editTextBirthDay)
        editTextBirthMonth = findViewById(R.id.editTextBirthMonth)
        editTextBirthYear = findViewById(R.id.editTextBirthYear)
        editTextCurrentDay = findViewById(R.id.editTextCurrentDay)
        editTextCurrentMonth = findViewById(R.id.editTextCurrentMonth)
        editTextCurrentYear = findViewById(R.id.editTextCurrentYear)

        setupCurrentDate() // setup today's date


        textViewCalculate.setOnClickListener(this)
        textViewClear.setOnClickListener(this)
        imageViewCalenderSecond.setOnClickListener(this)
        imageViewCalenderFirst.setOnClickListener(this)


        initToolbar()
        toolbar.tvHeader.text="Age Calculator"


    }


    private fun setupCurrentDate() {
        val c = Calendar.getInstance()
        editTextCurrentYear.setText(c[Calendar.YEAR].toString())
        editTextCurrentMonth.setText(addZero(c[Calendar.MONTH] + 1))
        editTextCurrentDay.setText(addZero(c[Calendar.DAY_OF_MONTH]))
        val simpleDateFormat = SimpleDateFormat("EEEE")
        val date = Date(
            c[Calendar.YEAR],
            c[Calendar.MONTH],
            c[Calendar.DAY_OF_MONTH] - 1
        )
        val dayOfWeek = simpleDateFormat.format(date)
        textViewCurrentDay.text = dayOfWeek
        textViewCurrentDay.visibility = View.VISIBLE
    }


    private fun addZero(number: Int): String? {
        return if (number < 10) {
            "0$number"
        } else {
            number.toString()
        }
    }


  override  fun onClick(view: View) {
        if (view.id == R.id.imageViewCalenderSecond) {
            val c = Calendar.getInstance()
            val mYear = c[Calendar.YEAR]
            val mMonth = c[Calendar.MONTH]
            val mDay = c[Calendar.DAY_OF_MONTH]
            val datePickerDialog =
                DatePickerDialog(this,
                    OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                        editTextBirthDay.setText(addZero(dayOfMonth))
                        editTextBirthMonth.setText(addZero(monthOfYear + 1))
                        editTextBirthYear.setText(year.toString())
                    }, mYear, mMonth, mDay
                )
            datePickerDialog.show()
        } else if (view === textViewCalculate) {
            if (!TextUtils.isEmpty(editTextBirthDay.text) && !TextUtils.isEmpty(
                    editTextBirthMonth.text
                ) && !TextUtils.isEmpty(editTextBirthYear.text)
            ) {
                calculateAge()
                nextBirthday()
            } else {
                Toast.makeText(
                    this@AgeCalculatorActivity,
                    "All fields are required",
                    Toast.LENGTH_SHORT
                ).show()
            }
        } else if (view === textViewClear) {
            editTextBirthDay.setText("")
            editTextBirthMonth.setText("")
            editTextBirthYear.setText("")
            Toast.makeText(this, "Successfully reset", Toast.LENGTH_SHORT).show()
        }
    }


    private fun nextBirthday() {
        val currentDay = Integer.valueOf(editTextCurrentDay.text.toString())
        val currentMonth = Integer.valueOf(editTextCurrentMonth.text.toString())
        val currentYear = Integer.valueOf(editTextCurrentYear.text.toString())
        val current = Calendar.getInstance()
        current[currentYear, currentMonth] = currentDay
        val birthDay = Integer.valueOf(editTextBirthDay.text.toString())
        val birthMonth = Integer.valueOf(editTextBirthMonth.text.toString())
        val birthYear = Integer.valueOf(editTextBirthYear.text.toString())
        val birthday = Calendar.getInstance()
        birthday[birthYear, birthMonth] = birthDay
        val difference = birthday.timeInMillis - current.timeInMillis
        val cal = Calendar.getInstance()
        cal.timeInMillis = difference
        textViewNextBirthdayMonths.text = cal[Calendar.MONTH].toString()
        textViewNextBirthdayDays.text = cal[Calendar.DAY_OF_MONTH].toString()
    }

    private fun calculateAge() {
        var currentDay = Integer.valueOf(editTextCurrentDay.text.toString())
        var currentMonth = Integer.valueOf(editTextCurrentMonth.text.toString())
        var currentYear = Integer.valueOf(editTextCurrentYear.text.toString())
        val now = Date(currentYear, currentMonth, currentDay)
        val birthDay = Integer.valueOf(editTextBirthDay.text.toString())
        val birthMonth = Integer.valueOf(editTextBirthMonth.text.toString())
        val birthYear = Integer.valueOf(editTextBirthYear.text.toString())
        val dob = Date(birthYear, birthMonth, birthDay)
        if (dob.after(now)) {
            Toast.makeText(this, "Birthday can't in future", Toast.LENGTH_SHORT).show()
            return
        }

        val month = intArrayOf(
            31, 28, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31
        )

        if (birthDay > currentDay) {
            currentDay += month[birthMonth - 1]
            currentMonth -= 1
        }

        if (birthMonth > currentMonth) {
            currentYear -= 1
            currentMonth += 12
        }

        val calculatedDate = currentDay - birthDay
        val calculatedMonth = currentMonth - birthMonth
        val calculatedYear = currentYear - birthYear
        textViewFinalDays.text = calculatedDate.toString()
        textViewFinalMonths.text = calculatedMonth.toString()
        textViewFinalYears.text = calculatedYear.toString()
    }

    private fun initToolbar() {


        ivBack.setOnClickListener {
            onBackPressed()
             finish()
        }

    }


}