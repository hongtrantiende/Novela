package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hed  reason: default package */
/* loaded from: classes.dex */
public final class hed implements xy9 {
    public final float a;
    public final float b;
    public final r13 c;

    public hed(float f, float f2, r13 r13Var) {
        r13Var.getClass();
        this.a = f;
        this.b = f2;
        this.c = r13Var;
    }

    @Override // defpackage.xy9
    public final Object a(Object obj) {
        ged gedVar = (ged) r36.d.a(ged.Companion.serializer(), (String) obj);
        return new ied(this.c, this.a, this.b, gedVar.a, gedVar.b, 0.2f, cd6.a, zi8.a, false);
    }

    @Override // defpackage.xy9
    public final Object b(rx9 rx9Var, Object obj) {
        ied iedVar = (ied) obj;
        rx9Var.getClass();
        iedVar.getClass();
        zc6 zc6Var = (zc6) iedVar.d.getValue();
        ged gedVar = new ged(p1d.j(zc6Var), zc6Var.c);
        q36 q36Var = r36.d;
        q36Var.getClass();
        return q36Var.b(ged.Companion.serializer(), gedVar);
    }
}
