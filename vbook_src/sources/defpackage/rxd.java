package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rxd  reason: default package */
/* loaded from: classes.dex */
public final class rxd implements a2e {
    public final /* synthetic */ int a;
    public final /* synthetic */ rwa b;
    public final /* synthetic */ k57 c;

    public rxd(k57 k57Var, rwa rwaVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = rwaVar;
                Objects.requireNonNull(k57Var);
                this.c = k57Var;
                return;
            default:
                this.b = rwaVar;
                Objects.requireNonNull(k57Var);
                this.c = k57Var;
                return;
        }
    }

    @Override // defpackage.a2e
    public final void k(l1e l1eVar) {
        switch (this.a) {
            case 0:
                h5e h5eVar = (h5e) l1eVar;
                this.c.J(new p4e(h5eVar.b, h5eVar.a, Long.valueOf(h5eVar.c), "Bearer"), null, null, Boolean.TRUE, null, this.b, this);
                return;
            default:
                d6e d6eVar = (d6e) l1eVar;
                this.c.J(new p4e(d6eVar.b, d6eVar.a, Long.valueOf(d6eVar.c), "Bearer"), null, null, Boolean.valueOf(d6eVar.d), null, this.b, this);
                return;
        }
    }

    @Override // defpackage.a2e
    /* renamed from: zza */
    public final void mo0zza(String str) {
        int i = this.a;
        rwa rwaVar = this.b;
        switch (i) {
            case 0:
                rwaVar.a(am8.G(str));
                return;
            default:
                rwaVar.a(am8.G(str));
                return;
        }
    }
}
