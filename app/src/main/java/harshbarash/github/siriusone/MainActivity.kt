package harshbarash.github.siriusone

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import harshbarash.github.siriusone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pbWorld.max = 8000
        binding.pbChina.max = 8000
        binding.pbIndia.max = 8000
        binding.pbUSA.max = 8000
        binding.pbINDON.max = 8000
        binding.pbPack.max = 8000
        binding.pbBrazil.max = 8000
        binding.pbNigeria.max = 8000
        binding.pbBangladesh.max = 8000
        binding.pbRussia.max = 8000
        binding.pbMexico.max = 10000

        val currentProgressWord = 7000
        val currentProgressChina = 2500
        val currentProgressIndia = 2300
        val currentProgressUSA = 1202
        val currentProgressIndon = 1032
        val currentProgressPak = 902
        val currentProgressBrazil = 820
        val currentProgressNig = 760
        val currentProgressBang = 680
        val currentProgressRuss = 610
        val currentProgressMexico = 570





        ObjectAnimator.ofInt(binding.pbWorld, "progress", currentProgressWord )
            .setDuration(7000)
            .start()

        ObjectAnimator.ofInt(binding.pbChina, "progress", currentProgressChina )
            .setDuration(2500)
            .start()

        ObjectAnimator.ofInt(binding.pbIndia, "progress", currentProgressIndia )
            .setDuration(2300)
            .start()

        ObjectAnimator.ofInt(binding.pbUSA, "progress", currentProgressUSA )
            .setDuration(1202)
            .start()

        ObjectAnimator.ofInt(binding.pbINDON, "progress", currentProgressIndon )
            .setDuration(1032)
            .start()

        ObjectAnimator.ofInt(binding.pbPack, "progress", currentProgressPak )
            .setDuration(902)
            .start()

        ObjectAnimator.ofInt(binding.pbBrazil, "progress", currentProgressBrazil )
            .setDuration(820)
            .start()

        ObjectAnimator.ofInt(binding.pbNigeria, "progress", currentProgressNig )
            .setDuration(760)
            .start()

        ObjectAnimator.ofInt(binding.pbBangladesh, "progress", currentProgressBang )
            .setDuration(680)
            .start()

        ObjectAnimator.ofInt(binding.pbRussia, "progress", currentProgressRuss )
            .setDuration(550)
            .start()

        ObjectAnimator.ofInt(binding.pbMexico, "progress", currentProgressMexico )
            .setDuration(400)
            .start()
    }
}