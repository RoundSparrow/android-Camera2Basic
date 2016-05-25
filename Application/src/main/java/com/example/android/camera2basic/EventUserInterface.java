package com.example.android.camera2basic;

/**
 * Created by adminsag on 5/25/16.
 * (c) Copyright 2016 Stephen A Gutknecht
 * Dual license: 1. Closed-source proprietary by Stephen A. Gutknecht. All Rights Reserved. 2. Apache License, Version 2.0, on this specific file.
 *
 */
public class EventUserInterface {

    public static final int CAMERA_ERROR_SPOTA = 1;
    public static final int CAMERA_CAMERA2_API_DIALOG0 = 2;
    public static final int CAMERA_PERMISSION_NEEDED0 = 3;
    public static final int CAMERA_CONFIGURE_FAILED0 = 4;
    public static final int CAPTURE_IMAGE_SAVED0 = 5;

    public EventUserInterface(int inEventCode)
    {
        eventCode = inEventCode;
    }

    public EventUserInterface(int inEventCode, String stringPayload)
    {
        eventCode = inEventCode;
        eventPayload0 = stringPayload;
    }

    public int eventCode = 0;
    public String eventPayload0 = "";
}
