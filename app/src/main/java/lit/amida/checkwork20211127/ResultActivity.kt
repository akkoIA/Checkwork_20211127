package lit.amida.checkwork20211127

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        findViewById<TextView>(R.id.result_text).text = intent.getIntExtra("volue", 0).toString()

    }

    override fun onPause() {
        Toast.makeText(applicationContext, "Result画面を終了", Toast.LENGTH_LONG).show()
        super.onPause()
    }
}