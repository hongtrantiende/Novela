package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cf  reason: default package */
/* loaded from: classes.dex */
public final class cf extends ae0 implements v7a, nm4 {
    public final AutofillId C;
    public final xu7 D;
    public boolean E;
    public final yw8 a;
    public final e8a b;
    public final rg c;
    public final vk9 d;
    public final String e;
    public final Rect f = new Rect();

    public cf(yw8 yw8Var, e8a e8aVar, rg rgVar, vk9 vk9Var, String str) {
        AutofillId autofillId;
        this.a = yw8Var;
        this.b = e8aVar;
        this.c = rgVar;
        this.d = vk9Var;
        this.e = str;
        rgVar.setImportantForAutofill(1);
        zd0 m = bue.m(rgVar);
        if (m != null) {
            autofillId = (AutofillId) m.a;
        } else {
            autofillId = null;
        }
        if (autofillId != null) {
            this.C = autofillId;
            this.D = new xu7();
            return;
        }
        throw a82.f("Required value was null.");
    }

    @Override // defpackage.nm4
    public final void a(hn4 hn4Var, hn4 hn4Var2) {
        od6 v;
        u7a x;
        od6 v2;
        u7a x2;
        rg rgVar = this.c;
        yw8 yw8Var = this.a;
        if (hn4Var != null && (v2 = voe.v(hn4Var)) != null && (x2 = v2.x()) != null && xpe.d(x2)) {
            yw8Var.e(rgVar, v2.b);
        }
        if (hn4Var2 != null && (v = voe.v(hn4Var2)) != null && (x = v.x()) != null && xpe.d(x)) {
            int i = v.b;
            vk9 vk9Var = this.d;
            od6 od6Var = (od6) vk9Var.a.b(i);
            if (od6Var != null && od6Var.C != -4) {
                kj kjVar = vk9Var.c;
                int e = vk9Var.e(od6Var);
                long[] jArr = (long[]) kjVar.b;
                long j = jArr[e];
                long j2 = jArr[e + 1];
                yw8Var.d(rgVar, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
            }
        }
    }

    public final void b(SparseArray sparseArray) {
        u7a x;
        xt4 xt4Var;
        xt4 xt4Var2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue g = sz0.g(sparseArray.get(keyAt));
            od6 od6Var = (od6) this.b.c.b(keyAt);
            if (od6Var != null && (x = od6Var.x()) != null) {
                tv7 tv7Var = x.a;
                Object g2 = tv7Var.g(s7a.g);
                g4 g4Var = null;
                if (g2 == null) {
                    g2 = null;
                }
                g4 g4Var2 = (g4) g2;
                if (g4Var2 != null && (xt4Var2 = (xt4) g4Var2.b) != null) {
                    Boolean bool = (Boolean) xt4Var2.invoke(new ps(g.getTextValue().toString()));
                }
                Object g3 = tv7Var.g(s7a.h);
                if (g3 != null) {
                    g4Var = g3;
                }
                g4 g4Var3 = g4Var;
                if (g4Var3 != null && (xt4Var = (xt4) g4Var3.b) != null) {
                    Boolean bool2 = (Boolean) xt4Var.invoke(new bj(g));
                }
            }
        }
    }
}
