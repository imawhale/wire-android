package com.wire.testinggallery.models;

import android.app.Activity;
import android.content.Intent;

import com.wire.testinggallery.DocumentResolver;
import com.wire.testinggallery.utils.Extensions;

public class Audio extends FileType {

    public Audio(){
        position = 2;
        name = "audio";
        mimeType = "audio/mp4a-latm";
        extension = "m4a";
    }

    public void handle(Activity activity){
        activity.setResult(Activity.RESULT_OK, new Intent().setData(DocumentResolver.getFile(Extensions.AUDIO)));
        activity.finish();
    }
}
