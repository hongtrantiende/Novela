package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l1f  reason: default package */
/* loaded from: classes.dex */
public final class l1f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d8f b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ w2f d;
    public final /* synthetic */ o3 e;

    public l1f(w2f w2fVar, d8f d8fVar, boolean z, i4e i4eVar) {
        this.a = 2;
        this.b = d8fVar;
        this.c = z;
        this.e = i4eVar;
        Objects.requireNonNull(w2fVar);
        this.d = w2fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        o3 o3Var = this.e;
        o3 o3Var2 = null;
        boolean z = this.c;
        d8f d8fVar = this.b;
        w2f w2fVar = this.d;
        switch (i) {
            case 0:
                lne lneVar = w2fVar.d;
                if (lneVar == null) {
                    ppe ppeVar = ((lte) w2fVar.a).f;
                    lte.m(ppeVar);
                    ppeVar.f.e("Discarding data. Failed to set user property");
                    return;
                }
                if (!z) {
                    o3Var2 = (g6f) o3Var;
                }
                w2fVar.p0(lneVar, o3Var2, d8fVar);
                w2fVar.k0();
                return;
            case 1:
                lne lneVar2 = w2fVar.d;
                if (lneVar2 == null) {
                    ppe ppeVar2 = ((lte) w2fVar.a).f;
                    lte.m(ppeVar2);
                    ppeVar2.f.e("Discarding data. Failed to send event to service");
                    return;
                }
                if (!z) {
                    o3Var2 = (ibe) o3Var;
                }
                w2fVar.p0(lneVar2, o3Var2, d8fVar);
                w2fVar.k0();
                return;
            default:
                lne lneVar3 = w2fVar.d;
                if (lneVar3 == null) {
                    ppe ppeVar3 = ((lte) w2fVar.a).f;
                    lte.m(ppeVar3);
                    ppeVar3.f.e("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                if (!z) {
                    o3Var2 = (i4e) o3Var;
                }
                w2fVar.p0(lneVar3, o3Var2, d8fVar);
                w2fVar.k0();
                return;
        }
    }

    public /* synthetic */ l1f(w2f w2fVar, d8f d8fVar, boolean z, o3 o3Var, int i) {
        this.a = i;
        this.b = d8fVar;
        this.c = z;
        this.e = o3Var;
        this.d = w2fVar;
    }
}
