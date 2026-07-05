package defpackage;

import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bu6  reason: default package */
/* loaded from: classes3.dex */
public final class bu6 implements s76 {
    public static final bu6 a = new Object();
    public static final y59 b = aze.e("kotlinx.datetime.LocalDateTime", w59.n);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        xt6 xt6Var = (xt6) obj;
        xt6Var.getClass();
        jbeVar.I(xt6Var.toString());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        vt6 vt6Var = xt6.Companion;
        String s = yq2Var.s();
        zt6 zt6Var = wt6.a;
        vt6Var.getClass();
        s.getClass();
        zt6Var.getClass();
        try {
            String obj = s.toString();
            obj.getClass();
            return new xt6(LocalDateTime.parse(jqe.E(12, obj)));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
