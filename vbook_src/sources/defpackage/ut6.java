package defpackage;

import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ut6  reason: default package */
/* loaded from: classes3.dex */
public final class ut6 implements s76 {
    public static final ut6 a = new Object();
    public static final y59 b = aze.e("kotlinx.datetime.LocalDate", w59.n);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        nt6 nt6Var = (nt6) obj;
        nt6Var.getClass();
        jbeVar.I(nt6Var.toString());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        lt6 lt6Var = nt6.Companion;
        String s = yq2Var.s();
        int i = mt6.a;
        mfb mfbVar = qt6.a;
        d1 d1Var = (d1) mfbVar.getValue();
        lt6Var.getClass();
        s.getClass();
        d1Var.getClass();
        if (d1Var == ((d1) mfbVar.getValue())) {
            try {
                String obj = s.toString();
                obj.getClass();
                return new nt6(LocalDate.parse(jqe.E(6, obj)));
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return (nt6) d1Var.c(s);
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
