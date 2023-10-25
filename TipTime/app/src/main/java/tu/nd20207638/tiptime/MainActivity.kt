package tu.nd20207638.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tu.nd20207638.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener {
            canculateTip()
        }
    }

    fun canculateTip(){
        val stringInTextField = binding.costOfService.text.toString(); //Hoá ra thuộc tính text của EditText là Editable
        val cost =  stringInTextField.toDoubleOrNull();
        if (cost == null) {
            binding.tipResult.text = ""
            return
        }
        val selectedId = binding.tipOptions.checkedRadioButtonId
        val tipPercentage = when (selectedId){
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage * cost
        val roundUp = binding.roundUpSwitch.isChecked

        if(roundUp){
            tip = kotlin.math.ceil(tip)
        }

        NumberFormat.getCurrencyInstance()
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)

        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }


}