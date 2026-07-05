package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ds7  reason: default package */
/* loaded from: classes.dex */
public final class ds7 extends u57 {
    public final mu9 f;
    public final xy0 g;
    public iya h;

    public ds7(t3a t3aVar, mu9 mu9Var, su1 su1Var, r13 r13Var) {
        super(t3aVar, su1Var, r13Var);
        this.f = mu9Var;
        this.g = xpe.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0171 A[PHI: r12 
      PHI: (r12v6 java.lang.Object) = (r12v4 java.lang.Object), (r12v7 java.lang.Object) binds: [B:27:0x0104, B:41:0x016f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172 A[PHI: r16 
      PHI: (r16v1 pvc) = (r16v0 pvc), (r16v2 pvc) binds: [B:24:0x00da, B:41:0x016f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r1v3, types: [wl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.ds7 r19, defpackage.t3a r20, defpackage.zr7 r21, float r22, float r23, defpackage.n42 r24) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds7.k(ds7, t3a, zr7, float, float, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.ds7 r11, defpackage.zl9 r12, defpackage.wl9 r13, defpackage.t3a r14, defpackage.zl9 r15, long r16, defpackage.n42 r18) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds7.l(ds7, zl9, wl9, t3a, zl9, long, n42):java.lang.Object");
    }

    public static zr7 o(xy0 xy0Var) {
        zr7 zr7Var = null;
        c9a O = h9a.O(new d(new yr7(xy0Var, 0), null, 5));
        while (O.hasNext()) {
            zr7 zr7Var2 = (zr7) O.next();
            if (zr7Var != null) {
                zr7Var2 = zr7Var.a(zr7Var2);
            }
            zr7Var = zr7Var2;
        }
        return zr7Var;
    }

    public final float m(s3a s3aVar, float f) {
        t3a t3aVar = (t3a) this.b;
        long i = t3aVar.i(t3aVar.e(f));
        t3a t3aVar2 = s3aVar.a;
        return t3aVar.h(t3aVar.f(t3aVar2.d(t3aVar2.k, i, 1)));
    }

    public final boolean n(r09 r09Var) {
        float L0;
        float L02;
        long j;
        r13 r13Var = (r13) this.d;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.a;
        int i = Build.VERSION.SDK_INT;
        if (i > 26) {
            L0 = ay5.m(viewConfiguration);
        } else {
            L0 = r13Var.L0(64.0f);
        }
        float f = -L0;
        if (i > 26) {
            L02 = ay5.l(viewConfiguration);
        } else {
            L02 = r13Var.L0(64.0f);
        }
        float f2 = -L02;
        List list = r09Var.a;
        y78 y78Var = new y78(0L);
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            j = y78Var.a;
            if (i2 >= size) {
                break;
            }
            y78Var = new y78(y78.j(j, ((z09) list.get(i2)).j));
            i2++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
        t3a t3aVar = (t3a) this.b;
        float j2 = t3aVar.j(t3aVar.f(floatToRawIntBits));
        if (j2 != nae.e) {
            int i3 = (j2 > nae.e ? 1 : (j2 == nae.e ? 0 : -1));
            x2a x2aVar = t3aVar.a;
            if (i3 > 0) {
                z = x2aVar.c();
            } else {
                z = x2aVar.b();
            }
        }
        if (z) {
            return !(this.g.j(new zr7(floatToRawIntBits, ((z09) sl1.c0(r09Var.a)).b, false)) instanceof ib1);
        }
        return this.a;
    }
}
