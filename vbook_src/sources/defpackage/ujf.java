package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ujf  reason: default package */
/* loaded from: classes.dex */
public final class ujf implements gce {
    public static final hvc a;
    public static final hvc b;

    static {
        c3f z = hvc.z();
        z.b(bkf.a, uxe.b);
        z.b(bkf.b, uxe.c);
        z.b(bkf.c, uxe.d);
        a = z.a();
        c3f z2 = hvc.z();
        z2.b(hkf.a, wxe.c);
        z2.b(hkf.b, wxe.b);
        z2.b(hkf.c, wxe.d);
        b = z2.a();
    }

    public static final String a(txe txeVar) {
        if (txeVar.equals(txe.b)) {
            return "HmacSha1";
        }
        if (txeVar != txe.c) {
            if (txeVar != txe.d) {
                if (txeVar != txe.e) {
                    if (txeVar == txe.f) {
                        return "HmacSha512";
                    }
                    throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(txeVar)));
                }
                return "HmacSha384";
            }
            return "HmacSha256";
        }
        return "HmacSha224";
    }
}
