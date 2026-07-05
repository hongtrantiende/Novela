package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a49  reason: default package */
/* loaded from: classes.dex */
public final class a49 {
    public final String a;
    public final bp9 b;
    public final xt4 c;
    public final m82 d;
    public final Object e = new Object();
    public volatile y39 f;

    public a49(String str, bp9 bp9Var, xt4 xt4Var, m82 m82Var) {
        this.a = str;
        this.b = bp9Var;
        this.c = xt4Var;
        this.d = m82Var;
    }

    public final Object a(r76 r76Var, Object obj) {
        y39 y39Var;
        Context context = (Context) obj;
        context.getClass();
        r76Var.getClass();
        y39 y39Var2 = this.f;
        if (y39Var2 == null) {
            synchronized (this.e) {
                try {
                    if (this.f == null) {
                        Context applicationContext = context.getApplicationContext();
                        bp9 bp9Var = this.b;
                        xt4 xt4Var = this.c;
                        applicationContext.getClass();
                        this.f = ctd.z(bp9Var, (List) xt4Var.invoke(applicationContext), this.d, new mm7(16, applicationContext, this));
                    }
                    y39Var = this.f;
                    y39Var.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return y39Var;
        }
        return y39Var2;
    }
}
