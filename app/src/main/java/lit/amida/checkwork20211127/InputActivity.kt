package lit.amida.checkwork20211127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        findViewById<Button>(R.id.input_to_result_button).setOnClickListener {
            val value = findViewById<EditText>(R.id.number_input_edit).text.toString().toInt()
            val intent = Intent(this, ResultActivity::class.java)
            if (value==Int){intent.putExtra("value", value)
                startActivity(intent)}else{
                print("無理")
            }

        }
    }
}