package defpackage;

import android.content.Context;
import android.os.Build;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yx8  reason: default package */
/* loaded from: classes.dex */
public abstract class yx8 {
    public static final tza a = new f99(new sc8(26));
    public static final xu1 b = new xu1(23);

    public static final void a(lob lobVar, Context context, boolean z, CharSequence charSequence, fxb fxbVar, sx8 sx8Var, xt4 xt4Var) {
        if (Build.VERSION.SDK_INT >= 28 && charSequence != null && fxbVar != null && sx8Var != null && (sx8Var instanceof xx8)) {
            ((xx8) sx8Var).b(lobVar, charSequence, fxbVar.a, xt4Var);
            nae.j(lobVar, context, z, charSequence, fxbVar.a);
            return;
        }
        xt4Var.invoke(lobVar);
        if (charSequence != null && fxbVar != null) {
            nae.j(lobVar, context, z, charSequence, fxbVar.a);
        }
    }

    public static final sx8 b(e6a e6aVar, ov6 ov6Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.e0(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            rv4Var.q(false);
            return null;
        }
        Context context = (Context) rv4Var.j(gh.b);
        d82 d82Var = (d82) rv4Var.j(a);
        boolean f = rv4Var.f(d82Var) | rv4Var.f(context);
        if ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.f(ov6Var)) || (i & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z | f;
        Object P = rv4Var.P();
        if (z2 || P == ax1.a) {
            b.getClass();
            P = new xx8(d82Var, context, e6aVar, ov6Var);
            rv4Var.o0(P);
        }
        sx8 sx8Var = (sx8) P;
        rv4Var.q(false);
        return sx8Var;
    }
}
