package defpackage;

import android.text.TextUtils;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pxd  reason: default package */
/* loaded from: classes.dex */
public final class pxd implements a2e {
    public final /* synthetic */ int a;
    public final /* synthetic */ rwa b;
    public final /* synthetic */ k57 c;

    public pxd(k57 k57Var, rwa rwaVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = rwaVar;
                this.c = k57Var;
                return;
            case 2:
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
                a6e a6eVar = (a6e) l1eVar;
                boolean isEmpty = TextUtils.isEmpty(a6eVar.e);
                rwa rwaVar = this.b;
                if (!isEmpty) {
                    rwaVar.p(new yb3(a6eVar.e, a6eVar.d, null));
                    return;
                }
                this.c.J(new p4e(a6eVar.b, a6eVar.a, Long.valueOf(a6eVar.c), "Bearer"), null, null, Boolean.FALSE, null, rwaVar, this);
                return;
            case 1:
                f3e f3eVar = (f3e) l1eVar;
                boolean isEmpty2 = TextUtils.isEmpty(f3eVar.f);
                rwa rwaVar2 = this.b;
                if (!isEmpty2) {
                    rwaVar2.p(new yb3(f3eVar.f, f3eVar.e, null));
                    return;
                }
                this.c.J(new p4e(f3eVar.b, f3eVar.a, Long.valueOf(f3eVar.d), "Bearer"), null, null, Boolean.valueOf(f3eVar.c), null, rwaVar2, this);
                return;
            default:
                x5e x5eVar = (x5e) l1eVar;
                boolean isEmpty3 = TextUtils.isEmpty(x5eVar.L);
                rwa rwaVar3 = this.b;
                if (isEmpty3) {
                    k57.G(this.c, x5eVar, rwaVar3, this);
                    return;
                } else {
                    rwaVar3.p(new yb3(x5eVar.L, x5eVar.K, x5eVar.a()));
                    return;
                }
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
            case 1:
                rwaVar.a(am8.G(str));
                return;
            default:
                rwaVar.a(am8.G(str));
                return;
        }
    }
}
