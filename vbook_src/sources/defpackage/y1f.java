package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y1f  reason: default package */
/* loaded from: classes.dex */
public final class y1f implements hce {
    public final b6f a;

    public y1f(b6f b6fVar) {
        this.a = b6fVar;
    }

    @Override // defpackage.hce
    public final byte[] zza(byte[] bArr) {
        Iterator it = this.a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((a2f) it.next()).a.zza(bArr);
            } catch (GeneralSecurityException unused) {
            }
        }
        hfd.j("decryption failed");
        return null;
    }
}
