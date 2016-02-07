package com.vytjan.opencv_detectedNumbers.utils.calibration;


import org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame;
import org.opencv.core.Mat;

public class OnCameraFrameRender {
    private FrameRender mFrameRender;
    public OnCameraFrameRender(FrameRender frameRender) {
        mFrameRender = frameRender;
    }
    public Mat render(CvCameraViewFrame inputFrame) {
        return mFrameRender.render(inputFrame);
    }
}