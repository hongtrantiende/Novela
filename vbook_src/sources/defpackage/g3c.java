package defpackage;

import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g3c  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g3c implements lu4 {
    public final /* synthetic */ aw7 C;
    public final /* synthetic */ aw7 D;
    public final /* synthetic */ aw7 E;
    public final /* synthetic */ aw7 F;
    public final /* synthetic */ aw7 G;
    public final /* synthetic */ aw7 H;
    public final /* synthetic */ kj6 a;
    public final /* synthetic */ cyb b;
    public final /* synthetic */ s35 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ aw7 f;

    public /* synthetic */ g3c(kj6 kj6Var, cyb cybVar, s35 s35Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5, aw7 aw7Var6, aw7 aw7Var7, aw7 aw7Var8, aw7 aw7Var9) {
        this.a = kj6Var;
        this.b = cybVar;
        this.c = s35Var;
        this.d = aw7Var;
        this.e = aw7Var2;
        this.f = aw7Var3;
        this.C = aw7Var4;
        this.D = aw7Var5;
        this.E = aw7Var6;
        this.F = aw7Var7;
        this.G = aw7Var8;
        this.H = aw7Var9;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int preceding;
        int i2;
        int following;
        long a;
        pwb[] pwbVarArr;
        boolean z;
        pwb pwbVar;
        Object obj3;
        pwb[] pwbVarArr2;
        y78 y78Var = (y78) obj;
        Boolean bool = (Boolean) obj2;
        boolean booleanValue = bool.booleanValue();
        float intBitsToFloat = Float.intBitsToFloat((int) (y78Var.a >> 32));
        c3c c3cVar = k3c.a;
        float floatValue = intBitsToFloat - ((Number) this.d.getValue()).floatValue();
        long j = y78Var.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j)) - ((Number) this.e.getValue()).floatValue();
        int intValue = ((Number) this.f.getValue()).intValue();
        kj6 kj6Var = this.a;
        l3c d = k3c.d(floatValue, intBitsToFloat2, intValue, kj6Var.j().k, kj6Var.j().p, ((kob) this.C.getValue()).b);
        if (d == null) {
            pwbVarArr = new pwb[0];
        } else {
            int i3 = d.b.b;
            int i4 = d.a.b;
            mn mnVar = d.c;
            int i5 = d.d;
            evb evbVar = mnVar.c;
            evb evbVar2 = mnVar.c;
            TextPaint textPaint = mnVar.b;
            int n = dce.n(i5, 0, evbVar.a.b.length() - 1);
            List list = mnVar.d;
            list.getClass();
            fxb fxbVar = (fxb) sl1.f0(tl1.n(new tr0(n, 16), list, list.size()), list);
            if (fxbVar != null) {
                a = fxbVar.a;
            } else {
                k57 k57Var = mnVar.h;
                if (k57Var == null) {
                    Locale textLocale = textPaint.getTextLocale();
                    textLocale.getClass();
                    k57Var = new k57(textLocale, evbVar2.a.b);
                    mnVar.h = k57Var;
                }
                mld mldVar = (mld) k57Var.b;
                mldVar.a(n);
                BreakIterator breakIterator = mldVar.e;
                if (mldVar.i(breakIterator.preceding(n))) {
                    mldVar.a(n);
                    i = n;
                    while (i != -1 && (!mldVar.i(i) || mldVar.d(i))) {
                        mldVar.a(i);
                        i = breakIterator.preceding(i);
                    }
                } else {
                    mldVar.a(n);
                    if (mldVar.g(n)) {
                        if (breakIterator.isBoundary(n) && !mldVar.b(n)) {
                            i = n;
                        } else {
                            preceding = breakIterator.preceding(n);
                            i = preceding;
                        }
                    } else if (mldVar.b(n)) {
                        preceding = breakIterator.preceding(n);
                        i = preceding;
                    } else {
                        i = -1;
                    }
                }
                if (i == -1) {
                    i = n;
                }
                k57 k57Var2 = mnVar.h;
                if (k57Var2 == null) {
                    Locale textLocale2 = textPaint.getTextLocale();
                    textLocale2.getClass();
                    k57Var2 = new k57(textLocale2, evbVar2.a.b);
                    mnVar.h = k57Var2;
                }
                mld mldVar2 = (mld) k57Var2.b;
                mldVar2.a(n);
                BreakIterator breakIterator2 = mldVar2.e;
                if (mldVar2.d(breakIterator2.following(n))) {
                    mldVar2.a(n);
                    i2 = n;
                    while (i2 != -1 && (mldVar2.i(i2) || !mldVar2.d(i2))) {
                        mldVar2.a(i2);
                        i2 = breakIterator2.following(i2);
                    }
                } else {
                    mldVar2.a(n);
                    if (mldVar2.b(n)) {
                        if (breakIterator2.isBoundary(n) && !mldVar2.g(n)) {
                            i2 = n;
                        } else {
                            following = breakIterator2.following(n);
                            i2 = following;
                        }
                    } else if (mldVar2.g(n)) {
                        following = breakIterator2.following(n);
                        i2 = following;
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    n = i2;
                }
                a = sze.a(i, n);
            }
            pwbVarArr = new pwb[]{new pwb(i4, fxb.g(a) + i3), new pwb(i4, (fxb.f(a) - 1) + i3)};
        }
        if (pwbVarArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        if (!z) {
            pwb pwbVar2 = (pwb) b00.m0(pwbVarArr);
            pwb pwbVar3 = (pwb) b00.t0(pwbVarArr);
            Iterator it = ((List) this.D.getValue()).iterator();
            while (true) {
                pwbVar = null;
                if (it.hasNext()) {
                    obj3 = it.next();
                    pmb pmbVar = (pmb) obj3;
                    if (pmbVar.e == 1 && cwe.o(pmbVar, pwbVar2.b, pwbVar3.b)) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            pmb pmbVar2 = (pmb) obj3;
            if (pmbVar2 != null) {
                pwbVarArr2 = new pwb[]{new pwb(pwbVar2.a, pmbVar2.i), new pwb(pwbVar3.a, pmbVar2.j)};
            } else {
                pwbVarArr2 = new pwb[0];
            }
            pwb pwbVar4 = (pwb) b00.n0(pwbVarArr2);
            if (pwbVar4 == null) {
                pwbVar4 = (pwb) b00.m0(pwbVarArr);
            }
            if (pwbVarArr2.length != 0) {
                pwbVar = pwbVarArr2[pwbVarArr2.length - 1];
            }
            if (pwbVar == null) {
                pwbVar = (pwb) b00.t0(pwbVarArr);
            }
            cyb cybVar = this.b;
            cybVar.f.setValue(bool);
            if (booleanValue) {
                ((dx8) this.c).a(0);
            }
            cybVar.a.setValue(p7a.b);
            this.E.setValue(pwbVar4);
            pwbVar4.getClass();
            cybVar.b.setValue(pwbVar4);
            pwbVar.getClass();
            cybVar.c.setValue(pwbVar);
            this.F.setValue(new y78(j));
            Boolean bool2 = Boolean.TRUE;
            this.G.setValue(bool2);
            this.H.setValue(bool2);
        }
        return Boolean.valueOf(z2);
    }
}
