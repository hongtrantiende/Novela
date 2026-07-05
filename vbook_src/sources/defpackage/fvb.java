package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fvb  reason: default package */
/* loaded from: classes.dex */
public final class fvb {
    public final evb a;
    public final it7 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public fvb(evb evbVar, it7 it7Var, long j) {
        float d;
        dvb dvbVar;
        this.a = evbVar;
        this.b = it7Var;
        this.c = j;
        ArrayList arrayList = it7Var.h;
        boolean isEmpty = arrayList.isEmpty();
        float f = nae.e;
        if (isEmpty) {
            d = 0.0f;
        } else {
            d = ((ll8) arrayList.get(0)).a.d.d(0);
        }
        this.d = d;
        if (!arrayList.isEmpty()) {
            ll8 ll8Var = (ll8) sl1.j0(arrayList);
            f = ll8Var.a.d.d(dvbVar.g - 1) + ll8Var.f;
        }
        this.e = f;
        this.f = it7Var.g;
    }

    public final oq9 a(int i) {
        int v;
        it7 it7Var = this.b;
        it7Var.m(i);
        int length = ((ps) it7Var.a.b).b.length();
        ArrayList arrayList = it7Var.h;
        if (i == length) {
            v = tl1.x(arrayList);
        } else {
            v = vqe.v(i, arrayList);
        }
        ll8 ll8Var = (ll8) arrayList.get(v);
        tj tjVar = ll8Var.a;
        if (tjVar.d.f.isRtlCharAt(ll8Var.d(i))) {
            return oq9.b;
        }
        return oq9.a;
    }

