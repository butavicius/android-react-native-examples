package com.inflater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class DisplayVideoActivity : AppCompatActivity() {
  private lateinit var video: VideoView
  private lateinit var mediaController: MediaController

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_display_video)

    video = findViewById<VideoView>(R.id.videoView).apply {
      // TODO: Get video url from intent extra data (intent.getStringExtra("com.oxidify.VIDEO_URL")
      setVideoPath("https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_640_3MG.mp4")
    }

    // Create MediaController and attach to VideoView
    mediaController = MediaController(this)
    mediaController.setAnchorView(video)
    video.setMediaController(mediaController)

    // Close player automatically when video finishes
    video.setOnCompletionListener { finish() }

    // Start video playback automatically
    video.start()
  }

  override fun onPause() {
    super.onPause()

    // TODO: Remember current player position
  }

  override fun onResume() {
    super.onResume()

    // TODO: Resume playing from remembered position instead of start
    video.start()
  }
}

