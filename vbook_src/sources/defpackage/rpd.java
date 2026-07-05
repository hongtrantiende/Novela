package defpackage;

import j$.time.YearMonth;
import j$.time.format.DateTimeParseException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rpd  reason: default package */
/* loaded from: classes3.dex */
public final class rpd implements s76 {
    public static final rpd a = new Object();
    public static final y59 b = aze.e("kotlinx.datetime.YearMonth", w59.n);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ipd ipdVar = (ipd) obj;
        ipdVar.getClass();
        jbeVar.I(ipdVar.toString());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        hpd hpdVar = ipd.Companion;
        String s = yq2Var.s();
        mfb mfbVar = ppd.b;
        d1 d1Var = (d1) mfbVar.getValue();
        hpdVar.getClass();
        s.getClass();
        d1Var.getClass();
        if (d1Var == ((d1) mfbVar.getValue())) {
            try {
                String obj = s.toString();
                obj.getClass();
                return new ipd(YearMonth.parse(jqe.E(3, obj)));
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return (ipd) d1Var.c(s);
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
