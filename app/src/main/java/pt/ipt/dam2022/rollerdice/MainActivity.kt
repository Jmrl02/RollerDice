package pt.ipt.dam2022.rollerdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollDiceBt: Button =findViewById<Button>(R.id.btRollDice)
        //define that the button will react to click
        rollDiceBt.setOnClickListener {
            Toast.makeText(this, "The button was pressed", Toast.LENGTH_SHORT).show()
            //generate the dice value
            rollDice()
        }
    }



private fun rollDice() {
    var randomDiceValue= Random().nextInt(6) + 1
    var resultText=findViewById<TextView>(R.id.resultTextView)
    resultText.text=randomDiceValue.toString()

}
}