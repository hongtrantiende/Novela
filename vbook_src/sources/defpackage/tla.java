package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tla  reason: default package */
/* loaded from: classes3.dex */
public final class tla implements s76 {
    public final /* synthetic */ int a = 0;
    public final sz b;
    public final snd c;

    public tla() {
        vx7 vx7Var = wx7.a;
        vx7Var.getClass();
        sz szVar = new sz(vx7Var, 0);
        this.b = szVar;
        this.c = aze.i("nl.adaptivity.xmlutil.SimpleNamespaceContext", (qz) szVar.c);
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        int i = this.a;
        sz szVar = this.b;
        switch (i) {
            case 0:
                vla vlaVar = (vla) obj;
                vlaVar.getClass();
                szVar.a(jbeVar, sl1.C0(vlaVar));
                return;
            default:
                ora oraVar = (ora) obj;
                oraVar.getClass();
                jbeVar.G(szVar, oraVar);
                return;
        }
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        int i = this.a;
        sz szVar = this.b;
        switch (i) {
            case 0:
                return new vla((List) szVar.c(yq2Var));
            default:
                ora oraVar = new ora();
                oraVar.addAll(sl1.C0((List) yq2Var.d(szVar)));
                return oraVar;
        }
    }

    @Override // defpackage.s76
    public final o9a e() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public tla(s76 s76Var) {
        s76Var.getClass();
        sz szVar = new sz(s76Var, 0);
        this.b = szVar;
        this.c = aze.i("androidx.compose.runtime.SnapshotStateList", (qz) szVar.c);
    }
}
