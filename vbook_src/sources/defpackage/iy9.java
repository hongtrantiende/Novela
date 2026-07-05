package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iy9  reason: default package */
/* loaded from: classes.dex */
public final class iy9 extends hbe {
    public final Bundle e;
    public final gy9 f;
    public String g;
    public int h;

    public iy9(Bundle bundle, gy9 gy9Var) {
        bundle.getClass();
        gy9Var.getClass();
        this.e = bundle;
        this.f = gy9Var;
        this.g = "";
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final byte A() {
        Bundle bundle = this.e;
        bundle.getClass();
        return (byte) cwe.i(this.g, bundle);
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final short B() {
        Bundle bundle = this.e;
        bundle.getClass();
        return (short) cwe.i(this.g, bundle);
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final float C() {
        Bundle bundle = this.e;
        bundle.getClass();
        String str = this.g;
        str.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
            gwe.l(str);
            throw null;
        }
        return f;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final double E() {
        Bundle bundle = this.e;
        bundle.getClass();
        String str = this.g;
        str.getClass();
        double d = bundle.getDouble(str, Double.MIN_VALUE);
        if (d == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
            gwe.l(str);
            throw null;
        }
        return d;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final boolean b() {
        Bundle bundle = this.e;
        bundle.getClass();
        String str = this.g;
        str.getClass();
        boolean z = bundle.getBoolean(str, false);
        if (!z && bundle.getBoolean(str, true)) {
            gwe.l(str);
            throw null;
        }
        return z;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final char c() {
        Bundle bundle = this.e;
        bundle.getClass();
        String str = this.g;
        str.getClass();
        char c = bundle.getChar(str, (char) 0);
        if (c == 0 && bundle.getChar(str, (char) 65535) == 65535) {
            gwe.l(str);
            throw null;
        }
        return c;
    }

    @Override // defpackage.yq2
    public final Object d(s76 s76Var) {
        Object f;
        s76Var.getClass();
        o9a e = s76Var.e();
        if (c16.i(e, fy9.a)) {
            qc1 qc1Var = qc1.a;
            f = qc1.f(this);
        } else if (c16.i(e, fy9.b)) {
            f = kw2.b.c(this);
        } else if (c16.i(e, fy9.c)) {
            f = zu2.b.c(this);
        } else if (c16.i(e, fy9.d)) {
            f = lj5.f(this);
        } else if (!c16.i(e, fy9.i) && !c16.i(e, fy9.j)) {
            if (!c16.i(e, fy9.k) && !c16.i(e, fy9.l)) {
                if (c16.i(e, fy9.e)) {
                    Parcelable[] f2 = bm8.f(this);
                    Object c = s76Var.c(ds3.e);
                    c.getClass();
                    f = Arrays.copyOf(f2, f2.length, nmd.B(cm9.a(c.getClass())));
                } else if (c16.i(e, fy9.f)) {
                    f = bm8.f(this);
                } else if (!c16.i(e, fy9.g) && !c16.i(e, fy9.h)) {
                    if (!c16.i(e, fy9.m) && !c16.i(e, fy9.n) && !c16.i(e, fy9.o)) {
                        f = null;
                    } else {
                        f = fwa.a.c(this);
                    }
                } else {
                    f = cm8.a.c(this);
                }
            } else {
                f = pc1.a.c(this);
            }
        } else {
            f = mc1.f(this);
        }
        if (f != null) {
            return f;
        }
        o9a e2 = s76Var.e();
        boolean i = c16.i(e2, ey9.a);
        Bundle bundle = this.e;
        if (i) {
            bundle.getClass();
            String str = this.g;
            str.getClass();
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
            if (integerArrayList != null) {
                return integerArrayList;
            }
            gwe.l(str);
            throw null;
        } else if (c16.i(e2, ey9.b)) {
            bundle.getClass();
            String str2 = this.g;
            str2.getClass();
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str2);
            if (stringArrayList != null) {
                return stringArrayList;
            }
            gwe.l(str2);
            throw null;
        } else if (c16.i(e2, ey9.c)) {
            bundle.getClass();
            String str3 = this.g;
            str3.getClass();
            boolean[] booleanArray = bundle.getBooleanArray(str3);
            if (booleanArray != null) {
                return booleanArray;
            }
            gwe.l(str3);
            throw null;
        } else if (c16.i(e2, ey9.d)) {
            bundle.getClass();
            String str4 = this.g;
            str4.getClass();
            char[] charArray = bundle.getCharArray(str4);
            if (charArray != null) {
                return charArray;
            }
            gwe.l(str4);
            throw null;
        } else if (c16.i(e2, ey9.e)) {
            bundle.getClass();
            String str5 = this.g;
            str5.getClass();
            double[] doubleArray = bundle.getDoubleArray(str5);
            if (doubleArray != null) {
                return doubleArray;
            }
            gwe.l(str5);
            throw null;
        } else if (c16.i(e2, ey9.f)) {
            bundle.getClass();
            String str6 = this.g;
            str6.getClass();
            float[] floatArray = bundle.getFloatArray(str6);
            if (floatArray != null) {
                return floatArray;
            }
            gwe.l(str6);
            throw null;
        } else if (c16.i(e2, ey9.g)) {
            bundle.getClass();
            String str7 = this.g;
            str7.getClass();
            int[] intArray = bundle.getIntArray(str7);
            if (intArray != null) {
                return intArray;
            }
            gwe.l(str7);
            throw null;
        } else if (c16.i(e2, ey9.h)) {
            bundle.getClass();
            String str8 = this.g;
            str8.getClass();
            long[] longArray = bundle.getLongArray(str8);
            if (longArray != null) {
                return longArray;
            }
            gwe.l(str8);
            throw null;
        } else if (c16.i(e2, ey9.i)) {
            bundle.getClass();
            String str9 = this.g;
            str9.getClass();
            String[] stringArray = bundle.getStringArray(str9);
            if (stringArray != null) {
                return stringArray;
            }
            gwe.l(str9);
            throw null;
        } else {
            return s76Var.c(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        r4.g = r2;
        r5 = r4.h;
        r4.h = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        return r5;
     */
    @Override // defpackage.fx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.o9a r5) {
        /*
            r4 = this;
            r5.getClass()
            bze r0 = r5.e()
            a5b r1 = defpackage.a5b.g
            boolean r0 = defpackage.c16.i(r0, r1)
            android.os.Bundle r1 = r4.e
            if (r0 != 0) goto L23
            bze r0 = r5.e()
            a5b r2 = defpackage.a5b.h
            boolean r0 = defpackage.c16.i(r0, r2)
            if (r0 == 0) goto L1e
            goto L23
        L1e:
            int r0 = r5.f()
            goto L2a
        L23:
            r1.getClass()
            int r0 = r1.size()
        L2a:
            int r2 = r4.h
            if (r2 >= r0) goto L56
            java.lang.String r2 = r5.g(r2)
            int r3 = r4.h
            boolean r3 = r5.j(r3)
            if (r3 == 0) goto L4d
            r1.getClass()
            r2.getClass()
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L4d
            int r2 = r4.h
            int r2 = r2 + 1
            r4.h = r2
            goto L2a
        L4d:
            r4.g = r2
            int r5 = r4.h
            int r0 = r5 + 1
            r4.h = r0
            return r5
        L56:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy9.f(o9a):int");
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final int l() {
        Bundle bundle = this.e;
        bundle.getClass();
        return cwe.i(this.g, bundle);
    }

    @Override // defpackage.fx1
    public final wf2 o() {
        return this.f.a;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final String s() {
        Bundle bundle = this.e;
        bundle.getClass();
        String str = this.g;
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        gwe.l(str);
        throw null;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final fx1 t(o9a o9aVar) {
        o9aVar.getClass();
        if (c16.i(this.g, "")) {
            return this;
        }
        Bundle bundle = this.e;
        bundle.getClass();
        return new iy9(cwe.j(this.g, bundle), this.f);
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final int u(o9a o9aVar) {
        o9aVar.getClass();
        Bundle bundle = this.e;
        bundle.getClass();
        return cwe.i(this.g, bundle);
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final long v() {
        Bundle bundle = this.e;
        bundle.getClass();
        String str = this.g;
        str.getClass();
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE && bundle.getLong(str, Long.MAX_VALUE) == Long.MAX_VALUE) {
            gwe.l(str);
            throw null;
        }
        return j;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final boolean w() {
        boolean z;
        Bundle bundle = this.e;
        bundle.getClass();
        String str = this.g;
        str.getClass();
        if (bundle.containsKey(str) && bundle.get(str) == null) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
