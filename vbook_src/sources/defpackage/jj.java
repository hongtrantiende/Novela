package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jj  reason: default package */
/* loaded from: classes.dex */
public final class jj implements nl5 {
    public final Bitmap a;

    public jj(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final void a(int i, int i2, int i3, int[] iArr) {
        Bitmap a = ay5.a(this);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26 && a.getConfig() == Bitmap.Config.HARDWARE) {
            a = a.copy(Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        Bitmap bitmap = a;
        bitmap.getPixels(iArr, 0, i3, 0, 0, i, i2);
        if (z) {
            bitmap.recycle();
        }
    }
}
