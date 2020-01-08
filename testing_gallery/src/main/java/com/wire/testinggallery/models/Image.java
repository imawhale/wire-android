package com.wire.testinggallery.models;

import android.app.Activity;
import android.content.Intent;

import com.wire.testinggallery.DocumentResolver;
import com.wire.testinggallery.utils.Extensions;

public class Image extends FileType {
    public Image(){
        position = 3;
        name = "image";
        mimeType = "image/*";
        extension = "png";
    }

    public void handle(Activity activity){
        activity.setResult(Activity.RESULT_OK, new Intent().setData(DocumentResolver.getFile(Extensions.IMAGE)));
        activity.finish();
    }
}