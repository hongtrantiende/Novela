package defpackage;

import j$.time.LocalTime;
import j$.time.format.DateTimeParseException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jv6  reason: default package */
/* loaded from: classes3.dex */
public final class jv6 implements s76 {
    public static final jv6 a = new Object();
    public static final y59 b = aze.e("kotlinx.datetime.LocalTime", w59.n);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        fv6 fv6Var = (fv6) obj;
        fv6Var.getClass();
        jbeVar.I(fv6Var.toString());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        ev6 ev6Var = fv6.Companion;
        String s = yq2Var.s();
        mfb mfbVar = iv6.a;
        hv6 hv6Var = (hv6) mfbVar.getValue();
        ev6Var.getClass();
        s.getClass();
        hv6Var.getClass();
        if (hv6Var == ((hv6) mfbVar.getValue())) {
            try {
                return new fv6(LocalTime.parse(s));
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return (fv6) hv6Var.c(s);
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
