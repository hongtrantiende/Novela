package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ci6  reason: default package */
/* loaded from: classes.dex */
public final class ci6 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ ei6 c;

    public ci6(ei6 ei6Var, int i) {
        this.c = ei6Var;
        this.a = i;
    }

    public final void a(int i) {
        ei6 ei6Var = this.c;
        o40 o40Var = ei6Var.c;
        if (o40Var == null) {
            return;
        }
        this.b.add(new z49(o40Var, i, ei6Var.b, null));
    }
}
