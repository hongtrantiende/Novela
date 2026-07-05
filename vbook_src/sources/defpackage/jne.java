package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jne  reason: default package */
/* loaded from: classes.dex */
public final class jne extends gae implements Serializable {
    public final MessageDigest K;
    public final int L;
    public final boolean M;
    public final String N;

    public jne() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.K = messageDigest;
            this.L = messageDigest.getDigestLength();
            this.N = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.M = z;
        } catch (NoSuchAlgorithmException e) {
            vs.j(e);
            throw null;
        }
    }

    public final String toString() {
        return this.N;
    }
}
