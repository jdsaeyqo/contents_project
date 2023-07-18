package jdsaeyqi.contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import jdsaeyqi.contents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAppBar()

    }

    fun initAppBar() {
        /** 프래그먼트 컨테이너 연결하기 */
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        navController = navHostFragment.navController

        /**
        액션바 생성
        nav_graph의 lable에 따라 이름 설정
         */
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        /** 뒤로 가기 자동으로 추가 */
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}