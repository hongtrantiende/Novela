package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oi9  reason: default package */
/* loaded from: classes.dex */
public final class oi9 implements hb3 {
    public final /* synthetic */ vfb a;
    public final /* synthetic */ long b;

    public oi9(vfb vfbVar, long j) {
        this.a = vfbVar;
        this.b = j;
    }

    @Override // defpackage.hb3
    public final void a() {
        rfb rfbVar;
        int F;
        vfb vfbVar = this.a;
        vfbVar.getClass();
        rm m = hud.m(vfbVar);
        rfb rfbVar2 = rfb.a;
        if (m != null) {
            bp9 bp9Var = m.c;
            om omVar = om.a;
            if (bp9Var != null && (F = ((kwe) bp9Var.b).F()) != 1 && F == 2) {
                omVar = om.b;
            }
            int ordinal = omVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    rfbVar = rfb.b;
                } else {
                    xk5.o();
                    return;
                }
            } else {
                rfbVar = rfbVar2;
            }
        } else {
            rfbVar = wfb.b;
        }
        if (rfbVar != rfbVar2) {
            vfbVar.b(rfbVar2);
        }
        int i = sfb.c;
        long j = zl1.i;
        long j2 = this.b;
        vfbVar.d(new sfb(j, Boolean.valueOf(kve.w(j2))));
        vfbVar.c(new sfb(j, Boolean.valueOf(kve.w(j2))));
        vfbVar.e(tfb.a);
    }
}
