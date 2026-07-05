package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bt6  reason: default package */
/* loaded from: classes3.dex */
public abstract class bt6 {
    public static final ly1 a = new ly1(new v16(25));

    public static s6 a(rv4 rv4Var) {
        s6 s6Var = (s6) rv4Var.j(a);
        if (s6Var == null) {
            rv4Var.e0(1213380307);
            Context context = (Context) rv4Var.j(gh.b);
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof s6) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                    break;
                }
            }
            s6Var = (s6) context;
        } else {
            rv4Var.e0(1213379439);
        }
        rv4Var.q(false);
        return s6Var;
    }
}
