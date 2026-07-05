package defpackage;

import android.content.Context;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q9d  reason: default package */
/* loaded from: classes.dex */
public final class q9d {
    public final x04 a;
    public final aza b;
    public final Object c;
    public Float d;

    public q9d(x04 x04Var, bw7 bw7Var, Context context) {
        x04Var.getClass();
        bw7Var.getClass();
        this.a = x04Var;
        this.b = bw7Var;
        this.c = context;
    }

    public final boolean a() {
        if (this.a.b.getValue() == py8.C) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0253, code lost:
        if (r1 == r4) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0251  */
    /* JADX WARN: Type inference failed for: r9v17, types: [z47, y47] */
    /* JADX WARN: Type inference failed for: r9v4, types: [z47, y47] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vad r25, defpackage.g60 r26, defpackage.n42 r27) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q9d.b(vad, g60, n42):java.lang.Object");
    }

    public final void c() {
        i04 i04Var;
        x04 x04Var = this.a;
        x04Var.C();
        if (!(x04Var instanceof x04)) {
            x04Var = null;
        }
        if (x04Var != null && (i04Var = x04Var.E) != null) {
            i04Var.M(true);
            i04Var.M(true);
        }
    }

    public final void d(boolean z) {
        i04 i04Var;
        x04 x04Var = this.a;
        if (((nb4) ((Map) x04Var.L.b).get(cne.b)) == null) {
            if (!(x04Var instanceof x04)) {
                x04Var = null;
            }
            if (x04Var != null && (i04Var = x04Var.E) != null) {
                Float f = this.d;
                if (z) {
                    if (f == null) {
                        i04Var.X();
                        this.d = Float.valueOf(i04Var.e0);
                        i04Var.R(nae.e);
                        return;
                    }
                    return;
                } else if (f != null) {
                    float floatValue = f.floatValue();
                    this.d = null;
                    i04Var.R(floatValue);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        vm1.h();
    }
}
