package defpackage;

import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wkf  reason: default package */
/* loaded from: classes.dex */
public final class wkf implements ukf, a47 {
    @Override // defpackage.ukf
    public /* synthetic */ Object a(String str, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }

    @Override // defpackage.a47
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.a47
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.a47
    public boolean next() {
        return false;
    }
}
