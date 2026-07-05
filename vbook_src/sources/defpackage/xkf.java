package defpackage;

import java.security.Provider;
import java.security.Signature;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xkf  reason: default package */
/* loaded from: classes.dex */
public final class xkf implements ukf {
    public xkf() {
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
    }

    @Override // defpackage.ukf
    public /* synthetic */ Object a(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
