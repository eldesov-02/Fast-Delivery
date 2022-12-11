package com.example.fasterdelivary

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.work.*
import com.example.fasterdelivary.databinding.ActivityMainBinding
import com.example.fasterdelivary.databinding.ActivityMainBinding.inflate
import com.example.fasterdelivary.databinding.FragmentMainBinding
import com.example.fasterdelivary.work.MyWork
import kotlinx.android.synthetic.main.fragment_main.*
import java.util.concurrent.TimeUnit

class MainFragment : Fragment() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root

        imageButton2.setOnClickListener(){
            drawerLayout.openDrawer(GravityCompat.START)
        }

        binding.apply {
            btnOneTime.setOnClickListener {
                myOneTimeWork()
            }
            btnPeriodic.setOnClickListener {
                myPeriodicWork()
            }
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onStart() {
        super.onStart()
        ToFood.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_marketFragment)
        }
        toSupermarket.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_foodFragment)
        }
        to_pharmacy.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_pharmacyFragment)
        }
        to_magazine.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_basketFragment)
        }
        to_phalochka.setOnClickListener(){
            (activity as MainActivity).navController.navigate(R.id.action_mainFragment_to_winBonusFragment)
        }
    }
    private fun myPeriodicWork() {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.NOT_REQUIRED)
            .setRequiresCharging(true)
            .build()

        val myRequest = PeriodicWorkRequest.Builder(
            MyWork::class.java,
            15,
            TimeUnit.MINUTES
        ).setConstraints(constraints)
            .addTag("my_id")
            .build()

        //minimum interval is 15min, just wait 15 min,
        // I will cut this.. to show you
        //quickly

        //now is 0:15 let's wait until 0:30min

        WorkManager.getInstance()
            .enqueueUniquePeriodicWork(
                "my_id",
                ExistingPeriodicWorkPolicy.KEEP,
                myRequest
            )
    }


    private fun myOneTimeWork() {

        val constraints: Constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.UNMETERED)
            .setRequiresCharging(true)
            .build()


        val myWorkRequest: WorkRequest = OneTimeWorkRequest.Builder(MyWork::class.java)
            .setConstraints(constraints)
            .build()

        WorkManager.getInstance().enqueue(myWorkRequest)

    }
}


