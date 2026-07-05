package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j68  reason: default package */
/* loaded from: classes3.dex */
public final class j68 extends y5c {
    public final String c1;
    public final wl6 d1;
    public final klc e1;
    public final fyb f1;
    public final cza g1;
    public final rj9 h1;

    public j68(String str, wl6 wl6Var, pi9 pi9Var, fnb fnbVar, ixb ixbVar, xo4 xo4Var, cs0 cs0Var, nld nldVar, qvb qvbVar, klc klcVar, sc9 sc9Var, a2c a2cVar, yf3 yf3Var, npc npcVar, wpc wpcVar, ko5 ko5Var, fyb fybVar, ih8 ih8Var) {
        super(str, wl6Var, yf3Var, pi9Var, fnbVar, ixbVar, xo4Var, cs0Var, nldVar, qvbVar, klcVar, sc9Var, a2cVar, npcVar, wpcVar, ih8Var);
        this.c1 = str;
        this.d1 = wl6Var;
        this.e1 = klcVar;
        this.f1 = fybVar;
        this.g1 = dza.a(new a68("", "", true, false, false));
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new qq4(this, null, 29));
        this.h1 = ko5Var.a(new i68(this, 0));
    }

    @Override // defpackage.y5c
    public final void X0(boolean z) {
        Object value;
        cza czaVar = this.g1;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, a68.a((a68) value, false, z, null, 26)));
        }
    }

    @Override // defpackage.y5c
    public final rj9 s0() {
        return this.h1;
    }
}