    public final rk9 b(int i) {
        boolean z;
        float k;
        float k2;
        float j;
        float j2;
        it7 it7Var = this.b;
        it7Var.l(i);
        ArrayList arrayList = it7Var.h;
        ll8 ll8Var = (ll8) arrayList.get(vqe.v(i, arrayList));
        tj tjVar = ll8Var.a;
        int d = ll8Var.d(i);
        CharSequence charSequence = tjVar.e;
        if (d < 0 || d >= charSequence.length()) {
            mv5.a("offset(" + d + ") is out of bounds [0," + charSequence.length() + ")");
        }
        dvb dvbVar = tjVar.d;
        int g = dvbVar.g(d);
        float i2 = dvbVar.i(g);
        float e = dvbVar.e(g);
        Layout layout = dvbVar.f;
        if (layout.getParagraphDirection(g) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (z && !isRtlCharAt) {
            k = dvbVar.j(d, false);
            k2 = dvbVar.j(d + 1, true);
        } else {
            if (z && isRtlCharAt) {
                j = dvbVar.k(d, false);
                j2 = dvbVar.k(d + 1, true);
            } else if (isRtlCharAt) {
                j = dvbVar.j(d, false);
                j2 = dvbVar.j(d + 1, true);
            } else {
                k = dvbVar.k(d, false);
                k2 = dvbVar.k(d + 1, true);
            }
            float f = j;
            k = j2;
            k2 = f;
        }
        RectF rectF = new RectF(k, i2, k2, e);
        return ll8Var.a(new rk9(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final rk9 c(int i) {
        int v;
        it7 it7Var = this.b;
        it7Var.m(i);
        int length = ((ps) it7Var.a.b).b.length();
        ArrayList arrayList = it7Var.h;
        if (i == length) {
            v = tl1.x(arrayList);
        } else {
            v = vqe.v(i, arrayList);
        }
        ll8 ll8Var = (ll8) arrayList.get(v);
        tj tjVar = ll8Var.a;
        int d = ll8Var.d(i);
        CharSequence charSequence = tjVar.e;
        dvb dvbVar = tjVar.d;
        if (d < 0 || d > charSequence.length()) {
            int length2 = charSequence.length();
            mv5.a("offset(" + d + ") is out of bounds [0," + length2 + "]");
        }
        float j = dvbVar.j(d, false);
        int g = dvbVar.g(d);
        return ll8Var.a(new rk9(j, dvbVar.i(g), j, dvbVar.e(g)));
    }

    public final boolean d() {
        it7 it7Var = this.b;
        if (!it7Var.c && ((int) (this.c & 4294967295L)) >= it7Var.e) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (((int) (this.c >> 32)) < this.b.d || d()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fvb) {
                fvb fvbVar = (fvb) obj;
                if (this.a.equals(fvbVar.a) && this.b == fvbVar.b && zy5.b(this.c, fvbVar.c) && this.d == fvbVar.d && this.e == fvbVar.e && c16.i(this.f, fvbVar.f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final float f(int i, boolean z) {
        int v;
        it7 it7Var = this.b;
        it7Var.m(i);
        int length = ((ps) it7Var.a.b).b.length();
        ArrayList arrayList = it7Var.h;
        if (i == length) {
            v = tl1.x(arrayList);
        } else {
            v = vqe.v(i, arrayList);
        }
        ll8 ll8Var = (ll8) arrayList.get(v);
        tj tjVar = ll8Var.a;
        int d = ll8Var.d(i);
        dvb dvbVar = tjVar.d;
        if (z) {
            return dvbVar.j(d, false);
        }
        return dvbVar.k(d, false);
    }

    public final float g(int i) {
        float f;
        it7 it7Var = this.b;
        it7Var.n(i);
        ArrayList arrayList = it7Var.h;
        ll8 ll8Var = (ll8) arrayList.get(vqe.w(i, arrayList));
        tj tjVar = ll8Var.a;
        int i2 = i - ll8Var.d;
        dvb dvbVar = tjVar.d;
        float lineLeft = dvbVar.f.getLineLeft(i2);
        if (i2 == dvbVar.g - 1) {
            f = dvbVar.j;
        } else {
            f = nae.e;
        }
        return lineLeft + f;
    }

    public final float h(int i) {
        float f;
        it7 it7Var = this.b;
        it7Var.n(i);
        ArrayList arrayList = it7Var.h;
        ll8 ll8Var = (ll8) arrayList.get(vqe.w(i, arrayList));
        tj tjVar = ll8Var.a;
        int i2 = i - ll8Var.d;
        dvb dvbVar = tjVar.d;
        float lineRight = dvbVar.f.getLineRight(i2);
        if (i2 == dvbVar.g - 1) {
            f = dvbVar.k;
        } else {
            f = nae.e;
        }
        return lineRight + f;
    }

    public final int hashCode() {
        return this.f.hashCode() + nk2.d(this.e, nk2.d(this.d, hl5.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31), 31);
    }

    public final int i(int i) {
        it7 it7Var = this.b;
        it7Var.n(i);
        ArrayList arrayList = it7Var.h;
        ll8 ll8Var = (ll8) arrayList.get(vqe.w(i, arrayList));
        return ll8Var.a.d.f.getLineStart(i - ll8Var.d) + ll8Var.b;
    }

    public final yj j(int i, int i2) {
        it7 it7Var = this.b;
        bm1 bm1Var = it7Var.a;
        if (i < 0 || i > i2 || i2 > ((ps) bm1Var.b).b.length()) {
            int length = ((ps) bm1Var.b).b.length();
            StringBuilder r = hl5.r(i, i2, "Start(", ") or End(", ") is out of range [0..");
            r.append(length);
            r.append("), or start > end!");
            mv5.a(r.toString());
        }
        if (i == i2) {
            return dk.a();
        }
        yj a = dk.a();
        vqe.y(it7Var.h, sze.a(i, i2), new ht7(a, i, i2));
        return a;
    }

    public final long k(int i) {
        int v;
        int i2;
        int i3;
        int j;
        it7 it7Var = this.b;
        it7Var.m(i);
        int length = ((ps) it7Var.a.b).b.length();
        ArrayList arrayList = it7Var.h;
        if (i == length) {
            v = tl1.x(arrayList);
        } else {
            v = vqe.v(i, arrayList);
        }
        ll8 ll8Var = (ll8) arrayList.get(v);
        tj tjVar = ll8Var.a;
        int d = ll8Var.d(i);
        mld l = tjVar.d.l();
        if (l.i(l.k(d))) {
            l.a(d);
            i2 = d;
            while (i2 != -1 && (!l.i(i2) || l.d(i2))) {
                i2 = l.k(i2);
            }
        } else {
            l.a(d);
            if (l.h(d)) {
                if (l.e(d) && !l.c(d)) {
                    i2 = d;
                } else {
                    i2 = l.k(d);
                }
            } else if (l.c(d)) {
                i2 = l.k(d);
            } else {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = d;
        }
        if (l.d(l.j(d))) {
            l.a(d);
            i3 = d;
            while (i3 != -1 && (l.i(i3) || !l.d(i3))) {
                i3 = l.j(i3);
            }
        } else {
            l.a(d);
            if (l.c(d)) {
                if (l.e(d) && !l.h(d)) {
                    i3 = d;
                } else {
                    j = l.j(d);
                    i3 = j;
                }
            } else if (l.h(d)) {
                j = l.j(d);
                i3 = j;
            } else {
                i3 = -1;
            }
        }
        if (i3 != -1) {
            d = i3;
        }
        return ll8Var.b(false, sze.a(i2, d));
    }

    public final boolean l(int i) {
        it7 it7Var = this.b;
        it7Var.n(i);
        ArrayList arrayList = it7Var.h;
        Layout layout = ((ll8) arrayList.get(vqe.w(i, arrayList))).a.d.f;
        ThreadLocal threadLocal = ivb.a;
        if (layout.getEllipsisCount(i) > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String c = zy5.c(this.c);
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + c + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
