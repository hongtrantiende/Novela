package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sfc  reason: default package */
/* loaded from: classes.dex */
public final class sfc {
    public epb a;
    public rfc b = rfc.a;

    public final void a() {
        xob xobVar;
        if (this.b == rfc.a) {
            ov5.c("ToolbarRequester is not initialized.");
        }
        epb epbVar = this.a;
        if (epbVar != null && epbVar.J) {
            iya iyaVar = epbVar.Q;
            if ((iyaVar == null || !iyaVar.isActive()) && (xobVar = (xob) nye.q(epbVar, yob.b)) != null) {
                epbVar.Q = z87.v(epbVar.v1(), null, p82.d, new qkb(epbVar, xobVar, (m42) null, 1), 1);
            }
        }
    }
}
