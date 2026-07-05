package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: da4  reason: default package */
/* loaded from: classes3.dex */
public final class da4 extends fu6 {
    public final String d1;
    public final wl6 e1;
    public final klc f1;
    public final xs5 g1;
    public final fyb h1;
    public final cza i1;

    public da4(String str, wl6 wl6Var, pi9 pi9Var, fnb fnbVar, ixb ixbVar, xo4 xo4Var, cs0 cs0Var, nld nldVar, qvb qvbVar, klc klcVar, sc9 sc9Var, a2c a2cVar, yf3 yf3Var, xs5 xs5Var, npc npcVar, wpc wpcVar, ko5 ko5Var, fyb fybVar, ih8 ih8Var) {
        super(str, wl6Var, pi9Var, fnbVar, ixbVar, xo4Var, cs0Var, nldVar, qvbVar, klcVar, sc9Var, a2cVar, yf3Var, xs5Var, npcVar, wpcVar, ko5Var, fybVar, ih8Var);
        this.d1 = str;
        this.e1 = wl6Var;
        this.f1 = klcVar;
        this.g1 = xs5Var;
        this.h1 = fybVar;
        this.i1 = dza.a(new ca4(true, false, true, false, "", "", "", ""));
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new uw2(this, null, 22));
    }

    @Override // defpackage.y5c
    public final void X0(boolean z) {
        cza czaVar = this.i1;
        if (czaVar == null) {
            return;
        }
        while (true) {
            Object value = czaVar.getValue();
            boolean z2 = z;
            if (!czaVar.l(value, ca4.a((ca4) value, false, false, false, z2, null, null, null, 246))) {
                z = z2;
            } else {
                return;
            }
        }
    }
}
