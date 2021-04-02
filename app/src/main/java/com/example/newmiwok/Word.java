package com.example.newmiwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceid = NO_IMAGE_PROVIDED;
 private  int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;
    public  Word( String defaultTranslation,String miwokTranslation,int audioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;

    }
    public  Word( String defaultTranslation,String miwokTranslation,int imageId ,int audioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceid=imageId;
        mAudioResourceId=audioResourceId;

    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceid;
    }


       public boolean hasImage(){
         return  mImageResourceid != NO_IMAGE_PROVIDED;
       }

       public int getAudioResourceid(){
        return  mAudioResourceId;
       }
}


