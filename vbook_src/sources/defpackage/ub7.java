package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ub7  reason: default package */
/* loaded from: classes.dex */
public final class ub7 {
    public final s26 a;
    public final ij1 b;
    public final HashMap c;

    public ub7(Context context, ij1 ij1Var) {
        s26 s26Var = new s26(context, 4);
        this.c = new HashMap();
        this.a = s26Var;
        this.b = ij1Var;
    }

    public final synchronized gnc a(String str) {
        if (this.c.containsKey(str)) {
            return (gnc) this.c.get(str);
        }
        CctBackendFactory w = this.a.w(str);
        if (w == null) {
            return null;
        }
        ij1 ij1Var = this.b;
        gnc create = w.create(new hc0((Context) ij1Var.b, (xj1) ij1Var.c, (xj1) ij1Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
