package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e0f  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e0f implements c9b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c9b
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object obj2 = a0f.j;
                return new b9f((ArrayList) obj);
            default:
                n8f n8fVar = (n8f) obj;
                hr7 hr7Var = (hr7) n8fVar.c.get();
                hr7Var.getClass();
                v1f v1fVar = (v1f) n8fVar.b.get();
                v1fVar.getClass();
                iye iyeVar = v1fVar.a;
                uu5 b = uu5.b();
                b.c = new k57(iyeVar, 29);
                b.d = new mb4[]{sxd.l};
                b.a = false;
                g0 b2 = v1f.b(iyeVar.b(0, b.a()));
                k3e k3eVar = k3e.e;
                int i2 = i0.H;
                i0 i0Var = new i0(b2, r1f.class, k3eVar);
                b2.a(i0Var, jqe.D(hr7Var, i0Var));
                t3 e = dv4.e(i0Var, new n5f(n8fVar, 2), hr7Var);
                e.a(new og(e, 26), hr7Var);
                return e;
        }
    }
}
