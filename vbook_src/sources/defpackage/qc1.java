package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qc1  reason: default package */
/* loaded from: classes.dex */
public final class qc1 implements s76 {
    public static final qc1 a = new Object();
    public static final q9a b = aze.m("kotlin.CharSequence", new o9a[0]);

    public static CharSequence f(yq2 yq2Var) {
        if (yq2Var instanceof iy9) {
            iy9 iy9Var = (iy9) yq2Var;
            Bundle bundle = iy9Var.e;
            bundle.getClass();
            String str = iy9Var.g;
            str.getClass();
            CharSequence charSequence = bundle.getCharSequence(str);
            if (charSequence != null) {
                return charSequence;
            }
            gwe.l(str);
            throw null;
        }
        p1a.k(am8.x(b.a, yq2Var));
        return null;
    }

    public static void g(jbe jbeVar, CharSequence charSequence) {
        charSequence.getClass();
        if (jbeVar instanceof jy9) {
            jy9 jy9Var = (jy9) jbeVar;
            Bundle bundle = jy9Var.C;
            String str = jy9Var.E;
            str.getClass();
            bundle.putCharSequence(str, charSequence);
            return;
        }
        p1a.k(am8.y(b.a, jbeVar));
    }

    @Override // defpackage.s76
    public final /* bridge */ /* synthetic */ void a(jbe jbeVar, Object obj) {
        g(jbeVar, (CharSequence) obj);
    }

    @Override // defpackage.s76
    public final /* bridge */ /* synthetic */ Object c(yq2 yq2Var) {
        return f(yq2Var);
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
