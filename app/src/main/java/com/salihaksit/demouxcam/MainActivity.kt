package com.salihaksit.demouxcam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.MobileAds
import com.uxcam.UXCam

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this) {}

        UXCam.startWithKey("MY_KEY")
        UXCam.setMultiSessionRecord(false)
        UXCam.setAutomaticScreenNameTagging(false)
    }
}