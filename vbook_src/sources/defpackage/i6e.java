package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i6e  reason: default package */
/* loaded from: classes.dex */
public abstract class i6e {
    protected transient int zza;

    public abstract int a(o8e o8eVar);

    public final w6e b() {
        try {
            int a = ((m7e) this).a(null);
            w6e w6eVar = s6e.b;
            byte[] bArr = new byte[a];
            boolean z = e7e.b;
            d7e d7eVar = new d7e(bArr, a);
            ((m7e) this).k(d7eVar);
            if (d7eVar.u() <= 0) {
                if (d7eVar.u() >= 0) {
                    return new w6e(bArr);
                }
                throw new IllegalStateException("Wrote more data than expected.");
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            cp8.p(hl5.n("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final byte[] c() {
        try {
            int a = ((m7e) this).a(null);
            byte[] bArr = new byte[a];
            boolean z = e7e.b;
            d7e d7eVar = new d7e(bArr, a);
            ((m7e) this).k(d7eVar);
            if (d7eVar.u() <= 0) {
                if (d7eVar.u() >= 0) {
                    return bArr;
                }
                throw new IllegalStateException("Wrote more data than expected.");
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            cp8.p(hl5.n("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
