package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: si2  reason: default package */
/* loaded from: classes3.dex */
public final class si2 implements s76 {
    public static final si2 a = new Object();
    public static final y59 b = aze.e("kotlinx.datetime.DatePeriod/ISO", w59.n);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ri2 ri2Var = (ri2) obj;
        ri2Var.getClass();
        jbeVar.I(ri2Var.toString());
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }

    @Override // defpackage.s76
    /* renamed from: f */
    public final ri2 c(yq2 yq2Var) {
        cj2 cj2Var = dj2.Companion;
        String s = yq2Var.s();
        cj2Var.getClass();
        dj2 a2 = cj2.a(s);
        if (a2 instanceof ri2) {
            return (ri2) a2;
        }
        throw new IllegalArgumentException(a2 + " is not a date-based period");
    }
}
