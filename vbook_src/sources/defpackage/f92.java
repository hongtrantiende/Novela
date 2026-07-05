package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f92  reason: default package */
/* loaded from: classes.dex */
public final class f92 {
    public final wf2 a;
    public final ij1 b;

    public f92(wf2 wf2Var, oe4 oe4Var) {
        this.a = wf2Var;
        this.b = new ij1(oe4Var);
    }

    public final void a(String str) {
        ij1 ij1Var = this.b;
        synchronized (ij1Var) {
            if (!Objects.equals((String) ij1Var.c, str)) {
                ij1.Q((oe4) ij1Var.b, str, (String) ij1Var.d);
                ij1Var.c = str;
            }
        }
    }
}
