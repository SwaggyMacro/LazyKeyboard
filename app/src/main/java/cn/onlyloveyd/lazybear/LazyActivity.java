package cn.onlyloveyd.lazybear;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;

import cn.onlyloveyd.lazybear.databinding.ActivityLazyBinding;

public class LazyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLazyBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_lazy);

        AppCompatButton button = findViewById(R.id.btnlogin);
//        button.setOnClickListener(v-> KeyboardDialog.show(this, binding.loginInputUsername));
        // Hide the navigation bar
        controlBottomNavigation(false);
    }
    /**
     * 控制底部导航栏，显示/隐藏虚拟按键
     *
     * @param isShow true:显示；false：隐藏
     */
    private void controlBottomNavigation(boolean isShow) {
        //隐藏虚拟按键
        if (isShow) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_IMMERSIVE);
        }
    }
}
