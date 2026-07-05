package com.reader.piper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class PiperNcnn {
    static {
        System.loadLibrary("ncnn");
        System.loadLibrary("piperncnn");
    }

    public final native boolean loadModelEncrypted(String str, String str2, float f, float f2, int i);

    public final native void stop();

    public final native short[] synthesizeFromIds(int[] iArr, int i, double d);
}
