package defpackage;

import android.graphics.Path;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kn8  reason: default package */
/* loaded from: classes.dex */
public abstract class kn8 {
    public final int a;
    public final float[] b;

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public kn8(Path path, int i) {
        if (i != 0) {
            this.a = i;
            this.b = new float[8];
            return;
        }
        throw null;
    }

    public abstract boolean a();

    public abstract int b(float[] fArr);
}
