package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: it7  reason: default package */
/* loaded from: classes.dex */
public final class it7 {
    public final bm1 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public it7(bm1 bm1Var, long j, int i, int i2) {
        int i3;
        boolean z;
        rk9 rk9Var;
        int i4;
        int h;
        int i5;
        this.a = bm1Var;
        this.b = i;
        if (x02.k(j) != 0 || x02.j(j) != 0) {
            mv5.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) bm1Var.f;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            ml8 ml8Var = (ml8) arrayList2.get(i6);
            wj wjVar = ml8Var.a;
            int i8 = x02.i(j);
            if (x02.d(j)) {
                i4 = i6;
                h = x02.h(j) - ((int) Math.ceil(f));
                if (h < 0) {
                    h = 0;
                }
            } else {
                i4 = i6;
                h = x02.h(j);
            }
            i3 = 0;
            tj tjVar = new tj(wjVar, this.b - i7, i2, y02.b(0, i8, 0, h, 5));
            float b = tjVar.b() + f;
            dvb dvbVar = tjVar.d;
            int i9 = i7 + dvbVar.g;
            arrayList.add(new ll8(tjVar, ml8Var.b, ml8Var.c, i7, i9, f, b));
            if (!dvbVar.d) {
                if (i9 == this.b) {
                    i5 = i4;
                    if (i5 != tl1.x((ArrayList) this.a.f)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i9;
                f = b;
            }
            z = true;
            i7 = i9;
            f = b;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = x02.i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = i3; i10 < size2; i10++) {
            ll8 ll8Var = (ll8) arrayList.get(i10);
            List list = ll8Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i11 = i3; i11 < size3; i11++) {
                rk9 rk9Var2 = (rk9) list.get(i11);
                if (rk9Var2 != null) {
                    rk9Var = ll8Var.a(rk9Var2);
                } else {
                    rk9Var = null;
                }
                arrayList4.add(rk9Var);
            }
            xl1.P(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.c).size()) {
            int size4 = ((List) this.a.c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = i3; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = sl1.n0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void j(it7 it7Var, k61 k61Var, long j, nea neaVar, gpb gpbVar, bk3 bk3Var) {
        k61Var.i();
        ArrayList arrayList = it7Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ll8 ll8Var = (ll8) arrayList.get(i);
            ll8Var.a.f(k61Var, j, neaVar, gpbVar, bk3Var);
            k61Var.p(nae.e, ll8Var.a.b());
        }
        k61Var.q();
    }

    public static void k(it7 it7Var, k61 k61Var, hy0 hy0Var, float f, nea neaVar, gpb gpbVar, bk3 bk3Var) {
        k61Var.i();
        ArrayList arrayList = it7Var.h;
        if (arrayList.size() <= 1) {
            hre.j(it7Var, k61Var, hy0Var, f, neaVar, gpbVar, bk3Var);
        } else if (hy0Var instanceof esa) {
            hre.j(it7Var, k61Var, hy0Var, f, neaVar, gpbVar, bk3Var);
        } else if (hy0Var instanceof jea) {
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                ll8 ll8Var = (ll8) arrayList.get(i);
                f3 += ll8Var.a.b();
                f2 = Math.max(f2, ll8Var.a.d());
            }
            Shader c = ((jea) hy0Var).c((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            c.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                tj tjVar = ((ll8) arrayList.get(i2)).a;
                tjVar.g(k61Var, new iy0(c), f, neaVar, gpbVar, bk3Var);
                k61Var.p(nae.e, tjVar.b());
                matrix.setTranslate(nae.e, -tjVar.b());
                c.setLocalMatrix(matrix);
            }
        } else {
            xk5.o();
            return;
        }
        k61Var.q();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [wl9, java.lang.Object] */
    public final void a(long j, float[] fArr) {
        l(fxb.g(j));
        m(fxb.f(j));
        ?? obj = new Object();
        obj.a = 0;
        vqe.y(this.h, j, new ss0(j, fArr, (xl9) obj, (wl9) new Object()));
    }

    public final float b(int i) {
        n(i);
        ArrayList arrayList = this.h;
        ll8 ll8Var = (ll8) arrayList.get(vqe.w(i, arrayList));
        return ll8Var.a.d.e(i - ll8Var.d) + ll8Var.f;
    }

    public final int c(int i, boolean z) {
        int f;
        n(i);
        ArrayList arrayList = this.h;
        ll8 ll8Var = (ll8) arrayList.get(vqe.w(i, arrayList));
        tj tjVar = ll8Var.a;
        int i2 = i - ll8Var.d;
        dvb dvbVar = tjVar.d;
        if (z) {
            Layout layout = dvbVar.f;
            ThreadLocal threadLocal = ivb.a;
            if (layout.getEllipsisCount(i2) > 0 && dvbVar.b == TextUtils.TruncateAt.END) {
                f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            } else {
                bm1 c = dvbVar.c();
                Layout layout2 = (Layout) c.b;
                f = c.K(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            }
        } else {
            f = dvbVar.f(i2);
        }
        return f + ll8Var.b;
    }

    public final int d(int i) {
        int v;
        int length = ((ps) this.a.b).b.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            v = tl1.x(arrayList);
        } else if (i < 0) {
            v = 0;
        } else {
            v = vqe.v(i, arrayList);
        }
        ll8 ll8Var = (ll8) arrayList.get(v);
        tj tjVar = ll8Var.a;
        return tjVar.d.g(ll8Var.d(i)) + ll8Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        ll8 ll8Var = (ll8) arrayList.get(vqe.x(arrayList, f));
        int i = ll8Var.c - ll8Var.b;
        int i2 = ll8Var.d;
        if (i == 0) {
            return i2;
        }
        tj tjVar = ll8Var.a;
        float f2 = f - ll8Var.f;
        dvb dvbVar = tjVar.d;
        int i3 = (int) f2;
        int i4 = dvbVar.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = dvbVar.f.getLineForVertical(i3 - dvbVar.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        n(i);
        ArrayList arrayList = this.h;
        ll8 ll8Var = (ll8) arrayList.get(vqe.w(i, arrayList));
        return ll8Var.a.d.i(i - ll8Var.d) + ll8Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        ll8 ll8Var = (ll8) arrayList.get(vqe.x(arrayList, intBitsToFloat));
        int i2 = ll8Var.c;
        int i3 = ll8Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        tj tjVar = ll8Var.a;
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i) - ll8Var.f) & 4294967295L);
        dvb dvbVar = tjVar.d;
        Layout layout = dvbVar.f;
        int lineForVertical = layout.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - dvbVar.h);
        if (lineForVertical >= dvbVar.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (dvbVar.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final oq9 h(int i) {
        int v;
        m(i);
        int length = ((ps) this.a.b).b.length();
        ArrayList arrayList = this.h;
        if (i == length) {
            v = tl1.x(arrayList);
        } else {
            v = vqe.v(i, arrayList);
        }
        ll8 ll8Var = (ll8) arrayList.get(v);
        tj tjVar = ll8Var.a;
        int d = ll8Var.d(i);
        dvb dvbVar = tjVar.d;
        if (dvbVar.f.getParagraphDirection(dvbVar.g(d)) == 1) {
            return oq9.a;
        }
        return oq9.b;
    }

    public final long i(rk9 rk9Var, int i, p1a p1aVar) {
        long j;
        long j2;
        float f = rk9Var.b;
        ArrayList arrayList = this.h;
        int x = vqe.x(arrayList, f);
        float f2 = ((ll8) arrayList.get(x)).g;
        float f3 = rk9Var.d;
        if (f2 < f3 && x != tl1.x(arrayList)) {
            int x2 = vqe.x(arrayList, f3);
            long j3 = fxb.b;
            while (true) {
                j = fxb.b;
                if (!fxb.c(j3, j) || x > x2) {
                    break;
                }
                ll8 ll8Var = (ll8) arrayList.get(x);
                j3 = ll8Var.b(true, ll8Var.a.c(ll8Var.c(rk9Var), i, p1aVar));
                x++;
            }
            if (fxb.c(j3, j)) {
                return j;
            }
            while (true) {
                j2 = fxb.b;
                if (!fxb.c(j, j2) || x > x2) {
                    break;
                }
                ll8 ll8Var2 = (ll8) arrayList.get(x2);
                j = ll8Var2.b(true, ll8Var2.a.c(ll8Var2.c(rk9Var), i, p1aVar));
                x2--;
            }
            if (fxb.c(j, j2)) {
                return j3;
            }
            return sze.a((int) (j3 >> 32), (int) (4294967295L & j));
        }
        ll8 ll8Var3 = (ll8) arrayList.get(x);
        return ll8Var3.b(true, ll8Var3.a.c(ll8Var3.c(rk9Var), i, p1aVar));
    }

    public final void l(int i) {
        boolean z = false;
        bm1 bm1Var = this.a;
        if (i >= 0 && i < ((ps) bm1Var.b).b.length()) {
            z = true;
        }
        if (!z) {
            int length = ((ps) bm1Var.b).b.length();
            mv5.a("offset(" + i + ") is out of bounds [0, " + length + ")");
        }
    }

    public final void m(int i) {
        boolean z = false;
        bm1 bm1Var = this.a;
        if (i >= 0 && i <= ((ps) bm1Var.b).b.length()) {
            z = true;
        }
        if (!z) {
            int length = ((ps) bm1Var.b).b.length();
            mv5.a("offset(" + i + ") is out of bounds [0, " + length + "]");
        }
    }

    public final void n(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            mv5.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
        }
    }
}
