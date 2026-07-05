package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vu9  reason: default package */
/* loaded from: classes.dex */
public final class vu9 extends nc2 {
    @Override // defpackage.nc2
    public final void g(ifa ifaVar, float f, float f2) {
        ifaVar.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        efa efaVar = new efa(nae.e, nae.e, f3, f3);
        efaVar.f = 180.0f;
        efaVar.g = 90.0f;
        ifaVar.f.add(efaVar);
        cfa cfaVar = new cfa(efaVar);
        ifaVar.a(180.0f);
        ifaVar.g.add(cfaVar);
        ifaVar.d = 270.0f;
        float f4 = (nae.e + f3) * 0.5f;
        float f5 = (f3 - nae.e) / 2.0f;
        ifaVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        ifaVar.c = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
