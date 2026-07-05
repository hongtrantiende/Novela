package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: flf  reason: default package */
/* loaded from: classes.dex */
public final class flf extends ThreadLocal {
    public final /* synthetic */ vdf a;

    public flf(vdf vdfVar) {
        this.a = vdfVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        vdf vdfVar = this.a;
        try {
            Mac mac = (Mac) kkf.c.a.zza((String) vdfVar.d);
            mac.init((SecretKeySpec) vdfVar.e);
            return mac;
        } catch (GeneralSecurityException e) {
            p1a.n(e);
            return null;
        }
    }
}
