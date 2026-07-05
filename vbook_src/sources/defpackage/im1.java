package defpackage;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: im1  reason: default package */
/* loaded from: classes.dex */
public final class im1 extends em1 {
    public float[] b;

    public im1(float[] fArr) {
        super(new ColorMatrixColorFilter(fArr));
        this.b = fArr;
    }

    public final float[] a() {
        float[] fArr = this.b;
        if (fArr == null) {
            ColorFilter colorFilter = this.a;
            if ((colorFilter instanceof ColorMatrixColorFilter) && 26 <= Build.VERSION.SDK_INT) {
                float[] k = ay5.k((ColorMatrixColorFilter) colorFilter);
                this.b = k;
                return k;
            }
            vs.m("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            return null;
        }
        return fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof im1) && Arrays.equals(a(), ((im1) obj).a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String n;
        float[] fArr = this.b;
        if (fArr == null) {
            n = "null";
        } else {
            n = hl5.n("ColorMatrix(values=", Arrays.toString(fArr), ")");
        }
        return hl5.n("ColorMatrixColorFilter(colorMatrix=", n, ")");
    }
}
