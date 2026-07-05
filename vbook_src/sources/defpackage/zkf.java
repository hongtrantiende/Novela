package defpackage;

import java.security.MessageDigest;
import java.security.Provider;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zkf  reason: default package */
/* loaded from: classes.dex */
public final class zkf implements ukf {
    @Override // defpackage.ukf
    public /* synthetic */ Object a(String str, Provider provider) {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
