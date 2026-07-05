package defpackage;

import android.os.Trace;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zm9  reason: default package */
/* loaded from: classes3.dex */
public final class zm9 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Serializable k;

    public zm9() {
        gw7 gw7Var = new gw7(new wv4[16], 0);
        this.c = gw7Var;
        uv7 uv7Var = uz9.a;
        this.g = new uv7();
        this.d = gw7Var;
        this.e = new gw7(new Object[16], 0);
        this.f = new gw7(new vt4[16], 0);
    }

    public static final boolean g(wv4 wv4Var, gw7 gw7Var) {
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            bn9 bn9Var = ((wv4) objArr[i2]).a;
            if (bn9Var instanceof ro8) {
                gw7 gw7Var2 = ((ro8) bn9Var).b;
                if (gw7Var2.j(wv4Var) || g(wv4Var, gw7Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a() {
        this.a = null;
        this.b = null;
        gw7 gw7Var = (gw7) this.c;
        gw7Var.g();
        ((uv7) this.g).b();
        this.d = gw7Var;
        ((gw7) this.e).g();
        ((gw7) this.f).g();
        this.h = null;
        this.j = null;
        this.k = null;
    }

    public void b() {
        Set set = (Set) this.a;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((bn9) it.next()).a();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public void c() {
        gw7 gw7Var = (gw7) this.c;
        gw7 gw7Var2 = (gw7) this.e;
        Set set = (Set) this.a;
        if (set != null) {
            this.i = null;
            if (gw7Var2.c != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    uv7 uv7Var = (uv7) this.h;
                    int i = gw7Var2.c;
                    while (true) {
                        i--;
                        if (-1 >= i) {
                            break;
                        }
                        Object obj = gw7Var2.a[i];
                        if (obj instanceof wv4) {
                            bn9 bn9Var = ((wv4) obj).a;
                            set.remove(bn9Var);
                            bn9Var.b();
                        }
                        if (obj instanceof ew1) {
                            if (uv7Var != null && uv7Var.c(obj)) {
                                ((ew1) obj).a();
                            } else {
                                ((ew1) obj).c();
                            }
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            }
            if (gw7Var.c != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = (Set) this.a;
                    if (set2 != null) {
                        Object[] objArr = gw7Var.a;
                        int i2 = gw7Var.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            bn9 bn9Var2 = ((wv4) objArr[i3]).a;
                            set2.remove(bn9Var2);
                            bn9Var2.c();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public void d() {
        gw7 gw7Var = (gw7) this.f;
        if (gw7Var.c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = gw7Var.a;
                int i = gw7Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((vt4) objArr[i2]).invoke();
                }
                gw7Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r20, defpackage.wk1 r21, java.lang.String[] r22, defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm9.e(java.lang.String, wk1, java.lang.String[], n42):java.lang.Object");
    }

    public void f(wv4 wv4Var) {
        gw7 gw7Var = (gw7) this.c;
        if (((uv7) this.g).c(wv4Var)) {
            ((uv7) this.g).l(wv4Var);
            if (!((gw7) this.d).j(wv4Var) && !gw7Var.j(wv4Var)) {
                g(wv4Var, gw7Var);
            }
            Set set = (Set) this.a;
            if (set != null) {
                set.add(wv4Var.a);
                return;
            }
            return;
        }
        uv7 uv7Var = (uv7) this.i;
        if (uv7Var != null && uv7Var.c(wv4Var)) {
            return;
        }
        ((gw7) this.e).b(wv4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ff  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v8, types: [xl9] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v7, types: [xl9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01ad -> B:52:0x01df). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01d1 -> B:51:0x01d5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01e4 -> B:54:0x01ee). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r24, defpackage.n42 r25) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm9.h(java.lang.String, n42):java.lang.Object");
    }

    public void i(Set set, sx1 sx1Var) {
        a();
        this.a = set;
        this.b = sx1Var;
    }
}
