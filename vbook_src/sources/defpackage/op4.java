package defpackage;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: op4  reason: default package */
/* loaded from: classes.dex */
public abstract class op4 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile bwa b = new bwa(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d(Token.HOOK, new pp4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d(130, new pp4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d(150, new pp4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d(180, new pp4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d(Context.VERSION_ES6, new pp4(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        nv5.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static np4 a(float f) {
        float c2;
        np4 np4Var;
        float f2;
        float[] fArr = a;
        if (f >= 1.03f) {
            int i = (int) (f * 100.0f);
            np4 np4Var2 = (np4) b.b(i);
            if (np4Var2 != null) {
                return np4Var2;
            }
            bwa bwaVar = b;
            int p = ipe.p(bwaVar.a, bwaVar.c, i);
            if (p >= 0) {
                return (np4) b.e(p);
            }
            int i2 = -(p + 1);
            int i3 = i2 - 1;
            if (i2 >= b.c) {
                pp4 pp4Var = new pp4(new float[]{1.0f}, new float[]{f});
                b(f, pp4Var);
                return pp4Var;
            }
            if (i3 < 0) {
                np4Var = new pp4(fArr, fArr);
                c2 = 1.0f;
            } else {
                c2 = b.c(i3) / 100.0f;
                np4Var = (np4) b.e(i3);
            }
            float c3 = b.c(i2) / 100.0f;
            if (c2 == c3) {
                f2 = 0.0f;
            } else {
                f2 = (f - c2) / (c3 - c2);
            }
            float max = (Math.max((float) nae.e, Math.min(1.0f, f2)) * 1.0f) + nae.e;
            np4 np4Var3 = (np4) b.e(i2);
            float[] fArr2 = new float[9];
            for (int i4 = 0; i4 < 9; i4++) {
                float f3 = fArr[i4];
                float b2 = np4Var.b(f3);
                fArr2[i4] = ((np4Var3.b(f3) - b2) * max) + b2;
            }
            pp4 pp4Var2 = new pp4(fArr, fArr2);
            b(f, pp4Var2);
            return pp4Var2;
        }
        return null;
    }

    public static void b(float f, pp4 pp4Var) {
        synchronized (c) {
            bwa clone = b.clone();
            clone.d((int) (f * 100.0f), pp4Var);
            b = clone;
        }
    }
}
