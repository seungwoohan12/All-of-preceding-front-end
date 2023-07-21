import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout


import com.example.precede1.R

class UniversityListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_universitylist)


        val btnUniversity: Button = findViewById(R.id.btnUniversity)
        val universityListLayout: LinearLayout = findViewById(R.id.universityListLayout)

        btnUniversity.setOnClickListener {
            if (universityListLayout.visibility == View.VISIBLE) {
                universityListLayout.visibility = View.GONE
            } else {
                universityListLayout.visibility = View.VISIBLE
            }
        }
    }
}
